package _6Thread;

public class _7CustomerAndProducer {
    public static void main(String[] args) {
        _7MailBox mailBox = new _7MailBox();

        _7Producer producer1=new _7Producer(mailBox);
        _7Customer customer1= new _7Customer(mailBox);

        Thread produceThread = new Thread(producer1);
        Thread customerThread = new Thread(customer1);

        produceThread.start();
        customerThread.start();





    }

}
