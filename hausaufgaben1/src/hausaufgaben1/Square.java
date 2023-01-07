package hausaufgaben1;

public class Square extends TwoDimensionalShape{
	int kose;
	@Override
	public double getArea() {
		return kose*kose;
	}

	public Square(int kose) {
		setKose(kose);
	}

	public int getKose() {
		return kose;
	}

	public void setKose(int kose) {
		this.kose = kose;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ " Kose: "+kose;
	}
}
