public class AnimalRunner {
    public static void main(String[] args) {
        Dog dog = new Dog("awdhakwdawdjkawjkd", 20, false, true, false,true);

        dog.adopt();
        System.out.println("I am a dog. My name is " + dog.getName() + " and I am " + dog.getAge() + " years old!");
        System.out.println(dog.isMale() ? "I am a boy. " : "I am a girl. ");
        System.out.println(dog.isPlayful() ? "I like to play with people! " : "I do not like playing with people. Go away.");
        dog.bark();
        if (dog.hasBeenWalked()) {
            System.out.println("I have been walked. Hooray!");
        }
        else {
            System.out.println("I have not been walked. :( Please go on a walk with me!");
            dog.walk();
        }
        System.out.println(dog.isVaccinated() ? "I am very healthy and got vaccinated!!!" : "I am not vaccinated! :(");
        dog.feed();
        dog.sleep();

        System.out.println("------------------------------");

        Cat cat = new Cat("Dog", 65, false, true, true, false);

        cat.adopt();
        System.out.println("I am a cat. My name is " + cat.getName() + " and I am " + cat.getAge() + " years old");
        System.out.println(cat.isMale() ? "I am a boy." : "I am a girl.");
        System.out.println(cat.likesTuna() ? "I looooooooooove tuna" : "ew tuna is so gross");
        cat.purr();
        if (cat.hasPlayedWith()) {
            System.out.println("yesss i played today");
        }
        else {
            System.out.println("noooo i havent played today :( plz play with me");
            cat.play();
        }
        System.out.println(cat.isVaccinated() ? "I have been vaccinated!" : "I have not been vaccinated I am very sick");
        cat.feed();
        cat.sleep();
    }
}
