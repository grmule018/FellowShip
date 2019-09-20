
package com.bridgelabz.oops.clinique;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.utility.OopsUtility;

public class Search {

	static Scanner sc = new Scanner(System.in);
	public static List<Doctor> searchByName() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.DOCTOR_FILE);
		try {
			CliniqueManager.listOfDoctor = OopsUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter the doctor's name to be searched");
			String name = sc.next();
			System.out.println(name);
			for (Doctor doctor : CliniqueManager.listOfDoctor) {
				if (name.equals(doctor.getName())) {
					list.add(doctor);
				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}

	}
	public static Doctor searchById() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.DOCTOR_FILE);
		CliniqueManager.listOfDoctor = OopsUtility.userReadValue(string, Doctor.class);
		System.out.println("Enter the doctor's id to be searched");
		int id = sc.nextInt();
		for (Doctor doctor : CliniqueManager.listOfDoctor) {
			if (id == doctor.getId()) {
				return doctor;

			}
		}
		return null;
	}

	public static List<Doctor> searchBySpecialization() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.DOCTOR_FILE);
		try {
			CliniqueManager.listOfDoctor = OopsUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter the doctor's name to be searched");
			String specialization = sc.next();
			for (Doctor doctor : CliniqueManager.listOfDoctor) {
				if (specialization.equals(doctor.getSpecialization())) {
					list.add(doctor);
				}
			}

			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}

	}

	public static List<Doctor> searchByAvailability() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.DOCTOR_FILE);
		try {
			CliniqueManager.listOfDoctor = OopsUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter when you need the doctor (eg: am/pm)");
			String availability = sc.next();
			for (Doctor doctor : CliniqueManager.listOfDoctor) {
				if (availability.equals(doctor.getAvailability())) {
					list.add(doctor);
				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}

	}

	public static Patient searchByPatientId() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.PATIENT_FILE);
		CliniqueManager.listOfPatients = OopsUtility.userReadValue(string, Patient.class);
		System.out.println("Enter the patient's id to be searched");
		int id = sc.nextInt();
		for (Patient patient : CliniqueManager.listOfPatients) {
			if (id == patient.getId()) {
				return patient;
			}
		}
		return null;
	}

	
	public static Patient searchByPhoneNo() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.PATIENT_FILE);
		CliniqueManager.listOfPatients = OopsUtility.userReadValue(string, Patient.class);
		System.out.println("Enter the patient's phone number to search");
		long phoneNo = sc.nextLong();
		for (Patient patient : CliniqueManager.listOfPatients) {
			if (phoneNo == patient.getPhoneNo()) {
				return patient;
			}
		}
		return null;
	}

}
