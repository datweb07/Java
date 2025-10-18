public abstract class Hinh {
    protected ToaDo toaDo;

    public Hinh(ToaDo toaDo){
        this.toaDo = toaDo;
    }

    public ToaDo getToaDo(){
        return this.toaDo;
    }

    public ToaDo setToaDo(ToaDo toaDo){
        return this.toaDo = toaDo;
    }

    public abstract double tinhDienTich();
}
