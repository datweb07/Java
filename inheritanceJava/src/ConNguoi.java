public class ConNguoi {
    private String hoVaTen;
    private int namSinh;

    public ConNguoi(String hoVaTen, int namSinh){
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
    }

    public String GetHoVaTen(){
        return this.hoVaTen;
    }

    public String SetHoVaTen(String hoVaTen){
        return this.hoVaTen = hoVaTen;
    }

    public int GetNamSinh(){
        return this.namSinh;
    }

    public int SetNamSinh(int namSinh){
        return this.namSinh = namSinh;
    }

    public void An(){
        System.out.println("Eat");
    }

    public void Uong(){
        System.out.println("Drink");
    }

    public void Ngu(){
        System.out.println("Sleep");
    }
}
