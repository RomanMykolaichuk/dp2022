package application.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import application.interfaces.Gadget;
import application.interfaces.Screen;

public class Pad implements Gadget {
	@Autowired
	@Qualifier("8inch")
	Screen screen;

	@Override
	public String specification() {
		// TODO Auto-generated method stub
		return "Lenovo Pad with "+screen.screen();
	}

}
