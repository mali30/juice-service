package com.mohamedali.msscjuiceservice.repositories;

import com.mohamedali.msscjuiceservice.domain.Juice;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface JuiceRepository extends PagingAndSortingRepository<Juice , UUID> {



}
