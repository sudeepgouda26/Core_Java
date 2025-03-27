class Circle {
    double area() {
        int r = 5;
        double pi = 3.142;
        return r * r * pi;
    }
}

class Rectangle {
    double area() {
        int a = 3;
        int b = 12;
        return a * b;
    }
}

class Square {
    double area() {
        int a = 6;
        return a * a;
    }
}

class Trapezoid {
    double area() {
        int a = 5;
        int b = 7;
        int h = 10;
        return ((a + b) / 2.0) * h;
    }
}

class Triangle {
    double area() {
        int b = 5;
        int h = 10;
        return (b * h) / 2.0;
    }
}

class Parallelogram {
    double area() {
        int b = 5;
        int h = 10;
        return b * h;
    }
}

class Ellipse {
    double area() {
        int a = 5;
        int b = 10;
        double pi = 3.142;
        return a * b * pi;
    }
}

class Sector {
    double area() {
        int r = 5;
        int angle = 90;
        double pi = 3.142;
        return (angle / 360.0) * pi * r * r;
    }
}

class Main {
    public static void main(String[] args) {
        Circle C = new Circle();
        System.out.println(C.area());
        Rectangle R = new Rectangle();
        System.out.println(R.area());
        Square S = new Square();
        System.out.println(S.area());
        Trapezoid T = new Trapezoid();
        System.out.println(T.area());
        Triangle T1 = new Triangle();
        System.out.println(T1.area());
        Parallelogram P = new Parallelogram();
        System.out.println(P.area());
        Ellipse E = new Ellipse();
        System.out.println(E.area());
        Sector S1 = new Sector();
        System.out.println(S1.area());
    }
}
