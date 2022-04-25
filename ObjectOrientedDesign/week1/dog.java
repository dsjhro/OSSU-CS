package ObjectOrientedDesign.week1;

public class dog {
    
    private String name;
    private int age;

    public dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("I am a dog named " + this.name + " and I am " + this.age + " Years old");
    }

}
