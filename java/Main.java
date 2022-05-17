import java.util.*;

public class Main
{
	int Main_Choice,bus_choice,return_main_choice,i,j,k,details_choice;
	int cur_location_choice1,cur_location_choice2,cur_location_choice3,des_location_choice1,des_location_choice2,des_location_choice3;
	int total_tic1,total_tic2,total_tic3,stops1,stops2,stops3;
	int fare1,fare2,fare3,fare_p1,fare_p2,fare_p3;
	String pas_name1[]=new String[20];
	String pas_name2[]=new String[20];
	String pas_name3[]=new String[20];
	
			Scanner sc=new Scanner(System.in);
	
	public void Main_menu()
	{
		do
		{
			System.out.println("===================================================");
			System.out.println("||     BUS RESERVATION AND TICKETING SYSTEM     ||");
			System.out.println("||==============================================||");
			System.out.println("|| [1] Book Ticket                              ||");
			System.out.println("|| [2] Passenger Details                        ||");			
			System.out.println("|| [3] Filling Bore Try Your Luck Play Luck Game||");
			System.out.println("|| [4] About us                                 ||");
			System.out.println("|| [5] Exit                                     ||");
			System.out.println("==================================================");
			System.out.println("==================================================\n");
			
			System.out.print("Enter The Choice : ");
			Main_Choice= sc.nextInt();
			
			switch(Main_Choice)
			{
			case 1 :
					 Bus_Select();                   
					break;
            case 2:
					passenger_details();
                    break;
			case 3:
					Luck_Game l=new Luck_Game();
					l.Guess_Number();
					break;
            case 4:
					About_us z=new About_us();
					z.details();
					System.out.println("");
					break;
			case 5:
					System.out.println("=============================================");
					System.out.println("-------------Thanks For Visiting-------------");
					System.out.println("=============================================");
					break;
					
            default:
					System.out.println("Wrong Choice Please Enter Correct Choice");
					
			}
		}while(Main_Choice!=5);
	}
	
	public void Bus_Select()
	{
		do
		{
			System.out.println("=============================================");
			System.out.println("||1.Bus 1=Pune to Mumbai                   ||");
			System.out.println("||2.Bus 2=Pune to Nashik                   ||");
			System.out.println("||3.Bus 3=Pune to Bhimashankar             ||");
			System.out.println("||4.Main Menu                              ||");
			System.out.println("=============================================");
			
			System.out.print("Enter The Choice : ");
			bus_choice= sc.nextInt();
			
			switch(bus_choice)
			{
				case 1 :
						bus1();
						money_cal1();
						Main_menu();
						break;
				case 2:
						bus2();
						money_cal2();
						Main_menu();
						break;
				case 3:
						bus3();
						money_cal3();
						Main_menu();
						break;
				case 4:
						Main_menu();
						break;
						
				default:
						System.out.println("Wrong Choice Please Enter Correct Choice");
						
			}
		}while(Main_Choice!=5);
	}
	
	
	public void bus1()
	{	
		System.out.println("******************************");
		System.out.println("*   DESTINATION              *");
		System.out.println("******************************");
		System.out.println("* 01.Swargate                *");
		System.out.println("* 02.Baner                   *");
		System.out.println("* 03.Ravet                   *");
		System.out.println("* 04.Lonavala                *");
		System.out.println("* 05.Khandala                *");
		System.out.println("* 06.Khopoli                 *");
		System.out.println("* 07.Rasayani                *");
		System.out.println("* 08.Kamboli                 *");
		System.out.println("* 09.Navi Mumbai             *");
		System.out.println("* 10.Vashi                   *");
		System.out.println("* 11.Chembur                 *");
		System.out.println("* 12.Mumbai                  *");
		System.out.println("******************************");
		System.out.println("******************************\n");
	}
	
	public void money_cal1()
	{
		do
		{
			System.out.print("Enter your current location : ");
			cur_location_choice1= sc.nextInt();
			System.out.print("Enter location where you  wants to go: ");
			des_location_choice1= sc.nextInt();
			if(cur_location_choice1>12||des_location_choice1>12||des_location_choice1<cur_location_choice1)
			{
				System.out.println("Wrong location please enter again");
			}
		}while(cur_location_choice1>12||des_location_choice1>12||des_location_choice1<cur_location_choice1);
		
		stops1=des_location_choice1-cur_location_choice1;
		
		System.out.print("How many tickets you want: ");
		total_tic1=sc.nextInt();
		
		do
		{
			if(total_tic1<pas_name1.length)
			{	
				System.out.println("Enter "+total_tic1+" passenger names");
			for(i=1;i<=total_tic1;i++)
			{	
				System.out.print("Enter "+i+" passenger name =");
				pas_name1[i]=sc.next();
				fare_p1=50*stops1;
				System.out.println("========================");
				System.out.println("|"+(20-i)+" Seats Are Left!!!  |");
				System.out.println("========================\n");
			}
			}
			else
			{
				System.out.println("There are only 20 seats available");
			}
		}while(total_tic1>21);
		
		fare1=50*total_tic1*stops1;		
		System.out.println("=========================================");
		System.out.println("||Total Fare of "+total_tic1+" passengers is= "+fare1+"Rs.||");
		System.out.println("||Your "+total_tic1+" seats are booked              ||");
		System.out.println("=========================================\n");
	}
		
	public void passenger_details1()
	{
		System.out.println("============================================");
		System.out.println("---------Your Total Bill Per-Person---------");
		System.out.println("============================================\n");
		System.out.println("============================================");
		System.out.println("*   Passenger Name      ||       Fare      *");
		System.out.println("============================================");
		for(i=1;i<=total_tic1;i++)
			{	
				System.out.println("||     "+pas_name1[i]+"\t\t\t"+fare_p1+"Rs.");
			}
		System.out.println("============================================\n");
			
	}
	
	
	
	public void bus2()
	{	
		System.out.println("******************************");
		System.out.println("*   DESTINATION              *");
		System.out.println("******************************");
		System.out.println("* 01.ShivajiNagar            *");
		System.out.println("* 02.Nashik Phata            *");
		System.out.println("* 03.Bhosari                 *");
		System.out.println("* 04.Chakan                  *");
		System.out.println("* 05.Rajgurunagar            *");
		System.out.println("* 06.Manchar                 *");
		System.out.println("* 07.Narayangaon             *");
		System.out.println("* 08.Ale-Phata               *");
		System.out.println("* 09.Sangamner               *");
		System.out.println("* 10.Sinnar                  *");
		System.out.println("* 11.Deolali                 *");
		System.out.println("* 12.Nashik                  *");
		System.out.println("******************************");
		System.out.println("******************************\n");
	}

	public void money_cal2()
	{
		do
		{
			System.out.print("Enter your current location : ");
			cur_location_choice2= sc.nextInt();
			System.out.print("Enter location where you  wants to go: ");
			des_location_choice2= sc.nextInt();
			if(cur_location_choice2>12||des_location_choice2>12||des_location_choice2<cur_location_choice2)
			{
				System.out.println("Wrong location please enter again");
			}
		}while(cur_location_choice2>12||des_location_choice2>12||des_location_choice2<cur_location_choice2);
		
		stops2=des_location_choice2-cur_location_choice2;
		
		System.out.print("How many tickets you want: ");
		total_tic2=sc.nextInt();
		
		do
		{
			if(total_tic2<pas_name2.length)
			{	
				System.out.println("Enter "+total_tic2+" passenger names");
			for(j=1;j<=total_tic2;j++)
			{	
				System.out.print("Enter "+j+" passenger name =");
				pas_name2[j]=sc.next();
				fare_p2=50*stops2;
				System.out.println("========================");
				System.out.println("|"+(20-j)+" Seats Are Left!!!  |");
				System.out.println("========================\n");
			}
			}
			else
			{
				System.out.println("There are only 20 seats available");
			}
		}while(total_tic2>21);
		
		fare2=50*total_tic2*stops2;		
		System.out.println("=========================================");
		System.out.println("||Total Fare of "+total_tic2+" passengers is= "+fare2+"Rs.||");
		System.out.println("||Your "+total_tic2+" seats are booked              ||");
		System.out.println("=========================================\n");
	}
		
	public void passenger_details2()
	{
		System.out.println("============================================");
		System.out.println("---------Your Total Bill Per-Person---------");
		System.out.println("============================================\n");
		System.out.println("============================================");
		System.out.println("*   Passenger Name      ||       Fare      *");
		System.out.println("============================================");
		for(j=1;j<=total_tic2;j++)
			{	
				System.out.println("||     "+pas_name2[j]+"\t\t\t"+fare_p2+"Rs.");
			}
		System.out.println("============================================\n");
			
	}
	
	

	public void bus3()
	{	
		System.out.println("******************************");
		System.out.println("*   DESTINATION              *");
		System.out.println("******************************");
		System.out.println("* 01.ShivajiNagar            *");
		System.out.println("* 02.Nashik Phata            *");
		System.out.println("* 03.Bhosari                 *");
		System.out.println("* 04.Chakan                  *");
		System.out.println("* 05.Rajgurunagar            *");
		System.out.println("* 06.Manchar                 *");
		System.out.println("* 07.Ghodegaon               *");
		System.out.println("* 08.Shinoli                 *");
		System.out.println("* 09.Dimbhe                  *");
		System.out.println("* 10.Pokhari                 *");
		System.out.println("* 11.Taleghar                *");
		System.out.println("* 12.Bhimashankar            *");
		System.out.println("******************************");
		System.out.println("******************************\n");
	}
	
	public void money_cal3()
	{
		do
		{
			System.out.print("Enter your current location : ");
			cur_location_choice3= sc.nextInt();
			System.out.print("Enter location where you  wants to go: ");
			des_location_choice3= sc.nextInt();
			if(cur_location_choice3>12||des_location_choice3>12||des_location_choice3<cur_location_choice3)
			{
				System.out.println("Wrong location please enter again");
			}
		}while(cur_location_choice3>12||des_location_choice3>12||des_location_choice3<cur_location_choice3);
		
		stops3=des_location_choice3-cur_location_choice3;
		
		System.out.print("How many tickets you want: ");
		total_tic3=sc.nextInt();
		
		do
		{
			if(total_tic3<pas_name3.length)
			{	
				System.out.println("Enter "+total_tic3+" passenger names");
			for(k=1;k<=total_tic3;k++)
			{	
				System.out.print("Enter "+k+" passenger name =");
				pas_name3[k]=sc.next();
				fare_p3=50*stops3;
				System.out.println("========================");
				System.out.println("|"+(20-k)+" Seats Are Left!!!  |");
				System.out.println("========================\n");
			}
			}
			else
			{
				System.out.println("There are only 20 seats available");
			}
		}while(total_tic3>21);
		
		fare3=50*total_tic3*stops3;		
		System.out.println("=========================================");
		System.out.println("||Total Fare of "+total_tic3+" passengers is= "+fare3+"Rs.||");
		System.out.println("||Your "+total_tic3+" seats are booked              ||");
		System.out.println("=========================================\n");
	}
		
	public void passenger_details3()
	{
		System.out.println("============================================");
		System.out.println("---------Your Total Bill Per-Person---------");
		System.out.println("============================================\n");
		System.out.println("============================================");
		System.out.println("*   Passenger Name      ||       Fare      *");
		System.out.println("============================================");
		for(k=1;k<=total_tic3;k++)
			{	
				System.out.println("||     "+pas_name3[k]+"\t\t\t"+fare_p3+"Rs.");
			}
		System.out.println("============================================\n");
			
	}
	
	public void passenger_details()
	{
		do
		{
			System.out.println("=================================================");
			System.out.println("||Enter which bus passenger details do you need||");
			System.out.println("=================================================\n");
			System.out.println("=================================================");
			System.out.println("||1.Bus 1=Pune to Mumbai                   ||");
			System.out.println("||2.Bus 2=Pune to Nashik                   ||");
			System.out.println("||3.Bus 3=Pune to Bhimashankar             ||");
			System.out.println("||4.Main Menu                              ||");
			System.out.println("=================================================");
			
			System.out.print("Enter The Choice : ");
			details_choice= sc.nextInt();
			
			switch(details_choice)
			{
				case 1 :
						passenger_details1();
						break;
				case 2:
						passenger_details2();
						break;
				case 3:
						passenger_details3();
						break;
				case 4:
						Main_menu();
						break;
						
				default:
						System.out.println("Wrong Choice Please Enter Correct Choice");
						
			}
		}while(Main_Choice!=5);
	}
	
	
	public static void main(String args[])
	{
		Main b=new Main();
		b.Main_menu();
	}
}