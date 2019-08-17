public enum Direction {
    N(0,1), E(1,0), S(0,-1), W(-1,0);
    public int plusX;
    public int plusY;
    Direction(int plusX,int plusY){
        this.plusX = plusX;
        this.plusY = plusY;
    }
}