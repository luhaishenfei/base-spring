package _10MethodYinYong;

public class _6Student {
    private int age;
    private String name;

    public _6Student(){
        super();
    }
    public _6Student( String name,int age) {
        this.age = age;
        this.name = name;
    }

    public _6Student(int age) {
        this.age = age;
    }

    public _6Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
