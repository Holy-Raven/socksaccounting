package com.holyraven.socksaccounting.model.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ArrivalDto {

    Long id;

    String color;

    Integer cottonPart;

    Integer quantity;
}
