package original;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        for(int i=0;i<2;i++) {
            Doctor d1 = new Doctor();
            Doctor d2 = new Doctor();
            System.out.println("�����������Ա�����");
            Scanner x = new Scanner(System.in);
            String name = x.nextLine();
            String sex = x.nextLine();
            int age = x.nextInt();
            d1.setDoctor(name,sex,age);
            try {
                Scanner in = new Scanner(System.in);
                System.out.println(d1);
                System.out.println("����������¹��ʣ�");
                double pay = in.nextDouble();
                d1.setPay(pay);
                System.out.println("���������ѧ�ѣ�");
                double fee = in.nextDouble();
                d1.setFee(fee);
                d1.setRatal();
                d2.setDoctor(name,sex,age);
            }catch (Exception in){
                System.out.println("���������⣬�ٴ�����");
                i--;
            }
        }
    }
}