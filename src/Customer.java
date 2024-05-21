public class Customer {
    private String name;
    private int phoneNumber;
    private String address;
    private String invoice;
    private int taxIDNumber;
    
    public Customer(){}

    public Customer(String name, int phoneNumber,String address, String invoice, int taxIDNumber){
        name = this.name;
        phoneNumber = this.phoneNumber;
        address = this.address;
        invoice = this.invoice;
        taxIDNumber = this.taxIDNumber;
    }

    public void setName(String name){
        name = this.name;
    }
    public void setPhoneNumber(int phoneNumber){
        phoneNumber = this.phoneNumber;
    }
    public void setAddress(String address){
        address = this.address;
    }
    public void setInvoice(String invoice){
        invoice = this.invoice;
    }
    public void setTaxIDNumber(int taxIDNumber){
        taxIDNumber = this.taxIDNumber;
    }

    public String getName(){
        return name;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
    public String getAddress(){
        return address;
    }
    public String getInvoice(){
        return invoice;
    }
    public int getTaxIDNumber(){
        return taxIDNumber;
    }
}

