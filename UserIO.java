
//impelent all methods as per intro document 
public interface UserIO {

	
	//how do i make some of these static?
	//do i need static in both files? 
    void print(String message);

    String readString(String prompt);

    int readInt(String prompt);

    int readInt(String prompt, int min, int max);



}