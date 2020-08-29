package dxc.LeaveManagementProject;

public class Test1 {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		Employee[] res = dao.showEmploy();
        for (Employee employee : res) {
			System.out.println(employee);
		}
	}
}
