package base.var;

public class datatype {
    public static void main(String[] args) {
        char a = 'a';
        char b = '林';
        int x = '中';
        int k ='a'; //显示字符的Unicode编码
        final String SEX ="男生不是女生";
        System.out.println(SEX+""+x+" "+k);

        String huanhang = "你看我\n" + "是这样换行的";
        System.out.println(huanhang);

        char c = '\u0041'; //16进制转换为字符
        System.out.println(c);
    }
}
