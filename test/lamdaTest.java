package test;


public class lamdaTest {
    @FunctionalInterface
    public interface JavaConding{
        String nowCoding(String s);
    }

    public static void main(String[] args) {
        JavaConding js;
        String s = "알파벳 ";

        String a = "에이";
        String b = "비";
        String c = "씨";


        js = (str) -> {return str + a;};
        System.out.println(js.nowCoding("알파벳 "));

        js = (str) -> {return str + b;};
        System.out.println(js.nowCoding(s));



    }
}
