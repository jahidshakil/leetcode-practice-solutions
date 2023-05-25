class Solution {
    // TC : O(N) && SC : O(1)
    // By using 2 pointer approach (start & end)

    public String reverseWords(String s) {
        int n = s.length(); // length of the string
        String res = ""; // for storing the result
        int i = 0; // start pointer

        // this loop runs till end of the string
        while(i < n){
            // i was looking for non-sapce
            // if i found space the this loop terminates, till that this i  will runs
            while(i < n && s.charAt(i) == ' '){
                i++;
            }

            // if i greater than String length, then break
            // just a check point
            if(i >= n){
                break;
            }

             // j points to next of i, ie; space of next character
            int j = i + 1;

            // this j loop was looking for space
            // if space found this while loop terminates and i loop will start
            while(j < n && s.charAt(j) != ' '){
                j++;
            }

            // store the word to sub
            String sub = s.substring(i, j);

            // if length of res is 0, then store the word to the res
            if(res.length() == 0){
                res = sub;
            } 
            // if res is not empty don't add
            else 
            {
                // it stores, new sub + " " + earlier sub
                res = sub + " " + res;
            }
            // j loop ends, i loop starts 
            i = j + 1;
        }

        // return resultant string
        return res;
    }
}