public class TwoDice {
    public static void main(String[] args) {
        Die playerDie = new Die();
        Die computerDie = new Die();

        int playerResult = playerDie.getDieValue();
        int computerResult = computerDie.getDieValue();

        System.out.println("Player's result: " + playerResult);
        System.out.println("Computer's result: " + computerResult);

        if (playerResult > computerResult) {
            System.out.println("Player wins!");
        } else if (playerResult < computerResult) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}