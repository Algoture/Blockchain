import java.util.Date;
public class Block {
    public String hash;
    public String previousHash;
    private String data;
    private long timestamp;

    public Block(String data,String previousHash) {
        this.previousHash = previousHash;
        this.data = data;
        this.timestamp = new Date().getTime();
        this.hash=calculateHash();
    }
    public String calculateHash(){
        String calcualtedHash = StringUtil.applySha256(previousHash+Long.toString(timestamp)+data);
        return calcualtedHash;
    }
}
