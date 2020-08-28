package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example2 {

    static List<String> list;

    public Example2() {
        if(list == null) {
            synchronized (this) {
                if (list == null) {
                    list = new ArrayList<String>();
                    list.add("whatever");
                    list.add("whatever");
                }
            }
        }
    }

    public List<String> getSomeList(){
        String[] tmp = new String[]{"whatever", "whatever"};



        List<String> list = new ArrayList(Arrays.asList(tmp));
        return list;
    }

    public boolean isExceed(List<String> list, int threshold) {

        // Some business rule here

        boolean empty = list.size() > threshold;
        return empty;
    }

    public static void main(String[] args) {
        Example2 example = new Example2();
        List<String> tmp = example.getSomeList();
        boolean result = example.isExceed(tmp, 0);
    }
}
