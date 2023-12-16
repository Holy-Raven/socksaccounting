package com.holyraven.socksaccounting.service;

import com.holyraven.socksaccounting.model.dto.ArrivalDto;
import com.holyraven.socksaccounting.model.dto.ArrivalNewDto;

public interface ArrivalService {

    ArrivalDto addNewArrival(ArrivalNewDto arrivalDto);

    Integer getCountSocksFromParam(String color, String operation,Integer cottonPart);
}
