package com.sjpfan.httpclient.demo;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class TestDemo {

    @Test
    public void getTest() throws IOException {
        String result;
        String new_result;
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet httpget = new HttpGet("http://www.baidu.com");
        CloseableHttpResponse response = client.execute(httpget);
        try {
            HttpEntity entity = response.getEntity();
            result = EntityUtils.toString(entity);
            System.out.println(result);
            EntityUtils.consume(entity);
        } finally {
            response.close();
        }

    }

    @Test
    public void postTest() throws IOException {
        String result;
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost post = new HttpPost("http://56yunjia.com/service/PUser_L?_mt=json");
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add(new BasicNameValuePair("userLoginName","******"));
        nvps.add(new BasicNameValuePair("userPassword","******"));
        post.setEntity(new UrlEncodedFormEntity(nvps));
        CloseableHttpResponse response = client.execute(post);
        try {
            result = EntityUtils.toString(response.getEntity());
            System.out.println(result);
            System.out.println("=============++++++++++++========"+response.getStatusLine());
        }finally {
            response.close();
        }


    }

    @Test
    //使用fluent 的API
    public void simpleGetTest() throws IOException {
        Content content = Request.Get("http://www.baidu.com").execute().returnContent();
        System.out.println(content);
    }

    @Test
    public void simplePostTest() throws IOException {
        try {
            Content content = Request.Post("http://56yunjia.com/service/PUser_L?_mt=json")
                    .bodyForm(Form.form().add("userLoginName","******").add("userPassword","******").build())
                    .execute().returnContent();
            System.out.println(content.asString());
        }catch (HttpResponseException e){
            e.printStackTrace();
        }

    }

}
