class T {
  static int triangle(int b, int h) {
    int res = b * h;
    return res;
  }
}

class R {
  static int rectangle(int w, int h) {
    int res = w * h;
    return res;
  }
}

class S {
  static int square(int a) {
    int res = a * a;
    return res;
  }
}

class P {
  static int parallelgram(int b, int h) {
    int res = b * h;
    return res;
  }
}

class Tra {
  static double trapizoid(int b, int h, int a) {
    double res = 0.5 * (a + b) * h;
    return res;
  }
}

class C {
  static double circle(int r, double pi) {
    double res = pi * r * r;
    return res;
  }
}

class E {
  static double ellipse(int b, int h, double pi) {
    double res = pi * h * b;
    return res;
  }
}

class Sec {
  static double sector(int b, double h) {
    double res = 0.5 * b * b * h;
    return res;
  }
}

class Returnclass{
  static final double pi = 3.142;

  public static void main(String[] args) {
    int t = T.triangle(3, 2);
    System.out.println(t);
    int rc = R.rectangle(4, 2);
    System.out.println(rc);
    int sq = S.square(4);
    System.out.println(sq);
    int pa = P.parallelgram(3, 4);
    System.out.println(pa);
    double tra = Tra.trapizoid(2, 4, 6);
    System.out.println(tra);
    double ca = C.circle(5, pi);
    System.out.println(ca);
    double el = E.ellipse(3, 5, pi);
    System.out.println(el);
    double sc = Sec.sector(2, 30.5);
    System.out.println(sc);
  }
}
