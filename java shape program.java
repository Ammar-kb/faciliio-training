import java.util.*;
import java.lang.*;
import java.io.*;

class Rectangle 
{
    
    
    double  rectarea(double rect_area)
	    {
	        
	        Scanner sc = new Scanner(System.in);
	        
        	System.out.print("enter the length");
            float l = sc.nextInt();
            System.out.print("enter the breadth");
            float b = sc.nextInt();
            rect_area=l*b;
            
            
            System.out.println("the area of rectangle is " + rect_area);
            
            
            return rect_area;
            
            
        }
}

class Square
{
    double sqarea(double sq_area)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the side");
        float s = sc.nextInt();
        sq_area=s*s;
        
        
        System.out.println("the area of square is " + sq_area);
        
        
        return sq_area;
        
        
    }
}

class Circle
{
    double cirarea(double cir_area)
    {
        
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the raidius");
        float r = sc.nextInt();
        cir_area=pi*r*r;
        
        
        System.out.println("the area of circle is " + cir_area);
        
        return cir_area;
    }
}

class Triangle
{
    double triarea(double tri_area)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the base");
        float b = sc.nextInt();
        System.out.print("enter the height");
        float h = sc.nextInt();
        tri_area=0.5*b*h;
        
        
        System.out.println("the area of triangle is " + tri_area);
        
        return tri_area;
    }
}

class Parallelogram
{
    double parrarea(double parr_area)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the base");
        float b = sc.nextInt();
        System.out.print("enter the height");
        float h = sc.nextInt();
        parr_area=b*h;
        
        
        System.out.println("the area of parallelogram is " + parr_area);  
        
        return parr_area;
    }
}




class Main
{
    
    public static void main(String[] args)
	{
	    double sum=0;
        
        Rectangle obj1 = new Rectangle();
        Square obj2 = new Square();
        Circle obj3 = new Circle();
        Triangle obj4 = new Triangle();
        Parallelogram obj5 = new Parallelogram();
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter total shapes");
        int n = sc.nextInt();
        
      for(int i=0;i<n;i++)
        {
            System.out.println("enter shape");
            String shape = sc.next();
            if(shape.equals("rectangle"))
            {
				
                sum=sum+obj1.rectarea(sum);
            }
            else if(shape.equals("square"))
            {
                sum=sum+obj2.sqarea(sum);
            }
            else if(shape.equals("circle"))
            {
                sum=sum+obj3.cirarea(sum);
            }
            else if(shape.equals("triangle"))
            {
                sum=sum+obj4.triarea(sum);
            }
            else if(shape.equals("parallelogram"))
            {
                sum=sum+obj5.parrarea(sum);
            }
            else{
                System.out.println("sorry the shape was not found");
            }
            
        }System.out.println("the total area is " + sum);     
        
    }   
}