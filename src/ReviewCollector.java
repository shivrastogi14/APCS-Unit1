import java.util.ArrayList;
import java.util.Arrays;

public class ReviewCollector
{
private ArrayList<ProductReview> reviewList;
private ArrayList<String> productList;
  /** Constructs a ReviewCollector object and initializes the instance variables. */
public ReviewCollector()
{
reviewList = new ArrayList<ProductReview>();
productList = new ArrayList<String>();
}
  /** Adds a new review to the collection of reviews, as described in part (a). */
public void addReview(ProductReview prodReview)
{ 
	reviewList.add(prodReview);
		if(productList.contains(prodReview.getName())==false){
			productList.add(prodReview.getName());
				}
	}
  /** Returns the number of good reviews for a given product name, as described in part (b). */
public int getNumGoodReviews(String prodName)
{ 
	int num = 0;
	for(int count = 0; count<productList.size(); count++) {
		if(productList.get(count).equals(prodName)&&reviewList.get(count).getReview().contains("best")){
			num++;
}
	}
	return num;
	}
  // There may be instance variables, constructors, and methods not shown.

public static void main(String[]args) {
//	ReviewCollector one = new ReviewCollector();
//	ProductReview two = new ProductReview("Duck", "best");
//	one.addReview(two);
//	System.out.println(one.getNumGoodReviews("Duck"));
}
}