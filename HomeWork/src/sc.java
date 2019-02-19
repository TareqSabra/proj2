
import java.util.ArrayList;


public class sc {
 private int count ;
 private int Amount;
  ArrayList<books> x = new ArrayList<books>();
   public ArrayList<books> get_X(){
	  
	return x;
	  
  }
	public void count() {
		this.setCount(x.size());
		}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public void addbook(books b) {
		this.x.add(b);
		this.count();
		this.totalprice();
		
	}
	public void totalprice() {
		int adder = 0;
		for(int i=0;i<x.size();i++) {
		adder = adder+this.x.get(i).getBookprice()*this.x.get(i).getCount();
		}
		this.setAmount(adder);	
		
	}
	public void deleteBook(int i) {
	x.remove(i);
	this.count();
	this.totalprice();
	
	}
}



