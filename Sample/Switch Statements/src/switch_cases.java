import java.util.Scanner;

public class switch_cases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();


//        switch (fruit) {
//            case "Mango" -> System.out.println("king of fruits");
//            case "Apple" -> System.out.println("Round fruit");
//            case "Orange" -> System.out.println("Small Fruit");
//            case "Grapes" -> System.out.println("PLease enter a valid fruit name");
//        }

        //switch day

//        int day = in.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//
//
//        }

        //Q Writing a program to find whether is a week day or
//        a weekend day

         int day = in.nextInt();
//        switch (day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekdays");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }
        switch (day){
            case 1,2,3,4,5 -> System.out.println("weekday");
            case 6,7 -> System.out.println("weekend");
        }
    }
}
