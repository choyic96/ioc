package kr.co.ezenac.Ioc;


public class Main {

    public static void main(String[] args) {

        String url = "www.google.com/books/it?page=1000&name=springframework";

        Encoder encoder = new Encoder();
        String result = encoder.encode(url);
        System.out.println(result);
    }
}
