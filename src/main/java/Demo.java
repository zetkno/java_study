import com.zetkno.clazz.Person;
import org.apache.poi.hslf.examples.DataExtraction;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Demo {

    /**
     * 冒泡排序
     * 思想；循环遍历左右两个元素交换位置，大的放在右边
     *
     */
    public static void bubbleSort(int[] nums) {

        int temp;
        for (int j = 0; j < nums.length - 1; j++) {
            for (int i = 0; i < nums.length - 1 - j; i++) {
                if (nums[i] > nums[i + 1]) {
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }

    /**
     * 快速排序
     * @param nums 目标数组
     * @param start 排序的起始位置
     * @param end 排序的终止位置
     * 思想：二分法，取第一个值为基数 从数组的右边开始与基数比较大小，如果比基数小就停下，
     *            然后从左边开始找比基数大的找到就停下，交换两个位置的值。
     *            直到两个位置相遇，相遇的话就交换相遇位置的值与基数的值，此刻(i = j)
     */
    public static void quickSort(int[] nums, int start, int end) {
        if (start > end) {
            return;
        }
        int i = start;
        int j = end;
        int base = nums[start];
        int temp;
        while (i != j) {
            while (base <= nums[j] && i < j) {
                j--;
            }
            while (base >= nums[i] && i < j) {
                i++;
            }
            temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
        nums[start] = nums[i];
        nums[i] = base;
        quickSort(nums, start, i - 1);
        quickSort(nums, i + 1, end);


    }


    public static void main(String[] args) {
//        long l1 = System.currentTimeMillis();
//        ArrayList arrayList = new ArrayList();
//        for (int i = 0; i < 1000000; i++) {
//            arrayList.add(i);
//        }
//        long l2 = System.currentTimeMillis();
//        System.out.println(l2 - l1);
//
//
//        long ll1 = System.currentTimeMillis();
//        LinkedList linkedList = new LinkedList();
//        for (int i = 0; i < 1000000; i++) {
//            linkedList.add(i);
//        }
//        long ll2 = System.currentTimeMillis();
//        System.out.println(ll2 - ll1);

//        Person[] p = new Person[3];
//        Person[] pArray =  p;
//        int i = 0;
//        Person person = pArray[i];
//        System.out.println(person);
//        String s = "李四";
//        System.out.println(s.hashCode());
//        for (Person person = pArray[i]; person != null; i++) {
//            System.out.println("for loops");
//        }
//        HashMap<String, String> map = new HashMap<>();
//        map.put("三国", "张三");
//        map.put("西游记", "李四");
//        map.put("海贼王", "王五");
//        for(Integer key : map.keySet()) {
//            String value = map.get(key);
//            System.out.println("<" + key + ", " + value + ">");
//        }
//        String a = "abc";
//        String b = new String("abc");
//        String c = "a" + "bc";
//        System.out.println(a == b);
//        System.out.println(a == c);
//        System.out.println(b == c);
//        System.out.println(a.equals(b));
//        System.out.println(b.equals(c));
//        System.out.println(b.replace("c", "b"));
        for (int i = 0; ; i++) {
            System.out.println(i);
        }


    }
}
class P implements Comparable{
    private String name;
    private int age;
    private String gender;

    public P() {}

    public P(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int hashCode() {
        return name.hashCode() + age * 37;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof P)) {
            return false;
        }
        P p = (P) obj;
        return this.name.equals(p.name) && this.age == age;
    }

    @Override
    public int compareTo(Object obj) {
        P p = (P) obj;
        if (this.age > p.age) {
            return 1;
        }
        if (this.age < p.age) {
            return -1;
        }
        return this.name.compareTo(p.name);
    }
}
