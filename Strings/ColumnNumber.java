// Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

// For example:

// A -> 1
// B -> 2
// C -> 3
// ...
// Z -> 26
// AA -> 27
// AB -> 28 
// ...
// Link- https://leetcode.com/problems/excel-sheet-column-number/description/
// Splution
class Solution {
    public int titleToNumber(String columnTitle) {
        int colNum = 0;
        for(int i=0;i<columnTitle.length();i++){
            colNum = colNum*26 + columnTitle.charAt(i) - 65 + 1;
        }
        return colNum;
    }
}
