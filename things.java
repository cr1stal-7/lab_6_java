public abstract class things {
    private String name;
    private String color;
    private float price;
    private int size;

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }
}

