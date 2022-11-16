import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Car,DannyeOmashine> hashMap = new LinkedHashMap<>();
        hashMap.put(new Car(1,"1234KRF"),
                    new DannyeOmashine(2001,"MERSEDES",12000000,"Chornyi"));

        for (Map.Entry entry: hashMap.entrySet()){
            Car a = (Car) entry.getKey();
            DannyeOmashine b = (DannyeOmashine) entry.getValue();

            System.out.println(a);
            System.out.println(b);
        }
    }
}