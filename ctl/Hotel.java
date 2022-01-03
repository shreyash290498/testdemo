package in.co.rays.project_4.ctl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import in.co.rays.project_4.util.ServletUtility;

@WebServlet(name="Hotel",urlPatterns={"/ctl/Hotel"})
public class Hotel extends BaseCtl {
	
	
	private static Logger log=Logger.getLogger(Hotel.class);
	
	
	protected boolean validate(HttpServletRequest request){
		
		log.debug("Hotel method validate started");
		boolean pass=true;
			
	log.debug("Hotel Method validate Ended");
	return pass;
	}
	
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		
		
		log.debug("Method doGet Started");
			System.out.println("hyy do get");
		ServletUtility.forward(getView(), request, response);
		log.debug("Hotel Method doGet Ended");
	}
	
	
	/**/			@Override
			protected String getView() {
				System.out.println("getView of Hotel");
			return ORSView.HOTEL_VIEW;
}

}
