package manito;

import java.util.Arrays;
import java.util.Random;

public class Manito {

    private String[] sender;  // "김연희", "김예준", "신지수", "이상현", "임주환", "정소망", "정지민", "한상화", "황수현"
    private String[] receiver;  // sender 와 동일
    private int num;    // 사람 숫자
    private int[][] send_receive;   // 마니또 배열. 왼쪽이 보내는 사람, 오른쪽이 받는 사람. send_receive[0][3] == 1이면, 0번이 3번에게 보냄. 또한, send_receive[0][i]와, send_receive[i][3]은 모두 0으로 설정. 그 외 초기값은 모두 -1


    public Manito() {
        this.sender = new String[]{"test1", "test2"};
        this.receiver = new String[]{"test1", "test2"};
        this.num = sender.length;

        send_receive = new int[num][num];
        for(int i = 0 ; i < num ; i++)
            Arrays.fill(send_receive[i], -1);

        for(int i = 0 ; i < num ; i++)
            send_receive[i][i] = 0;
    }
    public Manito(String[] name) {
        this.sender = name;
        this.receiver = name;
        this.num = name.length;

        send_receive = new int[num][num];
        for(int i = 0 ; i < num ; i++)
            Arrays.fill(send_receive[i], -1);

        for(int i = 0 ; i < num ; i++)
            send_receive[i][i] = 0;
    }

    public void makeManito() {
        Random rand = new Random();
        int i = 0;

        while(i < num)
        {
            int iValue = rand.nextInt(num);
            if(send_receive[i][iValue] != -1)
                continue;

            for(int j = 0 ; j < num ; j++)
            {
                send_receive[i][j] = 0;
                send_receive[j][iValue] = 0;
            }
            send_receive[i][iValue] = 1;
            i++;
        }
    }

    public void checkField() {
        System.out.println("This is check form");
        for(int i = 0 ; i < num ; i++)
        {
            for(int j = 0 ; j < num ; j++)
            {
                System.out.print(send_receive[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}
