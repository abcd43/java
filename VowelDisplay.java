import java.util.Arrays;
import java.util.List;

class VowelThread extends Thread {
    private final String vowel;
    private final long delay;

    public VowelThread(String vowel, long delay) {
        this.vowel = vowel;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            System.out.println(vowel);
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class VowelDisplay {
    public static void main(String[] args) {
        String input = "Hello World";
        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");

        for (char c : input.toLowerCase().toCharArray()) {
            String character = String.valueOf(c);
            if (vowels.contains(character)) {
                VowelThread vowelThread = new VowelThread(character, 3000);
                vowelThread.start();
            }
        }
    }
}
