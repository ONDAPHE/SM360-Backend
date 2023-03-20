package com.assignment.sm360assignment.services;

import static org.assertj.core.api.Assertions.assertThat;

import com.assignment.sm360assignment.dtos.DealerDto;
import com.assignment.sm360assignment.entity.Dealer;
import com.assignment.sm360assignment.exception.DealerNotFoundException;
import com.assignment.sm360assignment.mappers.DealerMapper;
import com.assignment.sm360assignment.repository.DealerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@ExtendWith(MockitoExtension.class)
public class DealerServiceTest {

    @Mock
    private DealerRepository dealerRepository;

    @InjectMocks
    private DealerServiceImpl dealerService;

    private Dealer dealer;

    @BeforeEach
    public void setup(){

        dealer = Dealer.builder()
                .idDealer(1)
                .name("ROSE HILL")
                .limit_p(11)
                .build();
    }

    @DisplayName("JUnit test for saveDealer method")
    @Test
    public void givenDealerDto_whenSaveDealer_thenReturnDealerDto(){
        given(dealerRepository.save(dealer))
                .willReturn(dealer);

        System.out.println(dealerRepository);
        System.out.println(dealerService);

        // when -  action or the behaviour that we are going test
        DealerDto savedEmployee = dealerService.createDealer(DealerMapper.INSTANCE.dealerToDealerDto(dealer));

        System.out.println(savedEmployee);
        // then - verify the output
        assertThat(savedEmployee).isNotNull();
    }

    @Test
    public void getDealerDtoById_InvalidId_ThrowsException() {
        String dealerDtoId = "1L";
        when(dealerRepository.findById(1)).thenReturn(Optional.empty());

        assertThrows(DealerNotFoundException.class, () -> dealerService.getDealerById(1));
        verify(dealerRepository, times(1)).findById(1);
    }

    @Test
    public void getAllDealerDtos_ReturnsListOfDealerDtos() {
        List<DealerDto> dealerDtos = new ArrayList<>();
        dealerDtos.add(DealerDto.builder().name("Dealer 1").limit_p(5).build());
        dealerDtos.add(DealerDto.builder().name("Dealer 2").limit_p(10).build());

        when(dealerRepository.findAll()).thenReturn(dealerDtos.stream().map(DealerMapper.INSTANCE::dealerDtoToDealer).collect(Collectors.toList()));

        List<DealerDto> foundDealerDtos = dealerService.getAllDealers();

        assertEquals(dealerDtos, foundDealerDtos);
        verify(dealerRepository, times(1)).findAll();
    }
}
