package org.anandi.SWEN20003.workshops.workshop5.q3;

public class Main {

    public static void main(String[] args) {
        Request request = getRequest(args);
        System.out.println(request.getFullRequest());
    }

    private static Request getRequest(String[] args) {
        if (args.length == 0) {
            System.out.println("Must pass at least one argument.");
            System.exit(-1);
        } else if (args[0].equalsIgnoreCase("http")) {
            if (args.length < 4) {
                System.out.println("Must pass 4 arguments for HTTP.");
                System.exit(-1);
            } else {
                return new HttpRequest(args[1], args[3], args[2]);
            }
        } else if (args[0].equalsIgnoreCase("ftp")) {
            if (args.length < 3) {
                System.out.println("Must pass 3 arguments for FTP.");
                System.exit(-1);
            } else {
                return new FtpRequest(args[1], args[2]);
            }
        }
        return null;
    }
}
