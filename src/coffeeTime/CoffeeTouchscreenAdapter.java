package coffeeTime;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

	OldCoffeeMachine machine;
	
	public CoffeeTouchscreenAdapter(OldCoffeeMachine machine)
	{
		this.machine = machine;
	}
	public void chooseFirstSelection() 
	{
		machine.selectA();
	}

	
	public void chooseSecondSelection() 
	{
		machine.selectB();
		
	}
	
	public static void main (String[] args)
	{
		OldCoffeeMachine oldCoffee = new OldCoffeeMachine();
		CoffeeTouchscreenAdapter coffee = new CoffeeTouchscreenAdapter(oldCoffee);
		
		System.out.println("This is the first selection");
		coffee.chooseFirstSelection();
		System.out.println("This is the second selection");
		coffee.chooseSecondSelection();
	}

}
