package com.springframework.springframeworkmsscbeerservice.repositories;


import com.springframework.springframeworkmsscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;


public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
