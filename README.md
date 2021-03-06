# JavaShiyanSI
### 实验四

# 一、实验目的

#### 掌握Java中抽象类和抽象方法的定义。

#### 掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法。

#### 了解异常的使用方法，并在程序中根据输入情况做异常处理。


# 二、实验内容

#### 某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。

#### 此时，该博士研究生有双重身份：学生和助教教师。

#### 设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。

#### 设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。

#### 编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额。


# 三、实验要求

#### 在博士研究生类中实现各个接口定义的抽象方法;

#### 对年学费和年收入进行统计，用收入减去学费，求得纳税额；

#### 国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static final修饰定义。

#### 实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。

#### 根据输入情况，要在程序中做异常处理。


# 四、实验步骤

#### 1.使用interface将Student和Teacher接口写好。

#### 2.建立Doctor类，使用implements。

#### 3.搜索国家纳税标准，并将其写进Doctor里。

#### 4.用for循环循环变量。

#### 5.使用try-catch方法做异常处理，完成程序。


# 五、核心代码

#### try {
####                 Scanner in = new Scanner(System.in);
####                 System.out.println(d1);
####                 System.out.println("请输入你的月工资：");
####                 double pay = in.nextDouble();
####                 d1.setPay(pay);
####                 System.out.println("请输入你的学费：");
####                 double fee = in.nextDouble();
####                 d1.setFee(fee);
####                 d1.setRatal();
####                 d2.setDoctor(name,sex,age);
####             }catch (Exception in){
####                 System.out.println("输入有问题，再次输入");
####                 i--;
####             }
            

# 六、实验结果

#### ![实验结果](https://github.com/GuoRuChang-226/JavaShiyanSI/blob/main/24991850da038e6de8eb15fce0484d2.png)


# 七、实验感想

#### 我知道了interface用来定义接口，而implement是实现接口，了解了try-catch异常处理。
