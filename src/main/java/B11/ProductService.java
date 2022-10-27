package B11;


import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public List<Product> getAllProduct(){
        List<Product> result = new ArrayList<>();
        Gson gson = new Gson();
        try {
            FileReader reader = new FileReader("product.json");
            Type type = new TypeToken<List<Product>>(){}.getType();
            result = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
