import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> products = new HashMap<>();
        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " products: ");
        String regEx = "[A-Z]{3}[1-8]{3}";
        for (int i = 0; i < n; i++) {
            System.out.println("Enter product code: ");
            sc.nextLine();
            String pCode = sc.next();
            if (pCode.matches(regEx)) {
                System.out.println("Enter product name: ");
                products.put(pCode, sc.next());
            } else {
                System.out.println("Invalid product code!");
                break;
            }
        }
        System.out.println("Map : " + products);
        System.out.println("All the product code in ascending order: ");
        TreeMap<String, String> mapOfProducts = new TreeMap<>(products);
        System.out.println(mapOfProducts.keySet());

        System.out.println("Fetching all products starts with T, L, A");
        for (String s : mapOfProducts.keySet()) {
            if (mapOfProducts.get(s).charAt(0) == 'T' || mapOfProducts.get(s).charAt(0) == 'L' || mapOfProducts.get(s).charAt(0) == 'A') {
                System.out.println(s + " " + mapOfProducts.get(s));
            }
        }
        System.out.println("Enter the product code to remove: ");
        String pCode = sc.next();
        mapOfProducts.remove(pCode);
        System.out.println(mapOfProducts);
    }
}