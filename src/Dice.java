import java.util.Random;

// Tibet Charoensripaiboon 6510450399

public class Dice {

    int faceValue = 0;
    Random random = new Random();

    public Dice() {
        roll();
    }

    public void roll() {
        this.faceValue = random.nextInt(1,7);
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }






}
