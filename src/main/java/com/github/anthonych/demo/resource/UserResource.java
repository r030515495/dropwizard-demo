package com.github.anthonych.demo.resource;

import com.github.anthonych.demo.core.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by anthonychen on 10/8/14.
 */
@Path("/user")
public class UserResource {

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAllUser() {
        List<User> users = new ArrayList<User>();

        users.add(new User("aaa"));
        users.add(new User("bbb"));
        users.add(new User("ccc"));

        return users;
    }
}
