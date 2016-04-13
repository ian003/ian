package cn.ian.designpattern.decoratorPattern;

public class Decorator extends Component {
    private Component component;

    // 通过构造函数传递被修饰者
    public Decorator(Component component) {
        this.component = component;
    }

    // 委托给被修饰者执行
    @Override
    public void operate() {
        component.operate();
    }
}