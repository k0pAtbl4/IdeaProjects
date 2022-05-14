package hillel.lesson07.newLesson7;

public class Practice {
    private static void animalSay(Animal a){
        a.say();
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog(10);
        //Test test = new Test(); - нельзя создать обьект абстрактоного класса
        animalSay(dog);
        dog.say2(7, 5);
    }
}

interface Animal{
    int count = 8;
    void say();
    default void say2(int a, int b){
        System.out.println(a + b);
    }
    static void say3(int a, int b){
        System.out.println(a - b);
    }
}

abstract class Test{
    int number;
    abstract void say1();
    public Test(int number) {
        this.number = number;
    }
}

class Dog extends Test implements Animal{

    public Dog(int number) {
        super(number);
    }

    @Override
    public void say() {
        System.out.println("Gav");
    }

    @Override
    void say1() {
        System.out.println("Gav");
    }

    @Override
    public void say2(int a, int b){
        System.out.println(a - b);
    }
}

class Cat implements Animal{

    @Override
    public void say() {
        System.out.println("Meow");
    }
}