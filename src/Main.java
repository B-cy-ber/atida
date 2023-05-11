import java.util.Scanner;
import  java.lang.Math;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            while (true) {
                System.out.print("Please enter a number between 1 and 3:\n" +
                        "1 rectangle\n" +
                        "2 triangle\n" +
                        "3 Exit. ");
                try {
                    num = scanner.nextInt();
                    if (num < 1 || num > 3) {
                        System.out.println("Invalid input. Please enter a number between 1 and 3.");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number between 1 and 3.");
                    scanner.nextLine();
                }
            }
            int Length, height;
            switch (num) {
                case 1:
                    System.out.println("Rectangle option is selected");
                    while (true) {
                        System.out.println("enter Length greater than 0:");
                        try {
                            Length = scanner.nextInt();
                            if (Length < 1) {
                                System.out.println("Invalid input. Please enter Length greater than 0:");
                                continue;
                            }

                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid input. Please enter a valid number.");
                            scanner.nextLine();
                        }
                    }
                    while (true) {
                        System.out.print("Please enter the height (must be greater than or equal to 2): ");
                        try {
                            height = scanner.nextInt();
                            if (height < 2) {
                                System.out.println("Invalid input. Please enter a height greater than or equal to 2.");
                                continue;
                            }
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid input. Please enter a valid number.");
                            scanner.nextLine();
                        }
                    }



                    Rectangle.rectanglechecker(Length, height);

                    break;
                case 2:
                    System.out.println("Triangle option selected");
                    while (true) {
                            System.out.println("enter Length greater than 0:");
                            try {
                                Length = scanner.nextInt();
                                if (Length < 1 ) {
                                    System.out.println("Invalid input. Please enter a number greater than 0.");
                                    continue;
                                }
                                break;
                            } catch (Exception e) {
                                System.out.println("Invalid input. Please enter a  valid number.");
                                scanner.nextLine();
                            }
                        }
                        while (true) {
                            System.out.print("Please enter the height (must be greater than or equal to 2): ");
                            try {
                                height = scanner.nextInt();
                                if (height < 2) {
                                    System.out.println("Invalid input. Please enter a height greater than or equal to 2.");
                                    continue;
                                }
                                break;
                            } catch (Exception e) {
                                System.out.println("Invalid input. Please enter a valid number.");
                                scanner.nextLine();
                            }
                        }

                        Triangle.Trianglechecker(Length, height);


                        break;
                    case 3:
                        System.out.println("Exit option selected.");
                        break;
                    default:
                        System.out.println("Invalid input.");   //  אין צורך רק ליתר ביטחון
                        break;
            }
                if (num==3){
                    break;
                }
        }

    }
}



