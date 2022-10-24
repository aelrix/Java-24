import java.util.Iterator;

public class Show {
    public static void main(String[] args){
        //Chain<Element> chain = new Chain<Element>(); //V.1
        Chain<Element> chain = new Chain<>(); //V.2
        chain.add("David B", 42000);
        chain.add("Michael O", 400000);
        chain.add("Frank L", 36000);
//        while (chain.hasNext()){
//            Element current = chain.next();
//            System.out.println(current.name);
//        }
//        for( ; chain.hasNext(); ){
//            Element current = chain.next();
//            System.out.println(current.name);
//        }
        for (Element e : chain){
            System.out.println(e.name);
        }
        for (Element e : chain){
            System.out.println(e.name);
        }
    }
}

class Chain<T> implements Iterator<T>, Iterable<T> {
    public Iterator<T> iterator(){
        index = latest;
        return this;
    }
    public T next() {
        T temporary = index;
        index = (T)((Element)index).back;
        return temporary;
    }
    T index;
    public boolean hasNext() { 
        return index != null; 
    }
    T latest;
    void add(String name, double salary){
        Element e = new Element();
        e.name = name; e.salary = salary;
        e.back = (Element)latest;
        latest = (T)e;
        index = latest;
    }
}

class Element {
    String name;
    double salary;
    Element back;
}

