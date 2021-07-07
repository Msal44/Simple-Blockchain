import java.util.ArrayList;

public class Block {
	 //private static int previousHash;
    ArrayList <Block> blockchain = new ArrayList<>();

    public static void main(String[] args)
    {
        String[] genesisTransaction = {"Jimbo sent Melvyn 20 bitcon", "Isabelle sent 24 bitcoins to Jimbo"};
        Block genesisBlock = new Block( 0, genesisTransaction);
        
        String[] block2Transaction = {"Melvyn sent Jimbo 10 satoshi", "Jimbo send 5 bitcon to BurgerKing"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transaction);

        String[] block3Transaction = {"Erick sent Scot 0.00000123 satoshi", "Scott sent Erick 5 bticon"};
        Block block3 = new Block(block2.getBlockHash(), block3Transaction);

        System.out.println("Hash of genesis block: " + genesisBlock.getBlockHash());
        System.out.println("Hash of Block2: " + block2.getBlockHash());
        System.out.println("Hash of Block3: " + block3.getBlockHash());


    }
}
