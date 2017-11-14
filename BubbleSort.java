package inheritance;

import java.util.List;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
	// write your code here
        int[] array = new int[5];//此处就只简单进行五个排序吧
        Scanner ded = new Scanner(System.in);
        System.out.println("请输入您要排序的数字：");
        for (int k = 0; k < 5; k++){
            System.out.print("请输入第" +(k+1) + " 个数字：");
            array[k] = ded.nextInt();

        }
        //进行排序
        BubbleSort sorter = new BubbleSort();
        sorter.sort(array);
    }
    //冒泡排序的算法，其实很简单啦
    public void sort(int[] array){
        for (int i = 1; i < array.length; i++){
            for (int j = 0; j < array.length - 1; j++){
                if (array[i] > array[i] +1){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        showArray(array);
    }
    //输出
    public void showArray(int[] array){
        for (int i : array){
            System.out.print(" " + i);
        }
        System.out.println();
    }
}
