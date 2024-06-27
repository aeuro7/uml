import java.util.Random;


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
