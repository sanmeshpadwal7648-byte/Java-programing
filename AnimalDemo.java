class Animal{
    String name;

    Animal(String name){
        this.name=name;

    }
    void makeSound(){
        System.out.println(name+"makes a sound");

    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);

    }
    @Override
    void makeSound(){
        System.out.println(name+"barks:Woof!");

    }
}
class Cat extends Animal{
    Cat(String name){
        super(name);

    }
    @Override
    void makeSound(){
        System.out.println(name + "meows: Meow!");
    }
}
public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Rex"), new Cat("Whiskers")

        };
        for (Animal a : animals)
{
    a.makeSound();
}   

 }
}
