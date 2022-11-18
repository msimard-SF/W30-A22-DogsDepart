package dogs;

import Repository.DogMemoryRepository;
import Repository.IDogRepository;
import dogs.controller.DogController;
import dogs.controller.IWelcomeController;
import dogs.controller.WelcomeController;
import dogs.view.IDogController;
import dogs.view.WelcomeView;

public class MainAppDogs {

	private IDogRepository repository = new DogMemoryRepository();
	public static void main(String[] args) {
		new MainAppDogs();
	}

	public MainAppDogs() {
		this.dataSeeder();
		this.createControllers();
	}
	
	private void createControllers() {
		IDogController dogController = new DogController(repository);
		IWelcomeController appController = new WelcomeController(dogController);
		appController.startApplication();
	}

	public void dataSeeder() {
		new DataSeeder(repository);
	}
}
