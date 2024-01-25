package OverflowAndUnderflow;

public class Overflow {
  // Overflow is over the maximum value- an int's maximum value + 1, for example. 
  // Underflow is the opposite, below the minimum value
  // Java just wraps the number around. Meaning that the maximum number + 1 is equal to the minimum value. Conversely, the minimum value -1 is equal to the maximum value. 
  
  public void max() {
    // Prints "Scratch!" to the console when the method is called
    int maxValue = Integer.MAX_VALUE;
    System.out.println(maxValue);
}
  public void overmax() {
  // Prints "Scratch!" to the console when the method is called
  int maxValue = Integer.MAX_VALUE;
  int overMaxValue = maxValue + 1;
  System.out.println(overMaxValue);
}
  
}
