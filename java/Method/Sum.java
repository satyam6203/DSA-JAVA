class Add{
    int add(int a,int b){
        return a+b;
    }
}
public class Sum {
    public static void main(String[] args) {
        Add add=new Add();
        int sum=add.add(10, 11);
        System.out.println(sum);
    }
}
