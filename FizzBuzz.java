/* I found this a little difficult to do because I kept on
getting muddled up the syntax for if and else if hence
why practice is important */

//% means modulo which is the remainder
//SYNTAX IS HIGHLY IMPORTANT

public class FizzBuzz {

  public static void main(String[] args){

    for (int i = 1; i <= 100; i++){
      if ((i % 3 == 0) && (i % 5 == 0)) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
        }   
      }
    }

  }
