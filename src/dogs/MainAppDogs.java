package dogs;

import dogs.controller.DogController;
import dogs.controller.IWelcomeController;
import dogs.controller.WelcomeController;
import dogs.view.IDogController;
import dogs.view.WelcomeView;

public class MainAppDogs {

	public static void main(String[] args) {
		new MainAppDogs();
	}

	public MainAppDogs() {
		this.createControllers();
	}
	
	private void createControllers() {
		IDogController dogController = new DogController();
		IWelcomeController appController = new WelcomeController(dogController);
		appController.startApplication();
	}

}
