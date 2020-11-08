package original;

public class Doctor implements Student,Teacher{
	String name;
	String sex;
	int age;
	double fee;
    double pay;
    double ratal;
    public void setDoctor(String name,String sex,int age) {
    	this.name = name;
    	this.sex = sex;
        this.age = age;
    }



    public void setPay(double pay) {
        this.pay = pay * 12;
        System.out.println("年收入：" + this.pay);
    }

    public void getPay(double pay) {
        this.pay = pay * 12;
        System.out.println("年收入：" + this.pay);
    }

    public void setFee(double fee) {
        this.fee = fee;
        System.out.println("学费：" + this.fee);
    }

    public void getFee(double fee) {
        this.fee = fee;
        System.out.println("学费：" + this.fee);
    }
    

public void setRatal() {
    this.ratal = this.pay - this.fee ;
    if (ratal < 30000) {
        this.ratal = (this.pay - this.fee) * 0.03;
        System.out.println("纳税：" + this.ratal);
    } else if (ratal > 30000 && ratal < 120000) {
        this.ratal = ((this.pay - this.fee) - 30000) * 0.1 + 30000 * 0.03;
        System.out.println("纳税：" + this.ratal);
    } else if (ratal > 120000 && ratal < 250000) {
        this.ratal = ((this.pay - this.fee) - 120000) * 0.2 + 30000 * 0.03 + 120000 * 0.1;
        System.out.println("纳税：" + this.ratal);
    } else if (ratal > 350000) {
        this.ratal = (this.pay - this.fee) *0.3;
        System.out.println("纳税：" + this.ratal);
    }
}
    public String toString () {
        return "姓名" + name + '\n' + "年龄" + age + '\n' + "性别：" + sex;
    }



}


    