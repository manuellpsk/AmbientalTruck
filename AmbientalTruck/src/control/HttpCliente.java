package control;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public class HttpCliente {

    public HttpCliente(){
        
    }
    
    public static String getDato(){
        try {
            
            HttpCliente hce = new HttpCliente();
            String body = hce.get("https://api.thingspeak.com/channels/795370/feeds.json?api_key=UDX4JKN3YVXUKT78&results=1");
            //System.out.println(body);
            return json(body);
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
        return null;
    }
    
    
    private static String json(String cadena){
        JSONObject json = new JSONObject(cadena);
        JSONObject resultado;
        JSONArray feeds=(JSONArray)json.getJSONArray("feeds");
        Iterator<Object> iterator = feeds.iterator();
        while(iterator.hasNext()){
            resultado=new JSONObject(iterator.next().toString());
            double t,p;
            if(resultado.isNull("field1")){
                t=0;
            }else{
                t=resultado.getDouble("field1");
            }
            if(resultado.isNull("field2")){
                p=0;
            }else{
                p=resultado.getDouble("field2");
            }
            return t+"-"+p;
        }
        return null;
    }
    public String get(String getUrl) throws IOException {
        URL url = new URL(getUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        return this.read(con.getInputStream());
    }

    private String read(InputStream is) throws IOException {
        BufferedReader in = null;
        String inputLine;
        StringBuilder body;
        try {
            in = new BufferedReader(new InputStreamReader(is));

            body = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                body.append(inputLine);
            }
            in.close();

            return body.toString();
        } catch(IOException ioe) {
            throw ioe;
        } finally {
            this.closeQuietly(in);
        }
    }

    protected void closeQuietly(Closeable closeable) {
        try {
            if( closeable != null ) {
                closeable.close();
            }
        } catch(IOException ex) {

        }
    }
    
}
