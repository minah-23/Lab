package project1;

import java.awt.geom.Point2D;
import java.lang.*;
import java.util.Scanner;

public class Lab {

    public static void main(String[] args) {
//        Vector a = new Vector(1, 1);    //intialize vector a = 1i, 1j
//        Vector b = new Vector(2, 3);    //intialize vector b = 2i, 3j
//        Vector c, d;
//        Point2D p1 = new Point2D.Double(3,8);
//
//        //Question 1
//        c = Vector.add(a, b);         // vector c is the add of a and b vectors
//        c.print();
//
//        d = Vector.sub(b, a);         // vector c is the sub of a and b vectors
//        d.print();
//        
//        b.read();                         // function read()
//        b.print();
//
//        //Question 2
//        Line2D line1 = new Line2D(p1,b);          //initalize line1 based on passed point and  vector
//        Line2D line2 = new Line2D(1,2);       //initalize line2 based on passed x and y coordinates
//        
//        line1.print();
//        line2.print();
        
        //Question 3
        MyStringBuffer x= new MyStringBuffer("Welcome");    //define string
        x.print();    
        
        System.out.println(x.indexOf('z'));               //getting index of 'z'
        
        System.out.println(x.length());                     //geting length of string
        
        x.insert(2,"xyz");                            //testing onsert method
        x.print();
        
        x.erase(3,4);                               //testing erase method
        x.print();
        
        //Question 4
        MyString y= new MyString("Congratulations");    //define string
        y.print();
        
        System.out.println(y.indexOf('M'));               //getting index of 'M'
        
        System.out.println(y.length());                     //geting length of string
        
        MyString z;
        z=y.erase(3,4);                             //testing erase method
        z.print();
        
        MyString w;                                           //testing insert method
        w=y.insert(3,"xyz");
        w.print();
        
        
        
    }
    
    public static class MyStringBuffer
    {
        
        private char [] ch; 
        private String s;
        MyStringBuffer(String z)
        {
            s=z;
            ch = new char[s.length()];
            for(int i=0 ; i<s.length() ; i++ )
            {
                ch[i] = s.charAt(i);
            }
            
        }
        
        //print()
        void print()
        {
            for(int i=0 ; i<s.length() ; i++ )
            {
                System.out.print(ch[i]);
            }
            System.out.println();
        }
        
        //indexOf(char c)
        int indexOf(char c)
        {   int a=-1;
            for(int i=0 ; i<s.length() ; i++ )
            {
                if(ch[i]==c)
                {
                    a=i;
                    break;
                }
            }
            return a;
        }
        
        //length()
        int length()
        {
            return s.length();
        }
        
        //erase(int index, int length)
        void erase(int index, int length)
        {
            for( int i=index; i < index+length ;i++ )
            {
                ch[i]='\0';
            }
        }
        
        //insert(int index, String str)
        void insert(int index, String str)
        {
            
            char []x = new char[s.length()]; 
            //this loop to save the rest of array starting from index stated
            for(int i=index, j=0; i < s.length() ;i++, j++)
            {
                x[j]=ch[i];
            }
            
            //this loop to insert the string stated
            for(int i=index, j=0; i < s.length() && j<str.length() ;i++, j++)
            {
                ch[i]=str.charAt(j); 
            }
            
            //this loop to add the rest of the array after string insertion
            for( int i=index+str.length(), j=0; i < s.length() ;i++, j++)
            {
                if(i<s.length())ch[i]=x[j];
            }
        }
    }
    
    public static class MyString
    {
        
        private char [] ch; 
        private String s;
        MyString(String z)
        {
            s=z;
            ch = new char[s.length()];
            for(int i=0 ; i<s.length() ; i++ )
            {
                ch[i] = s.charAt(i);
            }
            
        }
        
        //print()
        void print()
        {
            for(int i=0 ; i<s.length() ; i++ )
            {
                System.out.print(ch[i]);
            }
            System.out.println();
        }
        
        //indexOf(char c)
        int indexOf(char c)
        {   int a=-1;
            for(int i=0 ; i<s.length() ; i++ )
            {
                if(ch[i]==c)
                {
                    a=i;
                    break;
                }
            }
            return a;
        }
        
        //length()
        int length()
        {
            return s.length();
        }
        
        //erase(int index, int length)
        MyString erase(int index, int length)
        {
            MyString x= new MyString(s);
            for( int i=index; i < index+length ;i++ )
            {
                x.ch[i]='\0';
            }
            return x;
        }
        
        //insert(int index, String str)
        MyString insert(int index, String str)
        {
            MyString w= new MyString(s);
            char []x = new char[s.length()]; 
            //this loop to save the rest of array starting from index stated
            for(int i=index, j=0; i < s.length() ;i++, j++)
            {
                x[j]=ch[i];
            }
            
            //this loop to insert the string stated
            for(int i=index, j=0; i < s.length() && j<str.length() ;i++, j++)
            {
                w.ch[i]=str.charAt(j); 
            }
            
            //this loop to add the rest of the array after string insertion
            for( int i=index+str.length(), j=0; i < s.length() ;i++, j++)
            {
                if(i<s.length())w.ch[i]=x[j];
            }
            return w;
        }
    }
    
    public static class Line2D

    {
     private Point2D point = new Point2D.Double();
     private Vector vec = new Vector();

    

    Line2D(Point2D p, Vector v) {
        point = p;
        vec = v;
    }

    

    Line2D(double x, double y) {
        point.setLocation(x, y);
        vec.setX(x);
        vec.setY(y);
    }

    void print() {
        System.out.println("X-Coordinate: " + point.getX());
        System.out.println("Y-Coordinate: " + point.getY());
        System.out.println("Direction: " + vec.angle());
    }
}

public static double averageMagnitude(Vector [] x)
    {
        double av=0,n=0,tot=0;
        for(int i=0;i<x.length;i++)
        {
            n++;                     // counts number of vectors
            tot+= x[i].magnitude() ; //calculates total of magnitudes
        }
        return av = tot/n;           //return average magnitude 


}

    public static class Vector {

    private double x, y;

    Vector() {
    }

    Vector(double a, double b) {
        x = a;
        y = b;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    void setX(double x) {
        this.x = x;
    }

    void setY(double y) {
        this.y = y;
    }

    double magnitude() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    double angle() {
        double a = (y / x);                 // y/x is tan of an angle
        return Math.atan(a) * 180 / Math.PI;    //the result of atan is in radian form so convert it to degree
    }

    void print() {
        System.out.println("Unit vectors: " + x + "i, " + y + "j");
        System.out.println("Magnitude and direction: " + magnitude() + "[" + angle() + "]");
    }

    static Vector add(Vector v, Vector z) {
        double a = z.getX() + v.getX();      // x of new vector equals x of existing vector + x of passed vector
        double b = z.getY() + v.getY();      // y of new vector equals y of existing vector + y of passed vector
        Vector x = new Vector(a, b);
        return x;
    }

    static Vector sub(Vector v, Vector z) {
        double a = v.getX() - z.getX();      // x of new vector equals x of existing vector - x of passed vector
        double b = v.getY() - z.getY();      // y of new vector equals y of existing vector - y of passed vector
        Vector x = new Vector(a, b);
        return x;
    }

    void read() {
        Scanner input = new Scanner(System.in);
        this.x = input.nextDouble();
        this.y = input.nextDouble();
    }
}
}
