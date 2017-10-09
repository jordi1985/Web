package edu.upc.eseiaat.pma.web;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.StringTokenizer;

import static java.lang.System.in;

/**
 * Created by Jordi1985 on 9/10/17.
 */

public class WebReader {
    public static String getUrl(String surl){
        String error= "Error: ";
        try {
            URL url= new URL(surl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            if (conn.getResponseCode()!= HttpURLConnection.HTTP_OK){
                return error + conn.getResponseMessage();
            }
            InputStream in= conn.getInputStream();
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            copyBytes(in,out);
            out.close();
            return out.toString();
        } catch (MalformedURLException e) {
            return error + e.toString();
        } catch (IOException e) {
            return error + e.toString();
        }
private static void copyBytes(InputStream in, ByteArrayOutputStream out)throws IOException{

        byte [] bytes = new byte[1024];
        int nbytes = in.read(bytes);
        while(nbytes>0){
            out.write(bytes,0,nbytes);
            nbytes = in.read(bytes);
        }

    }
    }
}
