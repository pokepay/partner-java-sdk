package jp.pokepay.partnerapi;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;

public class Crypto {
    private String secret;

    public Crypto(String secret) {
        this.secret = secret;
    }

    public String encode(String plainText) throws ProcessingError {
        try {
            SecureRandom random = new SecureRandom();
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

            byte[] key = Base64.getUrlDecoder().decode(this.secret);
            SecretKeySpec keySpec = new SecretKeySpec(key, "AES");

            byte[] ivBytes = new byte[16];
            random.nextBytes(ivBytes);
            cipher.init(Cipher.ENCRYPT_MODE, keySpec, new IvParameterSpec(ivBytes));

            byte[] byteText = plainText.getBytes(StandardCharsets.UTF_8);
            byte[] filledText = new byte[16 + byteText.length];
            Arrays.fill(filledText, 0, 16, (byte) 0);
            System.arraycopy(byteText, 0, filledText, 16, byteText.length);

            byte[] cipherBytes = cipher.doFinal(filledText);
            return Base64.getUrlEncoder().encodeToString(cipherBytes);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException |
                InvalidAlgorithmParameterException | IllegalBlockSizeException |
                BadPaddingException ex) {
            throw new ProcessingError(ex.getMessage());
        }
    }

    public String decode(String cipherText) throws ProcessingError {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

            byte[] key = Base64.getUrlDecoder().decode(this.secret);
            SecretKeySpec keySpec = new SecretKeySpec(key, "AES");

            byte[] ivBytes = new byte[16];

            cipher.init(Cipher.DECRYPT_MODE, keySpec, new IvParameterSpec(ivBytes));
            byte[] bytes = cipher.doFinal(Base64.getUrlDecoder().decode(cipherText));
            return new String(Arrays.copyOfRange(bytes, 16, bytes.length));
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException |
                InvalidAlgorithmParameterException | IllegalBlockSizeException | BadPaddingException ex) {
            throw new ProcessingError(ex.getMessage());
        }
    }
}
