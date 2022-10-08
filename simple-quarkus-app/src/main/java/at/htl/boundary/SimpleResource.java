package at.htl.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/movies")
public class SimpleResource {

    String[] movies = {
            "Star Wars: Episode I – The Phantom Menace",
            "Star Wars: Episode II – Attack of the Clones",
            "Star Wars: Episode III – Revenge of the Sith",
            "Star Wars: Episode IV – A New Hope",
            "Star Wars: Episode V - The Empire strikes back",
            "Star Wars: Episode VI – Return of the Jedi"
    };


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMovies() {
        StringBuilder all = new StringBuilder();

        for (String s : movies) {all.append(s).append("\n");}

        return all.toString();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/best")
    public String getBestMovie() {
        return movies[3];
    }
}
