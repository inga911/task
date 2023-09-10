public class Main {
    public static void main(String[] args) {
        int fromYear = 2010;
        int toYear = 2015;

        if (fromYear < toYear) {
            for (int i = fromYear; i <= toYear; i++) {
                int month = i / 100;
                int day = i % 100;

                //          year to string
                int toString = i;
                String s = String.valueOf(toString);

                //            splint into 2 parts
                final int middle = s.length() / 2;
                String[] parts = {s.substring(0, middle), s.substring(middle)};

                //            reverse day
                String strReverseDay = parts[0];
                byte[] strAsByteArrayDay = strReverseDay.getBytes();
                byte[] resultDay = new byte[strAsByteArrayDay.length];
                for (int a = 0; a < strAsByteArrayDay.length; a++) {
                    resultDay[a] = strAsByteArrayDay[strAsByteArrayDay.length - a - 1];
                }

                //            reverse month
                String strReverseMonth = parts[1];
                byte[] strAsByteArrayMonth = strReverseMonth.getBytes();
                byte[] resultMonth = new byte[strAsByteArrayMonth.length];
                for (int a = 0; a < strAsByteArrayMonth.length; a++) {
                    resultMonth[a] = strAsByteArrayMonth[strAsByteArrayMonth.length - a - 1];
                }
                //                month is <=12 && day is <= 31
                int m = Integer.parseInt(new String(resultMonth));
                int d = Integer.parseInt(new String(resultDay));
                if (1 <= m && m <= 12 && 1 <= d && d <= 31) {
                    System.out.println("-----");
                    System.out.println(i + " year");
                    System.out.println("New date: " + i + '-' + new String(resultMonth) + '-' + new String(resultDay));

                }
            }

        }else {
            for (int iDesc = fromYear; iDesc >= toYear; iDesc--) { // Descending order
                int monthDesc = iDesc / 100;
                int dayDesc = iDesc % 100;

                //          year to string
                int toStringDesc = iDesc;
                String s = String.valueOf(toStringDesc);

                //            splint into 2 parts
                final int middleDesc = s.length() / 2;
                String[] partsDesc = {s.substring(0, middleDesc), s.substring(middleDesc)};

                //            reverse day
                String strReverseDayDesc = partsDesc[0];
                byte[] strAsByteArrayDayDesc = strReverseDayDesc.getBytes();
                byte[] resultDayDesc = new byte[strAsByteArrayDayDesc.length];
                for (int a = 0; a < strAsByteArrayDayDesc.length; a++) {
                    resultDayDesc[a] = strAsByteArrayDayDesc[strAsByteArrayDayDesc.length - a - 1];
                }

                //            reverse month
                String strReverseMonthDesc = partsDesc[1];
                byte[] strAsByteArrayMonthDesc = strReverseMonthDesc.getBytes();
                byte[] resultMonthDesc = new byte[strAsByteArrayMonthDesc.length];
                for (int a = 0; a < strAsByteArrayMonthDesc.length; a++) {
                    resultMonthDesc[a] = strAsByteArrayMonthDesc[strAsByteArrayMonthDesc.length - a - 1];
                }

                //            month is <=12 && day is <= 31
                int mDesc = Integer.parseInt(new String(resultMonthDesc));
                int dDesc = Integer.parseInt(new String(resultDayDesc));
                if (1 <= mDesc && mDesc <= 12 && 1 <= dDesc && dDesc <= 31) {
                    System.out.println("-----");
                    System.out.println(iDesc + " year");
                    System.out.println("New date: " + iDesc + '-' + new String(resultMonthDesc) + '-' + new String(resultDayDesc));

                }
            }



        }
    }
}
