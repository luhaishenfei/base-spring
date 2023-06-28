package _6Thread;

public class _4SellTicket implements Runnable{
    private  int tickets = 100;
    //Lock Thread
    private Object obj = new Object();
    @Override
    public void run() {
        sellTickets();
        /*
        *
        *
        *
        *
        synchronized(obj){
        //synchronized(this){
        //synchronized(_4SellTicket.class)
           while (true) {
            if (tickets > 0) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }

                System.out.println(Thread.currentThread().getName() + " had sell No." + (101 - tickets) + " ticket");
                tickets--;
            } else {
                //      System.out.println("tickets sell out");

            }
        }


        * }
        *
        *
        *
        *
        * */


    }

    private synchronized void sellTickets() {
        while (true) {
            if (tickets > 0) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }

                System.out.println(Thread.currentThread().getName() + " had sell No." + (101 - tickets) + " ticket");
                tickets--;
            } else {
                //      System.out.println("tickets sell out");

            }
        }
    }
}
