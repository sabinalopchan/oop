

import javax.swing.*;

//1.	Write a program to take student details as input and display the result.
class Detail {
    public static void main(String[] args) {
        String name, address;
        int age, batch;
        name = (JOptionPane.showInputDialog(null,"Name: " ));
        address = (JOptionPane.showInputDialog(null,"Address: " ));
        age = Integer.parseInt(JOptionPane.showInputDialog(null,"Age: " ));
        batch = Integer.parseInt(JOptionPane.showInputDialog(null,"Batch: " ));
        JOptionPane.showMessageDialog(null,"Name:"+name+"\n Address:"+address
        +"\nAge:"+age+"\nBatch:"+batch);
    }
}

//2.	Write a program to calculate sum of four numbers taking user input.
class SumNum{
    public static void main(String[] args) {
       Double num1, num2,num3,sum;
       num1=Double.parseDouble(JOptionPane.showInputDialog("Enter first number:"));
       num2=Double.parseDouble(JOptionPane.showInputDialog("Enter second number:"));
       num3=Double.parseDouble(JOptionPane.showInputDialog("Enter third number:"));
       sum=num1+num2+num3;
       JOptionPane.showMessageDialog(null,"Sum of given three numbers:"+sum);

    }
}

//3.	Write a program to take input of the total marks of four subjects of a student and calculate the total percentage secured. Then display the percentage and final result of the student;
//        If equal to or more than 70 -> First Class
//        If more than 59 -> Upper second Class
//        If more than 49 -> Second class
//If more than 39 -> Third class and if below than 40 the result is fail
class StudentResult{
    public static void main(String[] args) {
        float sub1, sub2,sub3,sub4,total,per;
        sub1=Integer.parseInt(JOptionPane.showInputDialog("Enter marks for sub1:"));
        sub2=Integer.parseInt(JOptionPane.showInputDialog("Enter marks for sub2:"));
        sub3=Integer.parseInt(JOptionPane.showInputDialog("Enter marks for sub3:"));
        sub4=Integer.parseInt(JOptionPane.showInputDialog("Enter marks for sub4:"));
        total=sub1+sub2+sub3+sub4;
        per=total*100/400;
        String result1;
        result1=(per>=70)?"First Class" : (per>59 && per<70)?"Second Class" :
                (per>49 && per<59)?"Third Class" :(per>39 && per<49)?"Fourth Class" : "Fail";
        JOptionPane.showMessageDialog(null,"Total:"+total+"\nPercentage"+per+"\n"+result1);
    }
}

//4.	Write a program to take two integer inputs from user and print sum and product of them.
//5. Take two integer inputs from user. First calculate the sum of two then product of two.
//        Finally, print the sum and product of both obtained results.
class ProductSum{
    public static void main(String[] args) {
        int num1,num2,sum,product,obtainedSum,obtainedPro;
        num1=Integer.parseInt(JOptionPane.showInputDialog("Enter first number:"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Enter second number:"));
        sum=num1+num2;
        product=num1*num2;
        obtainedSum=sum+product;
        obtainedPro=sum*product;
        JOptionPane.showMessageDialog(null,"Sum:"+sum+"\nProduct:"+product+"\nSum of obtained result:"+obtainedSum+
                "\nProduct of obtained result:"+obtainedPro);
    }
}

//5.	Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
class AreaRectangle{
    public static void main(String[] args) {
        double length, breadth, area;
        length=Double.parseDouble(JOptionPane.showInputDialog("Enter length of rectangle:"));
        breadth=Double.parseDouble(JOptionPane.showInputDialog("Enter length of breadth:"));
        area=length*breadth;
        JOptionPane.showMessageDialog(null,"Area of rectangle:"+ (int) area);

    }
}

//6.	Take name, roll number and field of interest from user and print in the format below :
//        Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
class Stud{
    public static void main(String[] args) {
        String name,field;
        int roll;
        name=(JOptionPane.showInputDialog("Enter name:"));
        field=(JOptionPane.showInputDialog("Enter interest field:"));
        roll=Integer.parseInt(JOptionPane.showInputDialog("Enter roll num.:"));
        JOptionPane.showMessageDialog(null,"Hey, my name is "+name+" and my roll number is "+roll+
                ". My field of interest is "+field);
    }
}

//7.	Take side of a square from user and print area and perimeter of it.
//        Also, calculate SI, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
class SquareArea{
    public static void main(String[] args) {
//        for square
        float length,area, perimeter;
        length=Float.parseFloat(JOptionPane.showInputDialog("Enter length side of a square:"));
        area=length*length;
        perimeter=4*length;
        JOptionPane.showMessageDialog(null,"Area of square: "+area+"\nPerimeter of square :"+perimeter);
//        for simple interest
        float p,t,r,si;
        p=Float.parseFloat(JOptionPane.showInputDialog("Enter principle:"));
        t=Float.parseFloat(JOptionPane.showInputDialog("Enter rate:"));
        r=Float.parseFloat(JOptionPane.showInputDialog("Enter time:"));
        si=p*t*r/100;
        JOptionPane.showMessageDialog(null,"Simple Interest :"+si);

//        for triangle;
        float l,b,areaT;
        l=Float.parseFloat(JOptionPane.showInputDialog("Enter length of triangle:"));
        b=Float.parseFloat(JOptionPane.showInputDialog("Enter breadth triangle:"));
       areaT=l*b;
        JOptionPane.showMessageDialog(null,"Area of triangle :"+areaT);

//       for cube and cuboid
        float l2,l1,b1,w,volumeOfCube,volumeOfCuboid;
        l2=Float.parseFloat(JOptionPane.showInputDialog("Enter the edge length of cube:"));
        volumeOfCube=l2*l2;
        JOptionPane.showMessageDialog(null,"Volume of cube :"+volumeOfCube);

        l1=Float.parseFloat(JOptionPane.showInputDialog("Enter length of cuboid:"));
        b1=Float.parseFloat(JOptionPane.showInputDialog("Enter breadth of cuboid:"));
        w=Float.parseFloat(JOptionPane.showInputDialog("Enter width of cuboid:"));
        volumeOfCuboid=l1*b1*w;
        JOptionPane.showMessageDialog(null,"Volume of cuboid :"+volumeOfCuboid);

    }
}

//8.	Write a program to find square of a number.
//        E.g.- INPUT : 2        OUTPUT : 4
//        INPUT : 5        OUTPUT : 25

class SquareOfNum{
    public static void main(String[] args) {
        int num, square;
        num=Integer.parseInt(JOptionPane.showInputDialog("Enter  number:"));
        square=num*num;
        JOptionPane.showMessageDialog(null,"Square of given number :"+square);
    }
}

//9.	Take two different string input and print them in same line. E.g.-
//        INPUT : Codes
//        Dope
//        OUTPUT : CodesDope

class Variable{
    public static void main(String[] args) {
        String var1,var2;
        var1=(JOptionPane.showInputDialog("Enter first string: "));
        var2=(JOptionPane.showInputDialog("Enter second string: "));
        JOptionPane.showMessageDialog(null,"Output: "+var1+var2);
    }
}

//10.	Take 3 inputs from user and check :
//        all are equal any of two are equal
//        ( use && || with ternary operator )

class InputCheck{
    public static void main(String[] args) {
        int a,b,c;
        a=Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
        b=Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));
        c=Integer.parseInt(JOptionPane.showInputDialog("Enter third number: "));
        String checkInput;
        checkInput=(a==b && a==c && b==c) ? "All are equal" : ((a==b) || (a==c) || (b==c)) ? "Any of two are equal":"None of them are equal";
        JOptionPane.showMessageDialog(null,"Output:"+checkInput);

    }
}


//11.	Write a program to enter the values of two variables 'a' and 'b' from keyboard and
//        then check if both the conditions 'a < 50' and 'a < b' are true.

class CheckValue{
    public static void main(String[] args) {
        int a,b;
        a=Integer.parseInt(JOptionPane.showInputDialog("Enter value of a:"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Enter value of b:"));
        String checkValue;
        checkValue=(a<50 && a<b) ? "True" : "False";
        JOptionPane.showMessageDialog(null,"Output: "+checkValue);
    }
}

//12.	If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//        write a program to calculate his total marks and percentage marks.
class CalculateResult{
    public static void main(String[] args) {
        float sub1,sub2,sub3,total,per;
        sub1=Float.parseFloat(JOptionPane.showInputDialog("Enter marks in oop: "));
        sub2=Float.parseFloat(JOptionPane.showInputDialog("Enter marks in python: "));
        sub3=Float.parseFloat(JOptionPane.showInputDialog("Enter marks in database: "));
        total=sub1+sub2+sub3;
        per=(total*100)/300;
        JOptionPane.showMessageDialog(null,"Total marks of Robert: "+total+"\nTotal percentage:"+per+"%");
    }
}
