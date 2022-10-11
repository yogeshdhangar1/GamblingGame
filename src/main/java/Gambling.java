import java.util.Random;

public class Gambling {
    public static void main(String[] args) {
        int money = 100;
        int playCount = 0;
        int wonCount = 0;
        Random random = new Random();
        while(money!=200&&money!=0){
            playCount++;
            System.out.println("Initial Money:"+money);
        }
    }
}
