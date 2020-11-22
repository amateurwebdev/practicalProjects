/*A program to determine whether there is a protein
in a strand of DNA*/

public class DNA {
 
  public static void main(String[] args) {
      String dna1 = "ATGCGATACGCTTGA";
      String dna2 = "ATGCGATACGTGA";
      String dna3 = "ATTAATATGTACTGA";

      String dna = dna1;
      
      int length = dna.length();
      System.out.println("Length is " + length);

      int start = dna.indexOf("ATG");
      System.out.println("Start: " + start);

      int end = dna.indexOf("TGA");
      System.out.println("End: " + end);

      if (start != -1 && end != -1 && (end - start) % 3 == 0) {

      System.out.println("Condition 1 and 2 and 3 are satisfied.");  
      String protein = dna.substring(start, end + 3); 
      System.out.println("Protein: " + protein);
 
      } else {
        System.out.println("No protein");
      }
      
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
 
  }
 
}
