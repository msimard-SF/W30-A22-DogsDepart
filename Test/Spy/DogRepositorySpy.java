package Spy;
import java.util.Collection;

import Mock.IDogRepositoryMock;
import dogs.model.Dog;

public class DogRepositorySpy implements IDogRepositoryMock{

	private boolean hasBeenAdded = false;
	@Override
	public void add(Dog dog) {
		hasBeenAdded = true;
	}

	@Override
	public Collection<Dog> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Dog searchedById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasBeenCalled() {
		return this.hasBeenAdded;
	}
}
