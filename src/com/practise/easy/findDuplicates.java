package com.practise.easy;

public class findDuplicates {
     public static void  main( String args[] ) {
         int noOfDuplicates ;
         int[] num = {0,0,1,1,2,3,4,4,4,4};
         noOfDuplicates = getDuplicates(num);
         System.out.printf("No. of Duplicates :"+noOfDuplicates);
    }

    public static int getDuplicates(int[] num){
        int i = 0;
        for (int j = 1 ; j <= num.length - 1; j++){
            if(num[i] != num[j]){
                i++;
                num[i] = num[j];
            }
        }
        return i + 1 ;
    }
}
