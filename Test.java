package original;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        for(int i=0;i<2;i++) {
            Doctor d1 = new Doctor();
            Doctor d2 = new Doctor();
            System.out.println("输入姓名，性别，年龄");
            Scanner x = new Scanner(System.in);
            String name = x.nextLine();
            String sex = x.nextLine();
            int age = x.nextInt();
            d1.setDoctor(name,sex,age);
            try {
                Scanner in = new Scanner(System.in);
                System.out.println(d1);
                System.out.println("请输入你的月工资：");
                double pay = in.nextDouble();
                d1.setPay(pay);
                System.out.println("请输入你的学费：");
                double fee = in.nextDouble();
                d1.setFee(fee);
                d1.setRatal();
                d2.setDoctor(name,sex,age);
            }catch (Exception in){
                System.out.println("输入有问题，再次输入");
                i--;
            }
        }
    }
}