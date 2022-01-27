package os.interact;

import os.process.controller.SingleChannel;
import software.SW1;

/**
 * 操作系统同用户交互接口
 * 用户只能通过这个对象访问操作系统
 */
public class Interactor {
    private SingleChannel singleChannel = new SingleChannel();

    public void test(){
        singleChannel.channelServe();
        singleChannel.submit(new SW1());
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        singleChannel.channelStop();
    }
}
