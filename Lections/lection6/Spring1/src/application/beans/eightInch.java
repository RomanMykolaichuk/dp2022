package application.beans;

import org.springframework.stereotype.Component;

import application.interfaces.Screen;

@Component("8inch")
public class eightInch implements Screen {

	@Override
	public String screen() {
		// TODO Auto-generated method stub
		return "8inch screen";
	}

}
