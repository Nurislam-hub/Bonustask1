public class CaesarCipherTest {
    public static void main(String[] args) {
        
        Cipher cipher = new CaesarCipher(4);

        String text = "Hi brothers!";
        String encrypted = cipher.encrypt(text);
        String decrypted = cipher.decrypt(encrypted);

        System.out.println("Original: " + text);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
