/*In this project, you will become a mathemagician and write a small program that performs a mathematical magic trick! 
It will involve performing arithmetic operations on an integer that you choose. */

public class Magic {
	public static void main(String[] args) {
    int myNumber = 8;
    
//We will refer to myNumber as the original number from now on

  int stepOne = myNumber * myNumber;
  int stepTwo = stepOne + myNumber;
  int stepThree = stepTwo / myNumber;
  int stepFour = stepThree + 17;
  int stepFive = stepFour - myNumber;
  int stepSix = stepFive / 6;
  
//You can use System.out.print() as well for next part if you want
  System.out.println(stepSix);
	}
}
