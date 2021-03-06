public class UserNames
{
	//instance variables
	private String userName, firstName, lastName;
	
	//Default constructor
	public UserNames()
	{
		//default values for instance variables
		userName = "";
		firstName = "";
		lastName = "";
	}
	
	//Constructor with params - overloaded
	public UserNames(String uName, String fName, String lName)
	{
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	
	//Modifier 
	public void setUserName(String uName)
	{
		userName = uName;
	}
	
	//Accessors
	public String getUserName()
	{
		return userName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
}