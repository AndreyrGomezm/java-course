package app.ui;

import app.model.entity.Product;
import app.model.repo.Address;
import app.model.repo.IFull;
import app.model.repo.list.ProductList;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        IFull<Product> repo = new ProductList();
        repo.create(new Product("Table", 50))
                .create(new Product("Chair", 18))
                .create(new Product("lamp", 15.5))
                .create(new Product("Notebook", 400.89));

        List<Product> products = repo.toList();
        products.forEach(System.out::println);
        System.out.println("===== pageable =====");
        List<Product> pageable = repo.toList(1, 4);
        pageable.forEach(System.out::println);

        System.out.println("===== sorteable =====");
        List<Product> ProductsAscOrder = repo.toList("description", Address.ASC);
        for(Product c: ProductsAscOrder){
            System.out.println(c);
        }

        System.out.println("===== edit =====");
        Product lampUpdate = new Product("Desk lamp", 23);
        lampUpdate.setId(3);
        repo.edit(lampUpdate);
        Product lamp = repo.byId(3);
        System.out.println(lamp);
        System.out.println(" ============= ");
        repo.toList("price", Address.ASC).forEach(System.out::println);
        System.out.println("===== delete ======");
        repo.delete(2);
        repo.toList().forEach(System.out::println);
        System.out.println("===== total ===== ");
        System.out.println("Total records: " + repo.total());
    }
}
