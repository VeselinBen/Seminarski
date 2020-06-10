package seminarski;

public class AnimalModel {
	private String name;
	private String imagePath;
	
	public AnimalModel(String name, String imagePath) {
		this.name = name;
		this.imagePath = imagePath;
	}
	
	public AnimalModel() {
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getImagePath() {
		return this.imagePath;
	}
	
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
