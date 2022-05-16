package pttern;

public class StarPrinting {
    public static void main(String[] args) {
        int row,col,n=5;
        for(row = 1;row<=n;row++){
            for(col=1;col<=row;col++){
                System.out.print("p"+" ");
            }
            System.out.println();
        }

        for(row=n;row>=1;row--){  // here (n-1) because of same line not printing again
            for(col=1;col<=row;col++){
                System.out.print("p"+" ");
            }
            System.out.println();
        }

    }
}