package pl.lublin.wsei.java.mylib;
import org.apache.commons.lang3.StringUtils;
public class Account {
    String name;

  public void setName(String name) {
      String[] tokens = StringUtils.split(name);
      for(int i = 0; i < tokens.length; i++)
          tokens[i] = StringUtils.capitalize(tokens[i]);
      this.name = StringUtils.join(tokens, ' ');

  }
    public String getName(){
      return name;
    }

}