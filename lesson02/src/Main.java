import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] newArray = GenerateRandomSeqArray(1000);
        long endTime = System.nanoTime();
        System.out.println("执行耗时: " + ((endTime - startTime) / 1000000.0)  + "毫秒. 生成的数组:\n");
        System.out.println(Arrays.toString(newArray));
    }

    //    题目：
//    生成一个长度为1000，有序但是值不连续的整形数组。
//    注意项：
//      1）代码必须编译通过
//      2）需要贴出输出的值
//      3）贴出总的执行时间
//      4）在关键逻辑处需要有相关的代码注释
//      5）尽量自己独立完成
//      6）请必须Checkin代码
    public static int[] GenerateRandomSeqArray(int length) {
        Random random = new Random();
        int[] values = new int[length];
        for(int i = 0; i< length; i++)
            values[i] = (i << 3) + random.nextInt(8);  // i * 8 + Random(0~8); 保证不重复

        return values;
    }
}
