package AllKindsOfCollectionIterate;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
//接受重复元素，按照加入顺序排序
public class linkedList {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        Person jack = new Person("Jack",20);
        Person chen  = new Person("Chen",25);
        Person bruce = new Person("Bruce",30);
        Person bruce2 = new Person("Bruce",30);
        linkedList.add(chen);
        linkedList.add(jack);
        linkedList.add(bruce);
        linkedList.add(bruce2);
        linkedList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return  o1.compareTo(o2);
            }
        });
        Iterator<Person> iterator = linkedList.listIterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            System.out.println(person.getName()+ " "+person.getAge());
        }
    }
}
