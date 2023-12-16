package com.holyraven.socksaccounting.controller;

import com.holyraven.socksaccounting.model.dto.ArrivalDto;
import com.holyraven.socksaccounting.model.dto.ArrivalNewDto;
import com.holyraven.socksaccounting.service.ArrivalService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;

import static com.holyraven.socksaccounting.exceptions.ErrorMessages.FROM_ERROR_MESSAGE;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/socks")
public class ArrivalController {

    private final ArrivalService arrivalService;

    @PostMapping("/income")
    @ResponseStatus(value = HttpStatus.OK)
    public ArrivalDto addNewArrival(@Valid @RequestBody ArrivalNewDto arrivalNewDto) {

        return arrivalService.addNewArrival(arrivalNewDto);
    }

    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    public Integer getCountSocksFromParam(@RequestParam(required = false, name = "color") String color,
                                          @RequestParam(required = false, name = "operation") String operation,
                                          @Positive(message = FROM_ERROR_MESSAGE)
                                          @RequestParam(required = false, name = "cottonPart") Integer cottonPart) {

        return arrivalService.getCountSocksFromParam(color, operation, cottonPart);
    }
}
