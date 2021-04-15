package sample;

public class Main{

    public static void main(String[] args) {
        Person kartik = new Person();
        kartik.setName("Kartik");
        kartik.setYearOfBirth(2003);
        kartik.setCurrentYear(2021);
        kartik.setYearOfDeath(0);

        System.out.println("Current age : " +
                kartik.calculateage());

        Person onkar = new Person();
        onkar.setName("Onkar");
        onkar.setYearOfBirth(2001);
        onkar.setYearOfDeath(0);
        onkar.setCurrentYear(2021);
        System.out.println("Current age : " +
                onkar.getName()+" : "+ onkar.calculateage());
    }
}
