package ordersystem;

/**
 *
 * @author Shuk Ha Kwan
 * 3/8/2022 updated decryption and encryption function
 */
public class DataCryption {
      String data;
    
    /**
     * Default constructor. 
     * set data to be empty string.
     */
    DataCryption(){
        data = "";
    }
    
    /**
     * Constructor with an argument
     * @param data
     * 
     */
    DataCryption(String data){
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
    
    /**
     * encrypted password
     * @return PW
     * When changing a password or creating an account
     * Can use this function encrypt password and store into database
     * for safety 
     */
    public String enCryption(){
        char[] pwChar = this.data.toCharArray();
        String pw = "";
        for(char c:pwChar){
            c+=5;
            pw+=c;
        }
        return pw;      
    }
    
    /**
     * DeCrpyted password
     * @return PW 
     * use return value with database PW to verify login
     */
    public String deCryption(){      
        char[] pwChar = this.data.toCharArray();
        String pw = "";
        for(char c:pwChar){
            c-=5;
            pw+=c;
        }
        return pw;
    
    }

}
