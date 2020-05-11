package staff;

import java.util.ArrayList;

public class MedicalStaffList {

	//protected String animalData;
	private String firstName;
	private String surname;
	private int staffID;
	protected int salary;
	private int j=0;
	
	
	//Number of medical staff to be generated
	private int numMedicalStaff = 30;
	private int numVeterinarian = (int) (numMedicalStaff*0.25);
	private int numTraineeVet = (int) (numMedicalStaff*0.1);
	private int numNurse = (int) (numMedicalStaff* 0.35);
	private int numVetAssistant = (int) (numMedicalStaff * 0.20); 
	private int petHairStylist =numMedicalStaff - numVeterinarian -numTraineeVet - numNurse - numVetAssistant ;
	
	//ArrayList from the Superclass ClinicStaff where Medical will be Stored
			ArrayList<ClinicStaff> medicalStaff = new ArrayList <ClinicStaff>();
			Medical medicStaff = new Medical(firstName, surname, staffID, salary);
	
	//Instance of the class StaffDataGenerator
			StaffDataGenerator sdg = new StaffDataGenerator();
			
			
	//Instances of the inner classes  of the class Medical
			Medical.Veterinarian vet;
			Medical.TraineeVet trainVet;
			Medical.Nurse nurse;
			Medical.VeterinarianAssistant vetAssist;
			Medical.PetHairStylist hairStyle;
			
			
			public void generateMedicalStaff() { 
				  ///Loop to generate veterinarians
				  for (int i=0; i<numVeterinarian; i++ ) {
					  j++;
					  String medicalData = sdg.getRandomData();
					  String [] medicalParts = medicalData.split(" ");
					  //Create a class for salary
					  int staffID = medicStaff.generateStaffID(j); //Method to generate the id
					  vet = medicStaff.new Veterinarian(medicalParts[0], medicalParts[1], staffID, 0);
					  medicalStaff.add(vet);
				  }
				  
				///Loop to generate Trainee Veterinarians
				  for (int i=0; i<numTraineeVet; i++ ) {
					  j++;
					  String medicalData = sdg.getRandomData();
					  String [] medicalParts = medicalData.split(" ");
					  //Create a class for salary
					  int staffID = medicStaff.generateStaffID(j); //Method to generate the id
					  trainVet = medicStaff.new TraineeVet(medicalParts[0], medicalParts[1], staffID, 0);
					  medicalStaff.add(trainVet);
				  }
				  
				  
				  ///
				  for (int i=0; i<numNurse; i++ ) {
					  j++;
					  String medicalData = sdg.getRandomData();
					  String [] medicalParts = medicalData.split(" ");
					  //Create a class for salary
					  int staffID = medicStaff.generateStaffID(j); //Method to generate the id
					  nurse = medicStaff.new Nurse(medicalParts[0], medicalParts[1], staffID, 0);
					  medicalStaff.add(nurse);
				  }
				  
				  
				  ////
				  for (int i=0; i<numVetAssistant; i++ ) {
					  j++;
					  String medicalData = sdg.getRandomData();
					  String [] medicalParts = medicalData.split(" ");
					  //Create a class for salary
					  int staffID = medicStaff.generateStaffID(j); //Method to generate the id
					  vetAssist = medicStaff.new VeterinarianAssistant(medicalParts[0], medicalParts[1], staffID, 0);
					  medicalStaff.add(vetAssist);
				  }
				  
				  
				  /////
				  for (int i=0; i<petHairStylist; i++ ) {
					  j++;
					  String medicalData = sdg.getRandomData();
					  String [] medicalParts = medicalData.split(" ");
					  //Create a class for salary
					  int staffID = medicStaff.generateStaffID(j); //Method to generate the id
					  hairStyle = medicStaff.new PetHairStylist(medicalParts[0], medicalParts[1], staffID, 0);
					  medicalStaff.add(hairStyle);
				  }
				  
			for (ClinicStaff ms : medicalStaff) {
				System.out.println(ms);
			}
}
}
