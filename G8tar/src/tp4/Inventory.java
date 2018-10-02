package tp4;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Instrument> instruments;

	public Inventory() {
		instruments = new LinkedList<Instrument>();
	}

	public void display(Instrument g) {
		List<Instrument> matchingGuitars = this.search(g.getInstrumentSpec());
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for (Iterator<Instrument> i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				G8tarSpecs gs = (G8tarSpecs) guitar.getInstrumentSpec();
				System.out.println("  We have a " + gs.getBuilder() + " " + gs.getModel() + " " + gs.getType() + " guitar:\n	 " + gs.getBackWood() + " back and sides,\n	 " + gs.getTopWood() + " top.\n  You can have it for only $" + guitar.getPrice() + "!\n  ----");
			}
		}
		else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

	public void addInstrument(String serialNumber, double price, InstrumentSpec instrSpec)
		{
		instruments.add(new Instrument(serialNumber, price, instrSpec));
		}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator<Instrument> i = instruments.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	public List<Instrument> search(InstrumentSpec searchSpec)
		{
		List<Instrument> matchingInstruments = new LinkedList<Instrument>();
		for(Iterator<Instrument> i = instruments.iterator(); i.hasNext();)
			{
			Instrument instru = i.next();
			if(instru.getSpec().matches(searchSpec))
				matchingInstruments.add(instru);
			}
		return matchingInstruments;
		}

	public Instrument getInstrument(String serialNumber) {
		for (Iterator<Instrument> i = instruments.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}
}
