class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int a = 100; 
      int b = 999; 
            int R = a + (int) (Math.random() * b); 
            
      System.out.println("1-ое случайное число: " + R);
        int l=R%10;
        int m=(R/10)%10;
        int k=(R/100)%10;
        if(l>=m&l>k||l>m&l>=k){
            System.out.println("В числе "+R+" наибольшая цифра " +l);
        }
        else {
            if (m>l&m>=k) {
                System.out.println("В числе "+R+" наибольшая цифра " +m);
            }
            else {
                System.out.println("В числе "+R+" наибольшая цифра " +k);
            }
        }
	}
}