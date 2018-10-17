package task3_1.model.entity;

public abstract class Toy {
    private String name;
    private double price;
    private int age;

    public Toy(String name, double price, int age) {
        this.name = name;
        this.price = price;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() + "{" +
                "name = '" + name + '\'' +
                ", price = " + price +
                ", age = " + age +
                "+";
    }
}
