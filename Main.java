import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome User, Please Type How Many Gallons Your Aquarium Display Holds");
        double gallons = scnr.nextDouble();
        int newGallons = (int) Math.round(gallons); //Round Gallons
        System.out.println("Great so you have about " + newGallons + " gallons.");
        System.out.println("How much fish do you have now?");
        int currentFish = scnr.nextInt();
        System.out.println("How much fish do you plan to add?");
        int plannedFish = scnr.nextInt();
        System.out.println("Assuming every fish requires at least 3 gallons of space:");
        boolean answer = GPF(newGallons, (currentFish+ plannedFish));
        if (answer){
            System.out.println("Perfect! " + newGallons + " is perfect for " + (currentFish+ plannedFish) + " fish!");
        }else{
            System.out.println("Sadly, " + newGallons + " gallons would not be enough for " + (currentFish+ plannedFish) + " fish!");
        }

    }

    static boolean GPF(int gallons, int fish){
         if ((fish*3) > gallons) {
             return false;
        } else {
             return true;
         }
    }
}

