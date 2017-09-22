/**
 * Created by mithuncd on 09/21/17.
 * testcases prelims
 */
public class Test {

    public static void main(String[] args) {

        KpcbHash myHash = new KpcbHash(5);

        String sample1 = "The 2018 Kleiner Perkins Engineering Fellows Program is open to outstanding undergraduate and graduate students enrolled at U.S. universities who are studying computer science, engineering, mathematics, physics or fields related to software development.";
        String sample2 = "At Kleiner Perkins (KPCB), we partner with the brightest entrepreneurs to turn disruptive ideas into world-changing businesses. We’ve helped build and accelerate growth at pioneering companies like Amazon, Google, Lending Club, Nest, Twitter, Uber, and Mandiant.";

        for (int i = 0; i < sample1.length(); i+=2) {
            String key = sample1.substring(i, i+2);
            myHash.set(key, i);
        }

        System.out.println(myHash + "\n******** KPCB HASHMAP TEST *********");

        for (int i = 0; i < sample1.length(); i+=2) {
            String key = sample1.substring(i, i+2);
            myHash.set(key, i*2);
        }

        System.out.println(myHash + "\n******** KPCB HASHMAP TEST *********");

        for (int i = 0; i < sample1.length(); i+=2) {
            String key = sample1.substring(i, i+2);
            System.out.println("\n TESTING GET ======> "+myHash.get(key));
        }

        System.out.println(myHash + "\n******** KPCB HASHMAP TEST *********");

        for (int i = 0; i < sample1.length(); i+=2)
            myHash.delete(sample1.substring(i,i+2));

        System.out.println("\n TESTING LOAD =======> "+myHash.load());
        System.out.println(myHash + "\n******** KPCB HASHMAP TEST *********");

        for (int i = 0; i < sample2.length(); i+=4)
            myHash.set(sample2.substring(i,i+4), i);

        System.out.println(myHash);
        System.out.println("\n DID I QUALIFY TO BE A KPCB FELLOW ^_^ ?");

    }

}