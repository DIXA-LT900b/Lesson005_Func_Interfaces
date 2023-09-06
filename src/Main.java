public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        System.out.println("Переменная а = " + a);

        int b = calc.minus.apply(1,1);
        System.out.println("Переменная b = " + b);

        try {
            int c = calc.devide.apply(a, b);
            System.out.println("Переменная c = " + c);
        } catch (IllegalArgumentException e) {
            System.out.println("Невозможно рассчитать переменную с (Деление на ноль)!");
        }
    }
}