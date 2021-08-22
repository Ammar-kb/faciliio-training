import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList.*;

abstract class Shape
{

    double l,b;
    
    double area;
    abstract public void printarea();
    abstract public void input();
    abstract public double calarea();
}
class Rectangle extends Shape
{
    
    
    public void printarea()
	    {
	        
	        
            
            
            System.out.printf("\nRectangle: length is %s breadth is %s area is %s ",l,b,area);
            
            
        }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length ");
        l = sc.nextInt();
        System.out.print("enter the breadth ");
        b = sc.nextInt();
        
    }
    public double calarea()
    {
        area = l *b ;
        return area;
        
    }
    
}



class Square extends Shape
{
    public void printarea()
    {
        
        System.out.printf("\nsquare:  side is %s area is %s ",l,area);
        
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the side ");
        l = sc.nextInt();
        
    }
    public double calarea()
    {
        area=l*l;
        return area;
    }
        
}



class Circle extends Shape
{
    public void printarea()
    {
        
        System.out.printf("\nCircle: radius is %s area is %s",l,area);
        
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius ");
        l=sc.nextInt();
    }
    public double calarea()
    {
       double pi = 3.14;
       area=pi*l*l; 
       return area;
    }
    
}


class Triangle extends Shape
{
    public void printarea()
    {
        
        System.out.printf("\ntriangle: base is %s heaight is %s area is %s ",l,b,area);
        
        
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the base ");
        l=sc.nextInt();
        System.out.print("enter the height ");
        b=sc.nextInt();
    }
    public double calarea()
    {
        area=0.5*l*b;
        return area;
    }
}



class Parallelogram extends Shape
{
    public void printarea()
    {
       
        System.out.printf("\nParallelogram: base is %s height is %s area is %s ",l,b,area);
        
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the base ");
        l=sc.nextInt();
        System.out.print("enter the height ");
        b=sc.nextInt();
    }
    public double calarea()
    {
         area=l*b;
         return area;
    }
    
}



class Main
{
    
    public static void main(String[] args)
	{
	    
        int i;
        int j;
        
        double total=0;
        Shape s[] = new Shape[5];
        
        
        
        
        
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
                total=total+s[i].calarea();
                
                
                
                
            }
            else if(shape.equals("square"))
            {
                s[i]=new Square();
                s[i].input();
                total=total+s[i].calarea();
                
                
                
            }
            else if(shape.equals("circle"))
            {
                s[i]=new Circle();
                s[i].input();
                total=total+s[i].calarea();
            
                
            }
            else if(shape.equals("triangle"))
            {
                s[i]=new Triangle();
                s[i].input();
                total=total+s[i].calarea();
                
                
            }
            else if(shape.equals("parallelogram"))
            {
                s[i]=new Parallelogram();
                s[i].input();
                total=total+s[i].calarea();
                
               
                
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
        System.out.println("\nthe total area is: " + total);
        
	}
}
            