package com.tbs.ecm.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;


public class EncDecRest {   
	
	static Cipher ecipher = null;
    static Cipher dcipher = null;
    static SecretKey key               = null;
    static KeyGenerator desKeyGen =null;     
    
    public static final String CARRIAGE_RETURN = "\r";
    public static final String CARRIAGE_RETURN_REPLACEMENT = "__CARRIAGERETURN__";
    public static final String PLUS = "\\+";
    public static final String PLUS_REPLACEMENT = "__PLUS__";
    public static final String SLASH = "/";
    public static final String SLASH_REPLACEMENT = "__SLASH__";
    public static final String NEWLINE = "\n";
    public static final String NEWLINE_REPLACEMENT = "__NEWLINE__";
    
    protected static String KEYGEN_STR = "23435356677";
    
    public EncDecRest() {
    	
    }
         
    private static Key getKey(){
        try{
            byte[] bytes = getbytes(KEYGEN_STR);
            DESKeySpec pass = new DESKeySpec(bytes); 	            
            SecretKeyFactory sKeyFactory = SecretKeyFactory.getInstance("DES"); 
            SecretKey sKey = sKeyFactory.generateSecret(pass); 
            return sKey;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    private static byte[] getbytes(String str){
        ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();	        
        StringTokenizer sTokenizer = new StringTokenizer(str, "-", false);
        while(sTokenizer.hasMoreTokens()){
            try{
                byteOutputStream.write(sTokenizer.nextToken().getBytes());
            }
            catch(IOException ex){
           
            }
        }	        
        byteOutputStream.toByteArray();
        return byteOutputStream.toByteArray();
    }
    
    /**
     * Please Use encryptWithSlashAndPlus() for encryption.
     * 
     */
    public static synchronized String encrypt(String sourceStr){ 
    	if(sourceStr == null || "".equals(sourceStr))
    		return null;
        try{
            // Get secret key
            Key key = getKey();	             
            ecipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            ecipher.init(Cipher.ENCRYPT_MODE, key); 
            //System.out.println(" sourceStr ::  "+sourceStr);
            byte[] enc = ecipher.doFinal((new String(sourceStr)).getBytes("UTF-8"));
             // Encode bytes to base64 to get a string
            //return new sun.misc.BASE64Encoder().encode(enc);
            String encryptedResult =   new sun.misc.BASE64Encoder().encode(enc);
            if(encryptedResult!= null ){
            	encryptedResult	=	encryptedResult.replaceAll(CARRIAGE_RETURN, CARRIAGE_RETURN_REPLACEMENT);
	    		encryptedResult	=	encryptedResult.replaceAll(PLUS, PLUS_REPLACEMENT);
		    	encryptedResult = 	encryptedResult.replaceAll(SLASH, SLASH_REPLACEMENT);
		    	encryptedResult = 	encryptedResult.replaceAll(NEWLINE, NEWLINE_REPLACEMENT);
	    	}
            return encryptedResult;
            }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    /**
     * Use this method for encryption.
     * 
     */
    public static synchronized String encryptWithSlashAndPlus(String sourceString)
    {
    	String encryptedResult = encrypt(sourceString);
    	if(encryptedResult!= null){
    		encryptedResult	=	encryptedResult.replaceAll(CARRIAGE_RETURN, CARRIAGE_RETURN_REPLACEMENT);
    		encryptedResult	=	encryptedResult.replaceAll(PLUS, PLUS_REPLACEMENT);
	    	encryptedResult = 	encryptedResult.replaceAll(SLASH, SLASH_REPLACEMENT);
	    	encryptedResult = 	encryptedResult.replaceAll(NEWLINE, NEWLINE_REPLACEMENT);
    	}
    	
    	return encryptedResult;
    }
    
    /**
     * Use This method for Decryption . 
     * @param sourceString
     * @return
     */
    public static synchronized String decryptWithSlashAndPlus(String sourceString){
    	//xJEZD5aeeRZk5le3FEbRJr9GTjkTygLzD__PLUS__QzBJitPDPcTBF5Uf3NHNEYNXyHv__SLASH__5WsJdjztlykFTk__NEWLINE__PvRAzX90xSbcPXxy3cWatZJMGW7opQceprbkYaZJS9tctRBfd91fXM__SLASH__zRKiED__SLASH__ptwToX1dTh4HSd__NEWLINE__iKJP__PLUS__fOz
    	//System.out.println(sourceString);
    	String decodedSourceString = sourceString.replaceAll(NEWLINE_REPLACEMENT, NEWLINE);
    	//System.out.println(decodedSourceString);
    	decodedSourceString = decodedSourceString.replaceAll(SLASH_REPLACEMENT, SLASH);
    	//System.out.println(decodedSourceString);
    	decodedSourceString = decodedSourceString.replaceAll(PLUS_REPLACEMENT, PLUS);
    	//System.out.println(decodedSourceString);
    	decodedSourceString = decodedSourceString.replaceAll(CARRIAGE_RETURN_REPLACEMENT, CARRIAGE_RETURN);
    	//System.out.println(decodedSourceString);
    	return decrypt(decodedSourceString);
    }
    
    
    
    public String encryptNonStatic(String sourceStr){ 
    	if(sourceStr == null || "".equals(sourceStr))
    		return null;
        try{
            // Get secret key
            Key key = getKey();	             
            Cipher ecipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            ecipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] enc = ecipher.doFinal((new String(sourceStr)).getBytes("UTF-8"));
             // Encode bytes to base64 to get a string
            String encryptedResult =   new sun.misc.BASE64Encoder().encode(enc);
            if(encryptedResult!= null ){
            	encryptedResult = 	encryptedResult.replaceAll(NEWLINE, NEWLINE_REPLACEMENT);
	    		encryptedResult	=	encryptedResult.replaceAll(PLUS, PLUS_REPLACEMENT);
		    	encryptedResult = 	encryptedResult.replaceAll(SLASH, SLASH_REPLACEMENT);
		    	encryptedResult = 	encryptedResult.replaceAll(CARRIAGE_RETURN, CARRIAGE_RETURN_REPLACEMENT);
	    	}
            return encryptedResult;   
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    /**
     *  Please Use decryptWithSlashAndPlus() instead of this method.
     *  This will take plus(+) as a special character.
     * @param sourceStr
     * @return
     */
    public static synchronized String decrypt(String sourceStr){
    	if(sourceStr == null || "".equals(sourceStr))
    		return null;
        try{
        	sourceStr = sourceStr.replaceAll(NEWLINE_REPLACEMENT, NEWLINE);
        	sourceStr = sourceStr.replaceAll(SLASH_REPLACEMENT, SLASH);
        	sourceStr = sourceStr.replaceAll(PLUS_REPLACEMENT, PLUS);
        	sourceStr = sourceStr.replaceAll(CARRIAGE_RETURN_REPLACEMENT, CARRIAGE_RETURN);
        	
        	// Get secret key
            Key key = getKey();
            
            dcipher = Cipher.getInstance("DES/ECB/PKCS5Padding");                      
            dcipher.init(Cipher.DECRYPT_MODE, key);  
            
            // Decode base64 to get bytes
            byte[] dec = new sun.misc.BASE64Decoder().decodeBuffer(sourceStr);
            //Decrypt data in a single step
            byte[] utf8 = dcipher.doFinal(dec);
            // Decode using utf-8
            return new String(utf8, "UTF-8");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    } 
    public String decryptNonStatic(String sourceStr){
    	if(sourceStr == null || "".equals(sourceStr))
    		return null;
        try{
        	sourceStr = sourceStr.replaceAll(NEWLINE_REPLACEMENT, NEWLINE);
        	sourceStr = sourceStr.replaceAll(SLASH_REPLACEMENT, SLASH);
        	sourceStr = sourceStr.replaceAll(PLUS_REPLACEMENT, PLUS);
        	sourceStr = sourceStr.replaceAll(CARRIAGE_RETURN_REPLACEMENT, CARRIAGE_RETURN);
        	
            // Get secret key
            Key key = getKey();
            
            Cipher dcipher = Cipher.getInstance("DES/ECB/PKCS5Padding");                      
            dcipher.init(Cipher.DECRYPT_MODE, key);  
            // Decode base64 to get bytes
            byte[] dec = new sun.misc.BASE64Decoder().decodeBuffer(sourceStr);
            //Decrypt data in a single step
            byte[] utf8 = dcipher.doFinal(dec);
            // Decode using utf-8
            return new String(utf8, "UTF-8");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    } 
    
    
    public static String  encURLEncode(String tobeEncode ){
    	try {
			return URLEncoder.encode(EncDecRest.encrypt(tobeEncode),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }
    
    public static String encURLDecode(String decoded){
    	
    	try {
    		return EncDecRest.decrypt(URLDecoder.decode(decoded,"UTF-8"));
			//return URLEncoder.encode(EncDec.decrypt(decoded),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }
	
	public static Map<String,String> getQueryKeyValMap(String queryStr) {
		//logger.info("getQueryKeyValMap called for querystring====="+queryStr);
		Map<String,String> reqParamMap=new HashMap<String, String>();
		try {
			if(queryStr!=null ){
				queryStr = URLDecoder.decode(queryStr, "UTF-8");
				//logger.info(" queryStr urldecoded====="+queryStr);

				if(queryStr!=null && queryStr.indexOf("_q=")==0){
					String decryptText=queryStr.substring(queryStr.indexOf("_q=")+3, queryStr.length());
					//logger.info(" before decryptText===="+decryptText);
					decryptText=decryptWithSlashAndPlus(decryptText);
					//logger.info(" after decryptText===="+decryptText);
					if(decryptText!=null){				
					    String tempData[]=decryptText.split("&");
						for(int i=0;i<tempData.length;i++){
							String tempStr=tempData[i];				
							String finalData[]=tempStr.split("=");
							if(finalData!=null && finalData.length>1){
								reqParamMap.put(finalData[0], finalData[1]);
							}
						}					
						//logger.info("getQueryKeyValMap return reqParamMap====="+reqParamMap);

						return reqParamMap;
					}
				}
			}
		} catch (Exception e) {
			//logger.error("error in getQueryKeyValMap.........", e);
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args){
		String email="xyz11816@mailinator.com";
		email=EncDecRest.encrypt(email);
		System.out.println("email=>"+email);
	}
}
