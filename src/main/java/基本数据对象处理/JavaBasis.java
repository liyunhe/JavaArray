package 基本数据对象处理;

/**
 * Created by mrlee on 2017/4/12.
 */
/**
* Java StringBuffer 和 StringBuilder 类
* 当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
* 和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
* StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。
* 由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。
 *---------------------------------------------------------------------------------
 * javaBuffer 用于线程安全 不会实力出新的对象
 * JavaBulider 用于非线程安全使用效率相对比较高 不会实力出新的对像
 *----------------------------------------------------------------------------------
 * 1	public StringBuffer append(String s) 将指定的字符串追加到此字符序列。
 * 2	public StringBuffer reverse()        将此字符序列用其反转形式取代。
 * 3	public delete(int start, int end)    移除此序列的子字符串中的字符。
 * 4	public insert(int offset, int i)     将 int 参数的字符串表示形式插入此序列中。
 * 5	replace(int start, int end, String str) 使用给定 String 中的字符替换此序列的子字符串中的字符。
 *
 *
 *
 *
 *
 *
* */


public class JavaBasis {
    public static void main(String []args){
//        StringBuffer strBuff = new StringBuffer("我叫李云鹤");
//        strBuff.append("我是一个java菜鸟");
//        strBuff.append(66);
//        System.out.println(strBuff);
//
//        StringBuilder strBuilder = new StringBuilder("我叫袁青青");
//        strBuilder.append("我是李云鹤的媳妇");
//        strBuilder.append("我今年36");
//        strBuilder.append(66);
//        System.out.println(strBuilder);
        //---------------------------------------
        //数组
        double[] myList = new double[5];
        myList[0] = 5.0;
        myList[1] = 5.0;
        myList[2] = 5.0;
        myList[4] = 5.0;
//        myList[5] = 5.0;
        double total = 0;
        System.out.println("myList.length is value：" + myList.length);
        for (int i = 0; i<5; i++){
//          total += myList[i];
            total = total+myList[i];

        }
        System.out.println("5个数的总和为：" + total);
        //数组的处理
        //数组的元素类型和数组的大小都是确定的，所以当处理数组元素时候，我们通常使用基本循环或者 foreach 循环。
        double[] myListNumber = {1.9,1.8,1.3,1.0};
        //查找最数组中最大的数
//        double number = 0.0;
        double max = myListNumber[0];
        for (int i =0;i< myListNumber.length;i++) {
            if (max<myListNumber[i]) max = myListNumber[i];
        }
        System.out.println("max is value:"+max);
        
        
        //foreach 循环
        for (double element: myListNumber) {
            System.out.println(element);
        }
        for (double element: myList) {
            System.out.println(element);
        }

    }
    //TODO：没有完成 有待开发
    public int[] Qukit(int left,int right){
        return null;
    }

}
