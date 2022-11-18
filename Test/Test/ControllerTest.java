package Test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Mock.DogControllerMock;
import Mock.IDogControllerMock;
import Mock.IDogRepositoryMock;
import Spy.DogRepositorySpy;
import dogs.controller.IWelcomeController;
import dogs.controller.WelcomeController;

public class ControllerTest {
	
	IDogRepositoryMock repository;
	IDogControllerMock dogController;
	IWelcomeController appController;
	
	@BeforeEach 
	public void initEach() 
	{
		repository = new DogRepositorySpy();
		dogController = new DogControllerMock(repository);
		appController = new WelcomeController(dogController);
	}
	
	@Test
	public void DogControllerGoToCreate() {
		this.dogController.goToCreate();
		assertTrue(this.dogController.hasBeenCalled() == true);
	}
	
	@Test
	public void DogControllerAdd() {
		this.dogController.add(null);
		assertTrue(this.dogController.hasBeenCalled() == true);
	}
}
