class Calculate{
	  int width;                                                                                                                                                              ;
	  int length;
	  int side;
	  int radius;
	  float pi=3.14,area;
	  
Calculate(int width,int length,int side,int radius,float pi,float area);
	  this.width=width;
	  this.lenght=lenght;
	  this.side=side;
	  this.radius=radius;
	  this.pi=pi;
          this.area=area;
}
void display() {
Ar=width*length;
As=side*side;
Ac=pi*(radius*radius);
System.out.println("Area of rectangle: "+Ar);
System.out.println("Area of side: "+As);
System.out.println("Area of circle: "+Ac);
}
}
class Area {
       public static void main(String[] args){
              Calculate k1=new Calculate(1);
              Calculate k2=new Calculate(3);
              Calculate k3=new Calculate(4);
              k1.display();
              k2.display();
              k3.display();
       }       
}