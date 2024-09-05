import java.util.Arrays;


public class Count_Sort {
    public static void CountSort(int[] arr){
        int max=Arrays.stream(arr).max().getAsInt();
        int min= Arrays.stream(arr).min().getAsInt();
        int range=max-min+1;
        int[] Count = new int[range];
        int[] f_arr= new int[arr.length];

        for(int i=0;i<arr.length;i++){
            Count[arr[i]-min]++;
        }
        for(int i=1;i<Count.length;i++){
            Count[i]+=Count[i-1];
        }
        
        for(int i=arr.length-1;i>=0;i--){
            f_arr[Count[arr[i]-min]-1]=arr[i];
            Count[arr[i]-min]--;

        }

        System.arraycopy(f_arr, 0, arr, 0, arr.length);
        System.out.println("Count Sort");
        for(int element:arr){
            System.out.print(element+" ");
        }

    }










}
