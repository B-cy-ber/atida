import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
        while (true) {
            System.out.print("Please enter a number between 0 and 3///////////////: ");
            try {
                num = scanner.nextInt();
                if (num < 0 || num > 3) {
                    System.out.println("Invalid input. Please enter a number between 0 and 3.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 0 and 3.");
                scanner.nextLine();
            }
        }
        int Length, height;
        switch (num) {
            case 1:
                System.out.println("Option malben is selected.");
                System.out.println("enter Length.");
                Length = scanner.nextInt();
                System.out.print("Please enter the height (must be greater than or equal to 2): ");
                height = scanner.nextInt();
                while (height < 2) {
                    System.out.println("Invalid input. Please enter a valid height.");
                    height = scanner.nextInt();

                }
                rectanglechecker(Length, height);

                break;
            case 2:
                System.out.println("Option masholash is selected.");
                System.out.println("enter Length.");
                Length = scanner.nextInt();
                System.out.print("Please enter the height (must be greater than or equal to 2): ");
                height = scanner.nextInt();
                while (height < 2) {
                    System.out.println("Invalid input. Please enter a valid height.");
                    height = scanner.nextInt();
                }
          Trianglechecker(Length, height);


                break;
            case 3:
                System.out.println("Option 3 is selected.");
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }
    }

}

    private static void rectanglechecker(int length,int height) {
        if (length == height || Math.abs(length - height) > 5) {
                System.out.println("Area of rectangle is: " + (length * height));
            }
        else {
                System.out.println("Perimeter of rectangle is: " +  2 * (length + height));

        }

    }


    public static void Trianglechecker(int length, int height) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter '1' to print the perimeter of the triangle, or '2' to print the shape: ");
        int choice = scanner.nextInt();


        double hypotenuse = Math.sqrt(length * length + height * height);//TODO
        double perimeter = length + height + hypotenuse;

        if (choice == 1) {
            System.out.println("Perimeter of triangle is: " + perimeter);
        } else if (choice == 2) {
            printTriangle(length, height);

        } else {
            System.out.println("Invalid choice. Please enter '1' or '2'.");
        }//todo להחזיר את האפשרות להכניס שוב.
        }

   //  מדפיס את הצורה של המשולש מכוכביות.
        public static void printTriangle(int length, int height) {
            if (length % 2 == 0 || length > height * 2) {// שני התנאים
                System.out.println("The triangle cannot be printed.");
            } else {
                int divisor=countOddDivisors(length);
                System.out.println(divisor);
                int NumofRows=(height-2)/divisor;// כמה פעמים מכל סוג שורה
                System.out.println(NumofRows);
                int remainder = (height-2) % divisor;// שארית שממנ היודפסו שורות של 3
                System.out.println(remainder);
                printline(1,length);
                for (int i = 0; i < remainder; i += 1) {
                    printline(3,length);
                }
                int numstars=3;
                for (int i = 0; i <divisor ; i += 1) {
                    for (int J = 0; J < NumofRows; J += 1) {
                        printline(numstars, length);

                    }
                    numstars+=2;
                }
                printline(length, length);
                System.out.println();

            }
        }
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
         int space=((length-1)/2)-(((star-1)/2));// מחשב כמה רווח להשים בשורה כדי שהכוכביות תיהיו באמצע

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
    }



