import java.text.DecimalFormat;

public class Is_It_Worth {

	private static DecimalFormat df2 = new DecimalFormat("#.##");
	private static DecimalFormat df1 = new DecimalFormat("#.#");
	private static DecimalFormat df0 = new DecimalFormat("#");


	public static void main(String[] args) {
		
		int years;
		int months;
		double total_Damage;
		double kefalaio;
		double epitokio;
		double damage;
		double extraDamage;
		double bankGains;
		double normaly;
		
		
		years = 30;
		kefalaio = 40000;
		epitokio = 0.035;
			
		
		months = 12;
		total_Damage = 0;
		damage = 0;
		extraDamage = 0;
		
		
		extraDamage= kefalaio * epitokio * years; 
		total_Damage = kefalaio + extraDamage;
		damage = total_Damage / (months * years);
		
		normaly = kefalaio / (months * years);
		bankGains =  damage - normaly;
		
		System.out.print("You took " + df0.format(kefalaio) + "─ but you have to pay: " + df1.format(total_Damage) + "─\n");
		System.out.print("The extra Damage would be: " + df1.format(extraDamage) + "─\n");
		System.out.print("You have to pay: " + df2.format(damage) + "─ each month\n\n");
		System.out.println("--------------------------------------------------------\n");
		System.out.print("If there wasn't epitokio, you would pay each month: " + df2.format(normaly) + "─ \n");
		System.out.print("The money that the Bank Gains for you each month is: " + df2.format(bankGains) + "─ \n\n");
		
//дамеислос апо тяапефес ала анифеи коцо епитойиым
// стахеяо епитойио дамеиым 

	}

}
