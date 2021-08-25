
from abc import ABC,abstractmethod

class Shape(ABC):
    
    global l,b,area
    
    
    
    
    
    @abstractmethod
    def inputuser(self):
        pass
    @abstractmethod
    def calarea(self):
        pass
    @abstractmethod
    def printarea(self):
        pass


class Rectangle(Shape):
    def inputuser(self):
        self.l=float(input("enter the length "))
        self.b=float(input("enter the breadth "))
    
    def printarea(self):
        
        print("rectangle: side is" +str(self.l)+ "breadth is " + str(self.b)+ "area is" + str(self.area))
    
    def calarea(self):
        self.area=self.l*self.b
        return self.area
    
        

class Square(Shape):

    def inputuser(self):
        self.l=float(input("enter the side "))
        
    
    def printarea(self):
        
        print("square: side is" +str(self.l)+ "area is" + str(self.area))
        
        
    def calarea(self):
        self.area=self.l*self.l
        return self.area
        
        
class Circle(Shape):

    def inputuser(self):
        self.l=float(input("enter the radius "))

    def printarea(self):
       
        print("circle: radius is" +str(self.l)+"area  is " + str(self.area))
        
    
    def calarea(self):
        pi=3.14
        self.area=pi*self.l*self.l
        return self.area
        
    
        
        
class Triangle(Shape):

    def inputuser(self):
        self.l=float(input("enter the base "))
        self.b=float(input("enter the height "))

    def printarea(self):
        
        print("triangle: base is " +str(self.l)+"height is "+str(self.b)+" area is " + str(self.area))
        return self.area
    
    def calarea(self):
        
        self.area=0.5*self.l*self.b
        return self.area
    
    
        
class Parallelogram(Shape):

    def inputuser(self):
        self.l=float(input("enter the base "))
        self.b=float(input("enter the height "))

    def printarea(self):
        
        print("Parallelogram: base is "+str(self.l)+"height is"+str(self.b)+"area is " + str(self.area))
         
        
    def calarea(self):
        self.area=self.l*self.b
        return self.area
    




Array=[]


total=0


n=int(input("enter total shapes "))
for i in range(0,n):
    shape=input("enter a shape ")
    if shape=="rectangle":
        r=Rectangle()
        r.inputuser()
        
        
        
        
        total=total+r.calarea()
        
        Array.append(r)
    
    elif shape=="square":
        s=Square()
        s.inputuser()
        
        
        
        
        total=total+s.calarea()
        
        Array.append(s)
    
    elif shape=="circle":
        c=Circle()
        c.inputuser()
        
        
        
        
        total=total+c.calarea()
        
        Array.append(c)
    
    elif shape=="triangle":
        t=Triangle()
        t.inputuser()
        
        
        
        
        total=total+t.calarea()
        
        Array.append(t)
    
    elif shape=="parallelogram":
        p=Parallelogram()
        p.inputuser()
        
        
        
        
        total=total+p.calarea()
        
        Array.append(p)
    else:
        print("shape was not found")

for i in Array:
    i.printarea()




    

print("the total area is "+ str(total))
