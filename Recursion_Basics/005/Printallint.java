
public class Solution
{
    public static void recursiveFunction(int x, int []ans) {
        if(x == 0) {
            return;
        }
        ans[ans.length - x] = x;

 
        recursiveFunction(x - 1, ans);
    }

    public static int[] printNos(int x) {
        int []ans = new int[x];

        recursiveFunction(x, ans);

        return ans;
    }
}
