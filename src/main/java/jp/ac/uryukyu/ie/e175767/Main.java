package jp.ac.uryukyu.ie.e175767;

public class Main {
    public static void main(String[] args){
        Player player1 = new Player();
        Player player2 = new Player();
        int[] player1_dice = player1.Throw();
        int[] player2_dice = player2.Throw();
        System.out.print("player1の出目は");
        for(int i = 0 ; i<3; i++){
            System.out.printf("%d,",player1_dice[i]);
        }
        System.out.printf("\nplayer2の出目は");
        for(int i = 0 ; i<3; i++){
            System.out.printf("%d,",player2_dice[i]);
        }
        int point1 = player1.point();
        int point2 = player2.point();
        if(point1 > point2){
            System.out.printf("\nplayer1の勝利です\n");
        }else if(point1 < point2){
            System.out.printf("\nplayer2の勝利です\n");
        }else{
            System.out.printf("\n引き分けです\n");
        }
    }
}
