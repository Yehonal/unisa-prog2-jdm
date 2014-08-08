package com.jdeals;

import com.jdeals.main.controller.JDealsController;
import com.jdeals.main.controller.JDealsController.RunType;

public class Starter {
    
    /** The instance. */
    private static JDealsController instance;
	
    /**
     * main method for production app.
     *
     * @param args the arguments
     */
	public static void main (String args[]) {
        RunType type=RunType.FRAME;
        
        if (args.length > 0 ) { 
            switch (args[0]) {
                case "cli": 
                    type=RunType.CLI;
                break;
                case "applet":
                    type=RunType.APPLET;
                break;
            }
        }

        instance = new JDealsController(type);
        instance.render();
	}
}
