package Ch13.Team_abstract;

public class Won2Euro extends Converter {

	public Won2Euro(double ratio) {
		super();
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		return Math.round(src/ratio);
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "유로";
	}

}
