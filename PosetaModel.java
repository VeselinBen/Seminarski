package seminarski;


public class PosetaModel extends AnimalModel {

	private int zivotinjaId;
	
	
	public PosetaModel(AnimalModel animalModel, int zivotinjaId) {
		
		super(animalModel.getName(), animalModel.getImagePath());
		
		this.zivotinjaId = zivotinjaId;
	}
	
	public int getZivotinjaId() {
		return this.zivotinjaId;
	}

	public void setZivotinjaId(int zivotinjaId) {
		this.zivotinjaId = zivotinjaId;
	}
	
}
