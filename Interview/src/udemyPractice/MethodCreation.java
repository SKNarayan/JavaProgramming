package udemyPractice;

public class MethodCreation {

    public static void main(String[] args){
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("shashi", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Anoop", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Guru", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Rahul", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Tiklu", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Ulu", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Blue", position);


    }

    public static void displayHighScorePosition(String playersName, int position){
        System.out.println(playersName + " managed to get into position "
                            + position + " on the high score table ");
    }

    public static int calculateHighScorePosition(int score){
        if(score >= 1000) {
            return 1;
        } else if(score >= 500) {
            return 2;
        }else if(score >= 100){
            return 3;
        }else{
            return 4;
        }
    }

}
