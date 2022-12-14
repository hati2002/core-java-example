package library;

public class Book {
    String name;
    int version;
    int price;

    public Book(String name,int version,int price) {
        this.name=name;
        this.version=version;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", version=" + version +
                ", price=" + price +
                '}';
    }
}
