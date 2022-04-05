public enum Days {
    SUN("Sunday"),
    MON("Monday"),
    TUES("Tuesday"),
    WED("Wednesday"),
    THUR("Thursday"),
    FRI("Friday"),
    SAT("Saturday");
    
    String day;
    Days(String day){
        this.day = day;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "day is "+ this.day;
    }

    public static void main(String[] args) {
        System.out.println(Days.valueOf("SUN"));
    }
}
