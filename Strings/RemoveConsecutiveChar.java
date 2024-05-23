# Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.

# Example 1:

# Input:
# S = aabb
# Output:  ab 
# Explanation: 'a' at 2nd position is
# appearing 2nd time consecutively.
# Similiar explanation for b at
# # 4th position.

# Link - https://www.geeksforgeeks.org/problems/consecutive-elements2306/1
# Solution
class Solution{
    public String removeConsecutiveCharacter(String S){
        //base condition
        if(S == null || S.length()==0){
            return S;
        }
        
        StringBuilder ans = new StringBuilder();
        ans.append(S.charAt(0));
        
        for(int i=1;i<S.length();i++){
            if(S.charAt(i)!=S.charAt(i-1)){
                ans.append(S.charAt(i));
            }
        }
        return ans.toString();
    }
}
