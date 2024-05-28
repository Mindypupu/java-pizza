package model;
public class Customer {
    private String name;
    private int phoneNumber;
    private String address;
    private String invoice;
    private int taxIDNumber;
    
    public Customer(){}

    public Customer(String name, int phoneNumber,String address, String invoice, int taxIDNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.invoice = invoice;
        this.taxIDNumber = taxIDNumber;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setInvoice(String invoice){
        this.invoice = invoice;
    }
    public void setTaxIDNumber(int taxIDNumber){
        this.taxIDNumber = taxIDNumber;
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

