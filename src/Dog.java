public class Dog extends Animal {
    private boolean hasBeenWalked;
    private boolean isPlayful;

    public Dog(String name, int age, boolean vaccinated, boolean isMale, boolean hasBeenWalked, boolean isPlayful) {
        super(name,age,vaccinated,isMale);
        this.hasBeenWalked = hasBeenWalked;
        this.isPlayful = isPlayful;
    }

    public void walk() {
        hasBeenWalked = true;
        System.out.println("yay i am walking");
    }

    public void bark() {
        System.out.println("bark bark");
    }

    public boolean hasBeenWalked() {
        return hasBeenWalked;
    }

    public boolean isPlayful() {
        return isPlayful;
    }
}
