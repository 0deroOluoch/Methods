package com.appnetics;

public class Main {

    public static void main(String[] args) {



		int position = calculateHighScorePosition(1500);
		displayHighScorePosition("Tonny", position);


		position = calculateHighScorePosition(900);
		displayHighScorePosition("Gerald", position);


		position = calculateHighScorePosition(400);
		displayHighScorePosition("Beverly", position);


		position = calculateHighScorePosition(50);
		displayHighScorePosition("Atis yo.!", position);

		position = calculateHighScorePosition(1000);
		displayHighScorePosition("Tatizo", position);





	}

    public static void displayHighScorePosition(String playersName,int highScorePosition){
		System.out.println(playersName +  " managed to get into position " + highScorePosition
		 + " on the high score table ");

	}

	public static int calculateHighScorePosition(int playerScore){
    	if (playerScore >= 1000){
    		return 1;
		}else if (playerScore >= 500 ){
    		return 2;
		}else if (playerScore >= 100 ){
    		return 3;
		}else return 4;
	}

}
