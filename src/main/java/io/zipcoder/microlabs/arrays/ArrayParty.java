package io.zipcoder.microlabs.arrays;


public class ArrayParty {

    //public static void main(String[] args){
    String [] palindromic = {
            "Sausage", "Eggs", "Beans", "Beans", "Eggs", "Sausage"
    };

    String[] breakfast = {
            "Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushroom"
    };

    public String printArray (String[]inputArray){
        String print = "*** Output ***";

        for (String string : inputArray) {
            print += "\n" + string;
        }
        return print;
        }

    public String lastElement(String[] inputArray) {
        String print = "*** Output ***";
        return inputArray[inputArray.length - 1];
    }

    //TODO Define the method lastButOne
    public String lastButOne(String[] inputArray){
            return inputArray[inputArray.length - 2];
    }

    //TODO Define the method reverse
    public String reverse(String[] inputArray){
        String print = "*** Output ***";

        for (int i = inputArray.length - 1; i >= 0; i--){
            print += ":\n" + inputArray;
        }
        return print;
    }

    //TODO Define the method isPalindrome
    public boolean isPalindrome(String[] inputArray){
        ArrayParty arrayParty = new ArrayParty();
        String palindromic = arrayParty.printArray(inputArray);
        String breakfast = arrayParty.printArray(inputArray);
        if (palindromic.equals(breakfast)){
            return true;
        }
        else {
            return false;
        }
    }

    //TODO Define the method compress
    public int compress(int[] inputArray){
        int ans = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            int ch1 = inputArray[i];
            int ch2 = inputArray[i + 1];
            if(ch1 != ch2){
                ans += ch1;
            }
        }
        return ans;
    }

    //TODO Define the method pack
    public String pack(char[] inputArray){
        String output = "";
        for (int i = 0; i <= inputArray.length - 2; i++){
            output += inputArray[i];
            if (inputArray[i] != inputArray[i +1]){
                output += ", ";
            }
        }
        output += inputArray[inputArray.length - 1];
        return output;
    }

}
