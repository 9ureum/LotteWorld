package pkg;

public class Output {
	InputData inputdata = new InputData();

	public void ticketOut() {
		System.out.println("������ �����ϼ���");
		System.out.println("1. �ְ��� ");
		System.out.println("2. �߰��� ");
		inputdata.setSelectDayOrNight();
	}

	public void registrationOut() {	
		System.out.println("������� 8�ڸ��� �Է��ϼ���.(YYYYMMDD)");
		inputdata.setResidentRegistrationNumber();
	}

	public void numberOfTicketOut() {
		System.out.println("��� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)");
		inputdata.setNumberOfTicket();
	}

	public void preferOut() {
		System.out.println("�������� �����ϼ���.");
		System.out.println("1. ���� (���� ���� �ڵ�ó��)");
		System.out.println("2. �����");
		System.out.println("3. ����������");
		System.out.println("4. ���ڳ�");
		System.out.println("5. �ӻ��");
		inputdata.setSelectPrefer();
	}
	public void finPriceOut() {
		LotteWorldFuntion lwf = new LotteWorldFuntion();
		System.out.printf("������ %d �� �Դϴ�.\n", lwf.getPayment());
		System.out.println("�����մϴ�.");

	}
	public void continueOut() {
		System.out.println("��� �߱��Ͻðڽ��ϱ�?\n");
		System.out.println("1. Ƽ�� �߱�\n");
		System.out.println("2. ����\n");
		inputdata.setInputSelectNumber();
	}
	
	public void exitTicket() {
		System.out.println("Ƽ�� �߱��� �����մϴ�. �����մϴ�.\n");
		System.out.println("============ �Ե����� ============");
		
	}
}
