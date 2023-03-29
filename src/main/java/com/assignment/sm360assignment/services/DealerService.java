package com.assignment.sm360assignment.services;

import com.assignment.sm360assignment.dtos.DealerDto;
import com.assignment.sm360assignment.exception.DealerNotFoundException;

import java.util.List;

public interface DealerService {
    DealerDto createDealer(DealerDto dealerDto);
    DealerDto getDealerById(Integer id) throws DealerNotFoundException;
    List<DealerDto> getAllDealers();
    DealerDto updateDealer(DealerDto dealerDto) throws DealerNotFoundException;
    void deleteDealer(Integer id) throws DealerNotFoundException;
}
