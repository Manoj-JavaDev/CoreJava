package com.techouts.cj6.Multithreading;



class TicketBooking implements Runnable {

    @Override
    public void run() {
        try {

            Thread.sleep(200);
        }
        catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("State of bookingThread while mainThread is waiting " + TicketSystem.mainThread.getState());

        try {
            Thread.sleep(200);
        }

        catch(InterruptedException ie) {
            ie.printStackTrace();
        }
    }

}

public class TicketSystem implements Runnable {
    public static Thread mainThread;
    public static TicketSystem  ticketSystem;

    @Override
    public void run() {
        TicketBooking booking = new TicketBooking();
        Thread bookingThread = new Thread(booking);

        System.out.println("State after creating bookingThread: " + bookingThread.getState());
        bookingThread.start();
        System.out.println("State after starting bookingThread: " + bookingThread.getState());

        try {
            Thread.sleep(100);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("State after sleeping bookingThread : " + bookingThread.getState());

        try {
            bookingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("State after bookingThread finishes: " + mainThread.getState());

    }
    public static void main(String args[]) {

        TicketSystem ticketSystem = new TicketSystem();

        mainThread = new Thread(ticketSystem);

        mainThread.start();

        System.out.println("State after starting mainThread: " + mainThread.getState());
    }
}