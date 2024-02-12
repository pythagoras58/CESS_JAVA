package DayTwo;

public class DayTwo {
    public static void main(String[] args) {
        // if statements
        int score = 89;
        if(score>90){
            System.out.println("You had an A");
        } else if (score>80) {
            System.out.println("You passed");
        }else if (score>70) {
            System.out.println("You passed, not good");
        }else if (score>60) {
            System.out.println("You passed, receive warning");
        } else{
            System.out.println("You failed");
        }
    }
}
