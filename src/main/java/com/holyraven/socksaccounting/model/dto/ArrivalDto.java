package com.holyraven.socksaccounting.model.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ArrivalDto {

    @NotBlank(message = "color can't be blank")
    @Size(max = 50)
    String color;

    @NotBlank(message = "cottonPart can't be blank")
    @Max(value = 100, message = "cottonPart should not be more than 100")
    @Min(value = 0, message = "cottonPart must be positive")
    Integer cottonPart;

    @NotBlank(message = "quantity can't be blank")
    @Min(value = 1, message = "quantity be greater than 1")
    Integer quantity;
}
