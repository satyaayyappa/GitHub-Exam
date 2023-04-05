import java.util.Random;
public class RandomNumber{
    public static void main(String[] args) {
        System.out.println("Generating 10 random numbers");
        Random randomGenerator=new Random();
        for (int i=0; i<10; i++){
            System.out.println(randomGenerator.nextInt(10)+1);
        }
    }
}