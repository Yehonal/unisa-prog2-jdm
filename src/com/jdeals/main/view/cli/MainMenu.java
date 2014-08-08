package com.jdeals.main.view.cli;

import java.util.concurrent.Callable;

import com.jdeals.libs.MyDate;
import com.jdeals.main.controller.JDealsController;
import com.jdeals.main.entity.catalogue.GeneralGood;
import com.jdeals.main.entity.catalogue.Item;
import com.jdeals.main.entity.catalogue.Restourant;
import com.jdeals.main.entity.catalogue.Travel;
import com.jdeals.main.entity.user.Manager;
import com.jdeals.main.entity.user.User;
import com.jdeals.main.view.cli.AdminMenu.ProductTypes;

/**
 * The Class MainMenu.
 */
public class MainMenu extends ViewCli {
	
	/**
	 * Instantiates a new main menu.
	 *
	 * @param sysCtrl the sys ctrl
	 */
	public MainMenu(JDealsController sysCtrl) {
		super("Main Menu",sysCtrl);
		this.addItem(
			"Login",
			new Callable<Boolean>() {
				@Override
				public Boolean call() throws Exception {
					return Login();
				}
			}
		);
		this.addItem(
			"Register",
			new Callable<Boolean>() {
				@Override
				public Boolean call() throws Exception {
					return Register();
				}
			}
		);
	}

    /* (non-Javadoc)
     * @see com.jdeals.main.view.cli.ViewCli#runMenu()
     */
    @Override
    public boolean runMenu() {
        System.out.println(
                "\nDemo users:"+
                "\nUser: root , pass: root ( Admin )"+
                "\nUser: utente , pass: utente ( User )\n"
        );
        
        return super.runMenu();
    }
	
	/**
	 * Login.
	 *
	 * @return true, if successful
	 */
	public boolean Login() {
		System.out.println("Username or Email:");
		String id=JDealsController.scan.nextLine();

		System.out.println("Password:");
		String password=JDealsController.scan.nextLine();
		
		try {
			User u=this.getSysCtrl().Login(id, password);
			if (u!=null) {
				if (u instanceof Manager) {
					new AdminMenu(this.getSysCtrl()).runMenu();
				} else {
					new UserMenu(this.getSysCtrl()).runMenu();
				}
				return true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
		return false;
	}
	
	/**
	 * Register.
	 *
	 * @return true, if successful
	 */
	public boolean Register() {
		System.out.println("Username:");
		String username=JDealsController.scan.nextLine();
		
		System.out.println("Email:");
		String email=JDealsController.scan.nextLine();
        
        System.out.println("City:");
		String city=JDealsController.scan.nextLine();

		System.out.println("Password:");
		String password=JDealsController.scan.nextLine();
		
		try  {
			this.getSysCtrl().Register(username,email,city, password);
		} catch(Exception e)	{
			System.out.println(e.getMessage());
		}
        
        return true;
	}
}
