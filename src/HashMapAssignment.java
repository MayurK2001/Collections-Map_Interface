import java.util.HashMap;
public class HashMapAssignment {
    public static void main(String[] args) {
        hashMapCities();
        hashMapStudentInfo();
        keyOddAverage();
    }
    //ass1:
    static void hashMapCities(){
        String []arr = {"Maharashtra","Goa","Karnataka","Gujrat","Rajasthan"};
        HashMap<String, String> hashMapCities = new HashMap<>();
        for(int i = 0 ; i < 5 ; i ++){
            hashMapCities.put(arr[i].substring(0,3).toUpperCase(), arr[i]);
        }
        System.out.println(hashMapCities);
    }
    //ass2:
    static void hashMapStudentInfo(){
        HashMap<String, Integer> h1 = new HashMap<>();
        h1.put("abc", 79);
        h1.put("xyz", 45);
        h1.put("jkl", 49);
        h1.put("pqr",55);
        h1.put("lmn", 98);
        HashMap<String, String> h2 = new HashMap<>();
        for(String s: h1.keySet()){
            if(h1.get(s) < 60) h2.put(s, "Fail");
            else h2.put(s, "Pass");
        }
        System.out.println(h2);
    }
    //ass3:
    static void keyOddAverage(){
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(1,4);
        h.put(2,5);
        h.put(3,6);
        h.put(4,7);
        h.put(5,8);
        h.put(6,9);
        int avg = 0;
        int count = 0;
        for(int i: h.keySet()){
            if((i & 1) != 0) {
                avg += h.get(i);
                count++;
            }
        }
        System.out.println("sum = "+avg+", count = "+count);
        System.out.println("average of values with odd keys: "+(avg/count));
    }
}
