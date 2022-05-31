package pl.lublin.wsei.java.mylib;

import org.apache.commons.lang3.StringUtils;

public class Account {
    String name;

    public static String capitalize(String aStr) {
        String[] tokens = StringUtils.split(aStr);
        for (int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens, ' ');
    }

    public void setName(String name) {
        this.name = capitalize(name);

    }

    public String getName() {
        return name;
    }

}