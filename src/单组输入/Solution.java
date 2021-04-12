package 单组输入;

public class Solution {
    public static void main(String[] args) {
        String s = "DDDDDoooo yoooouuuu    lllllooovvvveee      mmmmmmee";
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        char temp = s.charAt(0);
        StringBuilder sb = new StringBuilder(String.valueOf(temp));

        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == temp){
                continue;
            }
            sb.append(s.charAt(i));
            temp = s.charAt(i);
        }
        return sb.toString();
    }
}
