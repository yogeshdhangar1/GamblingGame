import java.util.Random;

public class Gambling {
    public static void main(String[] args) {
        int money = 100;
        int playCount = 0;
        int wonCount = 0;
        Random random = new Random();
        while(money!=200&&money!=0) {
            playCount++;
            System.out.println("Initial Money:" + money);
            int bet = random.nextInt(2);
            if (bet == 1) {
                money = money + 1;
                wonCount++;
            } else {
                money = money - 1;
                System.out.println("Remaining Money Is :" + money);
                System.out.println("No of Times Played:"+playCount);
                System.out.println("No of Times won :"+wonCount);
                System.out.println("No of Times Loss :"+(playCount-wonCount));
            }
        }
    }
}
