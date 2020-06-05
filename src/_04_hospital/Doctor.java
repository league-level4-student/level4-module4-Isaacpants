package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
Hospital h = new Hospital();
ArrayList<Patient> p = new ArrayList<Patient> ();
	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return null;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		if(p.size()<=3) {
			p.add(patient);
			}else {
				throw new DoctorFullException();
			}
		}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return null;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		
	}

}
