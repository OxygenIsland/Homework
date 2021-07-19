package day02;

public class h3 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,8,6,2,5,4,8,3,7};
        int[]arr2= new int[]{4,3,2,1,4};
        System.out.print(calculate(arr2));
    }
    public static int calculate(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if(arr[j] > arr[i]){
                    if((Math.abs(i-j))*arr[i]>max){
                        max=(Math.abs(i-j))*arr[i];
                    }
                }else {
                    if((Math.abs(i-j))*arr[j]>max){
                        max=(Math.abs(i-j))*arr[j];
                    }
                }
            }
        }
        return max;
    }
}
