from abc import ABC, abstractmethod

class Shape(ABC):
    
    
    
    @abstractmethod
    def printarea(self):
        pass
    @abstractmethod
    def inputuser(self):
        pass

    
class Rectangle(Shape):
    
    def inputuser(self):
        self.l=float(input("enter the length "))
        self.b=float(input("enter the breadth "))
    
    def printarea(self):
        area=self.l*self.b
        print("the area of rectangle is " + str(area))
        return area
        
    
        

class Square(Shape):

    def inputuser(self):
        self.l=float(input("enter the side "))
        
    
    def printarea(self):
        area=self.l*self.l
        print("the area of square is " + str(area))
        return area
        
        
class Circle(Shape):

    def inputuser(self):
        self.l=float(input("enter the radius "))

    def printarea(self):
        pi=3.14
        area=pi*self.l*self.l
        print("the area of circle is " + str(area))
        return area
        
    
        
        
class Triangle(Shape):

    def inputuser(self):
        self.l=float(input("enter the base "))
        self.b=float(input("enter the height "))

    def printarea(self):
        area=0.5*self.l*self.b
        print("the area of triangle is " + str(area))
        return area
    
    
        
class Parallelogram(Shape):

    def inputuser(self):
        self.l=float(input("enter the base "))
        self.b=float(input("enter the height "))

    def printarea(self):
        area=self.l*self.b
        print("the area of triangle is " + str(area))
        return area 
    
    


r=Rectangle()
s=Square()
c=Circle()
t=Triangle()
p=Parallelogram()

total=0

n=int(input("enter total shapes "))
for i in range(0,n):
    shape=input("enter a shape ")
    if shape=="rectangle":
        r.inputuser()
        r.printarea()
        total=total+r.printarea()
    
    elif shape=="square":
        s.inputuser()
        s.printarea()
        total=total+s.printarea()
    
    elif shape=="circle":
        c.inputuser()
        c.printarea()
        total=total+c.printarea()
    
    elif shape=="triangle":
        t.inputuser()
        t.printarea()
        total=total+t.printarea()
    
    elif shape=="parallelogram":
        p.inputuser()
        p.printarea()
        total=total+p.printarea()
    else:
        print("shape was not found")

print("the total area is "+ str(total))
        
        


        
        
        
    
