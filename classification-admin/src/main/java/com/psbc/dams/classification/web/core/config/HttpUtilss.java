package com.psbc.dams.classification.web.core.config;



import com.psbc.dams.classification.common.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpUtilss {
    public static String sendJson(String url,String parm,String token) throws IOException {
        String body = "";
        int source = 1;
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost post = new HttpPost(url);
        StringEntity s = new StringEntity(parm, "UTF-8");
        System.out.println("参数："+parm);
        s.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE,"application/json"));
        post.setEntity(s);
        System.out.println("请求地址："+url);
        post.setHeader("Content-type","application/json");
        post.setHeader("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
        post.setHeader("Authorization",token);
        System.out.println("获取到的token："+token);
        CloseableHttpResponse execute = client.execute(post);
        System.out.println("execute:"+execute);
        HttpEntity entity = execute.getEntity();
        System.out.println(" entity:"+ entity);
        System.out.println(" entity.getContent():"+ entity.getContent());
        int statusCode = execute.getStatusLine().getStatusCode();
        System.out.println("状态："+statusCode);
        if (entity!=null){
            body  = EntityUtils.toString(entity);
            System.out.println("body:"+body);
        }
        EntityUtils.consume(entity);
        execute.close();
        return body;
    }
}


