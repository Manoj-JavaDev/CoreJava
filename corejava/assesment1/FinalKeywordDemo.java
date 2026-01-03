package corejava.assesment1;

public class FinalKeywordDemo {
    public static void main(String args[]) {
        Honda honda = new Honda();

        System.out.println("The maximum speed of Bike is = " + honda.MAX_SPEED);
        System.out.println("Run method in bike : ");
        honda.run();
    }
}

/* final is keyword in java that is used to define constant values that are never modified
   and to define final methods which can't be overridden by any of its subclass
   and also applied to classes that keeps the class not being inherited by any other class.
 */

class Bike {
    final int MAX_SPEED = 200;

    final void run() {
        System.out.println("Bike is running !!!");
    }
    // Final variables cant be overridden
    // MAX_SPEED = 250; // get compile error that is not found

}

final class Honda extends Bike{

    // Final methods can not be overridden
   /* @Override
    void run(){
        System.out.println("Honda Bike is running!!");
    }*/

}

/* This also gives an error that final classes can not be extended!!
class HondaShine extends Honda {

}
*/

