class Solution {
    public String reverseWords(String s) {

        StringBuilder ans = new StringBuilder();

        int i = s.length()-1;  //LAST INDEX OF THE STRING

        while(i>=0){
            while(i>=0 && s.charAt(i)== ' '){
                // IGNORING EXTRA SPACES
                i--;
            }
            if(i<0){
                break;
            }
            int j=i;
            // FINDING THE STARTING INDEX OF THE WORD
            while(j>=0 && s.charAt(j) != ' '){
                j--;
            }
            // JAISE HI SPACE MILEGA WAISE HI HUM LOG USKO ANSWER ME APPEND KAR DENGE
            ans.append(s.substring(j+1,i+1));

            while(j>=0 && s.charAt(j) == ' '){
                j--;
            }
            if(j>=0){

                ans.append(' ');

            }
            i=j;

        }

        return ans.toString();
        
    }
}