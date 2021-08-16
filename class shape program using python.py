class shape():
    def calculateshape(self,shape):
       
        
        n=int(input("enter total number of shapes"))
        sum=0
        for i in range(0,n):
            shape=input("enter a shape")
            self.shape = shape

        
            if self.shape == "rectangle":
                l=int(input("enter the length of the rectangle"))
                b=int(input("enter the breadth of the rectangle"))
                rect_area = l * b
                sum=sum+rect_area
                print("the rectangle area is" + str(rect_area))
        
            elif self.shape == "square":
                s=int(input("enter the side of square"))
                sqr_area = s * s
                sum=sum + sqr_area
                print("the area of square is" + str(sqr_area))
            
            elif self.shape == "triangle":
                h = int(input("enter triangle's height : "))
                b = int(input("enter triangle's breadth : "))
                tri_area=0.5 * b * h
                sum=sum+tri_area
                print("the triangle area is" + str(tri_area))
        
            elif self.shape == "circle":
                r = int(input("enter circle's radius : "))
                pi = 3.14
                circle_area = pi * r * r
                sum=sum+circle_area
                print("the circle area is" + str(circle_area))
        
            elif self.shape == "parallelogram":
                b = int(input("enter parallelogram's base length: "))
                h = int(input("enter parallelogram's height length: "))
                para_area = b * h
                sum=sum + para_area
                print("the parallelogram area is" + str(para_area))
            
        
            
            else:
                print("sorry the shape is not found")
        print("the total area is"+ str(sum))

obj1=shape()
print(obj1.calculateshape(shape))

