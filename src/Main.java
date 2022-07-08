public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        //int c = calc.devide.apply(a, b); // результат работы int b равен нулю.(делить на ноль нельзя
        int c = calc.isPositive.test(b) ? calc.devide.apply(a, b) : b;
        calc.println.accept(c);
    }
}
w