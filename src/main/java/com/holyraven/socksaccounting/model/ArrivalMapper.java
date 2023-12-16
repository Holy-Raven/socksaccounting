package com.holyraven.socksaccounting.model;

import com.holyraven.socksaccounting.model.Arrival;
import com.holyraven.socksaccounting.model.dto.ArrivalDto;
import com.holyraven.socksaccounting.model.dto.ArrivalNewDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ArrivalMapper {

    public Arrival returnArrival(ArrivalNewDto arrivalNewDto) {
        Arrival arrival = Arrival.builder()
                .color(arrivalNewDto.getColor())
                .cottonPart(arrivalNewDto.getCottonPart())
                .quantity(arrivalNewDto.getQuantity())
                .build();
        return arrival;
    }

    public ArrivalDto returnArrivalDto(Arrival arrival) {
        ArrivalDto arrivalDto = ArrivalDto.builder()
                .id(arrival.getId())
                .color(arrival.getColor())
                .cottonPart(arrival.getCottonPart())
                .quantity(arrival.getQuantity())
                .build();
        return arrivalDto;
    }
}
