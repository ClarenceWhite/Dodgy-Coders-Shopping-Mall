/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package ie.ucd.dodgycoders.orderservice.api;

import ie.ucd.dodgycoders.orderservice.api.model.Order;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-14T17:27:04.945Z[Europe/Dublin]")
@Validated
@Tag(name = "order", description = "Online orders placed by users")
public interface OrderApi {

    default OrderApiDelegate getDelegate() {
        return new OrderApiDelegate() {};
    }

    /**
     * PUT /order
     *
     * @param order Place an order (optional)
     * @return successful operation (status code 200)
     *         or Validation exception (status code 405)
     *         or fail to place the order (status code 500)
     */
    @Operation(
        operationId = "orderPut",
        tags = { "order" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Order.class))
            }),
            @ApiResponse(responseCode = "405", description = "Validation exception"),
            @ApiResponse(responseCode = "500", description = "fail to place the order")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/order",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Order> orderPut(
        @Parameter(name = "Order", description = "Place an order") @Valid @RequestBody(required = false) Order order
    ) {
        return getDelegate().orderPut(order);
    }

}
