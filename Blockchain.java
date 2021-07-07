import java.util.Arrays;


	public class Blockchain {

	    private int perviousHash;
	    private String[] transaction;

	    private int blockHash;

	    public Block(int previousHash, String[] transacrion){
	        this.perviousHash = previousHash;
	        this.transaction = transacrion;

	        Object[] content = {Arrays.hashCode(transacrion), perviousHash};
	        this.blockHash = Arrays.hashCode(content);
	    }

	    public int getPreviousHash(){

	        return perviousHash;
	    }

	    public String[] getTransaction() {
	        return transaction;
	    }

	    public int getBlockHash()
	    {
	        return blockHash;
	    }
	}

