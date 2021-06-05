import static org.junit.Assert.*;

import org.junit.Test;

import daofiles.AppointmentDao;
import daofiles.GeneralDao;

import beans.AppointmentBean;
import beans.feedbackbean;


public class TestLogicTest {

	@Test
	public void testGeneralDao(){
		
		feedbackbean fb = new feedbackbean();
		fb.setName("Raju");
		fb.setEmail("raju@gmail.com");
		fb.setContact("1563248975");
		fb.setSuggestion("Good");
		
			assertEquals(1,GeneralDao.save(fb));
			System.out.println(" Test Successfull!!!");
		
	}
	
}
