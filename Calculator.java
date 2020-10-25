/*
This is a Basic Calculator that is used to do basic math.
It was created by AmateurWebDev in 2020.
*/
public class Calculator {

public Calculator() {

}

public int add(int a, int b) {
  return a + b;
}

public int subtract(int a, int b) {
  return a - b;
}

public int multiple(int a, int b) {
  return a * b;
}

public int divide(int a, int b) {
  return a / b;
}

public int modulo(int a, int b) {
  return a % b;
}

public static void main(String[] args) {
  Calculator myCalculator = new Calculator();
  System.out.println(myCalculator.add(5, 7));
  System.out.println(myCalculator.subtract(45, 11));
}
//I used add and subtract to test the calculator works with test values
//Give it a go and see if it works
}
