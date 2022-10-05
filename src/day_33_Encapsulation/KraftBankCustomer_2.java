package day_33_Encapsulation;
import java.util.Random;
public class KraftBankCustomer_2 {
    private final int customerId;
    private String customerFullName;
    public boolean isSms;
    private double customerAccount;
    private final String customerToken;
    public KraftBankCustomer_2(int customerId, String customerFullName, boolean isSms) {
        this.customerId = customerId;
        this.customerFullName = customerFullName;
        this.isSms = isSms;
        this.customerToken=customerId+customerFullName.substring(0,2)+12;
    }
    public int getCustomerId() {
        return customerId;
    }
    public String getCustomerFullName() {
        return customerFullName;
    }
    public void setCustomerFullName(String customerToken, String customerFullName){
        if(customerToken.equals(this.customerToken)){
            this.customerFullName=customerFullName;
        }else{
            System.out.println("Not Authorize ");
        }

    }
    public boolean getIsSms() {
        return isSms;
    }
    public void setIsSms(boolean sms) {
        isSms = sms;
    }
    public double getCustomerAccount() {
        return customerAccount;
    }
    public String getCustomerToken() {
        return customerToken;
    }
    public void addMoney (double money){
        this.customerAccount+=money;
    }
}
