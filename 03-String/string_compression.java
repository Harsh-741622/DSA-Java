// Problem: Compress the String 
// Approach: Using Count we find frequency of character then append that with character if count > 1 else just append character 
//  Time Complexity: usingString and usingStringBuilder - O(n)
// Space Complexity: usingString - O(n^2) and usingStringBuilder - O(n) 
// Source: Apna College Sigma 11.0 Batch 


public class practice {
    public static void main(String args[]){
        String str = "aaaabbbcccddeeeed";
        System.out.println(usingStringBuilder(str));
    }

  // Using StringBuilder 
  public static String usingStringBuilder(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0 ; i<str.length() ; i++){
            Integer count = 1 ; 
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++ ;
                i++ ;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

  // Using New String 
    // public static String usingString(String str){
    //     String strNew = "";
    //     strNew += str.charAt(0);

    //     for(int i = 1; i < str.length(); i++){
    //         int count = 1;

    //         while(i < str.length() && str.charAt(i - 1) == str.charAt(i)){
    //             count++;
    //             i++;
    //         }

    //         if(count > 1){
    //             strNew += count;
    //         }

    //         if(i < str.length()){
    //             strNew += str.charAt(i);
    //         }
    //     }

    //     return strNew;
    // }
}
