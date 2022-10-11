import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Login {
    @GET
    @Path("/{user}/{password}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam("user") String user, @PathParam("password") String password) {
        if(user.equals("Gabriel") && password.equals("123"))
            return "Usuário Correto.";
        return "Usuário Incorreto.";
    }
}