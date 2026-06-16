class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toLowerCase().replaceAll("[^A-Za-z0-9]","").toCharArray();
        int start  = 0;
        int end = arr.length - 1;
        while(end > start){
            if(arr[end] != arr[start]) return false;
            end--;
            start++;
        }
        return true;
    }
}
