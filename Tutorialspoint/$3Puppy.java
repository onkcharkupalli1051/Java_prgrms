public class $3Puppy {
    int puppyAge;

    public $3Puppy(String name){
        System.out.println("Name : "+name);
    }

    public void setPuppyAge(int age){
        puppyAge = age;
    }

    public int getPuppyAge(){
        System.out.println("Puppy's age is : "+puppyAge);
        return puppyAge;
    }

    public static void main(String args[]){
        $3Puppy myPuppy = new $3Puppy("Tommy");
        myPuppy.setPuppyAge(2);
        myPuppy.getPuppyAge();
        System.out.println("Variable Name : "+myPuppy.puppyAge);
    }
}