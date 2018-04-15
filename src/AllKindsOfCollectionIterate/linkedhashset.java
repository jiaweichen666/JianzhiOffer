package AllKindsOfCollectionIterate;

import java.util.Iterator;
import java.util.LinkedHashSet;
//LinkedHashSet在HashSet的基础之上实现了有序性，采用链表来保持有序
//不接受重复值，接受一个null值，用先用hashcode再用equals判断是否重复
public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<>();
        Person jack = new Person("Jack",20);
        Person chen  = new Person("Chen",25);
        Person bruce = new Person("Bruce",30);
        Person bruce2 = new Person("Bruce1",30);
        linkedHashSet.add(jack);
        linkedHashSet.add(chen);
        linkedHashSet.add(bruce);
        linkedHashSet.add(bruce2);
        Iterator<Person> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
