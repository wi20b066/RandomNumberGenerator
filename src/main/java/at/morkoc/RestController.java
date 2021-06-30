package at.morkoc;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class RestController {

    int min = 500;
    int max = 600;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public int rndNumber(){

        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("Number is: "+ random_int);
        return random_int;
    }

}
