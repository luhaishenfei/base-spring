package _6Thread;

public class _7Producer implements Runnable{

    private  _7MailBox mailBox;

    public  _7Producer(){
    }

    public  _7Producer(_7MailBox mailBox){
        this.mailBox = mailBox;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            mailBox.storeMile(i);
        }
    }
}
