package sample;

public class Person {
    private String name;
    private int yearOfBirth;
    private int currentYear;
    private int yearOfDeath;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public int getYearOfDeath() {
        return yearOfDeath;
    }

    public void setYearOfDeath(int yearOfDeath) {
        this.yearOfDeath = yearOfDeath;
    }

    public int calculateage(){
        if(yearOfDeath == 0){
            return currentYear-yearOfBirth;
        }
        else{
            return yearOfDeath-yearOfBirth;
        }
    }
}
