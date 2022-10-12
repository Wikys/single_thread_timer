public class timer {

    int period;
    int minute;
    int second;

    public timer(int minute, int second ,int period_ms){
        this.period = period_ms;
        this.minute = minute;
        this.second = second;
    }

    public void countdown() {
        while (true) {
        for (int i=this.second; this.second >= 0; this.second--) {
            if (this.second <= 0 && this.minute >0) { // 0초가되고 분이 아직 0분보다 많이남아있으면
                this.minute--; //분을 하나 빼주고
                this.second = 60; //초를 60으로 늘리고 넘어가라
            } else if (this.minute <= 0 && this.second <= 0) { //분과 초가 0이면
                System.out.println("타이머 종료"); // 나중에 리턴이든 구문을 없애든 해야할듯
                return; // 끝내라
            }
            try {Thread.sleep(this.period);
                System.out.println(this.minute+"분 "+this.second+"초");
            }
            catch (Exception e){}

        }
    }
    }
}
