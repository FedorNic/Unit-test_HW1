package Code.Home_work.Shop;

public class Product {
    private Integer cost;
    private String title;

    public Product(Integer cost, String title) {
        this.cost = cost;
        this.title = title;
    }

    @Override
    public String toString() {
        return  "(cost=" + cost + ", title='" + title + ")" + '\'';
    }

    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}