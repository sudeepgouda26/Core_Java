class Circle{
    void area(){
          int r =5;
          double pi = 3.142;
          System.out.println(r*r*pi);
    }
  
}

class Rectangle{
    void area(){
    int a = 3;
    int b = 12;
  System.out.println(a*b);
  

  }
}
class Square{
            void area(){
                int a =6;
                System.out.println(a*a);
            }
}
class Trapezoid {
  void area() {
    int a = 5;
    int b = 7;
    int h = 10;
    System.out.println(((a + b) / 2.0) * h);
  }
}
class Triangle {
  void area() {
    int b = 5;
    int h = 10;
    System.out.println((b * h) / 2.0);
  }
}
class Parallelogram {
  void area() {
    int b = 5;
    int h = 10;
    System.out.println(b * h);
  }
}
class Ellipse {
  void area() {
    int a = 5;
    int b = 10;
    double pi = 3.142;
    System.out.println(a * b * pi);
  }
}
class Sector {
  void area() {
    int r = 5;
    int angle = 90;
    double pi = 3.142;
    System.out.println((angle / 360.0) * pi * r * r);
  }
}

class Main {
  public static void main(String[] args) {
    Circle C = new Circle();
    C.area();
    Rectangle R = new Rectangle();
    R.area();
    Square S = new Square();
    S.area();
    Trapezoid T = new Trapezoid();
    T.area();
    Triangle T1 = new Triangle();
    T1.area();
    Parallelogram P = new Parallelogram();
    P.area();
    Ellipse E = new Ellipse();
    E.area();
    Sector S1 = new Sector();
    S1.area();
  }
}