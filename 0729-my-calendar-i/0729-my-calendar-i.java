class MyCalendar {
    ArrayList<int[]> bookings;

    public MyCalendar() {
        bookings = new ArrayList<>();
    }
    
    public boolean book(int startTime, int endTime) {

        for(int[] interval : bookings) {
            int start = interval[0];
            int end = interval[1];

            // Overlap condition
            if(startTime < end && endTime > start) {
                return false;
            }
        }

        bookings.add(new int[]{startTime, endTime});
        return true;
    }
}