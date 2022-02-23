package application.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import application.interfaces.Gadget;
import application.interfaces.Screen;

@Component("smartphone")
public class Smartphone implements Gadget {
	@Autowired
	@Qualifier("6inch")
	Screen screen;

	@Override
	public String specification() {
		// TODO Auto-generated method stub
		return "Smatrphone with "+screen.screen();
	}

}
