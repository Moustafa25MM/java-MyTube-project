package MyTube;

public class EmailService implements Notfication {
    @Override
    public void sendEmail(User user) {

        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}
