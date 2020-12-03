package main;

import java.net.URLConnection;

public class PDFREpo {

    public static void main(String[] args) {

        getContentType("Text");



    }

    private static String getContentType(String fileName) {
        String result = URLConnection.guessContentTypeFromName(fileName);
        if (result == null) {
            if (fileName.endsWith(".xls")) {
                result = "application/vnd.ms-excel";
                System.out.println("application/vnd.ms-excel");
            } else {
                System.out.println("application/octet-stream");
                result = "application/octet-stream";
            }
        }

        return result;
    }
}
