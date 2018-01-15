import model.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Party{
    private static Scanner scanner = new Scanner(System.in);
    private static Output out = new Output();
    
	private static ArrayList <Guest> partyGuests = new ArrayList<>();
	private static ArrayList <Song> Isplayedlist = new ArrayList<>();

	public static void register()
	{
		boolean registerNoName = false;
		System.out.println("register No Name? (yes/no)");
		
		if(scanner.nextLine() == "yes"){
			registerNoName = true;
		}

		String nameOfAnimal = "";
		System.out.println("----------------Species----------------");
		String confirmname = "";
		while(!confirmname.equals("yes") ){
			System.out.println("name?");
			nameOfAnimal = scanner.nextLine();
			System.out.println("confirm one time.(yes/no) ");
			confirmname = scanner.nextLine();
		}

		System.out.println("species?(flying,mammal,swimming)");
		String species = scanner.nextLine();
		boolean flying = false;
		boolean mammal = false;
		boolean swimming = false;
		int numberOfWing;
		int numberOfPaws;
		String startplace;
        Flying bird = new Flying();
        Swimming fish = new Swimming();
		Mammal mammalanimal = new Mammal();



		if(species.equals("flying")){
			flying = true;
			System.out.println("number of wings? ");
			numberOfWing = Integer.parseInt(scanner.nextLine());
			bird.setNumberOfWings(numberOfWing);
		}
		else if(species.equals("mammal"))
		{
            mammal = true;
			System.out.println("number of paws?");
			numberOfPaws = Integer.parseInt(scanner.nextLine());
			mammalanimal.setPaws(numberOfPaws);

		}
		else if(species.equals("swimming"))
		{
            swimming = true;
			System.out.println("where are you coming from? (Sea or River) ");
			startplace = scanner.nextLine();
			fish.setStartplace(startplace);
		}
			
			System.out.println(" The way you get in? ");
			String getinway = scanner.nextLine();
			System.out.println("what is your Song?");
			String song = scanner.nextLine();
			System.out.println("---------------NEED-----------------");
			System.out.println("Animal Need for your animal?");
			String needAnimal = scanner.nextLine();
			System.out.println("Species name?");
			String nameOfSpecies = scanner.nextLine();

			AnimalNeed animalNeed = new AnimalNeed(needAnimal);
			Animals newAnimal = new Animals(nameOfSpecies,animalNeed);
			Song newSong = new Song(song);
		
		if(flying)
		{
			Guest newGuest = new Guest(registerNoName,nameOfAnimal,bird,newAnimal,newSong,getinway);
			Mufasa.registerGuest(partyGuests,newGuest);
		}
		else if(mammal)
		{
			Guest newGuest = new Guest(registerNoName,nameOfAnimal,mammalanimal,newAnimal,newSong,getinway);
			Mufasa.registerGuest(partyGuests,newGuest);
		}
		else if(swimming)
		{
			Guest newGuest = new Guest(registerNoName,nameOfAnimal,fish,newAnimal,newSong,getinway);
			Mufasa.registerGuest(partyGuests,newGuest);
		}
		
	}
	public static void init()
	{
		String userCommand;
		do {
            System.out.println("----------Welcome to AHPT42 Party system--------");
            System.out.println(" ");
            System.out.println("--------------HERE IS THE COMMAND---------------");
            System.out.println("Command1: 'register' which to register the guest.");
            System.out.println("Command2: 'remove' which to remove the guest.");
            System.out.println("Command3: 'isInList' which to find the animal.");
            System.out.println("Command4: 'pickthesong' which to sort and list the songs.");
            System.out.println("Command5: 'removethesong' which to remove the song.");
            System.out.println("Command6: 'played' which to list the isPlayed songs.");
            System.out.println("Command7: 'unplayed' which to list unplayed songs.");
            System.out.println("Command8: 'animalneed' which to list animals need.");
            System.out.println("Command9: 'speciesneed' which to list species need.");
            System.out.println("Command10: 'shuffle' which to shuffle the song list.");
            System.out.println("Command11: 'exit'.");
            
            
            userCommand = scanner.nextLine();
            
            
            switch (userCommand) {
                case "register"://1
                    register();
                    break;
                case "remove"://2
                	System.out.println("name of the animal , which you want to remove : ");
                	String name = scanner.nextLine();
                    Mufasa.removeGuest(partyGuests,name);
                    break;
                case "isInList"://3
                    System.out.println("name of the animal : ");
                    String namewanttofind = scanner.nextLine();
                    if(Mufasa.isInTheList(partyGuests,namewanttofind)){
                        System.out.println("In the list");
                    }else{
                        System.out.println("Not in the list");
                    }
                    break;
                case "pickthesong"://4
                	try{
                		Zazu.PickSong(Isplayedlist);
                	}
                	catch (NoSongException e)
                	{
                		System.out.println("ERROR,NO SONG UNPLAYED.");
                	}	
                	break;
                case "removethesong"://5
                    System.out.println("name of the song?");
                    String song = scanner.nextLine();
                    Zazu.removeSong_list(Isplayedlist,song);
                    //System.out.println("Success");
                    break;
                case "played"://6
                    Zazu.playedSong(Isplayedlist);
                    printList();
                    break;
                case "unplayed"://7
                    Zazu.nonPlayedPrint(Isplayedlist);
                    break;
            	case "animalneed"://8
            		System.out.println("-----------animal need ----------");
            		list_animal_need();
            		break;
            	case "speciesneed"://9
            		System.out.println("-----------list species need -------- ");
            		list_species_need();
            		break;
                case "shuffle"://10
                    Zazu.shuffle(Isplayedlist);
                    System.out.println("Success");
                    break;

            }

        } while (!userCommand.equals("exit"));//11
    }
    public static void printList()
    {
    	for(int i=0;i<Isplayedlist.size();i++)
    	{
    		if(Isplayedlist.get(i).isPlayed())
    		{
    			System.out.println(Isplayedlist.get(i).getSong());
    		}
    	}
    }
    public static void list_animal_need()
    {
    	for(int i=0;i<partyGuests.size();i++)
    	{
    		System.out.println( partyGuests.get(i).getName() + " need - " + "'" +partyGuests.get(i).getAnimal().getAnimalNeed().getNeed() + "'");
    	}
    }
	public static void list_species_need()
    {
    	for(int i=0;i<partyGuests.size();i++)
    	{
    		System.out.println(partyGuests.get(i).getName() + " is " + "'" +partyGuests.get(i).getSpeciesNeed().getNeed() + "' and the way which get in is" + partyGuests.get(i).getGetinway());
    	}
    }
	public static void main(String[] args)
	{

		//test
		AnimalNeed animalNeed = new AnimalNeed(" i need air and cant take the water");
		Animals newAnimal = new Animals("rabbit",animalNeed);
		Song newSong = new Song("test_song1");
		Mammal rabbit = new Mammal(2);
		Guest newGuest = new Guest(false,"amy",rabbit,newAnimal,newSong,"land");
		Isplayedlist.add(newSong);
        
        AnimalNeed animalNeed1 = new AnimalNeed(" i need place to rest ");
        Animals newAnimal1 = new Animals("Bird",animalNeed1);
        Song newSong1 = new Song("test_song2");
        Flying bird = new Flying(2);
        Guest newGuest1 = new Guest(false,"kane",bird,newAnimal1,newSong1," on air ");
        Isplayedlist.add(newSong1);
        
        
        AnimalNeed animalNeed2 = new AnimalNeed(" I need water! ");
        Animals newAnimal2 = new Animals("Fish",animalNeed2);
        Song newSong2 = new Song("test_song3");
        Swimming fish = new Swimming("river");
        Guest newGuest2 = new Guest(false,"Sarah",fish,newAnimal2,newSong2,"river");
        Isplayedlist.add(newSong2);

		AnimalNeed animalNeed3 = new AnimalNeed(" I have to eat ");
		Animals newAnimal3 = new Animals("pig",animalNeed3);
		Song newSong3= new Song("test_song4");
		Mammal pig = new Mammal(4);
		Guest newGuest3 = new Guest(false,"john",pig,newAnimal3,newSong3,"land");
		Isplayedlist.add(newSong3);

		
		partyGuests.add(newGuest);
		partyGuests.add(newGuest1);
		partyGuests.add(newGuest2);
		partyGuests.add(newGuest3);

		out.outputPlaylist(Isplayedlist);


		Party.init();

		//lionKingParty.register();
		//Zazu.sortSong(Isplayedlist);

	}
}
