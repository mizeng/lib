package security.encode;

import org.junit.Assert;
import org.junit.Test;

import static security.encode.Base64.*;

/**
 * @author mizeng
 * @version v1.0
 * @description TODO
 * @date 9/24/15
 */
public class Base64Test {
    Base64 base64 = new Base64();

    @Test
    public void EncodeTest() {
        String text = "zabbix:zabbix";
        String encode = base64.encode(text);
        String expected = "emFiYml4OnphYmJpeA==";

        Assert.assertEquals("Base64 encode output is not as expected!", expected, encode);
    }

    @Test
    public void DecodeTest() {
        String text = "emFiYml4OnphYmJpeA==";
        String decode = base64.decode(text);
        String expected = "zabbix:zabbix";

        Assert.assertEquals("Base64 decode output is not as expected!", expected, decode);
    }
}
