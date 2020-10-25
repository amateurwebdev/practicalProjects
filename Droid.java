/*
Robot workshop used to build droids
While I still find it a little challenging
This hopefully, helps to understand the use
Of instance fields and methods
*/

public class Droid {
  int batteryLevel;
  String name;

  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }
  
  public String toString() {
    return "Hello, I am the droid: " + name;
  }
  
  public void performTask(String task) {
    batteryLevel = batteryLevel - 10;
    System.out.println(name + " is performing task: "+ task);
  }
  
  public static void main(String[] args){
    Droid glytch = new Droid("Glytch");
    System.out.println(glytch);
    glytch.performTask("Building Drone");
    glytch.performTask("Software Update");
  }
}
