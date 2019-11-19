import org.apache.poi.hslf.examples.DataExtraction;

import java.util.*;

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

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "张三");
        map.put(2, "李四");
        map.put(3, "王五");
        String s = map.put(3, "赵云");
        map.put(4, "赵云");
        System.out.println(s);

//        for(Integer key : map.keySet()) {
//            String value = map.get(key);
//            System.out.println("<" + key + ", " + value + ">");
//        }
    }
}
