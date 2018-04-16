

public class first {
    public static void main (String [] args){

        int [][] array = {{1,7,3,9,11}, {3,4,2,5,8}, {7,9,8,3,5}, {-3,7,8,9,10}, {8,15,11,14,-2}};
        double [] line = new double[5];
        int n = 5;
        int m=0;
        int []min=new int [5];

        double avg = 0;

        // OUTPUT 1
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }

        // AVG
        double sum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sum +=array[i][j];
                }

            }
            avg = sum /(n*n);
            System.out.println("---------before----------");

        //
        for (int i = 0; i < n; i++) {
            line[i]=avg;
        }

        // Find MIN
        int z=0;
        for (int i = 0; i < n; i++) {
            min[z] = array[i][m];
            for (int j = 0; j < n; j++) {
                if (array[i][j] < min[z]) {
                    min[z] = array[i][j];
                }

            }
            z++;
        }
        int a=0;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                if (array[i][j] == min[i]){
                    a=array[i][2];
                    array[i][2]=min[i];
                    array[i][j]=a;
                }
            }
        }

        //

        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }

        System.out.println("--------------------------------");
        // last

        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                System.out.print(" " + array[i][j]);

            }
            if(i==2){
                System.out.println();
                for (int k=0;k<n;k++) {
                    System.out.print(line[k] + " ");
                }
            }

            System.out.println();
        }

    }
}
