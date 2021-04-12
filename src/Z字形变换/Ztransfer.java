package Z字形变换;

public class Ztransfer {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        for(int i = 0; i < numRows; i++){
            int j = i;
            if(i == 0 || i == numRows - 1){
                while(j < length){
                    sb.append(s.charAt(j));
                    j = j + (2 * numRows - 2);
                }
            }else{
                while(j < length){
                    sb.append(s.charAt(j));
                    int temp = j + (2 * numRows - 2 - 2 * i);
                    if( temp < length){
                        sb.append(s.charAt(temp));
                    }
                    j = j + (2 * numRows - 2);
                }
            }

        }
        return sb.toString();
    }
}
