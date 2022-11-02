package KTCuoiKhoa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _609 {
    public static void main(String[] args) {
    }
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] str = path.split(" ");
            String prefix = str[0] + "/";
            for (int i = 1; i < str.length; i++) {
                String s = str[i];
                int j = s.indexOf("(");
                String name = s.substring(j + 1, s.length() - 1);
                String filePath = s.substring(0, j);
                map.computeIfAbsent(name, k -> new ArrayList<>()).add(prefix + filePath);
            }
        }

        List<List<String>> res = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> value = entry.getValue();
            if (value.size() > 1) {
                res.add(value);
            }
        }

        return res;
    }
}
