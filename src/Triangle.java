import java.util.Scanner;

public class Triangle {
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
        double side = Math.sqrt(Math.pow(length/2, 2) + Math.pow(height, 2));

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

}
