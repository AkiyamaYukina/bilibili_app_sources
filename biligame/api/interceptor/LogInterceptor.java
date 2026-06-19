package com.bilibili.biligame.api.interceptor;

import android.util.Log;
import androidx.constraintlayout.motion.widget.p;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Objects;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/interceptor/LogInterceptor.class */
public final class LogInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LogLevel f62167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorLevel f62168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f62169c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/interceptor/LogInterceptor$ColorLevel.class */
    public enum ColorLevel {
        VERBOSE,
        DEBUG,
        INFO,
        WARN,
        ERROR
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/interceptor/LogInterceptor$LogLevel.class */
    public enum LogLevel {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/interceptor/LogInterceptor$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f62170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f62171b;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:34:0x008e
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                com.bilibili.biligame.api.interceptor.LogInterceptor$ColorLevel[] r0 = com.bilibili.biligame.api.interceptor.LogInterceptor.ColorLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.bilibili.biligame.api.interceptor.LogInterceptor.a.f62171b = r0
                r0 = r4
                com.bilibili.biligame.api.interceptor.LogInterceptor$ColorLevel r1 = com.bilibili.biligame.api.interceptor.LogInterceptor.ColorLevel.VERBOSE     // Catch: java.lang.NoSuchFieldError -> L76
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L76
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L76
            L14:
                int[] r0 = com.bilibili.biligame.api.interceptor.LogInterceptor.a.f62171b     // Catch: java.lang.NoSuchFieldError -> L76 java.lang.NoSuchFieldError -> L7a
                com.bilibili.biligame.api.interceptor.LogInterceptor$ColorLevel r1 = com.bilibili.biligame.api.interceptor.LogInterceptor.ColorLevel.INFO     // Catch: java.lang.NoSuchFieldError -> L7a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7a
            L1f:
                int[] r0 = com.bilibili.biligame.api.interceptor.LogInterceptor.a.f62171b     // Catch: java.lang.NoSuchFieldError -> L7a java.lang.NoSuchFieldError -> L7e
                com.bilibili.biligame.api.interceptor.LogInterceptor$ColorLevel r1 = com.bilibili.biligame.api.interceptor.LogInterceptor.ColorLevel.DEBUG     // Catch: java.lang.NoSuchFieldError -> L7e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7e
            L2a:
                int[] r0 = com.bilibili.biligame.api.interceptor.LogInterceptor.a.f62171b     // Catch: java.lang.NoSuchFieldError -> L7e java.lang.NoSuchFieldError -> L82
                com.bilibili.biligame.api.interceptor.LogInterceptor$ColorLevel r1 = com.bilibili.biligame.api.interceptor.LogInterceptor.ColorLevel.ERROR     // Catch: java.lang.NoSuchFieldError -> L82
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L82
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L82
            L35:
                int[] r0 = com.bilibili.biligame.api.interceptor.LogInterceptor.a.f62171b     // Catch: java.lang.NoSuchFieldError -> L82 java.lang.NoSuchFieldError -> L86
                com.bilibili.biligame.api.interceptor.LogInterceptor$ColorLevel r1 = com.bilibili.biligame.api.interceptor.LogInterceptor.ColorLevel.WARN     // Catch: java.lang.NoSuchFieldError -> L86
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L86
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L86
            L40:
                com.bilibili.biligame.api.interceptor.LogInterceptor$LogLevel[] r0 = com.bilibili.biligame.api.interceptor.LogInterceptor.LogLevel.values()     // Catch: java.lang.NoSuchFieldError -> L86
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.bilibili.biligame.api.interceptor.LogInterceptor.a.f62170a = r0
                r0 = r4
                com.bilibili.biligame.api.interceptor.LogInterceptor$LogLevel r1 = com.bilibili.biligame.api.interceptor.LogInterceptor.LogLevel.NONE     // Catch: java.lang.NoSuchFieldError -> L8a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8a
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8a
            L54:
                int[] r0 = com.bilibili.biligame.api.interceptor.LogInterceptor.a.f62170a     // Catch: java.lang.NoSuchFieldError -> L8a java.lang.NoSuchFieldError -> L8e
                com.bilibili.biligame.api.interceptor.LogInterceptor$LogLevel r1 = com.bilibili.biligame.api.interceptor.LogInterceptor.LogLevel.BASIC     // Catch: java.lang.NoSuchFieldError -> L8e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8e
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8e
            L5f:
                int[] r0 = com.bilibili.biligame.api.interceptor.LogInterceptor.a.f62170a     // Catch: java.lang.NoSuchFieldError -> L8e java.lang.NoSuchFieldError -> L92
                com.bilibili.biligame.api.interceptor.LogInterceptor$LogLevel r1 = com.bilibili.biligame.api.interceptor.LogInterceptor.LogLevel.HEADERS     // Catch: java.lang.NoSuchFieldError -> L92
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L92
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L92
            L6a:
                int[] r0 = com.bilibili.biligame.api.interceptor.LogInterceptor.a.f62170a     // Catch: java.lang.NoSuchFieldError -> L92 java.lang.NoSuchFieldError -> L96
                com.bilibili.biligame.api.interceptor.LogInterceptor$LogLevel r1 = com.bilibili.biligame.api.interceptor.LogInterceptor.LogLevel.BODY     // Catch: java.lang.NoSuchFieldError -> L96
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L96
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L96
            L75:
                return
            L76:
                r4 = move-exception
                goto L14
            L7a:
                r4 = move-exception
                goto L1f
            L7e:
                r4 = move-exception
                goto L2a
            L82:
                r4 = move-exception
                goto L35
            L86:
                r4 = move-exception
                goto L40
            L8a:
                r4 = move-exception
                goto L54
            L8e:
                r4 = move-exception
                goto L5f
            L92:
                r4 = move-exception
                goto L6a
            L96:
                r4 = move-exception
                goto L75
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.api.interceptor.LogInterceptor.a.m6546clinit():void");
        }
    }

    public static void a(StringBuffer stringBuffer, Request request, Connection connection) {
        String strDecode;
        stringBuffer.append("method: ");
        stringBuffer.append(request.method());
        stringBuffer.append("\n");
        stringBuffer.append("url: ");
        try {
            strDecode = URLDecoder.decode(request.url().toString(), "utf-8");
        } catch (UnsupportedEncodingException e7) {
            e7.printStackTrace();
            strDecode = "";
        }
        stringBuffer.append(strDecode);
        stringBuffer.append("\n");
        stringBuffer.append("tag: ");
        stringBuffer.append(request.tag());
        stringBuffer.append("\n");
        stringBuffer.append("protocol:  ");
        if (connection != null) {
            stringBuffer.append(connection.protocol());
        } else {
            stringBuffer.append(Protocol.HTTP_1_1);
        }
        stringBuffer.append("\n");
    }

    public static void b(StringBuffer stringBuffer, Response response) {
        String strDecode;
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Long.valueOf(response.sentRequestAtMillis()));
        stringBuffer.append("response protocol: ");
        stringBuffer.append(response.protocol());
        stringBuffer.append("\n");
        stringBuffer.append("response code: ");
        stringBuffer.append(response.code());
        stringBuffer.append("\n");
        stringBuffer.append("response message: ");
        stringBuffer.append(response.message());
        stringBuffer.append("\n");
        stringBuffer.append("response request Url: ");
        try {
            strDecode = URLDecoder.decode(response.request().url().toString(), "utf-8");
        } catch (UnsupportedEncodingException e7) {
            e7.printStackTrace();
            strDecode = "";
        }
        stringBuffer.append(strDecode);
        stringBuffer.append("\n");
        stringBuffer.append("response sentRequestTime:");
        stringBuffer.append(str);
        stringBuffer.append("\n");
    }

    public static void c(StringBuffer stringBuffer, Request request, Connection connection) {
        a(stringBuffer, request, connection);
        Headers headers = request.headers();
        for (int i7 = 0; i7 < headers.size(); i7++) {
            stringBuffer.append(p.a("request Header: ", headers.name(i7), "=", headers.value(i7), "\n"));
        }
    }

    public static void d(StringBuffer stringBuffer, Response response) {
        b(stringBuffer, response);
        Headers headers = response.headers();
        for (int i7 = 0; i7 < headers.size(); i7++) {
            stringBuffer.append("response Header:");
            stringBuffer.append(headers.name(i7));
            stringBuffer.append(" = ");
            stringBuffer.append(headers.value(i7));
            stringBuffer.append("\n");
        }
    }

    public final void e(String str) {
        int i7 = a.f62171b[this.f62168b.ordinal()];
        String str2 = this.f62169c;
        if (i7 == 2) {
            Log.i(str2, str);
        } else if (i7 == 4) {
            Log.e(str2, str);
        } else {
            if (i7 != 5) {
                return;
            }
            Log.w(str2, str);
        }
    }

    public final Response intercept(Interceptor.Chain chain) throws IOException {
        String utf8;
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        if (responseProceed.isSuccessful()) {
            LogLevel logLevel = LogLevel.NONE;
            LogLevel logLevel2 = this.f62167a;
            if (logLevel2 == logLevel) {
                return responseProceed;
            }
            Connection connection = chain.connection();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("  \n>>>>>>>>>>>>>>>>>>>>>>>>>>request>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
            int i7 = a.f62170a[logLevel2.ordinal()];
            if (i7 == 2) {
                a(stringBuffer, request, connection);
            } else if (i7 == 3) {
                c(stringBuffer, request, connection);
            } else if (i7 == 4) {
                c(stringBuffer, request, connection);
                stringBuffer.append("RequestBody: ");
                try {
                    Request requestBuild = request.newBuilder().build();
                    Buffer buffer = new Buffer();
                    RequestBody requestBodyBody = requestBuild.body();
                    if (requestBodyBody != null) {
                        requestBodyBody.writeTo(buffer);
                    }
                    utf8 = buffer.readUtf8();
                } catch (IOException e7) {
                    utf8 = "error";
                }
                Objects.requireNonNull(utf8);
                stringBuffer.append(utf8);
                stringBuffer.append("\n");
            }
            stringBuffer.append("--------------------------------------------------------------------");
            e(stringBuffer.toString());
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("  \n<<<<<<<<<<<<<<<<<<<<<<<<Response<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
            int i8 = a.f62170a[logLevel2.ordinal()];
            if (i8 == 2) {
                b(stringBuffer2, responseProceed);
            } else if (i8 == 3) {
                d(stringBuffer2, responseProceed);
            } else if (i8 == 4) {
                d(stringBuffer2, responseProceed);
                try {
                    stringBuffer2.append("response body:\n".concat(new String(responseProceed.peekBody(1048576L).bytes(), Charset.defaultCharset())));
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            stringBuffer2.append("\n--------------------------------------------------------------------");
            stringBuffer2.append("\r\n\r");
            e(stringBuffer2.toString());
        } else {
            e(responseProceed.message());
        }
        return responseProceed;
    }
}
