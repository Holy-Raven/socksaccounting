package com.holyraven.socksaccounting.service;

import com.holyraven.socksaccounting.model.Arrival;
import com.holyraven.socksaccounting.model.dto.ArrivalDto;
import com.holyraven.socksaccounting.model.ArrivalMapper;
import com.holyraven.socksaccounting.model.dto.ArrivalNewDto;
import com.holyraven.socksaccounting.repository.ArrivalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArrivalServiceImpl implements ArrivalService {

    private final ArrivalRepository arrivalRepository;

    @Override
    public ArrivalDto addNewArrival(ArrivalNewDto arrivalMewDto) {

        Arrival arrival = ArrivalMapper.returnArrival(arrivalMewDto);
        arrival = arrivalRepository.save(arrival);

        return ArrivalMapper.returnArrivalDto(arrival);
    }
}
