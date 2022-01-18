package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.*;
public class mainController extends Menu {
	private double tab = 0.0;
	
	@FXML
	public void addToTab(ActionEvent event)
	{
		List<Object> list = new ArrayList<Object>();
		String value = ((Button)event.getSource()).getText();
		if(value.equals("Caesar Salad"))
		{
			tab += 3.5;
		}
		else if(value.equals("Tomatoe Soup"))
		{
			tab += 4;
		}
		else if(value.equals("House Salad"))
		{
			tab += 3.25;
		}
		else if(value.equals("Miso Soup"))
		{
			tab += 4.5;
		}
		else if(value.equals("Spaghetti"))
		{
			tab += 13.5;
		}
		else if(value.equals("Rigatoni"))
		{
			tab += 12;
		}
		else if(value.equals("Fettucine Alfredo"))
		{
			tab += 13;
		}
		else if(value.equals("Seafood Linguine"))
		{
			tab += 15;
		}
		else if(value.equals("Oven Cooked Italiano Pizza"))
		{
			tab += 14;
		}
		else if(value.equals("Beef Ravioli"))
		{
			tab += 13.5;
		}
		else if(value.equals("Chicken Parmesean"))
		{
			tab += 16.5;
		}
		else if(value.equals("The Stabler"))
		{
			tab += 24;
		}
		else if(value.equals("Tiramisu"))
		{
			tab += 6.5;
		}
		else if(value.equals("Apple Pie"))
		{
			tab += 5;
		}
		else if(value.equals("Chocolate Pie"))
		{
			tab += 5.5;
		}
		else if(value.equals("Chocolate Cake"))
		{
			tab += 5.75;
		}
		else if(value.equals("Sauteed Asparagus"))
		{
			tab += 3.45;
		}
		else if(value.equals("Baked Zucchini"))
		{
			tab += 3.9;
		}
		else if(value.equals("Sun-Dried Tomatoes"))
		{
			tab += 2.65;
		}
		else if(value.equals("Parmesean-Crusted Vegetables"))
		{
			tab += 3.75;
		}
		else
		{
			tab += 0;
		}
	}
	@FXML
	public void showTab(ActionEvent event)
	{
		System.out.println("This table's tab is:" + tab);
	}
}
