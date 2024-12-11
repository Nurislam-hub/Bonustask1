class CaesarCipher extends Cipher {

    public CaesarCipher(int shift) {
        super(shift);
    }

    @Override
    public String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char shiftedChar = shiftCharacter(character, shift);
                encryptedText.append(shiftedChar);
            } else {
                encryptedText.append(character);
            }
        }
        return encryptedText.toString();
    }

    @Override
    public String decrypt(String text) {
        StringBuilder decryptedText = new StringBuilder();
        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char shiftedChar = shiftCharacter(character, -shift);
                decryptedText.append(shiftedChar);
            } else {
                decryptedText.append(character);
            }
        }
        return decryptedText.toString();
    }
    private char shiftCharacter(char character, int shiftAmount) {
        if (Character.isUpperCase(character)) {
            return (char) ((character - 'A' + shiftAmount + 26) % 26 + 'A');
        } else {
            return (char) ((character - 'a' + shiftAmount + 26) % 26 + 'a');
        }
    }
}
