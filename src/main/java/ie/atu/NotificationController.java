package ie.atu;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class NotificationController {

    @PostMapping("/notification")
    public String notificationMessage(@RequestBody NotificationRequest notificationRequest) {
        String notification = String.format("Successfully registered");
        return notification;
    }
}
