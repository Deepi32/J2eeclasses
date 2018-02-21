import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;


	@Path("/v1/status") //removed * wildcard to make this more compatible with tomcat
	public class V1_status {

		private static final String api_version = "00.02.00"; //version of the api
		
		/**
		 * This method sits at the root of the api.  It will return the name
		 * of this api.
		 * 
		 * @return String - Title of the api
		 */
		@GET
		@Produces(MediaType.TEXT_HTML)
		public String returnTitle() {
			return "<p>Java Web Service</p>";
		}
		
		/**
		 * This method will return the version number of the api
		 * Note: this is nested one down from the root.  You will need to add version
		 * into the URL path.
		 * 
		 * Example:
		 * http://localhost:7001/com.youtube.rest/api/v1/status/version
		 * 
		 * @return String - version number of the api
		 */
		@Path("/version")
		@GET
		@Produces(MediaType.TEXT_HTML)
		public String returnVersion() {
			return "<p>Version:</p>" + api_version;
		}
		
}
