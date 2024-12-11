abstract class Cipher {
    protected int shift;

    public Cipher(int shift) {
        this.shift = shift;
    }
    public abstract String encrypt(String text);
    public abstract String decrypt(String text);

    public int getShift() {
        return shift;
    }
}
