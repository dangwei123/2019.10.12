1.
给定两个整数 L 和 R ，找到闭区间 [L, R] 范围内，计算置位位数为质数的整数个数。

（注意，计算置位代表二进制表示中1的个数。例如 21 的二进制表示 10101 有 3 个计算置位。还有，1 不是质数。）

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/prime-number-of-set-bits-in-binary-representation
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public int countPrimeSetBits(int L, int R) {
        int count=0;
        for(int i=L;i<=R;i++){
            int tmp=i;
            int num=0;
            while(tmp!=0){
                num++;
                tmp&=(tmp-1);
            }
            if(num==1){
                continue;
            }
            int j=0;
            for(j=2;j<num;j++){
                if(num%j==0){
                    break;
                }
            }
            if(j==num){
                count++;
            }
        }
        return count;
    }
}

2.
给定范围 [m, n]，其中 0 <= m <= n <= 2147483647，返
回此范围内所有数字的按位与（包含 m, n 两端点）。
class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int count=0;
        while(n!=m){
            m>>=1;
            n>>=1;
            count++;
        }
        return n<<count;
    }
}

3.
给定一个整数，将其转化为7进制，并以字符串形式输出。
class Solution {
    public String convertToBase7(int num) {
          String s="";
        if(num==0){
            return "0";
        }
        if(num>0){
            while(num!=0){
                int tmp=num%7;
                s=tmp+s;
                num/=7;
            }
            return s;
        }else{
            num=-num;
            while(num!=0){
                int tmp=num%7;
                s=tmp+s;
                num/=7;
            }
            return "-"+s;
        }
    }
}

4.
给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/array-partition-i
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}