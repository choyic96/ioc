package kr.co.ezenac.Ioc;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Encoder implements IEncoder {

    public String encode(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
