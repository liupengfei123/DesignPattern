package model;

public abstract class HummerModel {

    private boolean alarmFlag = true;

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    /**  设置是否 鸣笛
     *  默认不鸣笛
     * @return
     */
    protected boolean isAlarm(){
        return alarmFlag;
    }


    public void run(){
        this.start();
        this.engineBoom();

        if(this.isAlarm()){
            this.alarm();
        }
        this.stop();
    }



    /** 可以自行设置是否鸣笛
     * @param alarmFlag
     */
    public void setAlarmFlag(boolean alarmFlag){
        this.alarmFlag = alarmFlag;
    }
}
