
import java.util.Scanner;

//1. Write a program to take student details as input and display the result.
public class Assignment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=scanner.nextLine();
        System.out.println("Enter address:");
        String address=scanner.nextLine();
        System.out.println("Enter age:");
        int age=scanner.nextInt();
        System.out.println("Enter batch:");
        int batch=scanner.nextInt();

        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Address:"+address);
        System.out.println("Batch:"+batch);

    }
}

//2. Write a program to calculate sum of four numbers taking user input.
class Sum{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=scanner.nextInt();
        System.out.println("Enter second number:");
        int num2=scanner.nextInt();
        System.out.println("Enter third number:");
        int num3=scanner.nextInt();
        System.out.println("Enter fourth number:");
        int num4=scanner.nextInt();

        int sum=num1+num2+num3+num4;
        System.out.println("Sum of 4 numbers is:"+sum);
    }
}
//. Write a program to take input of the total marks of four subjects of a student and calculate
//        the total percentage secured. Then display the percentage and final result of the student;
//        a. If equal to or more than 70 -> First Class
//        b. If more than 59 -> Upper second Class
//        c. If more than 49 -> Second class
//d. If more than 39 -> Third class and if below than 40 the result is fail.

class Student{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter marks of first subject:");
        float sub1=scanner.nextFloat();
        System.out.println("Enter marks of second subject:");
        float sub2=scanner.nextFloat();
        System.out.println("Enter marks of third subject:");
        float sub3=scanner.nextFloat();
        System.out.println("Enter marks of fourth subject:");
        float sub4=scanner.nextFloat();

        float total=sub1+sub2+sub3+sub4;
        System.out.println("Total marks:"+total);

        float per=(total*100)/400;
        System.out.println("Total percentage:"+per);

        String result;
        result=(per>=70)?"First Class" : (per>59 && per<70)?"Second Class" :
                (per>49 && per<59)?"Third Class" :(per>39 && per<49)?"Fourth Class" : "Fail";
        System.out.println(result);
    }
}

//4. Write a program to take two integer inputs from user and print sum and product of them.
//5. Take two integer inputs from user. First calculate the sum of two then product of two.
//        Finally, print the sum and product of both obtained results.
class SumProduct{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=scanner.nextInt();
        System.out.println("Enter second number:");
        int num2=scanner.nextInt();

        int sum=num1+num2;
        int product=num1*num2;
        System.out.println("Sum:"+sum);
        System.out.println("Product:"+product);

        int finalSum=sum+product;
        int finalProduct=sum*product;
        System.out.println("Sum of obtained result:"+finalSum);
        System.out.println("Product of obtained result:"+finalProduct);
    }
}

//6. Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
class Area{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        double length= scanner.nextDouble();
        System.out.println("Enter breadth of rectangle");
        double breadth= scanner.nextDouble();
        double area=length*breadth;
        System.out.println("Area of rectangle is:" + (int) area);
    }
}

//7. Take name, roll number and field of interest from user and print in the format below :Hey,
//        my name is xyz and my roll number is xyz. My field of interest are xyz.
class Details{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=scanner.nextLine();
        System.out.println("Enter roll number:");
        String roll=scanner.nextLine();
        System.out.println("Enter field of interest:");
        String field=scanner.nextLine();
        System.out.println("Hey, my name is"+name+ "  and my roll number is"+roll+
                "   my field of interest is:"+field);
    }
}

//8. Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
//        of triangle and Volume of Cube and Cuboid. Take the attributes as user input.

class Square{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length of side of a square:");
        float length=scanner.nextFloat();
        float area=length*length;
        float perimeter=4*length;
        System.out.println("Area of square is" +area);
        System.out.println("Perimeter of a square is" +perimeter);
    }
}
class Triangle{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        to calculate simple interest
        System.out.println("Enter principle,rate and time:");
        float principle=scanner.nextFloat();
        float time=scanner.nextFloat();
        float rate=scanner.nextFloat();
       float si=(principle*time*rate)/100;
        System.out.println("Simple Interest is" +si);
//        to calculate area of triangle
        System.out.println("Enter length and breadth of triangle:");
        float length=scanner.nextFloat();
        float breadth=scanner.nextFloat();
        float area=length*breadth;
        System.out.println("Area of triangle is" +area);
//        to find volume of cube
        System.out.println("Enter the edge length of cube:");
        float len=scanner.nextFloat();
        float volumeCube=len*len;
        System.out.println("Volume of cube is" +volumeCube);
//        to find volume of cuboid
        System.out.println("Enter the length, breadth and width of cuboid:");
        float length1=scanner.nextFloat();
        float breadth1=scanner.nextFloat();
        float width1=scanner.nextFloat();
        float volumeCuboid=length1*breadth1*width1;
        System.out.println("Volume of cuboid is" +volumeCuboid);

    }
}

//9. Write a program to find square of a number.
//        E.g.- INPUT : 2 OUTPUT : 4
//        INPUT : 5 OUTPUT : 25

class Number{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number:");
        Double number=scanner.nextDouble();
        Double sqr=number*number;
        System.out.println("Square of a given number" +sqr);
    }
}

//10. Take two different string input and print them in same line. E.g.-
//        INPUT : Codes
//        Dope
//        OUTPUT : CodesDope
class StringFirst{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two string:");
        String char1=scanner.nextLine();
        String char2=scanner.nextLine();
        System.out.println("Output is" +char1+char2);
    }
}

//11. Take 3 inputs from user and check :
//        all are equal
//        any of two are equal
//        ( use && || with ternary operator )
class Check{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        String checkInput;
        checkInput=(a==b && a==c && b==c) ? "All are equal" : ((a==b) || (a==c) || (b==c)) ? "Any of two are equal":"None of them are equal";
        System.out.println(checkInput);
    }
}

//12.	Write a program to enter the values of two variables 'a' and 'b' from keyboard and
//        then check if both the conditions 'a < 50' and 'a < b' are true.
class Condition{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=scanner.nextInt();
        System.out.println("Enter the value of b:");
        int b=scanner.nextInt();
        String check1;
        check1=(a<50 && a<b) ? "True" : "False";
        System.out.println(check1);
    }
}

//13.	If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//        write a program to calculate his total marks and percentage marks.
class Result{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the marks of Robert in three subjects:");
        float sub1=scanner.nextFloat();
        float sub2=scanner.nextFloat();
        float sub3=scanner.nextFloat();
        float total=sub1+sub2+sub3;
        float percentage=(total*100)/300;
        System.out.println("His total marks is \t"+ total);
        System.out.println("His percentage is\t" + percentage+"%");
    }
}