
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ReverseString {
    public static void main(String[] args) {
        String input ="chandar";
        char[] chars = input.toCharArray();
        for(int i=chars.length-1; i>=0;i--){
            System.out.print(chars[i]);
        }
    }
}