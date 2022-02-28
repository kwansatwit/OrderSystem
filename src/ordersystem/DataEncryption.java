package ordersystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shuk Ha Kwan
 */
public class DataEncryption {
      String data;
    
    /**
     * Default constructor. 
     * set data to be empty string.
     */
    DataEncryption(){
        data = "";
    }
    
    /**
     * Constructor with an argument
     * @param data
     * 
     */
    DataEncryption(String data){
        this.data = data;
    }
    
    /**
     * 
     * @param data 
     * Set data into object
     */
    public void setData(String data){
        this.data = data;
    }
    
    // get data 
    public final String getData(){
        return data;
    }
    
    public void encrpytion(String data){
     
        
    }
    
    /*public int encrpytionData(String data){
        String binaryString = "";       
        char[] chData = data.toCharArray();
        for(int i = 0; i<chData.length; i++){
            System.out.println("here" + Integer.toBinaryString(chData[i]));
            binaryString += Integer.toBinaryString(chData[i]);
        }
        
        System.out.println("Bin = " + binaryString);
        int value = Integer.parseInt(binaryString,2);
        System.out.println("before shift " + value);
        int shift = value >> 2;
               
        // 01101111 01100110 00110010
        return shift;
    }
    
    public String decryptionData(int data){
       
        String str = "", result ="";
        int j = 0;
        int shift = data << 2;
        shift +=2;        
        
        str = Integer.toBinaryString(shift);
      
        int size = str.length()/7;
        String [] s = new String[size];
        
        for(int i = 0; i<size; i++){
            s[i] = str.substring(j,j+=7);
        }
        
        for(String ss:s){
            Character c = (char)Integer.parseInt(ss,2);
            result +=c.toString();
        }
        
        this.data = result;
        return result;
    }
    */
    
}
