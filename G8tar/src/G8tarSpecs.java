

public class G8tarSpecs
	{
	private String modele;
	private Builder builder;
	private Type type;
	private Wood backWood, topWood;
	
	public G8tarSpecs(String leModele, Builder leBuilder, Type leType, Wood leBackWood, Wood leTopWood)
		{
		modele = leModele;
		builder = leBuilder;
		type = leType;
		backWood = leBackWood;
		topWood = leTopWood;
		}
	
	
	
	public String getModele()
		{
		return this.modele;
		}
	
	public Builder getBuilder()
		{
		return this.builder;
		}
	
	public Type getType()
		{
		return this.type;
		}
	}
