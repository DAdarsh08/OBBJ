package com.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter the element");
                arr[i][j]=sc.nextInt();


            }
        }
        int[][] arr1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter the element");
                arr1[i][j]=sc.nextInt();


            }
        }
        int[][] res = new int[3][3];
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                res[i][j]=0;
                for (int k=0;k<3;k++)
                {
                    res[i][j]=res[i][j]+arr[i][k]*arr1[k][j];
                }

            }
        }
        System.out.println(Arrays.deepToString(res));
    }
}
