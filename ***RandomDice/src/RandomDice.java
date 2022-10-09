public class RandomDice {
    public static void main(String[] args)
    {
        //Write the line of code to create a random integer called dice
        // dice will output a value between 1 and 6 randomly>>
        int dice=(int)(6*Math.random())+1;
        System.out.println("The lucky guess you randomly received is "+dice);

        //Create an integer called lotto to be an integer between 1 and 50>>
        int lotto=(int)(50*Math.random())+1;
        System.out.println("The lucky guess you randomly received is "+lotto);

        //Write a line of code to test if the random number from 4 is the value 3
        // and if so you chose the lucky number will be outputted.>>
        int randomNumber=(int)(4*Math.random())+1;

        if(randomNumber==3)
        {
           System.out.println("You chose the lucky number!");
        }
else
        {
            System.out.println("Sorry, the lucky number was" +randomNumber);
        }
    }
}
