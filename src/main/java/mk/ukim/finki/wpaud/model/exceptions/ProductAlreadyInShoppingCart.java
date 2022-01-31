package mk.ukim.finki.wpaud.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductAlreadyInShoppingCart extends RuntimeException {
    public ProductAlreadyInShoppingCart(Long id, String username) {
        super(String.format("Product with id %d already exists in shopping cart for user with username %s", id, username));
    }
}
