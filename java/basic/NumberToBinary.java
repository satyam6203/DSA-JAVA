public class NumberToBinary {
    static String binaryToString(int n){
        StringBuilder sb=new StringBuilder();
        while(n>0){
            int rem=n%2;
            sb.append(rem);
            n=n/2;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(binaryToString(15));
    }
}
