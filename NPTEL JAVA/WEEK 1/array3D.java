class array3D{
    public static void main(String args[]){

        int array[][][] = new int [3][4][5];

        int i,j,k;

        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                for(k=0; k<5; k++){
                    array[i][j][k] = i*j*k;
                }
            }
        }

        System.out.println("Array Elements : ");
        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                for(k=0; k<5; k++){
                    System.out.println(array[i][j][k] + " ");
                    System.out.println(" ");
                }
                System.out.println(" ");
            }
        }

    }
}