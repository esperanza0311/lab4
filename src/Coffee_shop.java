import java.util.Scanner;

public class Coffee_shop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("   Menu   ");
        System.out.println("A->Americano->3.00$");
        System.out.println("C->Cappucino->3.75$");
        System.out.println("L->Latte->4.00$");
        System.out.println("E->Espresso->2.50$");
        String letter="";
        System.out.println("Please enter a letter from menu");
        letter=input.next();
        letter= letter.toUpperCase();
        String price="";
        boolean bool=true;
        while (bool) {
            if (letter.equals("A") || letter.equals("C") || letter.equals("L") || letter.equals("E")) { bool=false;
            }

        }
        switch (letter){
            case "A": price="$3.00";break;
            case "C": price="$3.75";break;
            case "L": price="$4.00";break;
            case "E": price="$2.50";break;
        }
        System.out.println(price);


    }

}
