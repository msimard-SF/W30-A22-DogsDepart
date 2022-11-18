package Repository;
import java.util.Collection;

import dogs.model.*;

public interface IDogRepository {
	void add(Dog dog);
	Collection<Dog> getList();
	int size();
	Dog searchedById(int id);
}