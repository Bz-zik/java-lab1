import java.util.ArrayList;

public class Separator {

    public static ArrayList<String> separate(String s) {
        ArrayList<String> list = new ArrayList<>();
        s = s.replaceAll(" ", "");
        char[] array = s.toCharArray();
        boolean wasEqually = false;
        String temp = "";

        for (char c : array) {
            if (c == '=') {
                wasEqually = true;
                list.add(temp);
                temp = "";
            } else if (c == '+') {
                if (wasEqually) {
                    list.add(temp.contains("-") ? temp.replaceAll("-", "") : "-" + temp);
                } else {
                    list.add(temp);
                }
                temp = "";
            } else if (c == '-' && !"".equals(temp)) {
                if (wasEqually) {
                    list.add(temp.contains("-") ? temp.replaceAll("-", "") : "-" + temp);
                } else {
                    list.add(temp);
                }
                temp = "-";
            } else {
                temp += c;
            }
        }

        list.add(temp.contains("-") ? temp.replaceAll("-", "") : "-" + temp);

        return list;
    }

}
