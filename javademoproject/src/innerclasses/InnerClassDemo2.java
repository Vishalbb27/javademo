package innerclasses;

public class InnerClassDemo2 {
	public static void main(String[] args) {
		Car car=new Car("black");
		
		Car.MusicSystem ms=car.new MusicSystem(4);
		ms.displayDetails();
		ms.playSomeMusic();
	}
}

class Car{
	private static String model="Hyundai I20 Automatic";
	private String colour;
	
	Car(String colour){
		this.colour=colour;
	}
	
	class MusicSystem{
		private int numofchannels;
		
		MusicSystem(int numofchannels){
			this.numofchannels=numofchannels;
		}
		
		void displayDetails() {
			System.out.println("Model of the car : "+Car.model);
			System.out.println("The color of the car: "+Car.this.colour);
			System.out.println("Number of channels in MusicSystem: "+this.numofchannels);
		}
		
		void playSomeMusic() {
			System.out.println("Playing some music...");
			
			class channel{
				int frequency;
				void getCurrentPlayingSong() {
					System.out.println("Displaying current playing song..");
				}
			}
			
			channel channel=new channel();
			channel.getCurrentPlayingSong();
		}
	}
}
