public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        //int c = calc.devide.apply(a, b); // результат работы int b равен нулю.(делить на ноль нельзя
        try {
            int c = calc.devide.apply(a, b); // результат работы int b равен нулю.(делить на ноль нельзя
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления: на ноль делить нельзя!");
        }
        //int c = calc.isPositive.test(b) ? calc.devide.apply(a, b) : b;

    }
}
