package dogs.model;

public class DogDTO {
	
	public final String NAME;
	public final String BREED;
	public final int OWNER_ID;
	
	public DogDTO(String name, String breed, int owner_id){
		this.NAME = name;
		this.BREED = breed;
		this.OWNER_ID = owner_id;
	}
}
