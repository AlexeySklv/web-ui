class Test {

    public static void main(String[] args) {
      //  private static Logger logger = LoggerFactory.getLogger(Test.class);

        triangle tr = new triangle(5, 5, 8);

        if (tr.existence() == true) {
            System.out.println("Площадь треугольника = " + tr.area());

        } else
            System.out.println("Треугольник с такими сторонами не существует");
    }

}