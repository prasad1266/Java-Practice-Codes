// Island of Isolation 
class First{
int a;
int b; 
Second s;
}

class Second{
int x;
First f;
	
}
class GarbageCollDemo{
	public static void main(String[] args){
	Fisrt f1 = new First();
	Second s1 = new Second();

	f1.s = s1;
	s1.f = f1
	}
}
