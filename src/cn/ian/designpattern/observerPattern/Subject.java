package cn.ian.designpattern.observerPattern;

import java.util.Vector;

//Subject可以被java.util.Observable实现类替换
public abstract class Subject {
    // 定义一个观察者数组
    private Vector<Observer> obsVector = new Vector<Observer>();

    // 增加一个观察者
    public void addObserver(Observer o) {
        this.obsVector.add(o);
    }

    // 删除一个观察者
    public void delObserver(Observer o) {
        this.obsVector.remove(o);
    }

    // 通知所有观察者
    public void notifyObservers() {
        for (Observer o : this.obsVector) {
            o.update(this, null);
        }
    }
}