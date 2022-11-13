package dogs.controller;

import dogs.view.DogCreateView;
import dogs.view.IDogController;
import dogs.view.IView;

public class DogController implements IDogController{
	
	public DogController() {
		
	}
	
	public void goToCreate() {
		IView DogView = new DogCreateView(this);
		DogView.display();
	}
}
