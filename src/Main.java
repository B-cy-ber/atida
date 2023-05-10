import java.util.Scanner;
import  java.lang.Math;


public class Main {
    // פונקציה הבודקת אם המלבן עומד בתנאים ולפי זה שולחת לפונקציה שמדפיסה את השטח או ההקיף
   /* private static void rectanglechecker(int length,int height) {
        if ((length == height) || ((Math.abs(length - height) )> 5) ){
            rectangleAreaPRINT( length, height);
        }
        else {
            rectanglePerimeterPRINT(length,height);
        }

    }
    // מדפיסה את השטח של המלבן
    private static void rectangleAreaPRINT(int length,int height) {
        System.out.println("Area of rectangle is: " + (length * height));

    }
    // מדפיסה את ההקף של המלבן
    private static void rectanglePerimeterPRINT(int length,int height) {
        System.out.println("Perimeter of rectangle is: " +  2 * (length + height));

    }




    //פונקציה שבודקת מה לעשות עם המשושלש
        public static void Trianglechecker(int length, int height) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.print("Enter '1' to print the perimeter of the triangle, or '2' to print the shape of the triangle: ");
        //בודק אם הקלט שהוכנס תקין
        while (true) {
            try {
                choice = scanner.nextInt();
                if (choice < 1 || choice > 2) {
                    System.out.println("Invalid input. Please enter a number between 1 and 2.");
                    continue;

                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 2.");
                scanner.nextLine();

            }
        }
        if (choice == 1) {
            trianglePerimeterPRINTER(length,height);
        }
        else {
            printTriangle(length, height);

        }
    }

    // פונקציה המדפיסה את היקף המשולש
    private static void trianglePerimeterPRINTER(int length,int height) {
        // Calculate the length of the equal sides
        double side = Math.sqrt(Math.pow(length / 2, 2) + Math.pow(height, 2));

        // Calculate the perimeter
        double perimeter = 2 * side + length;
        System.out.println("Perimeter of triangle is: " + perimeter);
    }


        //  מדפיס את הצורה של המשולש מכוכביות.
    public static void printTriangle(int length, int height) {
        if (length % 2 == 0 || length > height * 2) {//   שני התנאים: המשולש חייב להיות באורך אי זוגי והרוחב....
            System.out.println("The triangle cannot be printed.");
        } else {
            int divisor=countOddDivisors(length);//כמה מספרים אי זוגיים נכנסים לאורך לא כולל 1 ועצמו.
            int NumofRows=(height-2)/divisor;// כמה פעמים מכל סוג שורה
            int remainder = (height-2) % divisor;// שארית שממנ היודפסו שורות של 3
            printline(1,length);//הדפסת השורה העליונה במשולש
            for (int i = 0; i < remainder; i += 1) {//הדפסת שורות של שלוש כוכביות כמספר השארית
                printline(3,length);
            }
            int numstars=3;
            for (int i = 0; i <divisor ; i += 1) {//  הדפסת שאר השורות האמצעיות
                for (int J = 0; J < NumofRows; J += 1) {
                    printline(numstars, length);

                }
                numstars+=2;
            }
            printline(length, length);// הדפסת השורה התחתונה
            System.out.println();

        }
    }
    // כמה מספרים אי זוגיים נכנסים לאורך לא כולל 1 ועצמו.
    public static int countOddDivisors(int num) {
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    //מדפיסה שורת כוכביות
    public static void printline (int star, int length) {
        int space=(length-star)/2;
        for (int i = 0; i < space; i += 1) {
            System.out.print(" ");
        }
        for (int i = 0; i < star; i += 1) {
            System.out.print("*");
        }
        for (int i = 0; i < space; i += 1) {
            System.out.print(" ");
        }
        System.out.println();

    }
*/


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



