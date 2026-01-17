package corejava.assessment2;


public class TryCatchFinallyFlowDemo {

    public static void main(String[] args) {

        /*
            try, catch, finally are the important keywords in java which are used to handle the exception which stops abnormal termination of program.

            try -> It is used as a block of error getting code that have chance to raise an exception.
            catch -> It is block that catches the appropriate exception which occurred in try block.
            finally -> It is also a block that executes automatically irrespective of the error in the code.
                       Mainly this block is used for writing all the closing statements of files,Database connections etc.
         */
        try {
            int a = 10;
            int b = 0;

            int divisionResult = a / b; // This line throws a Arithmetic Exception that a number cant divide by zero.
            // Remaining code in try block was skipped and control goes to the catch block.
            System.out.println(divisionResult);
        }
        catch (ArithmeticException ae) {
            ae.printStackTrace(); // This block catches the exception from try block and makes it to smooth termination.
        }
        finally{
            // After the control will go to a finally block and executes it .
            System.out.println("This is finally block statement");
        }

    }

}
