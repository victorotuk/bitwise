package bitwise;

//we create a class to turn a string object into its binary representation 
class BinaryString {
//on the next line we have the class constructor  
    BinaryString(String s){
//we then create a for each loop to convert the string to bytes and print the values         
        for(byte b: s.getBytes()){
            System.out.print(Integer.toBinaryString(b)+" ");
        }
        System.out.println();
    } 
//on the next line we just pass a number to the function which in turn prints it out as a string 
    BinaryString(Integer i){
        System.out.println(Integer.toBinaryString(i));
    }
    
    public static void main(String[] args){
        
        new BinaryString("HackerRank");
        new BinaryString(8675309);
        
    }
    
}


