 import java.util.Arrays;
 public class radixSort {
    public static void RadixSort(int[] arr){
        int max=Arrays.stream(arr).max().getAsInt();
        int exp=1;
        while(exp<=max){
            count(arr,exp);
            exp++;

        }
        System.out.println("RADIX Sort:");
        for(int element:arr){
            System.out.print(element+" ");
        }

    }
    private static void count(int[] arr ,int exp){
        int[] count=new int[10];
        int[] Output=new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            count[(arr[i]/exp)%10]++;
        }

        for(int i =1;i<count.length;i++){
            count[i]+=count[i-1];
        }

        for(int i=0;i<arr.length;i++){
            Output[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }
        System.arraycopy(Output, 0, arr, 0, arr.length);

    }
}
    

