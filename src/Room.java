public class Room {
    private boolean areLightsOn;
    private int area;

    public Room (boolean areLightsOn,int area) {
        this.areLightsOn = areLightsOn;
        this.area = area;
    }

    public void switchLights() {
        areLightsOn = !areLightsOn;

    }

    public boolean areLightsOn() {
        return areLightsOn;
    }

    public int getArea() {
        return area;
    }
}
