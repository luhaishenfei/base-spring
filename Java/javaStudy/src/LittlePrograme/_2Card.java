package LittlePrograme;

import java.util.Collections;

public class _2Card implements Comparable<_2Card> {
    private String num;
    private String color;

    public _2Card(String num, String color) {
        this.num = num;
        this.color = color;
    }

    public String getCard(){
        return num+":"+color;
    }

    @Override
    public int compareTo(_2Card o) {

        String s = "1";
        int i = Integer.parseInt(s);
        if(Integer.parseInt(this.num)>Integer.parseInt(o.num)){

            return 1;
        }else{
            return -1;


        }
/*
        if (this.num.compareTo(o.num)==0){
            return this.color.compareTo(o.color);
        }else{
            return this.num.compareTo(o.num);
        }
  */
    }

}
