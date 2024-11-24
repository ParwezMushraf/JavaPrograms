package encapsulation;

public class umlaccount {
	private String acctholder;
	private long acc_no;
	private double balance;
    
    public String getname() {
    	
    	return acctholder ;
    }
    
 public long getacc_no()
 {
    	return acc_no ;
    }
 
 public double getbalance() 
 {
 	return balance ;
 }
 
 public void setname(String acctholder )
 {
	 this.acctholder=acctholder;
 }
 public void setacct_no(long acc_no ) 
 {
	 this.acc_no=acc_no;
 }

 public void setbalance(double balance) 
 {
     this.balance=balance;
 }
 
 public umlaccount(String acctholder,long acc_no,double balance) 
 {
	 this.acctholder=acctholder;
	 this.acc_no=acc_no;
	 this.balance=balance;
 }

}
