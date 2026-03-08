// Problem: Convert String into Tittle i.e first character in each word must be int Uppercase
// Approach: Using StringBuilder we append the characters.
// Time complexity: O(n)
// Space Complexity: O(n) 
// Source: Apna College Sigma 11.0 Batch 


public class practice {
    public static void main(String args[]){
        String str = "hi, i am harsh";
        System.out.println(toUpperCase(str));
    }
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1 ; i<str.length() ; i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){ // i<str.length()-1 because we need to avoid case where user enter space at end because after that there is no character to convert.
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
               
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    
}
