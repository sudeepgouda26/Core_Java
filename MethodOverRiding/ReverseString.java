class ReverseString{

    static String palindrome(String str){
        String result = "";
        for(int i = str.length()-1; i>=0; i--){
            result = result+ str.charAt(i);
        }
        return result;


    }
    public static void main(String[] args) {
         String str = "Level";
         String res = palindrome(str);

         if (res.equalsIgnoreCase(str)) {
            System.out.println("palindrome");
            
         }else{
            System.out.println("not a palindrome");
         }
    }
}