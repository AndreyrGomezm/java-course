package app.model.repo.list;

import app.model.entity.Product;
import app.model.repo.AbstractList;
import app.model.repo.Address;
import app.model.repo.exceptions.ReadingDataAccessException;

import java.util.*;

public class ProductList extends AbstractList<Product> {
    @Override
    public ProductList edit(Product product) throws ReadingDataAccessException {
        Product p = byId(product.getId());
        p.setDescription(product.getDescription());
        p.setPrice(product.getPrice());
        return this;
    }

    @Override
    public List<Product> toList(String campo, Address dir) {
        List<Product> sortedList = new ArrayList<>(this.dataSource);
        sortedList.sort((a, b) -> {
            int result = 0;
            if(dir == Address.ASC){
                result = order(campo, a, b);
            } else if(dir == Address.DESC){
                result = order(campo, b, a);
            }
            return result;
        });
        return sortedList;
    }

    public static int order(String campo, Product a, Product b){
        int result = 0;
        switch (campo){
            case "id" ->
                    result = a.getId().compareTo(b.getId());
            case "description" ->
                    result = a.getDescription().compareTo(b.getDescription());
            case "price" ->
                    result = a.getPrice().compareTo(b.getPrice());
        }
        return result;
    }
}
