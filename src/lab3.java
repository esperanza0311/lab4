import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean bool = true;
        int number = 0;
        String dayname = "";
        while (bool) {
            System.out.println("Please enter a number between 1 and 7");
            number = input.nextInt();
            if (number < 8 && number > 0) {
                bool = false;
            }
        }
        switch (number) {
            case 1:
                dayname = "Monday";
                break;
            case 2:
                dayname = "Tuesday";
                break;
            case 3:
                dayname = "Wednesday";
                break;
            case 4:
                dayname = "Thursday";
                break;
            case 5:
                dayname = "Friday";
                break;
            case 6:
                dayname = "Saturday";
                break;
            case 7:
                dayname = "Sunday";
                break;
        }
        System.out.println(dayname);

    }
}