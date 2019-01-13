package bitwise;

public class BinaryStringOr {
   
    BinaryStringOr(String s, Integer i){
    
        for(byte b: s.getBytes()){
            //we perform a bitwise operation using byte and integer operand s, save result as tmp:
            int tmp = b | i;
            System.out.println(Integer.toBinaryString(b) + " OR " + Integer.toBinaryString(i)+" = "+Integer.toBinaryString(tmp)+" = "+tmp);
        }
    }
    
    public static void main(String [] args){
        new BinaryStringOr("HackerRank", 8675309);
    }
    
}
