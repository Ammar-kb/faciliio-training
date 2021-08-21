
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
            
            
            System.out.printf("Rectangle length is %s breadth is %s area is %s ",l,b,area);
            
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
        System.out.printf("square  side is %s area is %s ",l,area);
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
        System.out.printf("Circle radius is %s area is %s",l,area);
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
        System.out.printf("triangle base is %s heaight is %s area is %s ",l,b,area);
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
        System.out.println("Parallelogram base is %s height is %s "l,b,area);
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
	    int a=0;
	    int b=0;
	    int d=0;
	    int f=0;
        int i;
        int j;
        int k;
        
        //ArrayList<Rectangle> r = new ArrayList<Rectangle>();
        
        
        Rectangle r[] = new Rectangle[5];
        Square s[] = new Square[5];
        Circle c[] = new Circle[5];
        Triangle t[] = new Triangle[5];
        Parallelogram p[] = new Parallelogram[5];
       
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter total shapes ");
        int n = sc.nextInt();
        
      for(i=0;i<n;i++)
        {
            System.out.println("enter shape ");
            String shape = sc.next();
            if(shape.equals("rectangle"))
            {
                
                
                a++;
                r[i]=new Rectangle();
                
                r[i].input();
                
                
                
                
                
            }
            else if(shape.equals("square"))
            {
                b++;
                s[i]=new Square();
                s[i].input();
                
                
                
            }
            else if(shape.equals("circle"))
            {
                d++;
                c[i]=new Circle();
                c[i].input();
                
            
                
            }
            else if(shape.equals("triangle"))
            {
                e++;
                t[i]=new Triangle();
                t[i].input();
                
            }
            else if(shape.equals("parallelogram"))
            {
                f++;
                p[i]=new Parallelogram();
                p[i].input();
               
                
            }
            
            else
            {
              System.out.println("sorry not found");  
            }
            
        }
        //to print rectangle  area
        for(j=0;j<=a;j++)
        {
            r[j].printarea();
        }
        // to print square area...... giving null pointer exception error;
        for(k=0;k<=b;k++)
        {
            s[k].printarea();
        }
        
	}
}
            

