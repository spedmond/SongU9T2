public class Cat extends Animal {
    private boolean hasPlayedWith;
    private boolean likesTuna;

    public Cat (String name, int age, boolean vaccinated, boolean isMale, boolean hasPlayedWith, boolean likesTuna) {
        super(name,age,vaccinated,isMale);
        this.hasPlayedWith = hasPlayedWith;
        this.likesTuna = likesTuna;
    }

    public void play() {
        hasPlayedWith = true;
        System.out.println("rawr");
    }

    public void purr() {
        System.out.println("purrrrrr");
    }

    public boolean hasPlayedWith() {
        return hasPlayedWith;
    }

    public boolean likesTuna() {
        return likesTuna;
    }
}
