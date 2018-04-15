package AllKindsOfCollectionIterate;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    //hashset不会保持有序，但是会保持唯一
    //非同步
    //可以存一个null
    public static void main(String[] args) {
        Person jack = new Person("Jack",20);
        Person chen  = new Person("Chen",25);
        Person bruce = new Person("Bruce",30);
        Person bruce2 = new Person("Bruce",30);
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(jack);
        hashSet.add(chen);
        hashSet.add(bruce);
        hashSet.add(bruce2);
        Iterator<Person> iterator = hashSet.iterator();
        while (iterator.hasNext()){
                System.out.println(iterator.next().getName());
        }
    }
}
