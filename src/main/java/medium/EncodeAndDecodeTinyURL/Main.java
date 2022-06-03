package medium.EncodeAndDecodeTinyURL;

public class Main {
    public static void main(String[] args) {
        String input = "https://leetcode.com/problems/design-tinyurl";
        Codec codec = new Codec();
        String encode = codec.encode(input);
        System.out.println("Encode " + encode);
        System.out.println("Decode " + codec.decode(encode));
    }
}
