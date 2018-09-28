

public class G8tarSpecs extends InstrumentSpec {

	private int numString;

	public G8tarSpecs(Builder builder, String model, int numString, Type type, Wood backWood, Wood topWood)
		{
		super(builder, model, type, backWood, topWood);
		this.numString = numString;
		}

	public boolean matches(G8tarSpecs g)
		{
		if (super.matches(g))
			{
			if (this.numString == g.numString)
				{
				return true;
				}
			}
			return false;
		}
	}