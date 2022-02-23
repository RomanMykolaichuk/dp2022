package application.beans;

import org.springframework.stereotype.Component;

import application.interfaces.Screen;

@Component("6inch")
public class sixInch implements Screen {

	@Override
	public String screen() {
		// TODO Auto-generated method stub
		return "6inch screen";
	}

}
