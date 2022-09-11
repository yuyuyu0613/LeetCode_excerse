package JavaVideo.Test.Test1;

public class Demo2 {
    public static void main(String[] args) {
//
//        Integer i=Integer.valueOf(100);
//        Integer j=2;
//        i=i+1;
//        int number=100;
//        String s=String.valueOf(number);
//        String string="100";
//        Integer k=Integer.valueOf(string);
//        int i=k.intValue();
//        int j=
String a="12 13 45 67 89";
String[]ss=a.split(" ");
        System.out.println(ss[1]);
        int[] arr=new int[ss.length];
        for(int i=0;i<a.length();i++){
            arr[i]=Integer.parseInt(ss[i]);
            System.out.println(arr[i]);

        }
        System.out.println(arr[1]);
    }

}
