package Classes;

public class Block {
    private int width;
    private int length;
    private int height;

    public Block(){}

    public Block(int[] dims){
        if(dims.length == 3){
            this.width = dims[0];
            this.length = dims[1];
            this.height = dims[2];
        }
        else throw new java.lang.IllegalArgumentException("Array must have a length of 3.");
    }

    public int getWidth(){
        return this.width;
    }

    public int getLength() {
        return this.length;
    }

    public int getHeight() {
        return this.height;
    }

    public int getVolume() {
        return this.width * this.length * this.height;
    }

    public int getSurfaceArea() {
        return 2 * (this.width * this.length + this.width * this.height + this.length * this.height);
    }

    public static void main(String[] args) {
        Block b = new Block(new int[]{2,2,2});
        System.out.println(b.getSurfaceArea());
    }
}
