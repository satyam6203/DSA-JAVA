public class StringInJava {
    public static void main(String[] args) {
        String name="satyamkumarsat";
        System.out.println(name);//retutn the string
        System.out.println(name.length());//return the length
        System.out.println(name.charAt(3));//return the index of particular char
        System.out.println(name.substring(2));//from this to last index
        System.out.println(name.substring(1,5));
        // System.out.println(name);
        String sn="sat";
        System.out.println(name.contains(sn));//to check it present or not
        System.out.println(name.equals(sn));//compare two string are equals or not
        System.out.println(name.indexOf(sn));//it return the 1 index of the string
        System.out.println(name.indexOf(sn,1));
    }
}
