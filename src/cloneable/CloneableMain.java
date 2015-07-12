package cloneable;

public class CloneableMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Company company = new Company();
		CloneModal modal = new CloneModal();
		modal.setName("Chiranjeevi");
		modal.setAge(28);
		modal.setHeight(5.7);
		modal.setWeight(67.0);
		modal.setCompany(company);
		modal.getCompany().setName("Oracle");
		
		CloneModal cloneModal = (CloneModal) modal.clone();
		cloneModal.getCompany().setName("Qualcomm");
		
		CloneModal newModal = new CloneModal();
		
		newModal = modal;
		
		System.out.println(modal.getCompany().getName());
		
		newModal.getCompany().setName("BOA");
		System.out.println(modal.getCompany().getName());
		
	}

}
