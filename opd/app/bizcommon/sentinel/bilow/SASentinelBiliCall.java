package com.bilibili.opd.app.bizcommon.sentinel.bilow;

import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import com.bilibili.api.base.util.NetworkManager;
import com.bilibili.api.base.util.Types;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.okretro.BiliApiParseException;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.okretro.converter.IParser;
import com.bilibili.okretro.interceptor.IRequestInterceptor;
import com.bilibili.opd.app.sentinel.SentinelXXX;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Converter;
import retrofit2.Response;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/bilow/SASentinelBiliCall.class */
public class SASentinelBiliCall<T> extends BiliCall<T> {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f74453D = JSON.DEFAULT_PARSER_FEATURE | Feature.DisableSpecialKeyDetect.mask;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Map<Type, ParameterizedType> f74454E = new HashMap(1024);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f74455A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f74456B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f74457C;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f74458q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final BiliCall<T> f74459r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SentinelXXX f74460s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<com.bilibili.opd.app.bizcommon.sentinel.bilow.a> f74461t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Annotation[] f74462u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Type f74463v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Converter f74464w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f74465x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f74466y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f74467z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/bilow/SASentinelBiliCall$a.class */
    public final class a implements IParser {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SASentinelBiliCall f74468a;

        public a(SASentinelBiliCall sASentinelBiliCall) {
            this.f74468a = sASentinelBiliCall;
        }

        @Override // com.bilibili.okretro.converter.IParser
        public final Object convert(Object obj) throws IOException {
            return this.f74468a.f74464w.convert(obj);
        }

        @Override // com.bilibili.okretro.converter.IParser
        @NonNull
        public final Object convert(ResponseBody responseBody) throws IOException, RuntimeException {
            return null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/bilow/SASentinelBiliCall$b.class */
    public final class b implements Callback<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SASentinelBiliCall f74469a;

        public b(SASentinelBiliCall sASentinelBiliCall) {
            this.f74469a = sASentinelBiliCall;
        }

        public final void onFailure(Call<T> call, Throwable th) {
            int i7 = SASentinelBiliCall.f74453D;
            this.f74469a.f(null, th);
        }

        public final void onResponse(Call<T> call, Response<T> response) {
            int i7 = SASentinelBiliCall.f74453D;
            this.f74469a.f(response, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/bilow/SASentinelBiliCall$c.class */
    public final class c implements Callback<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Callback f74470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SASentinelBiliCall f74471b;

        public c(SASentinelBiliCall sASentinelBiliCall, Callback callback) {
            this.f74471b = sASentinelBiliCall;
            this.f74470a = callback;
        }

        public final void onFailure(Call<T> call, Throwable th) {
            int i7 = SASentinelBiliCall.f74453D;
            this.f74471b.f(null, th);
            this.f74470a.onFailure(call, th);
        }

        public final void onResponse(Call<T> call, Response<T> response) {
            int i7 = SASentinelBiliCall.f74453D;
            this.f74471b.f(response, null);
            this.f74470a.onResponse(call, response);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/bilow/SASentinelBiliCall$d.class */
    public final class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Response f74472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f74473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SASentinelBiliCall f74474c;

        public d(SASentinelBiliCall sASentinelBiliCall, Response response, Throwable th) {
            this.f74474c = sASentinelBiliCall;
            this.f74472a = response;
            this.f74473b = th;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                SASentinelBiliCall.b(this.f74474c, this.f74472a, this.f74473b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/bilow/SASentinelBiliCall$e.class */
    public final class e<T> implements Converter<ResponseBody, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f74475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SASentinelBiliCall f74476b;

        public e(SASentinelBiliCall sASentinelBiliCall, Type type) {
            this.f74476b = sASentinelBiliCall;
            this.f74475a = type;
        }

        public final Object convert(Object obj) throws IOException {
            ResponseBody responseBody = (ResponseBody) obj;
            SASentinelBiliCall sASentinelBiliCall = this.f74476b;
            if (sASentinelBiliCall.f74467z == 0) {
                sASentinelBiliCall.f74467z = SystemClock.elapsedRealtime();
            }
            String strString = responseBody.string();
            sASentinelBiliCall.f74456B = strString == null ? null : Uri.encode(strString);
            sASentinelBiliCall.f74457C = strString == null ? sASentinelBiliCall.f74457C : strString.length();
            Object object = JSON.parseObject(strString, this.f74475a, SASentinelBiliCall.f74453D, new Feature[0]);
            if (sASentinelBiliCall.f74455A == 0) {
                sASentinelBiliCall.f74455A = SystemClock.elapsedRealtime();
            }
            return object;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/bilow/SASentinelBiliCall$f.class */
    public final class f<T> implements Converter<ResponseBody, GeneralResponse<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f74477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SASentinelBiliCall f74478b;

        public f(SASentinelBiliCall sASentinelBiliCall, Type type) {
            this.f74478b = sASentinelBiliCall;
            this.f74477a = type;
        }

        public final Object convert(@NonNull Object obj) throws IOException {
            ResponseBody responseBody = (ResponseBody) obj;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            SASentinelBiliCall sASentinelBiliCall = this.f74478b;
            sASentinelBiliCall.f74467z = jElapsedRealtime;
            HashMap map = (HashMap) SASentinelBiliCall.f74454E;
            ParameterizedType parameterizedType = (ParameterizedType) map.get(this.f74477a);
            ParameterizedType parameterizedTypeImpl = parameterizedType;
            if (parameterizedType == null) {
                parameterizedTypeImpl = new ParameterizedTypeImpl(new Type[]{this.f74477a}, null, GeneralResponse.class);
                map.put(this.f74477a, parameterizedTypeImpl);
            }
            GeneralResponse generalResponse = (GeneralResponse) new e(sASentinelBiliCall, parameterizedTypeImpl).convert(responseBody);
            sASentinelBiliCall.f74455A = SystemClock.elapsedRealtime();
            return generalResponse;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/bilow/SASentinelBiliCall$g.class */
    public final class g implements Converter<ResponseBody, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SASentinelBiliCall f74479a;

        public g(SASentinelBiliCall sASentinelBiliCall) {
            this.f74479a = sASentinelBiliCall;
        }

        public final Object convert(@NonNull Object obj) throws IOException {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            SASentinelBiliCall sASentinelBiliCall = this.f74479a;
            sASentinelBiliCall.f74467z = jElapsedRealtime;
            String strString = ((ResponseBody) obj).string();
            sASentinelBiliCall.f74456B = strString == null ? null : Uri.encode(strString);
            sASentinelBiliCall.f74457C = strString == null ? sASentinelBiliCall.f74457C : strString.length();
            sASentinelBiliCall.f74455A = SystemClock.elapsedRealtime();
            return strString;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/bilow/SASentinelBiliCall$h.class */
    public static final class h implements Converter<ResponseBody, Void> {
        public final Object convert(@NonNull Object obj) throws IOException {
            ((ResponseBody) obj).close();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [retrofit2.Converter] */
    public SASentinelBiliCall(@NonNull BiliCall<T> biliCall, String str, @NonNull SentinelXXX sentinelXXX, List<com.bilibili.opd.app.bizcommon.sentinel.bilow.a> list, Annotation[] annotationArr, Type type) throws IllegalAccessException, NoSuchFieldException {
        super(biliCall.request(), biliCall.getResponseType(), new Annotation[0], biliCall.getOKHttpClient(), NetworkManager.getBiliCache());
        this.f74457C = -1L;
        this.f74459r = biliCall;
        this.f74458q = str;
        this.f74460s = sentinelXXX;
        this.f74461t = list;
        this.f74463v = type;
        this.f74462u = annotationArr;
        Object eVar = null;
        if (Types.getRawType(type) == BiliCall.class) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length <= 0) {
                throw new IllegalArgumentException("Index 0 not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
            }
            Type type2 = actualTypeArguments[0];
            Type type3 = type2 instanceof WildcardType ? ((WildcardType) type2).getUpperBounds()[0] : type2;
            Class rawType = Types.getRawType(type3);
            if (rawType == GeneralResponse.class) {
                Type type4 = type3 instanceof ParameterizedType ? ((ParameterizedType) type3).getActualTypeArguments()[0] : null;
                eVar = new f(this, type4 == null ? Void.class : type4);
            } else if (rawType == String.class) {
                eVar = new g(this);
            } else if (rawType == Void.class) {
                eVar = new Object();
            } else if (rawType != ResponseBody.class) {
                eVar = new e(this, type3);
            }
        }
        this.f74464w = eVar;
        if (eVar != null) {
            setParser(new a(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(com.bilibili.opd.app.bizcommon.sentinel.bilow.SASentinelBiliCall r8, retrofit2.Response r9, java.lang.Throwable r10) {
        /*
            Method dump skipped, instruction units count: 1017
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.sentinel.bilow.SASentinelBiliCall.b(com.bilibili.opd.app.bizcommon.sentinel.bilow.SASentinelBiliCall, retrofit2.Response, java.lang.Throwable):void");
    }

    public static String c(int i7, int i8, int i9) {
        HashMap map = new HashMap();
        map.put("http_code", "" + i7);
        map.put("http_business_code", "" + i9);
        map.put("http_inner_code", "" + i8);
        return Uri.encode(JSON.toJSONString(map));
    }

    public static String d(Response response) {
        return (response == null || response.raw() == null || response.raw().request() == null || response.raw().request().headers() == null) ? "" : response.raw().request().headers().get(TraceIdEnd.TRACEID_END_HEADER_KEY);
    }

    public static Pair<String, String> e(HttpUrl httpUrl) {
        try {
            return new Pair<>(httpUrl.newBuilder().query((String) null).build().toString(), httpUrl.query());
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public void cancel() {
        this.f74459r.cancel();
    }

    @Override // com.bilibili.okretro.call.BiliCall
    /* JADX INFO: renamed from: clone */
    public BiliCall<T> mo7784clone() {
        BiliCall<T> biliCallMo7784clone = this.f74459r.mo7784clone();
        try {
            return new SASentinelBiliCall(biliCallMo7784clone, this.f74458q, this.f74460s, this.f74461t, this.f74462u, this.f74463v);
        } catch (IllegalAccessException e7) {
            e7.printStackTrace();
            return biliCallMo7784clone;
        } catch (NoSuchFieldException e8) {
            e8.printStackTrace();
            return biliCallMo7784clone;
        }
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public void enqueue() {
        this.f74465x = System.currentTimeMillis();
        this.f74466y = SystemClock.elapsedRealtime();
        this.f74459r.enqueue(new b(this));
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public void enqueue(Callback<T> callback) {
        this.f74465x = System.currentTimeMillis();
        this.f74466y = SystemClock.elapsedRealtime();
        this.f74459r.enqueue(new c(this, callback));
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public Response execute() throws IOException, BiliApiParseException {
        this.f74465x = System.currentTimeMillis();
        this.f74466y = SystemClock.elapsedRealtime();
        Response<T> responseExecute = this.f74459r.execute();
        f(responseExecute, null);
        return responseExecute;
    }

    public final void f(Response response, Throwable th) {
        HandlerThreads.post(1, new d(this, response, th));
    }

    @Override // com.bilibili.okretro.call.BiliCall
    @VisibleForTesting
    public okhttp3.Response getFromCache() {
        return this.f74459r.getFromCache();
    }

    @Override // com.bilibili.okretro.call.BiliCall
    @VisibleForTesting
    public OkHttpClient getOKHttpClient() {
        return this.f74459r.getOKHttpClient();
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public Type getResponseType() {
        return this.f74459r.getResponseType();
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public boolean isCanceled() {
        return this.f74459r.isCanceled();
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public boolean isExecuted() {
        boolean zIsExecuted;
        synchronized (this) {
            zIsExecuted = this.f74459r.isExecuted();
        }
        return zIsExecuted;
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public boolean removeCache() {
        return this.f74459r.removeCache();
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public Request request() {
        return this.f74459r.request();
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public BiliCall<T> setParser(IParser iParser) {
        this.f74459r.setParser(iParser);
        return this;
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public BiliCall<T> setRequestAddit(IRequestInterceptor iRequestInterceptor) {
        this.f74459r.setRequestAddit(iRequestInterceptor);
        return this;
    }
}
