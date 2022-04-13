import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.xml.sax.InputSource;

public class HttpClientz {
    public static void main(String[] args) {
      try{
        URL url = new URL("https://www.google.com");
        URLConnection conn =  url.openConnection();
        InputStream str = conn.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(str));
        String response =" ";
        System.out.println("getting response......");
        while((response = br.readLine()) != null){
            System.out.println(response);
        }
        
      }catch(Exception e){
          e.printStackTrace();
      }
    }
}
