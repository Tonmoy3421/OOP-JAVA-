package Entity;

public class Cow {

    private String id;
    private int age;
    private String color;
    private double weight;
    private double price;

    // Constructor
    public Cow(String id, String age, String color, double weight, double price) {
        this.id = id;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    // ===== Setters =====
    public void setId(String id) {
        this.id = id;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // ===== Getters =====
    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    // Display methods
    public void showInfo() {
        System.out.println(getInfo());
    }

    public String getInfo() {
        return "Code: " + id +
               ", Age: " + age +
               ", Color: " + color +
               ", Weight: " + weight +
               ", Price: " + price;
    }
}
