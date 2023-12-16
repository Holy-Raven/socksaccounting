package com.holyraven.socksaccounting.model.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ArrivalNewDto {

    @NotBlank(message = "color can't be blank")
    @Size(max = 50)
    String color;

    @NotNull(message = "cottonPart can't be null")
    @Max(value = 100, message = "cottonPart should not be more than 100")
    @Min(value = 0, message = "cottonPart must be positive")
    Integer cottonPart;

    @NotNull(message = "quantity can't be null")
    @Min(value = 1, message = "quantity be greater than 1")
    Integer quantity;
}
