import java.util.*;


class Job {
	
	String id;
	int profit, deadline;	
		
	public Job() {}

	public Job(String id, int deadline, int profit) {
		this.id = id;
		this.profit = profit;
		this.deadline = deadline;
	}

	public void printJobSequence(ArrayList<Job> jobList, int max) {
		Collections.sort(jobList,(a, b) -> b.profit - a.profit);
		boolean[] result = new boolean[max];
		String[] jobs = new String[max];
		for(int i = 0; i < jobList.size(); i++) {
			for(int j = Math.min(max - 1, jobList.get(i).deadline - 1); j >= 0; j--) {
				if(!result[j]) {
					result[j] = true;
					jobs[j] = jobList.get(i).id;
					break;
				}
			}
		}
		for(String eachJobId : jobs)
			System.out.print(eachJobId + " ");
	}
	
	public static void main(String args[]) {
		ArrayList<Job> arr = new ArrayList<Job>();
		arr.add(new Job("a", 2, 100));
		arr.add(new Job("b", 1, 19));
		arr.add(new Job("c", 2, 27));
		arr.add(new Job("d", 1, 25));
		arr.add(new Job("e", 3, 15));
		System.out.println("Following is maximum profit sequence of jobs");
		new Job().printJobSequence(arr, 3);
    }
}
	