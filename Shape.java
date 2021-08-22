
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList.*;

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
            
            
            System.out.printf("Rectangle: length is %s breadth is %s area is %s ",l,b,area);
            
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
        System.out.printf("square:  side is %s area is %s ",l,area);
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
        System.out.printf("Circle: radius is %s area is %s",l,area);
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
        System.out.printf("triangle: base is %s heaight is %s area is %s ",l,b,area);
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
        System.out.printf("Parallelogram: base is %s height is %s area is %s ",l,b,area);
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
	    
        int i;
        int j;
        
        
        Shape s[] = new Shape[5];
        
        //Shape s;
        //s=new Rectangle();
        //s=new Square();
        
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter total shapes ");
        int n = sc.nextInt();
        
      for(i=0;i<n;i++)
        {
            System.out.println("enter shape ");
            String shape = sc.next();
            if(shape.equals("rectangle"))
            {
                
                
                s[i]=new Rectangle();
                
                
                
                s[i].input();
                
                
                
                
                
            }
            else if(shape.equals("square"))
            {
                s[i]=new Square();
                s[i].input();
                
                
                
            }
            else if(shape.equals("circle"))
            {
                s[i]=new Circle();
                s[i].input();
                
            
                
            }
            else if(shape.equals("triangle"))
            {
                s[i]=new Triangle();
                s[i].input();
                
            }
            else if(shape.equals("parallelogram"))
            {
                s[i]=new Parallelogram();
                s[i].input();
               
                
            }
            
            else
            {
              System.out.println("sorry not found");  
            }
            
        }
        for(j=0;j<n;j++)
        {
            s[j].printarea();
        }
        
	}
}
            

