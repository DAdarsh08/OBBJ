package com.Matrix;

public class Matrix {
    int m, n;
    int[][] mat;

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

    public static void main(String[] args) throws MatrixException {
        int[][] a = {{1, 0}, {0, 1}};
        Matrix c = new Matrix(a);
        c.print();
        int[][] b = {{1, 3}, {5, 6}};

        Matrix d = new Matrix(b);
        d.print();
        try {
            Matrix sum = c.add(d);
            sum.print();
        } catch (MatrixException e) {
            System.out.println(e);
        }
        try {
            Matrix sum = c.sub(d);
            sum.print();
        } catch (MatrixException e) {
            System.out.println(e);
        }
        try {
            Matrix mult = c.multiply(d);
            mult.print();
        } catch (MatrixException e) {
            System.out.println(e);
        }
        int temp=Matrix.mult(c,d,1,1);
        System.out.println(temp);




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
    public static int mult(Matrix m1,Matrix m2,int r, int c)
    {
        int i=r;
        int ans=0;
        for (int j=0;j<m2.n;j++)
        {
            for (int k=0;k<m2.m;k++)
            {

                 ans+=m1.mat[i][k]*m2.mat[k][j];


            }
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
