package cn.ian.designpattern.observerPattern;

//Observer可以被java.util.Observer接口替换
public interface Observer {
    // 更新方法
    // update() 参数可以为空，加参数为了业务逻辑处理
    // 观察者快速响应 ： 一是采用多线程技术，二是缓存技术
    public void update(Subject subject, Object dto);
}