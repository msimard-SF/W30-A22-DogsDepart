package dogs.controller;

import Repository.IDogRepository;
import dogs.model.Dog;
import dogs.model.DogDTO;
import dogs.view.DogCreateView;
import dogs.view.IDogController;
import dogs.view.IView;

public class DogController implements IDogController{
	IDogRepository repository;
	
	public DogController(IDogRepository repository) {
		this.repository = repository;
	}
	
	public void goToCreate() {
		IView DogView = new DogCreateView(this);
		DogView.display();
	}
	
	public void add(DogDTO dogDTO){
		Dog dog = new Dog(dogDTO.NAME, dogDTO.BREED, dogDTO.OWNER_ID);
		repository.add(dog);
	}	
}
