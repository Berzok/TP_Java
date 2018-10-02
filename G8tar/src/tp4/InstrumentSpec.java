package tp4;

import java.util.Iterator;
import java.util.Map;


public class InstrumentSpec {
	@SuppressWarnings("rawtypes")
	private Map properties;

    @SuppressWarnings("rawtypes")
	public InstrumentSpec(Map lesProperties)
    	{
    	this.properties = lesProperties;
    }

	public boolean matches(InstrumentSpec otherSpec)
		{
		for(@SuppressWarnings("rawtypes")
		Iterator i = otherSpec.getProperties().keySet().iterator(); i.hasNext(); )
			{
			String k = (String) i.next();
			if(this.properties.containsKey(k))
				{
				if(this.properties.get(k).equals(otherSpec.properties.get(k)));
					continue;
				}
			return false;
			}
		return true;
    }

	@SuppressWarnings("rawtypes")
	public Map getProperties()
		{
		return properties;
		}
	}
