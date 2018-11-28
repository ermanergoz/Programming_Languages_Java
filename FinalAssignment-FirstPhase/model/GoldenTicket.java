package model;
import java.util.Date;

public class GoldenTicket
{
	private String ticketCode;
	private Date raffleDate;

	//Constructors:
	public GoldenTicket() {}
	
	public GoldenTicket(String _ticketCode, Date _raffleDate)
	{
		this.ticketCode = _ticketCode;
		this.raffleDate = _raffleDate;
	}

	// Getters and Setters
	public void setTicketCode(String _ticketCode)
	{
		this.ticketCode=_ticketCode;
	}
	public void setRaffleDate(Date _raffleDate)
	{
		this.raffleDate=_raffleDate;
	}
	
	public String getTicketCode()
	{
		return ticketCode;
	}	
	public Date getRaffleDate()
	{
		return raffleDate;
	}
	
	// If the current ticket has been already raffled
boolean isRaffled()
}