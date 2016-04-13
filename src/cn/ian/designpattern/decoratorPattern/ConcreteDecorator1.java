package cn.ian.designpattern.decoratorPattern;

public class ConcreteDecorator1 extends Decorator {
    // 定义被修饰者
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    // 定义自 己的修饰方法
    private void decorate() {
        System.out.println("decorate 1");
    }

    // 重写父类的Operation方法
    @Override
    public void operate() {
        decorate();
        super.operate();
    }
}