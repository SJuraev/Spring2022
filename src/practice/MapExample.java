package practice;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

        public static void main(String[] args) {


            Map<String, String> domains = new HashMap<>();
            Map<String, String> centralAsia = new HashMap<>();

            domains.put("de", "Germany");
            domains.put("sk", "Slovakia");
            domains.put("us", "United States");
            domains.put("ru", "Russia");
            domains.put("hu", "Hungary");
            domains.put("pl", "Poland");
            domains.put("kgz", "Kyrgyzstan");
            domains.put("kz", "Kazakhstan");
            domains.put("uz", "Uzbekistan");

            centralAsia.put("kgz", "Kyrgyzstan");
            centralAsia.put("kz", "Kazakhstan");
            centralAsia.put("uz", "Uzbekistan");

            System.out.println(domains);
            System.out.println(centralAsia);

            domains.put("jpn", "Japan");
            domains.put("turk", "Turkistan");
            System.out.println(domains);

            MapExample mapExample = new MapExample();
            String a = "vwxy";
            String b = "abc";
            System.out.println(a.charAt(0));
            System.out.println(b.charAt(0));
            System.out.println(mapExample.mixString(a,b));

        }

        public String mixString(String a, String b) {
            String result = "";
            int iteration = 0;
            String lastPart = "";

            if (a.length() >= b.length()) {
                iteration = b.length();
                lastPart = a.substring(b.length());

                for (int i = 0; i < iteration; i++) {
                    result = result.concat(a.substring(i, i + 1)).concat(b.substring(i, i + 1));
                }
            }else
            if (a.length() < b.length()) {
                iteration = a.length();
                lastPart = b.substring(a.length());

            for (int i = 0; i < iteration; i++ ){
                result = result.concat(a.substring(i, i+1)).concat(b.substring(i, i+1));
            }
            }
            return result.concat(lastPart);
        }



    }

