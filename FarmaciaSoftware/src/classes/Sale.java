package classes;
/*
 * class written by Philippe Ribeiro on June 14th, 2011
 * Department of Computer Science, University of Minnesota
 * Minneapolis, Minnesota, USA - 55455
 * 
 * Class sale defines a single sale
 * by definition, a sale is the act to selling a product to a client
 * we assign an unique id to the sale, in other to track it later on
 * 
 */
import java.sql.Time;

public class Sale{

	/*
	 * setting a Sale to an id would help to track that sale latter on
	 */
	private Integer id;
	/*
	 * identifies which was the product sold
	 */
	private Product product;
	/*
	 * identifies which client bought it
	 */
	private Client client;
	
	/*
	 * sets which was the date of the sale
	 */
	private Date saleDate;
	
	/*
	 * how many product were bought
	 */
	private Integer quantity;
	/*
	 * defines the time that the product was sold
	 */
	private Time time;
	/*
	 * defines the type of the sale
	 * 1 - in cash
	 * 2 - in term
	 * 3 - credit card
	 */
	private Integer saleType;
	/*
	 * default constructor, set the default values to the field variables
	 */
	@SuppressWarnings("deprecation")
	public Sale(){
		this.id = 0;
		this.product = new Product();
		this.client = new Client();
		this.saleDate = new Date();
		this.time = new Time(0, 0, 0);
		this.quantity = 0;
		this.saleType = 0;
	}
	/*
	 * overrode constructor
	 * @param product: Product
	 * @param cliente: Client
	 * @param saleDate : Data
	 * 
	 * @return none
	 * 
	 */
	public Sale(Product product, Client client, Date saleDate, Integer quantity, Integer saleType, Time time){
		this.setProduct(product);
		this.setClient(client);
		this.setSaleDate(saleDate);
		this.setQuantity(quantity);
		this.setSaleType(saleType);
		this.setSaleTime(time);
	}

	/*
	 * sets the type of the sale
	 * 1 - cash
	 * 2 - term
	 * 3 - credit card
	 */
	public void setSaleType(Integer type){
		if(type > 0 && type < 6){
			this.saleType = type;
		}
	}
	/*
	 * sets the time of the sale
	 */
	public void setSaleTime(Time time){
		this.time = time;
	}
	public void setQuantity(Integer quantity) {
		// TODO Auto-generated method stub
		this.quantity = quantity;
		
	}
	
	public Integer getQuantity(){
		return this.quantity;
	}
	/*
	 * sets the sale date
	 * @param: saleDate : Date
	 * @return: void
	 */
	public void setSaleDate(Date saleDate){
		this.saleDate = saleDate;
	}
	
	/*
	 * sets the sale id
	 * @param: id : Integer
	 * @returns: void
	 */
	public void setSaleId(Integer id){
		this.id = id;
	}
	/*
	 * sets the client who made the purchase
	 * @param: client : Client
	 * @returns : void
	 */
	public void setClient(Client client) {
		// TODO Auto-generated method stub
		this.client = client;
		
	}
	
	/*
	 * sets the product which was sold
	 * @param product : Product
	 * @returns: void
	 */
	public void setProduct(Product product) {
		// TODO Auto-generated method stub
		this.product = product;
	}
	
	/*
	 * returns the product of this sale
	 * @param: void
	 * @returns: Product
	 */
	public Product getProduct(){
		return this.product;
	}
	
	/*
	 * returns the client who made the purchase
	 * @param: void
	 * @returns: Client
	 */
	public Client getClient(){
		return this.client;
	}
	/*
	 * returns the id of the sale
	 * @param: void
	 * @returns: Integer
	 */
	public Integer getSaleId(){
		return this.id;
	}
	/*
	 * returns the date of the sale
	 * @param: void
	 * @returns: Date
	 */
	public Date getSaleDate(){
		return this.saleDate;
	}
	
	/*
	 * returns the sale Type
	 */
	public Integer getSaleType(){
		return this.saleType;
	}
	/*
	 * returns the sale time
	 */
	public Time getTime(){
		return this.time;
	}
	/*
	 * returns the total of the purchase, in US$
	 */
	public Double getTotalSale(){
		return this.quantity * this.product.getProductFinalPrice();
	}
}
