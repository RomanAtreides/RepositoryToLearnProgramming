import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] randomNumbers;
        randomNumbers = new int[50];

        for(int i = 0; i < 50; i++) {
            randomNumbers[i] = randInt(1, 50);
            System.out.println(randomNumbers[i]);
        }
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
