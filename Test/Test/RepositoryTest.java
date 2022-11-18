package Test;


import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Mock.IDogRepositoryMock;
import Spy.DogRepositorySpy;
import dogs.controller.DogController;
import dogs.controller.IWelcomeController;
import dogs.controller.WelcomeController;
import dogs.model.Dog;
import dogs.view.IDogController;

public class RepositoryTest {
	
	IDogRepositoryMock repository;
	
	@BeforeEach 
	public void initEach() 
	{
		repository = new DogRepositorySpy();
		IDogController dogController = new DogController(repository);
		IWelcomeController appController = new WelcomeController(dogController);
	}
		
	@Test 
	public void CanAddDog() {
		repository.add(new Dog("a", "a", 0));
		
		assertTrue(repository.hasBeenCalled() == true);
	}
}
