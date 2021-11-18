class ViTri {
    private Character x;
    private Character y;

    public ViTri(Character x, Character y) {
        this.x = x;
        this.y = y;

    }

    public void next1()
    {
        if(this.x + 1<= 'H'&& this.y+2<=8)
        {
            this.x = this.x+1;
            this.y = this.y+2;
        }
    }
}
