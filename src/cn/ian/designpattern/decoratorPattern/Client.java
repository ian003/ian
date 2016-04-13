package cn.ian.designpattern.decoratorPattern;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        // 第一次修饰
        component = new ConcreteDecorator1(component);
        // 第二次修饰
        component = new ConcreteDecorator2(component);
        // 修饰后运行
        component.operate();
        /*Component component1 = new ConcreteDecorator2(new ConcreteDecorator1(
                new ConcreteComponent()));
        component1.operate();*/
    }
}