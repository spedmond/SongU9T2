public class Bathroom extends Room {
    private boolean isWaterRunning;

    public Bathroom(boolean areLightsOn,int area,boolean isWaterRunning) {
        super(areLightsOn,area);
        this.isWaterRunning = isWaterRunning;
    }

    public void flush() {
        System.out.println("flllllwdawjdajdkakjdjkabblblbllbllllbllblblububublbl");
    }

    public boolean isWaterRunning() {
        return isWaterRunning;
    }

}
