public class Backtracking {

    public static void printPermutations(String str, String perm){
            if(str.isEmpty()){
                System.out.println(perm);
                return;
            }

        for(int i = 0; i < str.length(); i++){
            char curentChar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            printPermutations(newStr, perm+curentChar);
        }
    }

    public static void main(String[] args){
        String test = "123";
        printPermutations(test, "");
    }
}
