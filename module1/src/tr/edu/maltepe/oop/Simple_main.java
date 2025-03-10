package tr.edu.maltepe.oop;
public  class Simple_main {
    public static void main(String[] args) {
            // Creating two cat objects
        Cat cat1 = new Cat("Whiskers", 2);
        Cat cat2 = new Cat("Fluffy", 4);

            // Show cat details before making them meow
        cat1.bilgileriGoster();
        cat1.meow();

        System.out.println(); // Just for spacing

        cat2.bilgileriGoster();
         cat2.meow();
        System.out.println("Meowws");
        }
    }



