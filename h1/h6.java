package day03;

import java.util.Arrays;
import java.util.Stack;

public class h6 {
    public static int trap(int[] height) {
        int[] leftmaxheight=new int[height.length];
        int[] rightmaxheight=new int[height.length];
        int res=0;
        int max=0;
        for (int i=0;i<height.length;i++){
            max=0;
            for (int j=i;j<height.length;j++){
                if(height[j]>max){
                    max=height[j];
                }
            }
            rightmaxheight[i]=max;
        }
        //System.out.println(Arrays.toString(rightmaxheight));
        for (int i=0;i<height.length;i++){
            max=0;
            for (int j=0;j<i;j++){
                if(height[j]>max){
                    max=height[j];
                }
            }
            leftmaxheight[i]=max;
        }
        for (int i=0;i<rightmaxheight.length;i++){
            if(rightmaxheight[i]!=0&&leftmaxheight[i]!=0){
                if((Math.min(rightmaxheight[i],leftmaxheight[i])-height[i])>0){
                    res+=(Math.min(rightmaxheight[i],leftmaxheight[i])-height[i]);
                }
            }
        }
        //System.out.println(Arrays.toString(leftmaxheight));
        return res;
    }

    public static void main(String[] args) {
        int[] arr =new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int[] arr2=new int[]{4,2,0,3,2,5};
        //System.out.println(Arrays.toString(arr));
        System.out.print(trap(arr2));
    }
}
