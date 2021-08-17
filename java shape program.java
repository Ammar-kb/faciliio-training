import java.util.*;
import java.lang.*;
import java.io.*;

class Rectangle 
{
    
    
    float  rectarea(float sum)
	    {
	        
	        Scanner sc = new Scanner(System.in);
	        
        	System.out.print("enter the length");
            float l = sc.nextInt();
            System.out.print("enter the breadth");
            float b = sc.nextInt();
            float rect_area=l*b;
            
            
            System.out.println("the area of rectangle is " + rect_area);
            
            sum =sum +rect_area;
            return sum;
            
            
        }
}

class Square
{
    float sqarea(float sum)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the side");
        float s = sc.nextInt();
        float sq_area=s*s;
        
        
        System.out.println("the area of square is " + sq_area);
        sum=sum+sq_area;
        
        return sum;
        
        
    }
}

class Circle
{
    double cirarea(double sum)
    {
        
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the raidius");
        float r = sc.nextInt();
        double cir_area=pi*r*r;
        
        
        System.out.println("the area of circle is " + cir_area);
        sum=sum+cir_area;
        return sum;
    }
}

class Triangle
{
    double triarea(double sum)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the base");
        float b = sc.nextInt();
        System.out.print("enter the height");
        float h = sc.nextInt();
        double tri_area=0.5*b*h;
        
        
        System.out.println("the area of triangle is " + tri_area);
        sum=sum+tri_area;
        return sum;
    }
}

class Parallelogram
{
    float parrarea(float sum)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the base");
        float b = sc.nextInt();
        System.out.print("enter the height");
        float h = sc.nextInt();
        float parr_area=b*h;
        
        
        System.out.println("the area of parallelogram is " + parr_area);  
        sum=sum+parr_area;
        return sum;
    }
}




class Main
{
    
    public static void main(String[] args)
	{
	    float sum=0;
        
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