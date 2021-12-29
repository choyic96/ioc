package kr.co.ezenac.Ioc;


public class Main {

    public static void main(String[] args) {

        String url = "www.google.com/books/it?page=1000&name=springframework";

        //Base64 encoding
        IEncoder encoder = new Encoder();
        String result = encoder.encode(url);
        System.out.println(result);

        //url encoding
        IEncoder urlEncoder = new UrlEncoder();
        String urlResult = urlEncoder.encode(url);
        System.out.println(urlResult);

    }
}
