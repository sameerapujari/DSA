class Solution {
    public double angleClock(int hour, int minutes) {
       // min hand 360 revo in 1 hour: 360/60 = 6 deg per min
       //hr hand does 1 revo in 12 hr 360/12 = 30 deg per hr and 30/60 = 0.5 deg per min
       hour %= 12;  //24hr clock

       double hrangle = (hour * 30) + (minutes * 0.5);
       double minangle = minutes * 6;
       double diff = Math.abs(hrangle-minangle);
       return Math.min(diff,360-diff); //note: we need smaller angle formeddd
    }
}