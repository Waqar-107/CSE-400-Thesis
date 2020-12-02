import java.util.Random;

public class cp {
    public static void main(String[] args){
        Random rand = new Random();

        int x = rand.nextInt(), y = 5;

        if(x % 2 == 0){
            y = 40;
            System.out.println("x is even");
        }

        else if(x > 10) {
            y = 60;
            System.out.println("odd and greater than 10");
        }

        else {
            y = 160;
            System.out.println("odd and less than 10");
        }

        for(int i = 0; i < 10; i++)
            y++;

        System.out.println(y);
    }
}
