public class Invoice {
    //declare attributes
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    //constructor
    public Invoice(String partNo, String partDesc, int qty, double price){
        partNumber = partNo;
        partDescription = partDesc;
        quantity = qty;
        pricePerItem = price;
    }

    //mutators or set methods
    public void setPartNumber(String partNo) {

    }

    //include other set methods

    //accessors or get methods
    public String getPartNumber(){
        return partNumber;
    }
}
