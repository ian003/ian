package cn.ian.designpattern.decoratorPattern;

public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    private void decorate() {
        System.out.println("decorate 2");
    }

    @Override
    public void operate() {
        super.operate();
        decorate();
    }
}