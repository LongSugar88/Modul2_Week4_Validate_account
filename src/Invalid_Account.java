import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Invalid_Account {
    Pattern pattern;
    Matcher matcher;
    final String ACCOUNT_PATTERN = "^[a-z0-9_]{6,}$";

    Invalid_Account(){
        pattern = Pattern.compile(ACCOUNT_PATTERN);
    }

    boolean invalidAccount(String str){
        matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
