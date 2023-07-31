package com.Matrix;

import com.threadex.Main;
import com.threadex.Th;

import java.util.Scanner;

public class Multithread {
    static final  int max=2;
    static final int maxthrread=2;
    static int [][]mat1=new int[max][max];
    static int [][]mat2=new int[max][max];
    static int [][]res=new int [max][max];
    static int step_i=0;
    static class multiplicaton extends Thread{
        int i;
        multiplicaton(int i)
        {
            this.i=i;
        }
        public void run() {
            for (int j = 0; j < max; j++) {
                for (int k = 0; k < max; k++) {
                    res[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
          /*  try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(this.getName());

        }*/
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);



        for (int i = 0; i < Multithread.max; i++) {
            for (int j = 0; j < max; j++) {
                System.out.println("Enter the element");
                Multithread.mat1[i][j]=sc.nextInt();


            }
        }
        System.out.println("Matrix A");
        for (int i = 0; i < Multithread.max; i++) {
            for (int j = 0; j < Multithread.max; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < Multithread.max; i++) {
            for (int j = 0; j < Multithread.max; j++) {
                System.out.println("Enter the element");
                Multithread.mat2[i][j]=sc.nextInt();


            }
        }
        System.out.println("Matrix B");
        for (int i = 0; i < Multithread.max; i++) {
            for (int j = 0; j < Multithread.max; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }
        multiplicaton [] thread=new multiplicaton[max];
        for (int i=0;i<Multithread.maxthrread;i++)
        {
            thread[i]=new multiplicaton(step_i++);
            thread[i].start();

        }
         for (int i = 0; i <Multithread.maxthrread; i++) {
            try {
                thread[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Multiplication of A and B");
        for (int i = 0; i < Multithread.max; i++) {
            for (int j = 0; j < Multithread.max; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }


    }

}
