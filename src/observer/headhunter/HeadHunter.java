package observer.headhunter;

import java.util.ArrayList;

public class HeadHunter implements Subject{
	private ArrayList<Observer> userList;
	private ArrayList<String> jobs;

	public HeadHunter(){
		userList = new ArrayList<Observer>();
		jobs = new ArrayList<String>();
	}
	public void registerObserver(Observer o) {
		userList.add(o);
	}
	public void notifyAllObservers() {
		for(Observer o: userList){
			o.update(this);
		}
	}
 	public void addJob(String job) {
		this.jobs.add(job);
		notifyAllObservers();
	}
 	public ArrayList<String> getJobs() {
		return jobs;
	}
 	public String toString(){
		return jobs.toString();
	}

}
