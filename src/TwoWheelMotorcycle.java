
public class TwoWheelMotorcycle extends Motorcycle{
	TwoWheelMotorcycle(){
		bikeWheels = 2;
	}

	@Override
	public int countWheels() {
		return super.countWheels() + 1;
	}
}
