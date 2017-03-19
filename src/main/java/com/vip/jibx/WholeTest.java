package com.vip.jibx;

import org.jibx.runtime.*;

import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by jjliu on 2017/3/19.
 */
public class WholeTest {
    public static void main(String[] args){
        IBindingFactory factory = null;
        Account bean;
        bean = new Account();
        bean.setAddress("北京");
        bean.setEmail("jjliu_pub@hotmail.com");
        bean.setId(1);
        bean.setName("jack");
        final Birthday birthday = new Birthday("2000-11-11");
        bean.setBirthday(birthday);

        try {
            factory = BindingDirectory.getFactory(Account.class);
        } catch (JiBXException e) {
            e.printStackTrace();
        }

        StringWriter writer = new StringWriter();
        try {
            IMarshallingContext mctx = factory.createMarshallingContext();
            mctx.setIndent(2);
            mctx.marshalDocument(bean,"UTF-8",null,writer);
            System.out.println(writer);

            StringReader reader = new StringReader(writer.toString());
            IUnmarshallingContext umctx = factory.createUnmarshallingContext();
            Account acc = (Account) umctx.unmarshalDocument(reader, null);
            System.out.println(acc);

        } catch (JiBXException e) {
            e.printStackTrace();
        }

    }
}
