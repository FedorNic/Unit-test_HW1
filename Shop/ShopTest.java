package Code.Home_work.Shop;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    public static void main(String[] args) {
        List<Product> fruits = new ArrayList<>();
        fruits.add(new Product(100, "Apple"));
        fruits.add(new Product(150, "Orange"));
        fruits.add(new Product(80, "Cherry"));
        Shop shop = new Shop(fruits);
//        System.out.println(shop);
//        System.out.println(shop.sortProductsByPrice());
//        System.out.println(shop.getMostExpensiveProduct());

        // Проверяем на самый дорогой продукт
        assertThat(shop.getMostExpensiveProduct()).isEqualTo(fruits.get(1));
        // Проверяем сортировку
        assertThat(shop.sortProductsByPrice()).containsSequence(fruits.get(2), fruits.get(0), fruits.get(1));
    }
}