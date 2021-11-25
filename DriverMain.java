package OOPsAssignmentSolution1;

public class DriverMain {

	public static void main(String[] args) {
		Super_Department sp = new Super_Department();
		Admin_Department ad = new Admin_Department();
		System.out.println("Welcome to " + ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(sp.isTodayAHoliday());

		Hr_Department hr = new Hr_Department();
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(sp.isTodayAHoliday());

		Tech_Department tc = new Tech_Department();
		System.out.println("Welcome to " + tc.departmentName());
		System.out.println(tc.getTodaysWork());
		System.out.println(tc.getWorkDeadline());
		System.out.println(tc.getTechStackInformation());
		System.out.println(sp.isTodayAHoliday());
	}
}
