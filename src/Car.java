public class Car {
    int year;
    String make;
    int gas;
    HeadLight head_light;
    public Car(int year, String make, int gas, int h ){
        this.year = year;
        this.make = make;
        this.gas =gas;
        this.head_light = new HeadLight(h);
    }
    public void drive(String d){
        if(this.gas>20){
            this.gas -= 20;
            System.out.printf("drive to %s",d);
        }else{
            System.out.println("not enough gas!!");
        }
    }
    public void fillGas(){
        this.gas = 100;
    }
    public void head(){
        System.out.println(this.year);
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int newYear){
        this.year = newYear;
    }
    public static int add(int a, int b){
        return a+b;
    }
    //static 是类方法，可以被Car调用，且必须是静态方法
}

