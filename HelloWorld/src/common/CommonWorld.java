/**
 * 
 */
package common;

/**
 * @author Hung
 *
 */
public abstract class CommonWorld {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberOfUser() {
		return numberOfUser;
	}

	public void setNumberOfUser(Integer numberOfUser) {
		this.numberOfUser = numberOfUser;
	}

	public Languages getLanguage() {
		return language;
	}

	public void setLanguage(Languages language) {
		this.language = language;
	}

	private String name = "Common";
	private Integer numberOfUser  = 0;
	private Languages language = Languages.All;

	public abstract void Display();

	public void ShowAttribute(){
		
		System.out.println("Name: " + getName());
		System.out.println("Number of User: " + getNumberOfUser());
		System.out.println("Languages: " + getLanguage());
	}
	
	public enum Languages{
		ObjectiveC,
		CPlus,
		CsharpDotNet,
		BasicDotNet,
		Java,
		All
	}
	
}
