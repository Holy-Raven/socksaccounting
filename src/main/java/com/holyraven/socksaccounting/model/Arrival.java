package com.holyraven.socksaccounting.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "arrival", schema = "public")
public class Arrival {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "color", nullable = false)
    String color;

    @Column(name = "cotton_part", nullable = false)
    Integer cottonPart;

    @Column(name = "quantity", nullable = false)
    Integer quantity;
}
