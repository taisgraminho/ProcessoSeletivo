
import java.util.*;

public class reverterString {
    public static void main(String[] args) {
       
        String frase = "Hi everyone!";
        var tamanho = frase.length();
        
        ArrayList<Character> reverter = new ArrayList<Character>();

        for (int i=tamanho; i>=1; i--) {
            char c = frase.charAt(i);
            reverter.add(c);
        }

        System.out.println(reverter);

    }
}
