package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {

    static List<String> list;

    public Example() {
        if(list == null) {
            synchronized (this) {
                if (list == null) {
                    list = new ArrayList<String>();
                }
            }
        }
    }

    public List<String> getSomeList(){
        String[] tmp = new String[]{};

        // Do some business rule here

        List<String> list = new ArrayList(Arrays.asList(tmp));
        return list;
    }

    public boolean isExceed(List<String> list, int threshold) {

        // Some business rule here

        boolean empty = list.size() > threshold;
        return empty;
    }

    public static void main(String[] args) {
        Example example = new Example();
        List<String> tmp = example.getSomeList();
        boolean result = example.isExceed(tmp, 0);
    }
}
