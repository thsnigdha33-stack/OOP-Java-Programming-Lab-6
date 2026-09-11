
import javax.management.Notification;

public class NotificationSystem {

    // Broadcast notification
    public void sendNotification(String message) {
        System.out.println("Broadcast Alert:" + message);
    }

    // Email notification
    public void sendNotification(String message,String email) {
        System.out.println("Email sent to" + email +" -> " + message);
 }

     // SMS notification using long for phoneNumber
     public void sendNotification(String message, long phonenumber) {
    System.out.println("SMS sent to +" + phonenumber + " -> " + message);
 }
     
 public static void main(String[] args) {
     NotificationSystem system = new NotificationSystem();

     system.sendNotification("Server restart in 5 mins.");
     system.sendNotification("Your OTP is 4432","user@test.com");
     system.sendNotification("Package delivered!", 15550199L);
 }
}