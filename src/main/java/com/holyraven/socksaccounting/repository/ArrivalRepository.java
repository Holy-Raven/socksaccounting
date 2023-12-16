package com.holyraven.socksaccounting.repository;

import com.holyraven.socksaccounting.model.Arrival;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ArrivalRepository extends JpaRepository<Arrival, Long> {

    @Query(value = "SELECT SUM(a.quantity) FROM Arrival AS a WHERE :color LIKE a.color AND :cottonPart = a.cottonPart")
    Optional<Integer> getCountSocksByColorAndEqualCottonParam(@Param("color") String color, @Param("cottonPart") Integer cottonPart);

    @Query(value = "SELECT SUM(a.quantity) FROM Arrival AS a WHERE :color LIKE a.color AND :cottonPart > a.cottonPart")
    Optional<Integer> getCountSocksByColorAndLessThanCottonParam(@Param("color") String color, @Param("cottonPart") Integer cottonPart);

    @Query(value = "SELECT SUM(a.quantity) FROM Arrival AS a WHERE :color LIKE a.color AND :cottonPart < a.cottonPart")
    Optional<Integer> getCountSocksByColorAndMoreThanCottonParam(@Param("color") String color, @Param("cottonPart") Integer cottonPart);

}
