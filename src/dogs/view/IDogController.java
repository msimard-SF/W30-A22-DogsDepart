package dogs.view;

import dogs.model.DogDTO;

public interface IDogController {
	void goToCreate();
	void add(DogDTO dog);
}
