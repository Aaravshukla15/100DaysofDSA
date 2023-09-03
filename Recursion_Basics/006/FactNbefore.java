
//Iterative method
import java.util.List;
import java.util.ArrayList;
public class Solution {
    public static List<Long> factorialNumbers(long n) {
        long result = 1l, cnt = 1l;
        List< Long > ans = new ArrayList<>();

        while(result <= n / cnt) {
            // Multiplying 'result' with 'cnt'
            result *= cnt;
            cnt++;
            ans.add(result);
        }

        return ans;
    }
}

// recursive can suggest, I'm also trying
