

public class BalancesMain {

	public static void main(String[] args) {
		update();
	}

	public static void update() {
		// Open the file
	    try {
	      File myObj = new File("accountbalances.txt");
	      Scanner myReader = new Scanner(myObj);
	     
	      while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			//System.out.println(data);
			String account[] = data.split(",");

			String accountName = account[1];
		    String ledgerBalance = account[2];
		    String availableBalance = account[3];

		    System.out.println("Account Name: " + accountName +
		    	", Ledger Balance: " + ledgerBalance +
		    	", Available Balance: " + availableBalance);
	      }

	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	
	}
}