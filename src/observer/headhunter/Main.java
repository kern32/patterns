package observer.headhunter;

public class Main {
	public static void main(String[] args) {
		HeadHunter hh = new HeadHunter();
		hh.registerObserver(new JobSeeker("Mike"));
		hh.registerObserver(new JobSeeker("Chris"));
		hh.registerObserver(new JobSeeker("Jeff"));
		hh.addJob("Google Job");
		hh.addJob("Yahoo Job");
	}

}
