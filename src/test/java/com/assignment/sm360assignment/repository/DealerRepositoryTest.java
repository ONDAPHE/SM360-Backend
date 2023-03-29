package com.assignment.sm360assignment.repository;

import com.assignment.sm360assignment.Sm360AssignmentApplication;
import com.assignment.sm360assignment.entity.Dealer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@Transactional
@SpringBootTest(classes = Sm360AssignmentApplication.class)
public class DealerRepositoryTest {

  @Autowired private DealerRepository dealerRepository;

  @AfterEach
  void setupDatabase() {
    this.dealerRepository.deleteAll();
  }

  @Test
  public void should_find_no_tutorials_if_repository_is_empty() {
    Iterable<Dealer> tutorials = dealerRepository.findAll();

    assertThat(tutorials).isEmpty();
  }

  @Test
  void given_dealer_to_save_then_dealer_persisted_to_database() {
    // GIVEN
    Dealer dealer = Dealer.builder().name("Mendjijet").build();

    // WHEN
    dealer = dealerRepository.save(dealer);
    Optional<Dealer> optionalDealer = dealerRepository.findById(dealer.getIdDealer());

    // THEN
    Assertions.assertTrue(optionalDealer.isPresent());
    Assertions.assertEquals(dealer, optionalDealer.get());
  }

  @Test
  void given_many_dealer_to_saveAll_then_findAll() {
    List<Dealer> dealers =
        List.of(
            Dealer.builder().name("Mendjijet 1").build(),
            Dealer.builder().name("Mendjijet 2").build(),
            Dealer.builder().name("Mendjijet 3").build());
    List<Dealer> result = dealerRepository.saveAll(dealers);
    assertThat(result).isNotEmpty().hasSize(3);
  }
}
