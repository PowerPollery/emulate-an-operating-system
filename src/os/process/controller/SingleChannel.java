package os.process.controller;

import hardware.CPU;
import software.Software;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * 单道程序环境，不需要进程
 */
public class SingleChannel extends Thread{
    //外部提交过来的程序队列
    private LinkedBlockingQueue<Software> submitQueue = new LinkedBlockingQueue<>();

    public SingleChannel(){

    }

    @Override
    public void run() {
        while(true){
            try {
                Software software = submitQueue.take();
                int[] insArr = software.getInsArr();
                for (int iid:insArr){
                    CPU.exec(iid);
                }
                System.out.println(software.getName()+"已运行结束");
            } catch (InterruptedException e) {
                System.out.println("单道环境已停止");
                return;
            }
        }
    }

    //提交程序
    public void submit(Software software){
        try {
            submitQueue.put(software);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //开始从队列中读取程序
    public void channelServe(){
        this.start();
    }

    //停止线程
    public void channelStop(){
        this.interrupt();
    }
}
