public class Account{
    private String username; //to be initialized in part (a)

    /**
     * Creates a username based on the parambeter requestedName. If the
     * username is unavailable, appends successive integers, beginning
     * with 1, to requestedName until an available username is round,
     * as described in part (a).
     */
    public Account(String requestedName){
        String name = requestedName;
        int i = 1;
        while(!isAvailable(name)){
            name = requestedName + i;
            i++;
        }
        username = name;
    }

    /**
     * Returns true if the parameter str is an available username;
     * returns false otherwise.
     */
    public static boolean isAvailable(String str)
    {
        /* implementation not show */
    }

    /**
     * Returns a shortened version of username with each hyphen ("-")
     * and the character before it removed, as described in part (b)
     * Preconditions: username does not start or end with a hyphen.
     *                username does not contain consecutive hyphens.
     *                username.length() >= 2
     * Postcondition: username is unchanged.
     */
    public String getShortenedName(){
        String name = username;
        int i = name.indexOf("-");
        while(i > 0){
            name = name.substring(0,i-1) + name.substring(i+1);
            i = name.indexOf("-");
        }
        return name;
    }
}
