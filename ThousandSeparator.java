public class ThousandSeparator {
    public static String thousandSeparator(int n){
        String input = Integer.toString(n);
        StringBuilder sb = new StringBuilder(input);
        input = sb.reverse().toString();
        String out = "";
        if (input.length()>3){
            int i;
            for (i=0; i<input.length()-3; i=i+3){
                out += input.substring(i, i+3) + ".";
            }
            out += input.substring(i);
        }else {
            out = input;
        }
        StringBuilder s = new StringBuilder(out);
        return s.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(thousandSeparator(123456789));
    }
}
