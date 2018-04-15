package AllKindsOfCollectionIterate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class arraylist {
    //元素按照加入顺序排列，接受重复值
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();
        Person jack = new Person("Jack",20);
        Person chen  = new Person("Chen",25);
        Person bruce = new Person("Bruce",30);
        Person bruce2 = new Person("Bruce",30);
        arrayList.add(chen);
        arrayList.add(jack);
        arrayList.add(bruce);
        arrayList.add(bruce2);
        arrayList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.compareTo(o2);
            }
        });
        Iterator<Person> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            System.out.println(person.getName()+ " "+person.getAge());
        }
    }
}
