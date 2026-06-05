//Super class
abstract class Canine { //Abstract class can't be instantiated, can't directly create object, its subclass can instantiate

    //Instance variables
    String name;
    String color;
    String gender;
    int age;

    //Parameterized Constructor
    Canine(String name, String color, int age, char mF) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.gender = (mF == 'M') ? "Male" : "Female";
    }

    //Abstract Method declaration
    abstract String getBreed();

    abstract String makeSound();

    //Defined Method
    void printInfo() {
        //Print information about dog
        System.out.println(name + " is" + ((age % 10 == 8) ? " an " : " a ") + age + " year old " +
                gender + " " +getBreed() + " with a " + color + " coat" + " makes " + makeSound() +" sound.");
        //(age % 10 == 8) conditional ensures grammatical correctness if dog is 8 or 18, they don't live longer
    }
    void celebrateBirthday() {
        age++;
        System.out.println(name + " just turned " + age + '!');
    }
}

//Subclass of Canine
class KleeKai extends Canine {

    //Parameterized Constructor
    KleeKai (String name, String color, int age, char mF) {
        super (name, color, age, mF);
    }
    //Abstract Method implementation
    String getBreed() {
        return "Klee Kai";
    }
    String makeSound () {
        return "Yip!";
    }

}

//Subclass of Canine
class SiberianHusky extends Canine {

    //Parameterized Constructor
    SiberianHusky (String name, String color, int age, char mF) {
        super (name, color, age, mF);
    }

    //Abstract Method implementation
    String getBreed() {
        return "Siberian Husky";
    }
    String makeSound() {
        return "Howl!";
    }
}

void main() {
    Canine c = new KleeKai("Lilah", "Gray/White", 8, 'M');
    Canine d = new SiberianHusky("Alaska", "Grey/White/Black", 17, 'F');

    c.printInfo();
    d.printInfo();

    c.makeSound();
    d.makeSound();

    // 🎂 Celebrate birthdays
    c.celebrateBirthday();
    d.celebrateBirthday();

    // Print info again to see updated ages
    c.printInfo();
    d.printInfo();

    System.out.println();
    //Alternative way
    Canine[] dogs = {
      new KleeKai("Lilah", "Gray/white", 8, 'M'),
      new SiberianHusky("Alaska", "Gray/wWite/Black", 17, 'F')
    };

    for (Canine dog : dogs) {
        dog.printInfo(); //shared method from abstract class
        System.out.println("Sound " + dog.makeSound()); //polymorphic behavior

    }
}