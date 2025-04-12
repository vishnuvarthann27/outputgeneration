package com.project.outputgeneration.repository;

import com.project.outputgeneration.entity.Llr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface LLRRepository extends JpaRepository<Llr, Integer> {
    Optional<Llr> findByInvstrLoanNbr(Integer invstrLoanNbr);

    @Query("SELECT t FROM Llr t WHERE t.createdTimestamp >= :startTime")
    List<Llr> findLastHourTransactions(LocalDateTime startTime);
}
