package com.holyraven.socksaccounting.service;

import com.holyraven.socksaccounting.enums.Operation;
import com.holyraven.socksaccounting.model.Arrival;
import com.holyraven.socksaccounting.model.dto.ArrivalDto;
import com.holyraven.socksaccounting.model.ArrivalMapper;
import com.holyraven.socksaccounting.model.dto.ArrivalNewDto;
import com.holyraven.socksaccounting.repository.ArrivalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    @Override
    public Integer getCountSocksFromParam(String color, String operation, Integer cottonPart) {

        Operation thisOperation = Operation.getStateOperation(operation);
        String thisColor = color.toLowerCase();

        Optional<Integer> result = Optional.empty();

        switch (thisOperation) {
            case EQUAL:
                result = arrivalRepository.getCountSocksByColorAndEqualCottonParam(thisColor, cottonPart);
                break;
            case LESSTHAN:
                result = arrivalRepository.getCountSocksByColorAndLessThanCottonParam(thisColor, cottonPart);
                break;
            case MORETHAN:
                result =  arrivalRepository.getCountSocksByColorAndMoreThanCottonParam(thisColor, cottonPart);
                break;
        }

        return result.orElse(0);
    }
}