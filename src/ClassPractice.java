public class ClassPractice {
    public static void main(String[] args){
        Person ming = new Person();
        ming.setName("MingMing");
        ming.setAge(28
        );
        ming.setHeight(188);
        ming.setSex("male");
        System.out.print(ming.getName() + "," + ming.getSex() + "," + ming.getHeight() +"," + ming.getAge());
    }
}

class Person{
    private String name;
    private int age;
    private String sex;
    private int height;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public String getSex(){
        return this.sex;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public int getHeight(){
        return this.height;
    }
    public void setHeight(int height){
        this.height = height;
    }

    public void setAge(int age){
        if (age<0 || age>100){
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
}



