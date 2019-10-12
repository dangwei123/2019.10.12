1.
给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。

函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。

说明:

返回的下标值（index1 和 index2）不是从零开始的。
你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int mid=numbers[left]+numbers[right];
            if(mid>target){
                right--;
            }else if(mid==target){
                break;
            }else{
                left++;
            }
        }
        return new int[] {left+1,right+1};
    }
}

2.
给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。

如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。

 class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] res=new int[2001];
        for(int i :arr){
            res[i+1000]++;
        }
        for(int i=0;i<res.length;i++){
             if(i==0){
                 continue;
             }
         for(int j=0;j<res.length;j++){
             if(i==j){
                 continue;
             }if(res[i]==res[j]&&res[i]!=0){
                 return false;
             }
         }
          
    }
          return true;
}
}

3.
给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非
递减顺序排序。
class Solution {
    public int[] sortedSquares(int[] A) {
        int[] arr=new int[A.length];
        for(int i=0;i<A.length;i++){
            arr[i]=A[i]*A[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}

4.
给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。

说明：不要使用任何内置的库函数，如  sqrt。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/valid-perfect-square
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public boolean isPerfectSquare(int num) {
        double i=1.0;
        while(i<num/i){
            i++;
        }
        return i==num/i;
    }
}

 