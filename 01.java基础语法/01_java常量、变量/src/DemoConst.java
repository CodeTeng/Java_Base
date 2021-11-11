// 下面讲述常量
// 常量指的是在Java程序中固定不变的数据

public class DemoConst {
    public static void main(String[] args) {
        // 字符串常量
        System.out.println("ABC");
        System.out.println(""); // 字符串两个双引号中间的内容为空

        // 整数常量
        System.out.println(30);
        System.out.println(-500);

        // 浮点数常量（小数）
        System.out.println(3.14);
        System.out.println(-2.5);

        // 字符常量
        System.out.println('A');
        System.out.println('6');
        // System.out.println(''); // 两个单引号中间必须有且仅有一个字符，没有不行，IDE就会报错。
        // System.out.println('AB'); // 两个单引号中间必须有且仅有一个字符，有两个不行。

        // 布尔常量  true---1 false---0
        System.out.println(true);
        System.out.println(false);

        // 空常量。空常量不能直接用来打印输出。
        // System.out.println(null);
    }
}
