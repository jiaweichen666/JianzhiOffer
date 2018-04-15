package AllKindsOfCollectionIterate;

import java.util.Iterator;
import java.util.TreeSet;
//TreeSet通过红黑树实现元素有序，不接受空值，在判断元素是否重复时调用compareTo方法。
public class treeset {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();
        Person jack = new Person("Jack",20);
        Person chen  = new Person("Chen",19);
        Person bruce = new Person("Bruce",30);
        Person bruce2 = new Person("Bruce",30);
        Person bruce3 = new Person("Bruce3",30);
        Person hi = new Person("Hi",30);
        treeSet.add(jack);
        treeSet.add(chen);
        treeSet.add(bruce);
        treeSet.add(bruce2);
        treeSet.add(bruce3);
        treeSet.add(hi);
        //treeSet.add(null);TreeSet不接受空值
        Iterator<Person> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
    }
}
