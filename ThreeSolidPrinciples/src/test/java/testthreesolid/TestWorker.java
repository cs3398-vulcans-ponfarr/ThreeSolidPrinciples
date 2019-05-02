package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestWorker {

	private Worker w = new Worker();

	@Test
	@DisplayName("Work Method Fail: Object is supposed to be nullWW")
	public void newtestCVWorkerPass()
	{
		 	assertNull(w.work(), "The object is null.");
	}


}
