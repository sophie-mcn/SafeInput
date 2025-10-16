public class SafeInput
{
    //static method definitions go here
    //are called with SafeInput.METHODNAME

    /**
     * a method that prompts for and returns a string response with at least one character
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt a prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't

        do
        {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();

            if (retString.isEmpty())
            {
                System.out.println("Please enter at least one character");
            }
        }while(retString.isEmpty());

        return retString;

    }
}
