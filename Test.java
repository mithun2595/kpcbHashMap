/**
 * Created by mithuncd on 09/21/17.
 * testcases prelims
 */
public class Test {

    public static void main(String[] args) {

        KpcbHash myHash = new KpcbHash(5);

        String sample1 = "The2018KleinerPerkinsEngineeringFellowsProgramisopentooutstandingundergraduateandgraduatestudent";
        String sample2 = "AtKleinerPerkinsKPCBwepartnerwiththebrightestentrepreneurstoturndisruptiveideasintoworldchangingbusiness";

        for (int i = 0; i < sample1.length(); i+=2) {
            String key = sample1.substring(i, i+2);
            myHash.set(key, i);
        }

        System.out.println(myHash + "******** KPCB HASHMAP TEST *********");
        System.out.println("TESTING LOAD =======> "+myHash.load());

        for (int i = 0; i < sample1.length(); i+=2) {
            String key = sample1.substring(i, i+2);
            myHash.set(key, i*2);
        }

        System.out.println(myHash + "******** KPCB HASHMAP TEST *********");
        System.out.println("TESTING LOAD =======> "+myHash.load());

        for (int i = 0; i < sample1.length(); i+=2) {
            String key = sample1.substring(i, i+2);
            System.out.println("TESTING GET ======> "+myHash.get(key));
        }

        System.out.println(myHash + "******** KPCB HASHMAP TEST *********");
        System.out.println("TESTING LOAD =======> "+myHash.load());

        for (int i = 0; i < sample1.length(); i+=2)
            myHash.delete(sample1.substring(i,i+2));


        System.out.println(myHash + "******** KPCB HASHMAP TEST *********");
        System.out.println("TESTING LOAD =======> "+myHash.load());

        for (int i = 0; i < sample2.length(); i+=4)
            myHash.set(sample2.substring(i,i+4), i);

        System.out.println(myHash + "******** KPCB HASHMAP TEST *********");
        System.out.println("TESTING LOAD =======> "+myHash.load());
        System.out.println("\n DID I QUALIFY TO BE A KPCB FELLOW ^_^ ?");

    }

}