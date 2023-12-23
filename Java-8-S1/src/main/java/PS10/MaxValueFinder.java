package PS10;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class MaxValueFinder extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 1000;
    private int[] array;
    private int start;
    private int end;

    public MaxValueFinder(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= THRESHOLD) {
            return findMaxValue();
        } else {
            int mid = (start + end) / 2;
            MaxValueFinder leftTask = new MaxValueFinder(array, start, mid);
            MaxValueFinder rightTask = new MaxValueFinder(array, mid, end);

            invokeAll(leftTask, rightTask);

            return Math.max(leftTask.join(), rightTask.join());
        }
    }

    private int findMaxValue() {
        int max = array[start];
        for (int i = start + 1; i < end; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println("Max value found: " + max + ", range: " + start + "-" + end);
        return max;
    }

    public static void main(String[] args) {
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        ForkJoinPool pool = new ForkJoinPool();
        MaxValueFinder task = new MaxValueFinder(array, 0, array.length);

        int result = pool.invoke(task);
        System.out.println("\nMax value of the array: " + result);
    }
}
