package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.controller.CarController;
import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CardatabaseApplicationTests {

	@Autowired
	private CarRepository repository;
	@Autowired
	private TestEntityManager entityManager;


	@Test
	public void deleteCars() {
		entityManager.persistAndFlush(new Car("Tesla", "Model X", "White", "ABC-1234", 2017, 86000));
		entityManager.persistAndFlush(new Car("Mini", "Cooper", "Yellow", "BWS-3007", 2015, 24500));
		repository.deleteAll();
		assertThat(repository.findAll()).isEmpty();
	}
}
