import Controller.SingInController;
import Controller.SingUpController;
import Model.SingUpModel;
import View.ManageRoomsView;
import View.SingUpView;

public class Main
{
    public static void main(String[] args)
    {
        SingUpView view = new SingUpView();
        SingUpModel model = new SingUpModel();
        new SingUpController(view, model);
        view.setVisible(true);
    }
}