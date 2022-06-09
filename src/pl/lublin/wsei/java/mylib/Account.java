package pl.lublin.wsei.java.mylib;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class Account {
    String name;
    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String translitRepl[]
            = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j", "k","l","m","n","o","p","r","s","t","u","f","h","c", "ch","sh","shh","'","ju","ja"};
    String wordChars ="";

    public String translit(String word){
        for (int i = 0; i < word.length(); i++) {
            if( word.charAt(i) == ' '){
                wordChars = wordChars + " ";} else
                wordChars = wordChars + translitRepl[findCharInUkr(word.charAt(i))];

        }
        return wordChars;
    }

    int findCharInUkr(char c){
        for (int i = 0; i < ukrAlphabet.length(); i++) {
            if (ukrAlphabet.charAt(i) == c){
                return i;
            }
        }
        return 0;
    }

    public static String capitalize(String aStr)
    {
        String[] tokens = StringUtils.split(aStr);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens,' ');
    }
    public void setName(String name) {
        this.name = capitalize(name);
    }

    public String getName() {
        return name;
    }


}