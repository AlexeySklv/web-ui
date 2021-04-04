    class triangle {

        double a;
        double b;
        double c;

    triangle(double sa, double sb, double sc) {
        a = sa;
        b = sb;
        c = sc;
    }

    boolean existence() {
        boolean ex = true;
        if((a+b)<c || (a+c)<b || (b+c)<a)
            ex = false;
        return ex;
    }

    double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}


