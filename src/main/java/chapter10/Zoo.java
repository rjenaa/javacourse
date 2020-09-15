package chapter10;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        Animal sasha = new Dog();
        sasha.makeSound();

        sasha = new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch();
    }

    public static void feed(Animal animal) {
        if(animal instanceof Dog){
            System.out.println("heres your dog food");
        }
        else if(animal instanceof Cat){
            System.out.println("Heres your cat food");
        }
    }
}
