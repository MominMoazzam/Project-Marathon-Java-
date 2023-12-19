package Marathon_code;

public class User {
protected String name;
protected String phonenumber;
protected int age;
protected int gender;
protected String Email;

User()
{
	
}
User(String name)
{
	this.name = name;
}
User(String phonenumber,String name,String Email)
{
	this.phonenumber = phonenumber;
	this.name = name;
	this.Email = Email;
}

public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getname()
{
	return name;
}
public String getphonenumber()
{
	return phonenumber;
}
public int getage()
{
	return age;
}
public int getgender()
{
	return gender;
}
}
