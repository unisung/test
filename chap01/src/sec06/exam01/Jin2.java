package sec06.exam01;

public class Jin2 {
public static void main(String[] args) {
	double x = 0.75;
	int j =0;
	double k = 0.0;
	
	k=x;
	System.out.println(x+"="+j+","+k);
	
//	k=x*2;
//	j=(int)k;
//	k = k - j;
//	x = k;
//	System.out.println(x+"="+j+","+k);
//    
//	k=x*2;
//	j=(int)k;
//	k = k - j;
//	System.out.println(x+"="+j+","+k);

	while(true) {
		k=x*2;
		j=(int)k;
		k = k - j;
		System.out.println(x+"="+j+","+k);
		if(k==0.0) break;
		x=k;
	}
	
	
	
	
}
}
