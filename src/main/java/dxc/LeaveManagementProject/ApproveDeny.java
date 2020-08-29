package dxc.LeaveManagementProject;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/myleave")
public class ApproveDeny {

	@GET
	@Path("/approvedeny/{LeaveId}/{empMgrId}/{status}/{mgrComment}")
	@Produces(MediaType.APPLICATION_JSON)
	public String approvedenyLeave(@PathParam("LeaveId")int LeaveId, @PathParam("empMgrId") int empMgrId, @PathParam("status")String status, @PathParam("mgrcomment") String mgrComment) {
	LeaveDAO dao = new LeaveDAO();
	String result = "";
	try {
		result = dao.approveDeny(LeaveId,empMgrId,status,mgrComment);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return result;
	}
}
