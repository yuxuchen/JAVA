//请定义一个City类，该class具有如下字段:
//
//        name: 名称，String类型
//        latitude: 纬度，double类型
//        longitude: 经度，double类型
//        实例化几个City并赋值，然后打印。
public class City {
    String name;
    double latitude;
    double longitude;
    public City(String name, double latitude, double longitude){
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public void p(){
        System.out.printf("Hi, this is %s, the latitude is %f and the longitude is %f",
                this.name,this.latitude, this.longitude);
    }
}
//不声明是static的方法都是动态方法，动态方法可以使用this.