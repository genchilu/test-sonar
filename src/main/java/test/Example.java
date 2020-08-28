package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {

    static List<String> global;

    public Example() {
        if(global == null) {
            synchronized (this) {
                if (global == null) {
                    global = new ArrayList();
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

    public boolean isExceed(List<String> mylist, int threshold) {

        // Some business rule here

        boolean empty = mylist.size() > threshold;
        return empty;
    }

    public static void main(String[] args) {
        Example example = new Example();
        List<String> tmp = example.getSomeList();
        boolean result = example.isExceed(tmp, 0);
    }
}
