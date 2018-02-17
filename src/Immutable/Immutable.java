package Immutable;

public final class Immutable {
	final int employeeId;
	final String employeeName;

	public Immutable(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}
}
