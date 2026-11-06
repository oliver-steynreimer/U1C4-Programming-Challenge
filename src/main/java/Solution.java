public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        String last;
        if(x.length() < 2){
            return false;
        } else {
            last = x.substring(x.length() - 2);
            if (last.equals("ly")){
                return true;
            } else {
            return false;
            }
        }
    }

    public String conCat(String s1, String s2) {
        String first = s1;
        String second = s2;
        String result;
        if (first.length() == 0 || second.length() == 0){
            result = first + second;
        } else if (first.substring(first.length() - 1).equals(second.substring(0,1))){
            second = second.substring(1);
        }
        result = first + second;
        return result;
    }

    public String withoutX(String s1) {
        String word = s1;
        if(word.substring(0,1).equals("x") || word.substring(word.length() - 1).equals("x")){
            if(word.substring(0,1).equals("x")){
                word = word.substring(1);
            }
            if(word.substring(word.length() - 1).equals("x")){
                word = word.substring(0, word.length() -1);
            }
        }
        return word;
    }

    public String fizzString(String s1) {
        String output = s1;
        if(s1.substring(0,1).equals("f") && s1.substring(s1.length() - 1).equals("b")){
            output = "FizzBuzz";
        } else if (s1.substring(0,1).equals("f")){
            output = "Fizz";
        } else if (s1.substring(s1.length() - 1).equals("b")){
            output = "Buzz";
        }
        return output;
    }

    public String fizzString2(int x) {
        String output = x + "";
        if(x % 3 == 0 && x % 5 == 0){
            output = "FizzBuzz";
        } else if (x % 3 == 0){
            output = "Fizz";
        } else if (x % 5 == 0){
            output = "Buzz";
        }
        output += "!";
        return output;
    }

}
