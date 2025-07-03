package ticket.booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.User;

import java.io.File;
import java.util.List;

public class UserBookingService {

    private User user;

    private List<User> userList;

    private static final ObjectMapper = new ObjectMapper();

    private static final String USERS_PATH = "../localDB/users.json";

    private UserBookingService(User user1) {
        this.user = user1;
         File users = new File(USERS_PATH);
         userList = ObjectMapper.readValue(users, new TypeReference<List<User>>() {
         })

    }


}
