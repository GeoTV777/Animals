public class Animals {
   private String name;
   private int age;
   private int weight;
   private String color;

    public Animals(String name, int age, int weight, String color) {
        System.out.println("Новое животное");
        setValues(name, age, weight, color);
        System.out.println(getValues());
    }

    public void setValues(String name, int age, int weight, String color){
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.color = color;
    }
    public String getValues(){
        return "Привет! Меня зовут " + name + " мне " + age + " лет, я вешу " + weight + " кг, моя шкурка " + color + ".";

    }
}
