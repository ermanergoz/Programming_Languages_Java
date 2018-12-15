package model;

public class Product
{
    private String description;
    private long barcode;
    private String serialNumber;
    private GoldenTicket prizeTicket;
    private boolean ticketState;    //if this is true then it has a golden ticket

    public Product () {}
    public Product (String _description, long _barcode, String _serialNumber, GoldenTicket _prizeTicket)
    {
        this.description=_description;
        this.barcode=_barcode;
        this.serialNumber=_serialNumber;
        this.prizeTicket=_prizeTicket;
        this.ticketState=false;
    }

    //Setters
    public void setDescription(String _description)
    {
        this.description=_description;
    }
    public void setBarcode(long _barcode)
    {
        this.barcode=_barcode;
    }
    public void setSerialNumber(String _serialNumber)
    {
        this.serialNumber=_serialNumber;
    }
    public void setPrizeTicket(GoldenTicket _prizeTicket)
    {
        this.prizeTicket=_prizeTicket;

    }
    public void setTicketState(boolean _ticketState)
    {
        this.ticketState=_ticketState;
    }

    //Getters
    public String getDescription()
    {
        return description;
    }
    public long getBarcode()
    {
        return barcode;
    }
    public String getSerialNumber()
    {
        return serialNumber;
    }
    public GoldenTicket getPrizeTicket()
    {
        return prizeTicket;
    }
    public boolean getTicketState()
    {
        return ticketState;
    }
}