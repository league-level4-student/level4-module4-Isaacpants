package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
//ArrayList<GeneralPractitioner> gp = new ArrayList<GeneralPractitioner>();
ArrayList<Doctor> d = new ArrayList<Doctor>();
ArrayList<Patient> p = new ArrayList<Patient>();

	public void addDoctor(GeneralPractitioner generalPractitioner) {
		// TODO Auto-generated method stub
		
		d.add(generalPractitioner);
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return d;
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return p;
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		
		p.add(patient);
		
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		
			
		
	}

	public void addDoctor(Surgeon surgeon) {
		// TODO Auto-generated method stub
		d.add(surgeon);
	}



}
