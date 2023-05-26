package _6Thread;

public class _7Customer implements Runnable{

    private _7MailBox mailBox;

    public _7Customer(){

    }

    public _7Customer(_7MailBox mailBox ){
        this.mailBox = mailBox;
    }



    @Override
    public void run() {
        while (true) {
            mailBox.sendMile();
        }
    }
}
