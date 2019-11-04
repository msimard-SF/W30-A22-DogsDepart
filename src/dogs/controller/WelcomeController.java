package dogs.controller;

import dogs.view.IView;
import dogs.view.WelcomeView;

public class WelcomeController implements IWelcomeController {


	public void startApplication() {;
		IView welcomeView = new WelcomeView(this);
		welcomeView.display();
	}
}
