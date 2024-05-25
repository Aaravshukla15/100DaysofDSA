// Given an integer columnNumber, return its corresponding
// column title as it appears in an Excel sheet.

// For example:

// A -> 1
// B -> 2
// C -> 3
// ...
// Z -> 26
// AA -> 27
// AB -> 28 
//   Link - https://leetcode.com/problems/excel-sheet-column-title/description/
//   solution
class Solution {
    public String convertToTitle(int columnNumber) {
     StringBuilder ans = new StringBuilder();
     while(columnNumber>0){
        columnNumber = columnNumber -1;
        int remainder = columnNumber%26;
        ans.append((char)(remainder + 65));
        columnNumber = columnNumber/26;
     }
     return ans.reverse().toString();   
    }
}
