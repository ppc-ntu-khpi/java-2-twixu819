//package domain;

public class Exercise {
    public static String Calculate(String text, int rows){
        if (text == null || text.isEmpty() || rows <= 0) {
            return "";
        }
        String result = "";
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < text.length(); j += rows) {
                result += text.charAt(j);
            }
        }
        return result;
    }
}
