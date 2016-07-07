package CygnusTest;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;

import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Neo on 2016-07-01.
 */
public class Base64EncDecTest {
    private static double START_TIME = 0; //시작시간
    private static double DURATION = 0; //실행시간
    private static long LOOP = 10000; //반복횟수

    static byte[] EXAMPLE = null;

    private static void start(String text) {
        //System.out.println("\n\n===== Start " + text + " ===== ");
        START_TIME = System.nanoTime();
    }

    private static double end() {
        DURATION = (System.nanoTime() - START_TIME) / 1000000.0;
        DURATION = (Math.floor(DURATION*1000)/1000);
        float countPerSec = 0;
        if(DURATION < 1000)  countPerSec = LOOP;
        else countPerSec = LOOP/(Math.round(DURATION/100)/10);

        //System.out.println("===== " + DURATION+" ms / avg : "+countPerSec+" cnt/s =====");
        //System.out.println("===== End ===== ");
        return DURATION;
    }
    private static String byte2String(byte[] bytes){
        String result = new String(bytes);
        return result;
    }

    private static String base64Enc(byte[] bytes){
        return Base64.encode(bytes);
    }

    private static byte[] base64Dec(String encStr) throws Base64DecodingException {
        return Base64.decode(encStr);
    }

    private static String base64EncToJavax(byte[] bytes) { return DatatypeConverter.printBase64Binary(bytes); }

    private static byte[] base64DecToJavax(String encStr) { return DatatypeConverter.parseBase64Binary(encStr); }

    public static void main(String[] args) throws Base64DecodingException, IOException {

        String[] fileLists = new String[] {"5K", "10k", "30k", "50k", "100k", "500k"};
        String testStr= "This is Encoding Test!!!!";
        String testEnc= "";
        String testEncJavax= "";
        byte[] testDecByte= null;
        byte[] testDecJavaxByte= null;

        System.out.println("##################################################");
        System.out.println("LOOP Counte = "+LOOP);


        System.out.println("##################################################");
        System.out.println("testStr.getBytes()::"+testStr.getBytes());
        //Test Enc
        testEnc= base64Enc(testStr.getBytes());
        testEncJavax= base64EncToJavax(testStr.getBytes());

        if(testEnc.equals(testEncJavax)) System.out.println("testEnc == testEncJavax  >>> ok!");
        //System.out.println("base64Enc::"+testEnc);
        //System.out.println("base64EncJavaX::"+testEncJavax);

        //Compare Dec
        testDecByte = base64Dec(testEnc);
        testDecJavaxByte = base64DecToJavax(testEncJavax);
        String testGetStr = new String(testDecByte);
        String testGetStrJavax = new String(testDecJavaxByte);

        if(testGetStr.equals(testGetStrJavax)) System.out.println("testDecByte == testDecJavaxByte  >>> ok!");
        //System.out.println("base64Dec::"+testGetStr);
       // System.out.println("base64DecJavaX::"+testGetStrJavax);
        System.out.println("#############################################################################");
        System.out.println("### seq,path,noBase64,a-Base64Enc, a-Base64Dec, jx-Base64Enc, js-Base64Dec###");
        System.out.println("#############################################################################");
        for(int analCnt = 0; analCnt < 20; analCnt++) {

            for(String fl : fileLists ) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sbSize = new StringBuilder();

                Path path = Paths.get(fl+".txt");
                EXAMPLE = Files.readAllBytes(path);
                sb.append(analCnt+","+path+",");

                //Not Base64 Encodeing Text
                start(analCnt+"::: No Base64 Enc");
                for (int i = 0; i < LOOP; i++) byte2String(EXAMPLE);
                sb.append(end()+",");


                // Base64 Encodeing Text
                start(analCnt+"::: Base64 Encoding...");
                String encStr = "";
                for (int i = 0; i < LOOP; i++) encStr = base64Enc(EXAMPLE);
                sb.append(end()+",");
                sbSize.append(encStr.length()+",");

                // Base64 Decodeing Text
                start(analCnt+"::: Base64 Decoding...");
                for (int i = 0; i < LOOP; i++) base64Dec(encStr);
                sb.append(end()+",");


                // Base64 Encodeing Text
                start(analCnt+"::: Base64Javax Encoding...");
                String encStrJavax = "";
                for (int i = 0; i < LOOP; i++) encStrJavax = base64EncToJavax(EXAMPLE);
                sb.append(end()+",");
                sbSize.append(encStrJavax.length()+"||");

                // Base64 Decodeing Text
                start(analCnt+"::: Base64Javax Decoding...");
                for (int i = 0; i < LOOP; i++) base64DecToJavax(encStrJavax);
                sb.append(end()+"||");
                sb.append(sbSize);

                System.out.println(sb);
            }
        }
    }
}
