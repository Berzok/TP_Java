package test;

import static org.junit.Assert.*;
import paquet.*;
import tp4.Builder;
import tp4.Client;
import tp4.G8tarSpecs;
import tp4.Guitar;
import tp4.Instrument;
import tp4.Inventory;
import tp4.Type;
import tp4.Wood;

import org.junit.Test;

public class TestInventory {
	
	
	Inventory inventory = new Inventory();
	
	
	
	@Test
	public void testInventory()
		{
		inventory = new Inventory();
		Client.initializeInventory(inventory);
		}

	@Test
	public void testDisplay() {
		assertTrue(inventory != null);	}

	@Test
	public void testAddInstrument()
	{
		Instrument a = new Guitar("V95693", 1499.95, new G8tarSpecs(Builder.FENDER, "Stratocastor", 5,
				Type.ELECTRIC, Wood.ALDER, Wood.ALDER));
		inventory.display(a);
		}

	@Test
	public void testGetGuitar() {
		assertEquals("11277", inventory.getInstrument("11277").getSerialNumber());
		assertEquals(new Double(3999.45),
				(Double)inventory.getInstrument("11277").getPrice());
		assertEquals(Wood.MAHOGANY, inventory.getInstrument("122784").getSpec().getTopWood());
	}

	@Test
	public void testSearch() {
		fail("Not yet implemented"); // TODO
	}

}