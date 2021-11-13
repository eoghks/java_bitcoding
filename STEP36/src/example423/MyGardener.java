package example423;

public class MyGardener implements Gardener {
	int workLoad;
	public void giveWater(Garden g) {
		if(workLoad!=10) {
			g.increaseWater(100);
			workLoad++;
		}
	}
	
	public void cutGrass(Garden g) {
		if(workLoad!=10) {
			g.setGrass(0);
			workLoad++;
		}
	}
	public void plantTree(Garden g) {
		if(workLoad!=10) {
			g.increaseTree(1);
			workLoad++;
		}
	}
	
	public void finishWork() {
		workLoad=0;
	}
}
