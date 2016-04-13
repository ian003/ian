package cn.ian.designpattern.observerPattern;

public class ConcreteObserver implements Observer {
    // 实现更新方法
    @Override
    public void update(Subject subject, Object dto) {
        System.out.println("接收到信息， 并进行处理！ ");
    }
}