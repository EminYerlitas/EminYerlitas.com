package practices1;

import java.util.*;

public class A5 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();

  // write your code below
    int a=100;
    int count=0;
String[] array=str.split(", ");
    
    for(String word:array){
         if(word.length()<a){
           a=word.length();
         }}
      
      
      for(String word2:array){
        
        if(word2.length()==a){
          count++;
  
      }}
      for(String word3:array) {
   if(word3.length()==a) {
      String []arr=new String[count];
      arr[count-1]=word3;
      System.out.println(arr[count]);}}
  }
}

