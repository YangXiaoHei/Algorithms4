package 第二章_初级排序算法;

public class Practise_2_1_10 {
    public static void main(String[] args) {
        /*
         * 如果我们在 h-sorting 中使用 selectionSort
         * 
         * 对于序列
         * 
         * N = 10 N/3 = 3 h = 4
         * 
         *  0    1    2    3    4    5    6    7    8    9    
            0    9    9    7    4    3    3    3    6    3    
         * 
         * 排序过程如下
         * 
         * h = 4
         * 假设 0 是最小的，在 4 ~ 9 之间寻找比 0 更小的元素，比较了 6 次
         * 假设 9 是最小的，在 5 ~ 9 之间寻找比 9 更小的元素，比较了 5 次 
         *  0    3    9    7    4    9    3    3    6    3
         * 假设 9 是最小的，在 6 ~ 9 之间寻找比 9 更小的元素，比较了 4 次
         *  0    3    3    7    4    9    9    3    6    3
         * 假设 7 是最小的，在 7 ~ 9 之间寻找比 7 更小的元素，比较了 3 次
         *  0    3    3    3    4    9    9    7    6    3
         * 假设 4 最小，在 8 ~ 9 之间寻找比 4 更小的元素 比较了 2 次
         *  0    3    3    3    3    9    9    7    6    4
         * 
         * h = 1
         * 假设 0 最小，比较了 9 次
         * 假设 3 最小，比较了 8 次
         * 假设 3 最小，比较了 7 次
         * 假设 3 最小，比较了 6 次
         * 假设 3 最小，比较了 5 次
         * 假设 9 最小，比较了 4 次
         *  0    3    3    3    3    4    9    7    6    9
         *  假设 9 最小，比较了 3 次
         *  0    3    3    3    3    4    6    7    9    9
         *  假设 7 最小，比较了 2 次
         *  假设 9 最小，比较了 1 次
         *  
         *  交换了 6 次
         *  比较了 65 次
         *  
         *  其实下面不用插入排序来进行对比也可以感觉出来，在 h-sorting 中使用选择排序造成了大量的比较操作，
         *  虽然交换操作很少，但是比较操作上的数组访问次数远远超过了选择排序
         *  
         *  使用选择排序进行 h-sorting 过程如下
         *  
         *  h = 4
         *  0    1    2    3    4    5    6    7    8    9    
            0    9    9    7    4    3    3    3    6    3 
            
            0    3    9    7    4    9    3    3    6    3  
            0    3    3    7    4    9    9    3    6    3  
            0    3    3    3    4    3    9    7    6    9  
            
            h = 1
            0    3    3    3    3    4    9    7    6    9 
            0    3    3    3    3    4    7    9    6    9 
            0    3    3    3    3    4    7    6    9    9 
            0    3    3    3    3    4    6    7    9    9 
            
            交换了 7 次
            比较了 22 次
            
            可以看出，在交换次数上，使用选择排序或有不及，但在比较次数上，插入排序的成本远远低于选择排序
         */
    }
}
