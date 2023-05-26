package _6Thread;

public class  _4ThreadSecurity {
    public static void main(String[] args) {
        _4SellTicket sellTicket = new _4SellTicket();

        Thread sellWindow1 = new Thread(sellTicket, "window1");
        Thread sellWindow2 = new Thread(sellTicket, "window2");
        Thread sellWindow3 = new Thread(sellTicket, "window3");

        sellWindow1.start();
        sellWindow2.start();
        sellWindow3.start();

    }
}
