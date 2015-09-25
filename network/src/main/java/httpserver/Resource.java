package httpserver;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author mizeng
 * @version v1.0
 * @description TODO
 * @date 9/25/15
 */

@Path("/resource")
public class Resource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(){
        return "Got it";
    }

    @Path("/restart/{target}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String restart(@PathParam("target") String target){
        return target;
    }
}
