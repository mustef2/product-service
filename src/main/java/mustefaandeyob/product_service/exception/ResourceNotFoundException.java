package mustefaandeyob.product_service.exception;

import lombok.Getter;

@Getter
public class ResourceNotFoundException extends RuntimeException {
    private final Long id;
    public ResourceNotFoundException(Long id) {
        super("Product " + id + " not found");
        this.id = id;
    }
}