package jp.ac.uryukyu.ie.e175767;


public class Player {
    int dice1;
    int dice2;
    int dice3;
    int dice_point;
    int[] dice = {0,0,0};

    public int[] Throw(){
        /**
         * 三つのサイコロの目を決めるメソッド。
         * diceという配列に保存することで、三つの目の数を返している
         */
        dice1 = (int)(Math.random()*6)+1;
        dice2 = (int)(Math.random()*6)+1;
        dice3 = (int)(Math.random()*6)+1;
        sort();
        dice[0] = dice1;
        dice[1] = dice2;
        dice[2] = dice3;
        return dice;
    }

    public void sort(){
        /**
         * 出てきた三つの目をプログラミング上で、
         * 処理しやすいように並び変えるメソッド。
         */
        int pro = 0;
        if(dice2 > dice3){
            pro = dice3;
            dice3 = dice2;
            dice2 = pro;
        }
        if(dice1 > dice2){
            pro = dice2;
            dice2 = dice1;
            dice1 = pro;
            sort();//一度の実行では並び替えきれない場合があるので再起している。
        }
    }

    public int point(){
        /**
         * 三つの目の組み合わせのポイントを決めるメソッド。
         */
        if(dice1 == dice3){
            if(dice1 == 1) dice_point = 9;
                else dice_point = 8;
        }else if(dice1 == dice2) {
            dice_point = dice3;
        } else if(dice2 == dice3) {
            dice_point = dice1;
        }else if(dice1 == 4 && dice2 == 5 && dice3 == 6 ){
            dice_point = 7;
        }else if(dice1 == 1 && dice2 == 2 && dice3 == 3 ){
            dice_point = -1;
        }else{
            dice_point = 0;
        }
        return dice_point;
    }
}
