class TestArray{
    public static void main(String args[]){

        int a[] = {10,20,30,40,50};

        System.out.println("Array Elements : ");
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]+" ");
        }

        float sum=0, avg;

        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        avg = sum/a.length;
        System.out.println("\nSum : "+sum+"\nAverage : "+avg);
    }
}