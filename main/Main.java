import controller.ControllerTicket;
import view.MainMenu;

public class Main {

    public static void main(String[] args) {

        ControllerTicket controllerTicket = new ControllerTicket();
        new MainMenu(controllerTicket);
    }
}