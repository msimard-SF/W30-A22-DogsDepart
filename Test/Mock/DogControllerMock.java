package Mock;

import Repository.IDogRepository;
import dogs.model.DogDTO;

public class DogControllerMock implements IDogControllerMock{

	private boolean hasBeenCalled = false;
	
	public DogControllerMock(IDogRepository repository) {
		
	}
	
	public void goToCreate() {
		hasBeenCalled = true;
	}
	
	public void add(DogDTO dogDTO){
		hasBeenCalled = true;
	}

	@Override
	public boolean hasBeenCalled() {
		// TODO Auto-generated method stub
		return this.hasBeenCalled;
	}	

}
