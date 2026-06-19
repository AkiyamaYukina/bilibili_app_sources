package com.bilibili.sistersplayer.httpserver;

import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/httpserver/Tester.class */
public class Tester {
    public static final long LENGTH = 8388608;
    public static final String URL = "http://20.254.1.9/PLTV/88888888/224/3221225703/10000100000000060000000000035351_0.smil";
    public static final String URL_HTTP = "http://20.254.1.9/PLTV/88888888/224/3221225703/10000100000000060000000000035351_0.smil";

    public static void main(String[] strArr) throws Throwable {
        String str;
        String str2 = (strArr == null || strArr.length <= 0) ? "http://20.254.1.9/PLTV/88888888/224/3221225703/10000100000000060000000000035351_0.smil" : strArr[0];
        if (strArr == null || strArr.length <= 1) {
            str = "/tmp/" + str2.substring(0, str2.indexOf(58)) + ".ts";
        } else {
            str = strArr[1];
        }
        testClient(str2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
    public static void testClient(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        SimpleHttpClient simpleHttpClient = new SimpleHttpClient();
        Object obj = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(str2);
                try {
                    simpleHttpClient.open(str);
                    byte[] bArr = new byte[16384];
                    long j7 = 0;
                    while (j7 < 8388608) {
                        int i7 = simpleHttpClient.read(bArr, 0, 16384);
                        System.out.println("Read: " + i7);
                        if (i7 > 0) {
                            fileOutputStream2.write(bArr, 0, i7);
                            j7 += (long) i7;
                        } else if (i7 < 0) {
                            break;
                        }
                    }
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Saved to: ");
                    sb.append(str2);
                    printStream.println(sb.toString());
                    SimpleBaseClient.closeSilently(fileOutputStream2);
                    obj = sb;
                } catch (IOException e7) {
                    e = e7;
                    fileOutputStream = fileOutputStream2;
                    obj = fileOutputStream;
                    e.printStackTrace();
                    SimpleBaseClient.closeSilently(fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    obj = fileOutputStream2;
                    SimpleBaseClient.closeSilently((Closeable) obj);
                    simpleHttpClient.close();
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
                fileOutputStream = null;
            }
            simpleHttpClient.close();
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
