package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestWorker {

	private Worker w = new Worker();

	@Test
	@DisplayName("Work Method Fail Test")
	public void testWorkMethodFail()
	{
		assertEquals(w.work(), "I'm already working!","Mismatch between test text and method text");
	}	

	@Test
	@DisplayName("Work Method Succeed Test")
	public void testWorkMethodSucceed()
	{
		assertEquals(w.work(), "Work work work, do work \n","Mismatch between test text and method text");
	}
}