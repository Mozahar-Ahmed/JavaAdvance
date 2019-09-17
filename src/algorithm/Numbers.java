
package algorithm;

        import databases.ConnectToSqlDB;

        import java.util.List;
        import java.util.Random;

public class Numbers {

     /* Show all the different kind of sorting algorithm by applying into (num array).
        Display the execution time for each sorting.Example in below.
        Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
        At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.*/


    public static void main(String[] args) throws Exception {

        int[] num = new int[100000];
        storeRandomNumbers(num);

        //ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        Sort algo = new Sort();
        int n = num.length;

        //selection sort
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");

        //Insertion Sort
        randomize (num, n);
        algo.insertionSort(num);
        long insertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

        //Bubble sort
        randomize (num, n);
        algo.bubbleSort(num);
        long bubbleSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");

        //Merge sort
        randomize (num, n);
        algo.mergeSort(num,0,n-1);
        long mergeSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergeSortExecutionTime + " milli sec");

        //Quick sort
        randomize (num, n);
        algo.quickSort(num,0,n-1);
        long quickSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");

        //Heap sort
        randomize (num, n);
        algo.heapSort(num,n);
        int maxValueForBucketSort = num[num.length-1];
        long heapSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");

        //Bucket sort
        randomize (num, n);
        algo.bucketSort(num,maxValueForBucketSort);
        long bucketSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Bucket Sort take: " + bucketSortExecutionTime + " milli sec");
    }

    public static void storeRandomNumbers(int [] num){
        Random rand = new Random();
        for(int i=0; i<num.length; i++){
            num[i] = rand.nextInt(1000000);
        }
    }

    public static void randomize( int arr[], int n) {
        Random r = new Random();

        for (int i = n-1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void printValue(List<String> array){
        for(String st:array){
            System.out.println(st);
        }
    }
}


