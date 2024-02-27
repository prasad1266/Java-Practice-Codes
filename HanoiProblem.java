class HanoiProblem{
public static void toh(int n,char s, char iter,char d){
if(n==1){
System.out.println("Disk From Text "+s+" to "+d);
	}
	else{
	toh(n-1,s,d,iter);
	System.out.println("Disk from Text "+s+" To "+d);
	toh(n-1,iter,s,d);
		}

	}
public static void main(String[] args){
int n=3;
toh(n,'A','B','C');
	}
}