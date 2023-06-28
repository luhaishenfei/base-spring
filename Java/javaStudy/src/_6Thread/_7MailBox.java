package _6Thread;

public class _7MailBox {
    private int mileNum = 0;
    //定义一个成员变量表示奶箱的状态
    private boolean state = false;


    public synchronized void storeMile(int mileNum){

        //如果有牛奶 等待消费
        if(state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.mileNum=mileNum;
        System.out.println("Stores No."+mileNum+"mile ");
        //生产完毕后，修改奶箱状态
        state=true;

        //
        notifyAll();

    }

    public synchronized void sendMile() {
        //如果没有牛奶 等待生产
        if (!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Customer gets NO."+mileNum+" mile");
        //消费完毕后 修改奶箱状态
        state = false;
        notifyAll();
    }


}
