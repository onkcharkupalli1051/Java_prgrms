class array2D{
    public static void main(String args[]){

        int array[][] = new int[3][3];

        int i,j;

        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                array[i][j] = i*j;
            }
        }

        System.out.println("Array Elements : ");

        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.println(array[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}