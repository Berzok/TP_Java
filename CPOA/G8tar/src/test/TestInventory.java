package test;

import static org.junit.Assert.*;
import paquet.*;
import org.junit.Test;

public class TestInventory {
	
	
	Inventory inventory;
	
	
	
	@Test
	public void testInventory()
		{
		inventory = new Inventory();
		Client.initializeInventory(inventory);
		}

	@Test
	public void testDisplay() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testAddInstrument() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetGuitar() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSearch() {
		fail("Not yet implemented"); // TODO
	}

}