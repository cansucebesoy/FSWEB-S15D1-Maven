package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {

   public static ArrayList<String> groceryList = new ArrayList<>();

   Scanner scanner = new Scanner(System.in);

   public void startGrocery(){
      int choice;

      do{
         System.out.println("Yapılmak isteneni seçin. (0=çıkış, 1=ekle, 2=sil)");
         choice = scanner.nextInt();
         scanner.nextLine();
         switch(choice){
            case 1:
               System.out.println("eklemek istediklerinizi yazın");
               String itemsToAdd = scanner.nextLine();
               addItems(itemsToAdd);
               printSorted();
               break;
            case 2:
               System.out.println("silmek istediğinizi yazınız");
               String itemsToRemove = scanner.nextLine();
               removeItems(itemsToRemove);
               printSorted();
               break;
         }
      }while(choice != 0);
      scanner.close();
   }


      public static void addItems(String itemsToAdd){
         String[] splitItems = itemsToAdd.split(",");
         for(String item : splitItems){
            item = item.trim();
            if(checkList(item)){
               System.out.println("ürün listede mevcut" + item);
            }else{
               groceryList.add(item);
            }
         }
         sortItems();
      }

      public static boolean checkList(String item){
            return groceryList.contains(item);
      }

      public static void removeItems(String itemsToRemove){
      String[] splitItems = itemsToRemove.split(",");
      for(String item : splitItems){
         item = item.trim();
         if(!checkList(item)){
            System.out.println("ürün listede mevcut değil" + item);
         }else{
            groceryList.remove(item);
         }
      }
      sortItems();
      }

      public static void printSorted(){
         sortItems();
         System.out.println("mevcut pazar listesi: ");
         for(String item : groceryList){
            System.out.println(item);
         }
      }

      public static void sortItems(){
         Collections.sort(groceryList);
      }
}

