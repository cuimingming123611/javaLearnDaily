package template_exercise;

/**
 * @Author: MingmingCui
 * @Description:
 * @Date:16:02 2019-11-22
 */
public class HourlyEmployee extends Employee {

    private int wage;//每小时的工资
    private int hour;//月工作的小时数

    public HourlyEmployee(String name, int number, MyDate birthday,int wage,int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{"+super.toString()+"}";
    }
}
