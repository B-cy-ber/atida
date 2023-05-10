public class Rectangle {
    static void rectanglechecker(int length, int height) {
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

}
