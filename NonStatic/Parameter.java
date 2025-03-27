class Circle {
    void area(int r) {
        double pi = 3.142;
        System.out.println(r * r * pi);
    }
}

class Rectangle {
    void area(int a, int b) {
        System.out.println(a * b);
    }
}

class Square {
    void area(int a) {
        System.out.println(a * a);
    }
}

class Trapezoid {
    void area(int a, int b, int h) {
        System.out.println(((a + b) / 2.0) * h);
    }
}

class Triangle {
    void area(int b, int h) {
        System.out.println((b * h) / 2.0);
    }
}

class Parallelogram {
    void area(int b, int h) {
        System.out.println(b * h);
    }
}

class Ellipse {
    void area(int a, int b) {
        double pi = 3.142;
        System.out.println(a * b * pi);
    }
}

class Sector {
    void area(int r, int angle) {
        double pi = 3.142;
        System.out.println((angle / 360.0) * pi * r * r);
    }
}

class Main {
    public static void main(String[] args) {
        Circle C = new Circle();
        C.area(5);
        Rectangle R = new Rectangle();
        R.area(3, 12);
        Square S = new Square();
        S.area(6);
        Trapezoid T = new Trapezoid();
        T.area(5, 7, 10);
        Triangle T1 = new Triangle();
        T1.area(5, 10);
        Parallelogram P = new Parallelogram();
        P.area(5, 10);
        Ellipse E = new Ellipse();
        E.area(5, 10);
        Sector S1 = new Sector();
        S1.area(5, 90);
    }
}
