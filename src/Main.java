public class Main {
    public static void main(String[] args) {
        int fromYear = 2015;
        int toYear = 2010;

        if (fromYear < toYear) {
            for (int i = fromYear; i <= toYear; i++) {
                printBonusDatesBetween(i);
            }
        } else {
            for (int i = fromYear; i >= toYear; i--) {
                printBonusDatesBetween(i);
            }
        }
    }

    private static void printBonusDatesBetween(int date) {
        int month = date / 100;
        int year = date % 100;

        //          year to string
        int toStringDesc = date;
        String s = String.valueOf(toStringDesc);

        //            split into 2 parts
        final int middleDesc = s.length() / 2;
        String[] partsDesc = {s.substring(0, middleDesc), s.substring(middleDesc)};

        //            reverse day
        String reverseDay = partsDesc[0];
        byte[] strAsByteDay = reverseDay.getBytes();
        byte[] resultDayDesc = new byte[strAsByteDay.length];
        for (int a = 0; a < strAsByteDay.length; a++) {
            resultDayDesc[a] = strAsByteDay[strAsByteDay.length - a - 1];
        }

        //            reverse month
        String reverseMonth = partsDesc[1];
        byte[] strAsByteMonth = reverseMonth.getBytes();
        byte[] resultMonthDesc = new byte[strAsByteMonth.length];
        for (int a = 0; a < strAsByteMonth.length; a++) {
            resultMonthDesc[a] = strAsByteMonth[strAsByteMonth.length - a - 1];
        }

        //            month is <=12 && day is <= 31
        int reversedMonth = Integer.parseInt(new String(resultMonthDesc));
        int reversedDay = Integer.parseInt(new String(resultDayDesc));
        if (1 <= reversedMonth && reversedMonth <= 12 && 1 <= reversedDay && reversedDay <= 31) {
            System.out.println("-----");
            System.out.println(date + " year");
            System.out.println("New date: " + date + '-' + new String(resultMonthDesc) + '-' + new String(resultDayDesc));

        }
    }
}