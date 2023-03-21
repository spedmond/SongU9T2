public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private boolean isMale;

    public Animal(String name, int age, boolean vaccinated, boolean isMale) {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.isMale = isMale;
    }

    public void adopt() {
        System.out.println("Yipee!");
    }

    public void feed() {
        System.out.println("Thank you for feeding me");
    }

    public void sleep() {
        System.out.println("zzzzzzzzzz");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public boolean isMale() {
        return isMale;
    }
}
