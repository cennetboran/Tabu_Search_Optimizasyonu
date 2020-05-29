/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Random;

/**
 *
 * @author sariz
 */
public class JavaApplication5 {

    public static String[] listeDegistir(String[] liste){
        String tmp;
        tmp=liste[0];
        liste[0] = liste[4];
        liste[4] = tmp;
        tmp = liste[2];
        liste[2] = liste[3];
        liste[3] = tmp;
        return liste;   
    }
    public static int[][] diziYerlestir(int[][] hocaDers1){
        Random rnd = new Random();
        for(int i = 0;i<hocaDers1.length;i++){
            for(int j=0;j<hocaDers1.length;j++)
                hocaDers1[i][j] = rnd.nextInt(100);
        }
        return hocaDers1;
    }
 public static int kontrolEt(String[] list,int[][] hocaDers){
     int a,b,c,d,e;
     if(list[0].equals("Cennet")){
         a=hocaDers[0][0];
     }
     else if(list[0].equals("Büşra")){
         a=hocaDers[1][0];
     }
     else if(list[0].equals("Emine")){
         a=hocaDers[2][0];
     }
     else if(list[0].equals("Esra")){
         a=hocaDers[3][0];
     }
     else{
         a=hocaDers[4][0];
     }
     if(list[1].equals("Cennet")){
         b=hocaDers[0][1];
     }
     else if(list[1].equals("Büşra")){
         b=hocaDers[1][1];
     }
     else if(list[1].equals("Emine")){
         b=hocaDers[2][1];
     }
     else if(list[1].equals("Esra")){
         b=hocaDers[3][1];
     }
     else{
         b=hocaDers[4][1];
     }
     if(list[2].equals("Cennet")){
         c=hocaDers[0][2];
     }
     else if(list[2].equals("Büşra")){
         c=hocaDers[1][2];
     }
     else if(list[2].equals("Emine")){
         c=hocaDers[2][2];
     }
     else if(list[2].equals("Esra")){
         c=hocaDers[3][2];
     }
     else{
         c=hocaDers[4][2];
     }
     if(list[3].equals("Cennet")){
         d=hocaDers[0][3];
     }
     else if(list[3].equals("Büşra")){
         d=hocaDers[1][3];
     }
     else if(list[3].equals("Emine")){
         d=hocaDers[2][3];
     }
     else if(list[3].equals("Esra")){
         d=hocaDers[3][3];
     }
     else{
         d=hocaDers[4][3];
     }
     if(list[4].equals("Cennet")){
         e=hocaDers[0][4];
     }
     else if(list[4].equals("Büşra")){
         e=hocaDers[1][4];
     }
     else if(list[4].equals("Emine")){
         e=hocaDers[2][4];
     }
     else if(list[4].equals("Esra")){
         e=hocaDers[3][4];
     }
     else{
         e=hocaDers[4][4];
     }
     int toplam = a+b+c+d+e;
     return toplam;
 }   
 public static int degistir(String[] list,int[][] hocaDers,int[] sht,String[] hocalar){
     String tmp;
     int count = 0;
     int countloop = 0;
     sht[0] = kontrolEt(list, hocaDers);
     for(int i=0;;){
     int gecici = kontrolEt(list, hocaDers);
     int gc = 0;
     tmp = list[0];
     list[0] = list[1];
     list[1] = tmp;
     if(kontrolEt(list, hocaDers)<sht[0]){
         sht[0]=kontrolEt(list, hocaDers);
         gc=sht[0];
     }
     tmp = list[0];
     list[0] = list[2];
     list[2] = tmp;
     if(kontrolEt(list, hocaDers)<sht[0]){
         sht[0]=kontrolEt(list, hocaDers);
         gc=sht[0];
     }
     tmp = list[0];
     list[0] = list[3];
     list[3] = tmp;
     if(kontrolEt(list, hocaDers)<sht[0]){
         sht[0]=kontrolEt(list, hocaDers);
         gc=sht[0];
     }
     tmp = list[0];
     list[0] = list[4];
     list[4] = tmp;
     if(kontrolEt(list, hocaDers)<sht[0]){
         sht[0]=kontrolEt(list, hocaDers);
         gc=sht[0];
         for(i=0;i<hocalar.length;i++)
                 hocalar[i]=list[i];
     if(sht[0]==gecici){
         tmp = list[1];
         list[1] = list[2];
         list[2] = tmp;
         if(kontrolEt(list, hocaDers)<sht[0]){
             sht[0]=kontrolEt(list, hocaDers);
             gc=sht[0];
             for(i=0;i<hocalar.length;i++)
                 hocalar[i]=list[i];
         }
         else if(sht[0]==gecici){
             tmp = list[1];
             list[1] = list[3];
             list[3] = tmp;
             if(kontrolEt(list, hocaDers)<sht[0]){
                 sht[0]=kontrolEt(list, hocaDers);
                 gc=sht[0];
                 for(i=0;i<hocalar.length;i++)
                 hocalar[i]=list[i];
             }
             else
                 break;
         }
     }
     }
     System.out.print("En düşük: "+hocalar[0]+" "+hocalar[1]+" "+hocalar[2]+" "+hocalar[3]+" "+hocalar[4]+"\n");
         System.out.print("Liste: "+list[0]+" "+list[1]+" "+list[2]+" "+list[3]+" "+list[4]+"\n");
         System.out.println("En düşük değer: "+sht[0]+" "+gc+"\n");
         countloop++;
         if(gc==0&&countloop!=1)
             break;
 }
     return countloop;
}
}
