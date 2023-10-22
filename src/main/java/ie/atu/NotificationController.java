package ie.atu;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class NotificationController {

    @PostMapping("/notification")
    public String notificationMessage(@RequestBody UserDetails userDetails) {
        String notification = String.format("Successfully registered user :%s", userDetails.getName());
        return notification;
    }
}
