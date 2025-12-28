package javafundamentals;

public class Istatuscode {
   static String customerErr(int statuscode){

    switch (statuscode) {
        case 200:
            return "OK OK OK";
        case 400:
            return "Bad Request";
        case 401:
            return "Unauthorized";
        case 402:
            return "Payment Required";
        case 403:
            return "Forbidden";
        case 404:
            return "Not Found";
        case 500:
            return "Internal Server Error";
    }
    return "Unknown Status Code";
   }
    public static void main(String[] args) {
        System.out.println(customerErr(200));
        System.out.println(customerErr(401));
        System.out.println(customerErr(402));
        System.out.println(customerErr(403));
        System.out.println(customerErr(404));
        System.out.println(customerErr(500));
    }
}
