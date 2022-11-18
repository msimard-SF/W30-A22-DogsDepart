package Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import dogs.model.Dog;

public class DogMemoryRepository implements IDogRepository{
	private int nextId;
	Map<Integer,Dog> dogs;
	
	public DogMemoryRepository(){
		nextId = 0;
		dogs = new HashMap<>();
	}
	
	public void add(Dog dog) {
		nextId++;
		dogs.put(this.nextId, dog);
	}
	
	public Collection<Dog> getList(){
		Collection<Dog> copy = new ArrayList<Dog>(dogs.values());
		return copy;
	}
	
	public int size() {
		return dogs.size();
	}
	
	public Dog searchedById(int id) {
		return dogs.get(id);
	}
}
