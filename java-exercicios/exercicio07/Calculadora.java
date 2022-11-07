public class Calculadora {

  public static void sum(int number1, int number2) {
    int sum = number1 + number2;
    System.out.println("A soma de " + number1 + " + " + number2 + " = " + sum);
  }

  public static void subtract(int number1, int number2) {
    int subtract = number1 - number2;
    System.out.println("A subtração de " + number1 + " - " + number2 + " = " + subtract);
  }

  public static void multiply(int number1, int number2) {
    int multiply = number1 * number2;
    System.out.println("A multiplicação de " + number1 + " * " + number2 + " = " + multiply);
  }

  public static void divide(int number1, int number2) {
    int divide = number1 / number2;
    System.out.println("A divisão de " + number1 + " / " + number2 + " = " + divide);
  }
}


