package com.assignment.sm360assignment.services;

import com.assignment.sm360assignment.dtos.DealerDto;
import com.assignment.sm360assignment.entity.Dealer;
import com.assignment.sm360assignment.exception.DealerNotFoundException;
import com.assignment.sm360assignment.mappers.DealerMapper;
import com.assignment.sm360assignment.repository.DealerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class DealerServiceImpl implements DealerService{
    private DealerRepository dealerRepository;

    public DealerServiceImpl(DealerRepository dealerRepository) {
        this.dealerRepository = dealerRepository;
    }

    @Override
    public DealerDto createDealer(DealerDto dealerDto) {
        log.info("Saving new Dealer");
        Dealer saveDealer = dealerRepository.save(DealerMapper.INSTANCE.dealerDtoToDealer(dealerDto));
        return DealerMapper.INSTANCE.dealerToDealerDto(saveDealer);
    }

    @Override
    public DealerDto getDealerById(Integer id) throws DealerNotFoundException {
        return DealerMapper.INSTANCE.dealerToDealerDto(dealerRepository.findById(id)
                .orElseThrow(() -> new DealerNotFoundException(id)));
    }

    @Override
    public List<DealerDto> getAllDealers() {
        return dealerRepository.findAll().stream().map(DealerMapper.INSTANCE::dealerToDealerDto).collect(Collectors.toList());
    }

    @Override
    public DealerDto updateDealer(DealerDto dealerDto) throws DealerNotFoundException {
        return DealerMapper.INSTANCE.dealerToDealerDto(dealerRepository.save(DealerMapper.INSTANCE.dealerDtoToDealer(dealerDto)));
    }

    @Override
    public void deleteDealer(Integer id) throws DealerNotFoundException {
        dealerRepository.deleteById(id);
    }
}
