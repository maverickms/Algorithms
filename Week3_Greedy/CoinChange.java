import java.util.Scanner;

class CoinChange {

	public int coinChange(int amount, int[] coins) {

        int count = 0, i = coins.length - 1;

        while(amount > 0 && i >= 0) {
            if(amount >= coins[i]) {
                amount -= coins[i];
                count++;
            } else
                i--;
        }

        if(amount != 0)
            return 0;
        else
            return count;
    }

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int amount = s.nextInt();
        int[] coins = {1, 5, 10};

        CoinChange obj = new CoinChange();
        System.out.println(obj.coinChange(amount, coins));
    }
}