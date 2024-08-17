public class BlockChain {
    public static void main(String[] args) {
        Block genesisBlock = new Block("First Block","0");
        System.out.println("Hash for block 1 : " + genesisBlock.hash);
    }
}
