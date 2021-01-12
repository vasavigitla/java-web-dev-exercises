package exercises;

import java.util.Scanner;

class AreaOfRectangle {

    public static void main(String[] args) {
//    What data types should the dimensions be?
//    2,5,1000,10000,0.1,2.7634
//    doubles - Hold our value

        AreaOfRectangle areaOfRectangle = new AreaOfRectangle();
        areaOfRectangle.calculateAreaOfRectangle();
    }


    public void calculateAreaOfRectangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length of the rectangle?");
        Double myRectLength = scanner.nextDouble();

        System.out.println("What is the width of the rectangle?");
        Double myRectWidth = scanner.nextDouble();

// Area  =  length * width
        double area = myRectLength *  myRectWidth;

        System.out.println("Your area is: " + area);
    }
}