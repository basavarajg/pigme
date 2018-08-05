package pigme.pojo;

import java.util.Date;

public class Payment {
	
	String id; // unique transaction id
	String amount;
	Date dateTime;
	String status; //transaction successful/failed/cancelled
	String mode; // mode of payment (net banking, debit/credit card)
	String modeInfo; // bank/debit/credit partial info
	String comments;
}
