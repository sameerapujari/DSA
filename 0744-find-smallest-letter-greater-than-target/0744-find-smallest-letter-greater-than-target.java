class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        //binary search
        char ans = letters[0];
        int l=0, h=letters.length-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(letters[mid]>target){
                //go left
                ans=letters[mid];
                h=mid-1;
            }
            else l=mid+1;
        }
        return ans;
    }
}