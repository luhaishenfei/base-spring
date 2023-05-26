package LittlePrograme;

import java.util.*;

public class _2FightTheLandLord {
    public static void main(String[] args) {
        //creates cards and gives all cards
        List<_2Card> cards = new ArrayList<>();
        cards = newAllCard();
        //traversal
        traversalCards(cards);


        List<_2Card> playerLord = new ArrayList<>();
        List<_2Card> farmer1 = new ArrayList<>();
        List<_2Card> farmer2 = new ArrayList<>();


        dealCards(playerLord,20,cards);
        dealCards(farmer1,17,cards);
        dealCards(farmer2,17,cards);
        traversalCards(playerLord);
        traversalCards(farmer1);
        traversalCards(farmer2);
        traversalCards(cards);


    }

    public static void traversalCards(List<_2Card> list){
        System.out.println("---------------------");
        for (_2Card c :
                list) {
            System.out.println(c.getCard());
        }
    }

    public static void dealCards(List<_2Card> playerCards,int num,List<_2Card> allCards){
        Collections.shuffle(allCards);
        for (int i = 0; i < num; i++) {
            playerCards.add(allCards.get(0));
            allCards.remove(0);
        }
        Collections.sort(allCards);
        Collections.sort(playerCards);

    }

    public static List<_2Card> newAllCard(){
        List<_2Card> cards = new ArrayList<>();
        cards =newCard(13,"spade");
        cards=newCard(cards,13,"heart");
        cards=newCard(cards,13,"club");
        cards=newCard(cards,13,"diamond");
        cards=newCard(cards,2,"Joker");
        return cards;
    }

    public static List<_2Card> newCard(int count,String color){
        if (color!="spade"&&color!="heart"&&color!="club"&&color!="diamond"&&color!="Joker"){
            System.out.println("Color is not in type");
            System.exit(-1);
        }
            List<_2Card> cards =new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            _2Card c = new _2Card(i+"",color);
            cards.add(c);
        }


//shitHill
/*
        _2Card s1 = new _2Card("1","spade");
        _2Card s2 = new _2Card("2","spade");
        _2Card s3 = new _2Card("3","spade");
        _2Card s4 = new _2Card("4","spade");
        _2Card s5 = new _2Card("5","spade");
        _2Card s6 = new _2Card("6","spade");
        _2Card s7 = new _2Card("7","spade");
        _2Card s8 = new _2Card("8","spade");
        _2Card s9 = new _2Card("9","spade");
        _2Card s10 = new _2Card("10","spade");
        _2Card sj = new _2Card("J","spade");
        _2Card sq = new _2Card("Q","spade");
        _2Card sk = new _2Card("K","spade");


        _2Card h1 = new _2Card("1","heart");
        _2Card h2 = new _2Card("2","heart");
        _2Card h3 = new _2Card("3","heart");
        _2Card h4 = new _2Card("4","heart");
        _2Card h5 = new _2Card("5","heart");
        _2Card h6 = new _2Card("6","heart");
        _2Card h7 = new _2Card("7","heart");
        _2Card h8 = new _2Card("8","heart");
        _2Card h9 = new _2Card("9","heart");
        _2Card h10 = new _2Card("10","heart");
        _2Card hj = new _2Card("J","heart");
        _2Card hq = new _2Card("Q","heart");
        _2Card hk = new _2Card("K","heart");


        _2Card c1 = new _2Card("1","club");
        _2Card c2 = new _2Card("2","club");
        _2Card c3 = new _2Card("3","club");
        _2Card c4 = new _2Card("4","club");
        _2Card c5 = new _2Card("5","club");
        _2Card c6 = new _2Card("6","club");
        _2Card c7 = new _2Card("7","club");
        _2Card c8 = new _2Card("8","club");
        _2Card c9 = new _2Card("9","club");
        _2Card c10 = new _2Card("10","club");
        _2Card cj = new _2Card("J","club");
        _2Card cq = new _2Card("Q","club");
        _2Card ck = new _2Card("K","club");

        _2Card d1 = new _2Card("1","diamond");
        _2Card d2 = new _2Card("2","diamond");
        _2Card d3 = new _2Card("3","diamond");
        _2Card d4 = new _2Card("4","diamond");
        _2Card d5 = new _2Card("5","diamond");
        _2Card d6 = new _2Card("6","diamond");
        _2Card d7 = new _2Card("7","diamond");
        _2Card d8 = new _2Card("8","diamond");
        _2Card d9 = new _2Card("9","diamond");
        _2Card d10 = new _2Card("10","diamond");
        _2Card dj = new _2Card("J","diamond");
        _2Card dq = new _2Card("Q","diamond");
        _2Card dk = new _2Card("K","diamond");

        cards.add(s1);
*/
        return cards;
    }

    public static List<_2Card> newCard(List<_2Card> cards,int count,String color){
        if (color!="spade"&&color!="heart"&&color!="club"&&color!="diamond"&&color!="Joker"){
            System.out.println("Color is not in type");
            System.exit(-1);
        }

        for (int i = 1; i <= count; i++) {
            _2Card c = new _2Card(i+"",color);
            cards.add(c);
        }
        return cards;
    }

    public static List<_2Card> washCard(List<_2Card> cards){
        Collections.shuffle(cards);
        return cards;
    }
}
