package blocks;

public abstract class Block {

    private final Color color;


    public Block(Color color) {
        this.color = color;
    }

    abstract void rotate();
    abstract void fall();


}
