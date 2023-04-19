package pkg;

public class MainLotteWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputData inputdata = new InputData();
		Output output = new Output();
		LotteWorldFuntion lwf = new LotteWorldFuntion();
		do {
		output.ticketOut();
		output.registrationOut();
		lwf.residentRegistration();
		output.numberOfTicketOut();
		output.preferOut();
		lwf.preferFunction();
		lwf.finPrice();
		output.finPriceOut();
		output.continueOut();
		} while(inputdata.getInputSelectNumber() == 1);
				
	}

}
