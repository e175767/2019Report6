package jp.ac.uryukyu.ie.e175767;

import org.junit.Test;

import static org.junit.Assert.*;


public class PlayerTest {
    @Test
    /**
     * sortメソッドが正しく行われているか確認するテスト。
     * 1,2,3の三つの数の全ての並びでを入力している。
     */
    public void sort() throws Exception {
        Player player1 = new Player();
        player1.dice1 = 2;
        player1.dice2 = 1;
        player1.dice3 = 3;
        player1.sort();
        System.out.printf("%d,%d,%d\n",player1.dice1,player1.dice2,player1.dice3);
        player1.dice1 = 2;
        player1.dice2 = 3;
        player1.dice3 = 1;
        player1.sort();
        System.out.printf("%d,%d,%d\n",player1.dice1,player1.dice2,player1.dice3);
        player1.dice1 = 3;
        player1.dice2 = 1;
        player1.dice3 = 2;
        player1.sort();
        System.out.printf("%d,%d,%d\n",player1.dice1,player1.dice2,player1.dice3);
        player1.dice1 = 3;
        player1.dice2 = 2;
        player1.dice3 = 1;
        player1.sort();
        System.out.printf("%d,%d,%d\n",player1.dice1,player1.dice2,player1.dice3);
        player1.dice1 = 1;
        player1.dice2 = 2;
        player1.dice3 = 3;
        player1.sort();
        System.out.printf("%d,%d,%d\n",player1.dice1,player1.dice2,player1.dice3);     player1.dice1 = 20;
        player1.dice1 = 1;
        player1.dice2 = 3;
        player1.dice3 = 2;
        player1.sort();
        System.out.printf("%d,%d,%d",player1.dice1,player1.dice2,player1.dice3);
    }

}
