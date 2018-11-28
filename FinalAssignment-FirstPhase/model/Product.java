package model;

public class Product
{
    private String description;
    private long barcode;
    private String serialNumber;
    private GoldenTicket prizeTicket;

    public Product () {}
    public Product (String _description, long _barcode, String _serialNumber, GoldenTicket _prizeTicket)
    {
        this.description=_description;
        this.barcode=_barcode;
        this.serialNumber=_serialNumber;
        this.prizeTicket=_prizeTicket;
    }

    public void descriptionSetter(String _description)
    {
        this.description=_description;
    }
    public void barcodeSetter(long _barcode)
    {
        this.barcode=_barcode;
    }
    public void serialNumberSetter(String _serialNumber)
    {
        this.serialNumber=_serialNumber;
    }
    public void prizeTicketSetter(GoldenTicket _prizeTicket)
    {
        this.prizeTicket=_prizeTicket;
    }

    public String descriptionGetter()
    {
        return description;
    }
    public long barcodeGetter()
    {
        return barcode;
    }
    public String serialNumberGetter()
    {
        return serialNumber;
    }
    public GoldenTicket prizeTicketGetter()
    {
        return prizeTicket;
    }
}