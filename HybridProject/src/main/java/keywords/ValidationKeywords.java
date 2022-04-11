package keywords;

public class ValidationKeywords extends GenericKeywords
{

	public void validateTitle()
	{
	
	}
	
	public void validateText()
	{
		
	}
	
	public void validateElementPresent(String locator)
	{
		//failure
		reportFailure("Element is not Found :" + locator,true);
	}
	
}
