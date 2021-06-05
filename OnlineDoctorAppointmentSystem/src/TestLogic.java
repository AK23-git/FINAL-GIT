import static org.junit.Assert.*;

import org.junit.Test;

import beans.AppointmentBean;

import daofiles.AdminDao;
import daofiles.AppointmentDao;
import daofiles.DoctorDao;
import daofiles.PatientDao;


public class TestLogic {

	@Test
	public void testAdminLogValidate(){  
		
        assertEquals(Boolean.TRUE,AdminDao.validate("admin@gmail.com","admin"));  	//Correct Username and Password
        assertEquals(Boolean.FALSE,AdminDao.validate("admin@gmail","admin"));  	//InCorrect Username and Correct Password
        assertEquals(Boolean.FALSE,AdminDao.validate("admin@gmail.com","ad"));  	//Correct Username and Incorrect Password
        assertEquals(Boolean.FALSE,AdminDao.validate("admin@gmail","min")); 	//InCorrect Username and Incorrect Password 
        System.out.println("Test sucessfull!!!");
        
	}
	@Test
	public void testDoctorLogValidate(){  
		
        assertEquals(Boolean.TRUE,DoctorDao.validate("raj@gmail.com","12345"));  	//Correct Username and Password
        assertEquals(Boolean.FALSE,DoctorDao.validate("admin@gmail","Rajshree"));  	//InCorrect Username and Correct Password
        assertEquals(Boolean.FALSE,DoctorDao.validate("Rajshree@GMAIL.COM","ad"));  	//Correct Username and Incorrect Password
        assertEquals(Boolean.FALSE,DoctorDao.validate("admin@gmail","min")); 	//InCorrect Username and Incorrect Password 
        System.out.println("Test sucessfull!!!");
        
	}
	@Test
	public void testPatientLogValidate(){  
		
        assertEquals(Boolean.TRUE,PatientDao.validate("priti@rediff.com","ppp"));  	//Correct Username and Password
        assertEquals(Boolean.FALSE,PatientDao.validate("admin@gmail","sakshi"));  	//InCorrect Username and Correct Password
        assertEquals(Boolean.FALSE,PatientDao.validate("sakshi@gmail.com","ad"));  	//Correct Username and Incorrect Password
        assertEquals(Boolean.FALSE,PatientDao.validate("admin@gmail","min")); 	//InCorrect Username and Incorrect Password 
        System.out.println("Test sucessfull!!!");
        
	}
	
}
