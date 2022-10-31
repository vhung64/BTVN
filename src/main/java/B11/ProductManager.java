package B11;
import java.util.*;

public class ProductManager {
    // Liệt kê tất cả các hãng sản phẩm (Sử dụng Set)
    public static Set<String> getDataBrand(List<Product> list){
        Set<String> set = new HashSet<>();
        for(Product pd : list){
            String str = pd.getBrand();
            int temp = str.indexOf("(");
            if (temp != -1)
                set.add(str.substring(0, temp).trim());
            else
                set.add(str);
        }
        return set;
    }
    // Liệt kê Danh mục sản phẩm(Category) và số lượng sản phẩm thuộc danh mục đó (Map)
    public static Map<String, Integer> getDataCategory(List<Product> list){
        Map<String, Integer> hashMap = new HashMap<>();
        for(Product pd : list){
            String[] category = pd.getCategory();
//            String str = Arrays.toString(category);
            for (String str : category){
                if(hashMap.containsKey(str)){
                    hashMap.put(str, hashMap.get(str) + 1);
                }
                else{
                    hashMap.put(str, 1);
                }
            }
        }
        return hashMap;
    }
    public static void main(String[] args) {
        ProductService ps = new ProductService();
        List<Product> list = ps.getAllProduct();
//      list.forEach(i -> System.out.println(i.getId() + " - " + i.getName() + " - " ));
        // Liệt kê tất cả các hãng sản phẩm (Sử dụng Set)
        Set<String> set = getDataBrand(list);
        Map<String, Integer> hashMap = getDataCategory(list);
        System.out.println("Liệt kê tất cả các hãng sản phẩm (Sử dụng Set) : ");
        System.out.println("\t" + set);
        System.out.println("Liệt kê Danh mục sản phẩm(Category) và số lượng sản phẩm thuộc danh mục đó (Map) :");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println("\t" + entry.getKey() + " - " + entry.getValue());
        }
    }
}
