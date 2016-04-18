/**
 * 
 */
package common;

/**
 * @author Hung
 *
 */
public class AndroidWorld extends CommonWorld {

	
	public AndroidWorld(int numberOfUser, Languages lang) {
		super();
		// TODO Auto-generated constructor stub
		
		setName("Android");
		setNumberOfUser(numberOfUser);
		setLanguage(lang);
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("Welcome from Android World");

		ShowAttribute();
		
	}

}
