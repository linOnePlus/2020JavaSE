package base.array;
/**
 * 数组定义以及内存
 */
public class demo1 {
    public static void main(String[] args) {
        boolean [] arr = new boolean[5];
        System.out.println(arr[3]); //默认值是

        String [] arr2 = new String[]{"hello","twice","time","learning"};
        System.out.println(arr2.length+" "+arr2[1]);

        String [] arr3 = {"hello","twice","time","learning"};
        System.out.println(arr3.length+" "+arr3[1]);

        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"? xyz string仍然指向旧版name[1]指向的值xyz name[1]指向新值cat
    }
}
