public class Inherit {
    public static void main(String[] args){
        Fish a = new Nemo("big",3,"blue","M");
        Nemo b = new Nemo("small",2,"blue","M");
        System.out.print(a.head +' ' + b.age);
    }
}

class Fish{
    protected String head;
    protected int age;
    public Fish(String head, int age){
        this.head = head;
        this.age = age;
    }
    public String getHead(){
        return head;
    }
    public void setHead(String head){
        this.head=head;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
        }

class Nemo extends Fish{
    protected String color;
    protected String sex;
    public Nemo(String head, int age,String color, String sex){
        super(head, age);
        this.color= color;
        this.sex= sex;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public String getSex(){
        return sex;
    }
    public void setAge(int age){
        this.age=age+2;
    }
    public int getAge(){
        return age;
    }
}