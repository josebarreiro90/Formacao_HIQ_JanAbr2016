package domain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import domain.toys.ActionMan;
import domain.toys.Toy;

public class ActionManUnitTest {

	@Parameters


	
	@Test
	public void testActionMan(){

		ActionMan actionMan = new ActionMan(1, "AA", 50.0F, 3, "Comando");
		
		Assert.assertEquals(1, actionMan.getId());

		Assert.assertTrue(actionMan instanceof Product);
		


		Toy toy = new ActionMan(1, "AA", 50.0F, 3, "Comando");
		
		Assert.assertEquals(1, actionMan.getId());

		Assert.assertTrue(toy instanceof Product);
		
		
		
		
	}

}
