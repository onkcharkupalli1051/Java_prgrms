public class Cat2 {
    int age;

    public Cat2(String name){
        System.out.println("Name : "+name);
    }

    public void setAge(int age1){
        age = age1;
    }

    public int getAge(){
        System.out.println("Age : "+age);
        return age;
    }

    public static void main(String args[]){
        Cat2 mycat = new Cat2("Whiskey");

        mycat.setAge(2);
        mycat.getAge();

        System.out.println("Variable value : "+ mycat.age);
    }
}