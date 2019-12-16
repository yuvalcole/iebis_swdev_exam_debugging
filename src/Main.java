import java.util.Random;

@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        String emailAddress = "john.doe.mis2016@ie.edu";
        String formattedEmailAddress = emailAddress.replaceAll("\\.", "/");

        Random random = new Random();
        StringBuffer word = new StringBuffer(); //bug 1 bbeofre was rod = null instead of = new StringBuffer()

        switch (random.nextInt(3)) {
            case 0:
                word = word.append("Y");            //bug 2 .append
                break;
            case 1:
                word = word.append("F");            //bug 3 Equiprobability, random had to be valued to 3.
                break;
            case 2:
                word = word.append("T");
                break;
        }

        word.append('o');
        word.append('u');
        word.append('r');

        System.out.println(word + " " + formattedEmailAddress);
    }
}
