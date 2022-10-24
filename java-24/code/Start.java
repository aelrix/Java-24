import java.util.ArrayList;

class Start{
    public static void main(String[] args){
        ArrayList<String> coffee = new ArrayList<>();
        coffee.add("Latte");
        coffee.add("Mocha");
        coffee.add("Milk");
        System.out.println(coffee);
        
        ArrayList a = new ArrayList();
        a.add(5);           // Converted to instanceof Integer  
        a.add("Latte");     // Non-Primitive
        a.add(2.8);         // Converted to instanceof Double
        a.add(6);
        a.add(3);
        // Write code to find the total sum of 
        // instanceof Integer from the given ArrayList
        int count = 0;
        int sum = 0;
        for (Object o : a) { 
            if(o instanceof Integer){
                count++;
                sum += (Integer)o;
            }
        }
        System.out.println(count);
        System.out.println(sum);
    }
}

// Spring Data JDBC = based on JDBC
// Spring Dta JPA = based on JPA
