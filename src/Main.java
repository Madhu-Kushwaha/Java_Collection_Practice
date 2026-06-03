import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //List orr Collection - > interface

        //ArrayList -> concrete class

        List<Integer> list = new LinkedList<>();
        //
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        //remove
        list.remove(0);
        System.out.println(list);

        //addAll
        List<Integer> list2 = new LinkedList<>();
        list2.add(101);
        list2.add(50);

        list.addAll(list2);
        System.out.println(list);

        list.removeAll(list2);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println("printing list2:" + list2);
//clear
        list2.clear();

        System.out.println(list2.size());

        //i want to traverse list using iterator
        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println("Element: " + iterator.next());
        }

        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(14);
        System.out.println(list3.get(1));
        System.out.println("before set:"+ list3);

        //set
        list3.set(0,100);
        System.out.println("after set: "+ list3);



//toArray
       Object[] arr = list3.toArray();
       for(Object obj : arr) {
           System.out.println(obj);
       }
//contains
        System.out.println(list3.contains(10023));
       
       /// sort()
       list.add(12);
       list.add(6);
        System.out.println("Printing Entre List: " + list);
        
        Collections.sort(list);
        System.out.println("printing Entire List: " + list);

        //how can we sort in descending order - homework

        //clone
//        LinkedList<Integer> newList = (LinkedList<Integer>)list.clone();
//        marks.ensureCapacity(100);
//        System.out.println("Printing Entire newList : " + newList);


        //isEmpty
//        System.out.println(newList.isEmpty());

        //indexOf
//        System.out.println(newList.indexOf(20));

        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);
        System.out.println(marks.isEmpty());
        list.add(30);
        list.add(24);
        list.add(30);
        System.out.println("Printing Orginial List" + list);
        System.out.println(list.lastIndexOf(30));

        LinkedList<Integer> li = new LinkedList<>();
        li.add(10);
        System.out.println(li);
        li.addFirst(1);
        System.out.println(li);
        li.addLast(101);
        System.out.println(li);
        System.out.println(li.getFirst());
        System.out.println(li.getLast());
        System.out.println(li.peek());
        System.out.println("Before: " + li);
        System.out.println("pollig:" + li.poll());
//        System.out.println(li.poll());
        System.out.println("After : " +li);

//        li.removeFirst();
//        System.out.println(li);
//        li.removeLast();
//        System.out.println(li);


    }
}