package Mock;

import Repository.IDogRepository;

public interface IDogRepositoryMock extends IDogRepository{
	public boolean hasBeenCalled();
}
