/*for (int i = 0; i < m; i++) {
        for (int j = 0; j < r; j++) {
        res[i][j] = mult(mat1, mat, i, j);

        }
        }*/

package com.Matrix;

import com.threadex.Th;

public class Matrix {
    int m, n;
    int[][] mat;

    public Matrix threadmultiplication(Matrix mat1, Matrix mat2) throws MatrixException, InterruptedException {
        if (mat1.m != mat2.n)
            throw new MatrixException("Cannot multiply");
        int m = mat1.m, n = mat2.n, r = mat2.m;
        int[][] res = new int[m][n];

        thread t1 = null;
       Matrix result= new Matrix(res);

        for (int i=0;i<m;i++)
        {
            for (int j=0;j<r;j++)
            {
                t1=new thread(i,j,mat1,mat2,result);
                t1.start();

            }



        }
        t1.join();


        return result;



    }


    class thread extends Thread {
        int i;
        int j;
        Matrix mat1;
        Matrix mat2;
        Matrix res;

        public thread(int i, int j, Matrix mat1, Matrix mat2, Matrix res) {
            this.i = i;
            this.j = j;
            this.mat1 = mat1;
            this.mat2 = mat2;
            this.res = res;


        }


        @Override
        public void run() {
            res.mat[i][j] = Matrix.mult(mat1, mat2, i, j);
            try {
                Thread.sleep(3000);
                System.out.println(this.getName());


            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }






    public Matrix(int m, int n, int[][] mat) {
        this.m = m;
        this.n = n;
        this.mat = mat;
    }
    public Matrix(int[][] mat) {
        this.m = mat.length;
        this.n = mat[0].length;
        this.mat = mat;
    }
    public static void main(String[] args) throws MatrixException, InterruptedException {
        int[][] a = {{1, 0}, {0, 1}};
        Matrix c = new Matrix(a);
       // c.print();
        int[][] b = {{1, 3}, {5, 7}};
        Matrix d = new Matrix(b);
        //d.print();
       Matrix ans=c.threadmultiplication(c,d);
        ans.print();
    }
    public Matrix add(Matrix x) throws MatrixException {
        if (this.m != x.m || this.n != x.n) {
            throw new MatrixException("this is wrong");
        }
        int[][] ans = new int[this.m][this.n];
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                ans[i][j] = this.mat[i][j] + x.mat[i][j];
            }
        }
        return new Matrix(ans);
    }
    public Matrix sub(Matrix x) throws MatrixException {
        if (this.m != x.m) {
            throw new MatrixException("this is wrong");
        }
        int[][] ans = new int[this.m][this.n];

        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                ans[i][j] = this.mat[i][j] - x.mat[i][j];
            }
        }
        return new Matrix(ans);
    }
    public Matrix multiply(Matrix mat) throws MatrixException {
        if (this.m != mat.n)
            throw new MatrixException("Cannot multiply");
        int m = this.m, n = mat.n, r = mat.m;
        int[][] a = new int[m][r];
        for (int i = 0; i <= m - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                for (int k = 0; k <= r - 1; k++) {
                    a[i][k] += this.mat[i][j] * mat.mat[j][k];
                }
            }
        }
        return new Matrix(a);
    }
    public static synchronized int mult(Matrix m1,Matrix m2,int r, int c)
    {
        int i=r;
        int ans=0;
        for (int j=0;j<m2.n;j++)
        {


                ans+=m1.mat[r][j]*m2.mat[j][c];

        }
        return ans;
    }
    public void print() {
        System.out.println();
        for (int i = 0; i <= m - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                System.out.printf("%5d", mat[i][j]);
            }
            System.out.println();
        }
    }



}