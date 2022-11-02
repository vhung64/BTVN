package KTCuoiKhoa;

public class _1672 {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            if(result < temp){
                result = temp;
            }
        }
        return result;
    }
}
