package Study_java_Problem.Example;

public class bubbleImplement implements SortBubble {
    /**
     * 冒泡排序
     * <T>表明了这是一个泛型方法，并且声明了一个范型T
     * 这里调用了comparaTo方法进行比较
     * @param <T>
     * @param t
     * @return
     */
    public <T extends Comparable<T>> T[] bubbleSort(T[] t) {
        if (t == null || t.length < 2) {
            return t;
        }
        for (int i = 0; i < t.length-1; i++) {
            boolean flag = true;
            for (int j = 0; j < t.length-1-i; j++) {
                // 如果前面的数比后面的数大 则交换
                if (t[j].compareTo(t[j+1])>0) {
                    flag = false;
                    T temp = t[j];
                    t[j] = t[j+1];
                    t[j+1] = temp;
                }
            }
            if(flag) {
                break;
            }
        }
        return t;
    }

}
