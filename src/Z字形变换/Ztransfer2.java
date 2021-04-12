package Z字形变换;

import java.util.ArrayList;
import java.util.List;

public class Ztransfer2 {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        boolean flag = false;
        int curNumRows = 0;
        for(char c : s.toCharArray()){
            if(curNumRows == 0 || curNumRows == numRows - 1){
                flag = !flag;
            }
            list.get(curNumRows).append(c);
            curNumRows = curNumRows + (flag ? 1 : -1);

        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder sb : list) {
            res.append(sb);
        }
        return res.toString();


    }


}
