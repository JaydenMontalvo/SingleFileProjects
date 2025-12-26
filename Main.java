import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How long until you need to feed your fish?");
        Scanner scnr = new Scanner(System.in);
        System.out.print("Hours: ");
        int hours = scnr.nextInt();
        System.out.print("\nMinutes: ");
        int minutes = scnr.nextInt();
        System.out.print("\nSeconds: ");
        int seconds = scnr.nextInt();
        Timer(hours, minutes, seconds);
    }

    static void Timer(int hours, int minutes, int seconds) {
        while (hours > 0 || minutes > 0 || seconds > 0) {

            System.out.println(hours + "h " + minutes + "m " + seconds + "s");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            seconds--;

            if (seconds < 0) {
                seconds = 59;
                minutes--;
            }

            if (minutes < 0) {
                minutes = 59;
                hours--;
            }
        }

        System.out.println("Timer finished! It is time to feed your fish!");


        }
    }


