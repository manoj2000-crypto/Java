package ArraysPrograms;

public class WordCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome,to,edubridge";
        String str2 = "";
        String str3 = "";
        String splitString[] = str.split(",");
        int max = splitString[0].length();
        int min = splitString[0].length();
        for(int i = 1; i<splitString.length; i++)
        {
            if(splitString[i].length() > max)
            {
            	str2 = splitString[i];
                //max = splitString[i].length();
                //System.out.println(splitString[i]);
            }
            if(splitString[i].length() < min) 
            {
            	str3 = splitString[i];
            }
        }
        System.out.println("Gretest : "+str2);
        System.out.println("Lowest : "+str3);
	}

}
