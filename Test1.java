1.
给定一副牌，每张牌上都写着一个整数。

此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：

每组都有 X 张牌。
组内所有的牌上都写着相同的整数。
仅当你可选的 X >= 2 时返回 true。

 

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/x-of-a-kind-in-a-deck-of-cards
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] arr=new int[10000];
        for(int i:deck){
            arr[i]++;
        }
      Arrays.sort(arr);
        int i=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]!=0){
                break;
            }
        }
         int count=arr[i];
       while(count>1){
           int tmp=i;
          while(tmp<arr.length&&arr[tmp]%count==0){
               tmp++;
           }
           if(tmp==arr.length){
               break;
           }
           count--;
       }
        return count>1;
    }
}

2.
给定两个字符串 s 和 t，它们只包含小写字母。

字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。

请找出在 t 中被添加的字母。

 class Solution {
    public char findTheDifference(String s, String t) {
         int res=0;
        for(char c:s.toCharArray()){
            res^=c;
        }for(char c:t.toCharArray()){
            res^=c;
        }
        return (char)res;
    }
}

3.
颠倒给定的 32 位无符号整数的二进制位。


 public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int num=0;
        for(int i=31;i>=0;i--){
            num+=((n>>i)&1)<<(31-i);
        }
        return num;
    }
}

4.
给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。
 找出只出现一次的那两个元素。
 class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res={0,0};
        int a=0;
        for(int i: nums){
            a^=i;
        }
        a&=(-a);
        for(int i:nums){
            if((i&a)==0){
                res[0]^=i;
            }else{
                res[1]^=i;
            }
        }
        return res;
    }
}
