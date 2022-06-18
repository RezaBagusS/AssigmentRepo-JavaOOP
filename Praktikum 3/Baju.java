package pbo.praktikum;

public class Baju {
    private String type;
    private int pcs;
    private int pay;
    private int dscA,dscB,dscC;

    final static int a = 100_000;
    final static int b = 125_000;
    final static int c = 175_000;

    Baju(String type, int pcs) {
        this.type = type;
        this.pcs = pcs;
        this.pay = 1;
        this.dscA = a - 5_000;
        this.dscB = b - 5_000;
        this.dscC = c - 15_000;
    }

    private int priceA() {
        if(this.pcs >= 0 && this.pcs <= 100){
            this.pay = this.pcs * a;
        }else if(this.pcs > 100){
            this.pay = this.pcs * (a - 5_000);
        }
        return this.pay;
    }

    private int priceB() {
        if((this.pcs >= 0 && this.pcs <= 100)){
            this.pay = this.pcs * b;
        }else if(this.pcs > 100){
            this.pay = this.pcs * (b - 5_000);
        }
        return this.pay;
    }

    private int priceC() {
        if((this.pcs >= 0 && this.pcs <= 100)){
            this.pay = this.pcs * c;
        }else if(this.pcs > 100){
            this.pay = this.pcs * (c - 15_000);
        }
        return this.pay;
    }

    private void totalPrice() {
        if(this.type.equalsIgnoreCase("a")){
            System.out.println("Totalharga\t\t: "+this.priceA());
        }else if(this.type.equalsIgnoreCase("b")){
            System.out.println("Totalharga\t\t: "+this.priceB());
        }else if(this.type.equalsIgnoreCase("c")){
            System.out.println("Totalharga\t\t: "+this.priceC());
        }else {
            this.pay = 0;
        }
    }

    private void pricePerType() {
        if(this.type.equalsIgnoreCase("a")){
            if(this.pcs > 100){
                System.out.println("Harga per Buah\t\t: "+this.dscA);
            }else {
                System.out.println("Harga per Buah\t\t: "+a);
            }
        }else if(this.type.equalsIgnoreCase("b")){
            if(this.pcs > 100){
                System.out.println("Harga per Buah\t\t: "+this.dscB);
            }else {
                System.out.println("Harga per Buah\t\t: "+b);
            }
        }else if(this.type.equalsIgnoreCase("c")){
            if(this.pcs > 100){
                System.out.println("Harga per Buah\t\t: "+this.dscC);
            }else {
                System.out.println("Harga per Buah\t\t: "+c);
            }
        }
    }

    public void display(){
        if(this.pay == 0 && this.pcs < 0){
            System.out.println("\nINVALID INPUT !!\n*Please Input more than 0 pcs!! & Available Types!!*");
        }else if(this.pcs < 0){
            System.out.println("\nINVALID INPUT !!\n*Please Input more than 0 pcs!!*");
        }else if(this.pay == 0){
            System.out.println("\nINVALID INPUT !!\n*Please Input Available Types!!*");
        }else {
            System.out.println("Jenis yang anda beli\t: "+this.type);
            this.pricePerType();
            this.totalPrice();
        }


    }
}