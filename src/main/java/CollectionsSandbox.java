import java.util.*;

public class CollectionsSandbox {



    public static void main(String[] args) {
        //// ME QUEDÉ EN ITERATOR https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html

        //////////// COLLECTIONS

        List listA = new ArrayList();

        listA.add("Element 1");
        listA.add("Element 2");
        listA.add("Element 3");
        listA.add("Element 4");
        listA.add("Element 5");
        listA.add("Element 6");

        filterWithFor(listA, listA.get(1).toString());

        //////////// SET

        String[] strArray = new String[]{"i","came","i","saw","i","left",};

        getDistinctWord2(strArray);

        //////////// LIST

        swap(listA, 2, 3);

        shuffle(strArray);
    }

    public static void getDistinctWord2(String[] params){
        Set<String> uniques = new HashSet<String>();
        Set<String> dups = new HashSet<String>();

        for (String a : params)
            if (!uniques.add(a))
                dups.add(a);

        uniques.removeAll(dups);

        System.out.println("Unique rods: " + uniques);
        System.out.println("Duplicate words: " + dups);
        System.out.println();

    }

    public static void shuffle(String[] params){
        List<String> list = Arrays.asList(params);
        Collections.shuffle(list);
        System.out.println(list);
    }

    public static void getDistinctWords(String[] params){
        Set<String> s = new TreeSet<String>();
        for (String a : params)
            s.add(a);
        System.out.println(s.size() + " distinct words: " + s);
    }

    public static <E> void swap(List<E> c, int i, int j){
        E tmp = c.get(i);
        c.set(i, c.get(j));
        c.set(j, tmp);
        System.out.println("Swapped element in index "+i+" ("+c.get(i).toString()+") with the element in index "
                +j+" ("+c.get(j).toString()+"):");
        for (Object o : c)
            System.out.print(o+", ");
        System.out.println();
        System.out.println();
    }


    static void filterWithFor(Collection<String> c, String cond){

        for ( Iterator<String> it = c.iterator(); it.hasNext();){
            String text = it.next();
            if (text.equals(cond))
                it.remove();
        }
        System.out.println("Filtered list with for and removed element: "+cond);
        for (Object o : c)
            System.out.print(o+", ");
        System.out.println();
        System.out.println();
    }
}

