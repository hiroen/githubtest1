public class Test {
    private int age;
    private String name;
    Test (int age,String name){
        this.age = age;
        this.name = name;
    }

    void getName(){
        System.out.println("登録名:" + name);
        System.out.println("登録年齢:" + age + "歳");
    }
}
