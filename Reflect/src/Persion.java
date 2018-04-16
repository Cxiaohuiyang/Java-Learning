public class Persion {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;

    public void Speak(){
        System.out.println("Hello! "+"My name is "+ Name);
    }
    public void run(String speed){
        System.out.println("I can run " + speed+" KM!!!");
    }

}
