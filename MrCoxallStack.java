    /*
    * The Mr.Coxall Stack Program V2
    *
    * @author  Liam Fletcher
    * @version 1.0
    * @since   2021-12-08 
    */
   
   // Import the ArrayList class
  import java.util.ArrayList;
  
  public class MrCoxallStack {
  
      private ArrayList < Integer > _stackAsArray = new ArrayList < Integer > ();
  
      public void push(int receivedNum) {
          _stackAsArray.add(receivedNum);
      }
  
      /**
       * pop method 
       */
  
      public int pop() {
          int poppedNumber = this._stackAsArray.get(_stackAsArray.size() - 1);
          _stackAsArray.remove(_stackAsArray.size() - 1);
          return poppedNumber;
      }
  
      /**
       * Getter 
       */
  
      public String currentStack() {
          String arrayVal = "Current ArrayList: ";
          for (int counter = 0; counter < _stackAsArray.size(); counter++) {
              arrayVal = arrayVal + _stackAsArray.get(counter) + ", ";
          }
          return arrayVal;
      }
  }
