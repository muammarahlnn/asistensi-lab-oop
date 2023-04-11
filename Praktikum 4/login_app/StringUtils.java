package login_app;

public class StringUtils {
    public static String getNickName(String fullName) {
        String[] name = fullName.split(" ");
        if (name.length == 1) {
            return fullName;
        } else {
            return name[1];
        }

    }
}
