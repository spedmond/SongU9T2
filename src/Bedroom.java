public class Bedroom extends Room {
    private boolean isBedMade;

    public Bedroom(boolean areLightsOn,int area,boolean isBedMade) {
        super(areLightsOn, area);
        this.isBedMade = isBedMade;
    }

    public void sleep() {
        isBedMade = false;
        System.out.println("zzzzzzzzzzzzzz");
    }

    public boolean isBedMade() {
        return isBedMade;
    }
}
