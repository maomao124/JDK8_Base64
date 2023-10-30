package mao;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Project name(项目名称)：JDK8_Base64
 * Package(包名): mao
 * Class(类名): Test1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/10/29
 * Time(创建时间)： 14:09
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test1
{
    public static void main(String[] args)
    {
        String str = "hello";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        String encode = Base64.getEncoder().encodeToString(bytes);
        System.out.println(encode);
        str = "world";
        bytes = str.getBytes(StandardCharsets.UTF_8);
        encode = Base64.getEncoder().encodeToString(bytes);
        System.out.println(encode);
        str = "hello world 123456";
        bytes = str.getBytes(StandardCharsets.UTF_8);
        encode = Base64.getEncoder().encodeToString(bytes);
        System.out.println(encode);
        //aGVsbG8=
        //d29ybGQ=
        //aGVsbG8gd29ybGQgMTIzNDU2

        System.out.println(new String(Base64.getDecoder().decode(encode.getBytes(StandardCharsets.UTF_8))));
        System.out.println(new String(Base64.getUrlDecoder().decode(encode.getBytes(StandardCharsets.UTF_8))));
        System.out.println(new String(Base64.getDecoder().decode("aGVsbG8=".getBytes(StandardCharsets.UTF_8))));
    }
}
