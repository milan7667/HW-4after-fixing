package hw5;

import java.util.ArrayList;
import java.util.Collections;

public class MyList<T extends Comparable<T>> {
    public static void main(String[] args) {
        ArayList<T> MyList = new ArrayList<>();
    }

    public void toAdd() {
        MyList.add(T t1);
        MyList.add(T t2);
        MyList.add(T t3);

    }

    public getLargestValue() {
        return Collections.max(MyList);
    }

    public getSmallestValue() {
        return Collections.min(MyList);
    }
}
