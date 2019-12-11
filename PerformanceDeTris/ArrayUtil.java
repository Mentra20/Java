public class ArrayUtil {
	// M�thode qui echange l'�l�ment � l'indice i avec celui a l'indice j d'un tableau t. 
	public static void swap(int[] t,int i, int j) {
		int temp; 
		temp = t[i];
		t[i] = t[j];
		t[j] = temp;
	}
	
	// M�lange al�atoirement un tableau t.
	public static void shuffle(int[] t) {
		for(int i = t.length-1;i>0;i--) {
			int j = (int) (Math.random()*(i+1));
			swap(t,i,j);
		}
	}
	
	// Renvoie un tableau de longueur n remplie al�atoire d'entier de 0 � n-1.
	public static int[] getRandomArray(int n) {
		int[] t = new int[n];
		for(int i=0;i<n;i++) {
			t[i] = i;
		}
		//On le m�lange. 
		ArrayUtil.shuffle(t);
		return t;
	}
	
	// Renvoie une copie d'un tableau t donn� en entr�e.
	public static int[] copyTab(int[] t) {
		int[] copy = new int[t.length];
		for(int i=0;i<t.length;i++) {
			copy[i] = t[i];
		}
		return copy; 
	}
}