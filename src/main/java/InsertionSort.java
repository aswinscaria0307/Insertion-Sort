import javax.sound.midi.Soundbank;

public class InsertionSort {
    public void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public int[] insertionSort(int[] arr){
        for(int i=1;i< arr.length;i++){
            int key=arr[i];//key=arr[1]
            int j=i-1;//j=0
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];//j=1
                j=j-1;
            }
            arr[j+1]=key;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] roll={1,4,7,3,5};
        InsertionSort obj=new InsertionSort();
        System.out.print("unsorted array ");
        obj.printArray(roll);
        System.out.println();
        System.out.print("sorted array ");
        int[] sortedArray= obj.insertionSort(roll);
        obj.printArray(sortedArray);

    }
}
