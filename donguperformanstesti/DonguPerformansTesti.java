/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donguperformanstesti;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;
/**
 *
 * @author BUKET
 */
public class DonguPerformansTesti {

    //FOR DONGUSU ICIN
    static long evenFibSum(int limit)
    {
        if (limit < 2)
            return 0;
        long ef1 = 0,ef2=2 ;
        long sum = ef1 + ef2;
        long startTime = System.nanoTime();
        for (ef2 = 2 ; ef2 <= limit ;)
        {
            long ef3 = 4 * ef2 + ef1;
            if (ef3 > limit)
                break;
            ef1 = ef2;
            ef2 = ef3;
            sum += ef2;
        }
       int deg = (int) sum;
               System.out.println(sum);
        return startTime;
    }
    
    // WHILE DONGUSU ICIN
    static long evenFibSumWhile(int limit)
    {
        if (limit < 2)
            return 0;
        long ef1 = 0, ef2 = 2;
        long sum = ef1 + ef2;
        long startTime = System.nanoTime();
        while (ef2 <= limit)
        {
            long ef3 = 4 * ef2 + ef1;
            if (ef3 > limit)
                break;
            ef1 = ef2;
            ef2 = ef3;
            sum += ef2;
        }
        int deg = (int) sum;
               System.out.println(sum);
        return startTime;
    }
    
    //DO-WHILE DONGUSU ICIN
    static long evenFibSumDoWhile(int limit)
    {
        if (limit < 2)
            return 0;
        long ef1 = 0, ef2 = 2;
        long sum = ef1 + ef2;
        long startTime = System.nanoTime();
        
        do
        {
            long ef3 = 4 * ef2 + ef1;
            if (ef3 > limit)
                break;
            ef1 = ef2;
            ef2 = ef3;
            sum += ef2;    
        } while (ef2 <= limit);
        
          int deg = (int) sum;
               System.out.println(sum);
        return startTime;
    }
    
    public static void main (String[] args)
    {
        int limit = 400;
        DonguPerformansTesti ft = new DonguPerformansTesti();
        long startTime = ft.evenFibSum(limit);
        long endTime = System.nanoTime();
        System.out.println("Baslangıc zamanı (nano)" + startTime);
        System.out.println("Bitis zamanı (nano)" + endTime);
        System.out.println("Farkları (nano)" + (endTime - startTime));
        
       System.out.println("***********************************");
        
        DonguPerformansTesti ft1 = new DonguPerformansTesti();
        long startTime1 = ft1.evenFibSumWhile(limit);
        long endTime1 = System.nanoTime();
        System.out.println("Baslangıc zamanı (nano)" + startTime1);
        System.out.println("Bitis zamanı (nano)" + endTime1);
        System.out.println("Farkları (nano)" + (endTime1 - startTime1));
        
         System.out.println("***********************************");
        
        DonguPerformansTesti ft2 = new DonguPerformansTesti();
        long startTime2 = ft2.evenFibSumDoWhile(limit);
        long endTime2 = System.nanoTime();
        System.out.println("Baslangıc zamanı (nano)" + startTime2);
        System.out.println("Bitis zamanı (nano)" + endTime2);
        System.out.println("Farkları (nano)" + (endTime2 - startTime2));
        
    }
}

 
