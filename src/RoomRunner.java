public class RoomRunner {
    public static void main(String[] args) {
        Bathroom bath = new Bathroom (true,1000,false);
        System.out.println(bath.areLightsOn() ? "The lights are on in the bathroom." : "The lights are off in the bathroom.");
        System.out.println("The bathroom has an area of " + bath.getArea() + " square feet.");
        System.out.println(bath.isWaterRunning() ? "The water is running. Hooray!" : "The water is not running. Someone call a plumber or something!");
        bath.flush();

        System.out.println("---------------------------------------");
        Bedroom bed = new Bedroom(false,2000,true);
        System.out.println(bed.areLightsOn() ? "The lights are on in the bedroom." : "The lights are off in the bedroom.");
        System.out.println("The bedroom has an area of " + bed.getArea() + " square feet.");
        System.out.println(bed.isBedMade() ? "The bed is made." : "The bed is not made.");
        bed.sleep();
        System.out.println(bed.isBedMade() ? "The bed is made." : "The bed is not made.");
    }
}
