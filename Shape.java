import java.util.*;
import java.lang.*;
import java.io.*;

abstract class Shape
{
    double l,b;
    
    double area;
    abstract public double printarea();
    abstract public void input();
    
}
class Rectangle extends Shape
{
    
    
    public double printarea()
	    {
	        
	        area = l *b ;
            
            
            System.out.println("the area of rectangle is " + area);
            
            return area;
        }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length ");
        l = sc.nextInt();
        System.out.print("enter the breadth ");
        b = sc.nextInt();
        
    }
}



class Square extends Shape
{
    public double printarea()
    {
        area=l*l;
        System.out.println("the area of square is " + area);
        return area;
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the side ");
        l = sc.nextInt();
        
    }
        
}



class Circle extends Shape
{
    public double printarea()
    {
        double pi = 3.14;
        area=pi*l*l;
        System.out.println("the area of circle is " + area);
        return area;
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius ");
        l=sc.nextInt();
    }
    
}


class Triangle extends Shape
{
    public double printarea()
    {
        area=0.5*l*b;
        System.out.println("the area of triangle is " + area);
        return area;
        
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the base ");
        l=sc.nextInt();
        System.out.print("enter the height ");
        b=sc.nextInt();
    }
}



class Parallelogram extends Shape
{
    public double printarea()
    {
        area=l*b;
        System.out.println("the area of parallelogram is " + area);
        return area;
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the base ");
        l=sc.nextInt();
        System.out.print("enter the height ");
        b=sc.nextInt();
    }
    
}



class Main
{
    
    public static void main(String[] args)
	{
	    
        double sum=0;
        Rectangle r = new Rectangle();
        Square s = new Square();
        Circle c = new Circle();
        Triangle t = new Triangle();
        Parallelogram p = new Parallelogram();
       
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter total shapes ");
        int n = sc.nextInt();
        
      for(int i=0;i<n;i++)
        {
            System.out.println("enter shape ");
            String shape = sc.next();
            if(shape.equals("rectangle"))
            {
                r.input();
                r.printarea();
                sum=sum+r.area;
                
                
            }
            else if(shape.equals("square"))
            {
                s.input();
                s.printarea();
                sum=sum+s.area;
                
            }
            else if(shape.equals("circle"))
            {
                c.input();
                c.printarea();
                sum=sum+c.area;
            
                
            }
            else if(shape.equals("triangle"))
            {
                t.input();
                t.printarea();
                sum=sum+t.area;
            }
            else if(shape.equals("parallelogram"))
            {
                p.input();
                p.printarea();
                sum=sum+p.area;
            }
            
            else
            {
              System.out.println("sorry not found");  
            }
            
        }System.out.println("the total area is " + sum);  
	}
}
            