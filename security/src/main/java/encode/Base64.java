package encode;

import javax.xml.bind.DatatypeConverter;

/**
 * @author mizeng
 * @version v1.0
 * @description TODO
 * @date 9/24/15
 */
public class Base64 {
    public String encode(String textToEncode){
        byte[] textByte = textToEncode.getBytes();
        String encoded = DatatypeConverter.printBase64Binary(textByte);
        return encoded;
    }

    public String decode(String textToDecode){
        byte [] decoded = DatatypeConverter.parseBase64Binary(textToDecode);
        return new String(decoded);
    }

}
