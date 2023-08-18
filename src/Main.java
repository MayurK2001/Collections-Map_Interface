import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map mapOfCity = new HashMap();
        mapOfCity.put(1, "Mumbai");
        mapOfCity.put(2, "Pune");
        mapOfCity.put(3, "Delhi");
        mapOfCity.put(4, "Chennai");
        mapOfCity.put(2, "Kolkata");
        System.out.println(mapOfCity);
        Set<Objects> setOfKeys = mapOfCity.keySet();
        System.out.println(setOfKeys);
        System.out.println();
        Iterator<Objects> mapIterator  = setOfKeys.iterator();
        System.out.println("Using while loop and iterator:");
        while (mapIterator.hasNext()){
            Object obj = mapIterator.next();
            System.out.println(obj+" "+mapOfCity.get(obj));
        }
        System.out.println();
        System.out.println("Using for each loop:");
        for(Object o: mapOfCity.keySet()){
            System.out.println(o+" "+mapOfCity.get(o));
        }

    }
}
/*MAP:
* 1. Map is an interface inside the java.util package, which is used to store the data in key and value pair.
* 2. Map is not subtype of collection, that's why it behaves differently from collection.
* 3. All key in the map must b unique, but value can be duplicate.
* 4. A map can contain one null key but it can contain multiple null values.
*
* Map<interface>
   |----------------------------SortedMap<interface>---------->TreeMap<Class>
   HashMap<Class>
   |
   LinkedHashMap<Class>

*5. Methods:
* i. V put(Object key, Object value)
* ii. void putAll(Map map)
* iii. remove(Object key)
* iv. boolean remove(Object key)
* v. Set<K> keySet()
* vi. Set<Map.Entry<K,V>> entrySet()
* vii. void clear()
* viii. boolean containsValue(Object value)
* ix. boolean containsKey(Object key)
*  x. boolean equals(Object O)
* xi. V get(Object key)
* xii. boolean isEmpty()
* xiii. V replace(K key, V value)
* xiv. boolean replace(K key, V oldValue, V newValue)
* xv. Collection Values()*/