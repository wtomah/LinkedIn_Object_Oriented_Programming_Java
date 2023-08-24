public class PasswordMain {
    public static void main(String[] args) {
        PasswordChangeEvent eventOne = new PasswordChangeEvent("321");
        AccountTransferEvent eventTwo = new AccountTransferEvent("123");
        MissedPaymentEvent eventThree = new MissedPaymentEvent("700");

        Event[] events = {eventOne, eventTwo, eventThree};

        for (Event e: events) {
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();
        }
    }
}
