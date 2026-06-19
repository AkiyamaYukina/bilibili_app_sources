package com.bilibili.opd.app.bizcommon.sentinel.bilow;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.core.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import com.alipay.alipaysecuritysdk.common.model.DynamicModel;
import com.bilibili.api.base.ok.BiliCache;
import com.bilibili.api.base.util.Types;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.okretro.BiliApiParseException;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.okretro.converter.IParser;
import com.bilibili.okretro.interceptor.IRequestInterceptor;
import com.bilibili.opd.app.bizcommon.biliapm.APMRecorder;
import com.bilibili.opd.app.bizcommon.sentinel.HighReport;
import com.bilibili.opd.app.bizcommon.sentinel.bilow.a;
import com.bilibili.opd.app.sentinel.SentinelXXX;
import com.tencent.connect.common.Constants;
import com.tencent.map.geolocation.TencentLocation;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Converter;
import retrofit2.Response;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/bilow/b.class */
public final class b<T> extends BiliCall<T> {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f74482C = JSON.DEFAULT_PARSER_FEATURE | Feature.DisableSpecialKeyDetect.mask;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Map<Type, ParameterizedType> f74483D = new HashMap(1024);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f74484A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f74485B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final BiliCall<T> f74486q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SentinelXXX f74487r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<com.bilibili.opd.app.bizcommon.sentinel.bilow.a> f74488s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Type f74489t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Converter f74490u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f74491v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f74492w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f74493x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f74494y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f74495z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/bilow/b$a.class */
    public final class a implements IParser {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f74496a;

        public a(b bVar) {
            this.f74496a = bVar;
        }

        @Override // com.bilibili.okretro.converter.IParser
        public final Object convert(Object obj) throws IOException {
            return this.f74496a.f74490u.convert(obj);
        }

        @Override // com.bilibili.okretro.converter.IParser
        @NonNull
        public final Object convert(ResponseBody responseBody) throws IOException, RuntimeException {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.sentinel.bilow.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/bilow/b$b.class */
    public final class C0473b implements Callback<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f74497a;

        public C0473b(b bVar) {
            this.f74497a = bVar;
        }

        public final void onFailure(Call<T> call, Throwable th) {
            this.f74497a.e(null, th);
        }

        public final void onResponse(Call<T> call, Response<T> response) {
            this.f74497a.e(response, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/bilow/b$c.class */
    public final class c implements Callback<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Callback f74498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f74499b;

        public c(b bVar, Callback callback) {
            this.f74499b = bVar;
            this.f74498a = callback;
        }

        public final void onFailure(Call<T> call, Throwable th) {
            this.f74499b.e(null, th);
            this.f74498a.onFailure(call, th);
        }

        public final void onResponse(Call<T> call, Response<T> response) {
            this.f74499b.e(response, null);
            this.f74498a.onResponse(call, response);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/bilow/b$d.class */
    public final class d<T> implements Converter<ResponseBody, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f74500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f74501b;

        public d(b bVar, Type type) {
            this.f74501b = bVar;
            this.f74500a = type;
        }

        public final Object convert(Object obj) throws IOException {
            ResponseBody responseBody = (ResponseBody) obj;
            b bVar = this.f74501b;
            if (bVar.f74493x == 0) {
                bVar.f74493x = SystemClock.elapsedRealtime();
            }
            String strString = responseBody.string();
            bVar.f74495z = strString == null ? null : Uri.encode(strString);
            bVar.f74484A = strString == null ? bVar.f74484A : strString.length();
            Object object = JSON.parseObject(strString, this.f74500a, b.f74482C, new Feature[0]);
            if (bVar.f74494y == 0) {
                bVar.f74494y = SystemClock.elapsedRealtime();
            }
            return object;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/bilow/b$e.class */
    public final class e<T> implements Converter<ResponseBody, GeneralResponse<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f74502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f74503b;

        public e(b bVar, Type type) {
            this.f74503b = bVar;
            this.f74502a = type;
        }

        public final Object convert(@NonNull Object obj) throws IOException {
            ResponseBody responseBody = (ResponseBody) obj;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            b bVar = this.f74503b;
            bVar.f74493x = jElapsedRealtime;
            HashMap map = (HashMap) b.f74483D;
            ParameterizedType parameterizedType = (ParameterizedType) map.get(this.f74502a);
            ParameterizedType parameterizedTypeImpl = parameterizedType;
            if (parameterizedType == null) {
                parameterizedTypeImpl = new ParameterizedTypeImpl(new Type[]{this.f74502a}, null, GeneralResponse.class);
                map.put(this.f74502a, parameterizedTypeImpl);
            }
            GeneralResponse generalResponse = (GeneralResponse) new d(bVar, parameterizedTypeImpl).convert(responseBody);
            bVar.f74494y = SystemClock.elapsedRealtime();
            return generalResponse;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/bilow/b$f.class */
    public final class f implements Converter<ResponseBody, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f74504a;

        public f(b bVar) {
            this.f74504a = bVar;
        }

        public final Object convert(@NonNull Object obj) throws IOException {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            b bVar = this.f74504a;
            bVar.f74493x = jElapsedRealtime;
            String strString = ((ResponseBody) obj).string();
            bVar.f74495z = strString == null ? null : Uri.encode(strString);
            bVar.f74484A = strString == null ? bVar.f74484A : strString.length();
            bVar.f74494y = SystemClock.elapsedRealtime();
            return strString;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/bilow/b$g.class */
    public static final class g implements Converter<ResponseBody, Void> {
        public final Object convert(@NonNull Object obj) throws IOException {
            ((ResponseBody) obj).close();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27, types: [retrofit2.Converter] */
    public b(@NonNull BiliCall<T> biliCall, SentinelXXX sentinelXXX, List<com.bilibili.opd.app.bizcommon.sentinel.bilow.a> list, Annotation[] annotationArr, Type type, OkHttpClient okHttpClient, BiliCache biliCache) throws IllegalAccessException, NoSuchFieldException {
        Object fVar;
        super(biliCall.request(), biliCall.getResponseType(), new Annotation[0], okHttpClient, biliCache);
        this.f74484A = -1L;
        this.f74485B = false;
        this.f74486q = biliCall;
        this.f74487r = sentinelXXX;
        this.f74488s = list;
        this.f74489t = type;
        for (Annotation annotation : annotationArr) {
            if (annotation instanceof HighReport) {
                this.f74485B = ((HighReport) annotation).support();
            }
        }
        Type type2 = null;
        if (Types.getRawType(type) != BiliCall.class) {
            fVar = null;
        } else {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length <= 0) {
                throw new IllegalArgumentException("Index 0 not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
            }
            Type type3 = actualTypeArguments[0];
            Type type4 = type3 instanceof WildcardType ? ((WildcardType) type3).getUpperBounds()[0] : type3;
            Class rawType = Types.getRawType(type4);
            if (rawType == GeneralResponse.class) {
                type2 = type4 instanceof ParameterizedType ? ((ParameterizedType) type4).getActualTypeArguments()[0] : type2;
                fVar = new e(this, type2 == null ? Void.class : type2);
            } else {
                fVar = rawType == String.class ? new f(this) : rawType == Void.class ? new Object() : rawType == ResponseBody.class ? null : new d(this, type4);
            }
        }
        this.f74490u = fVar;
        if (fVar != null) {
            setParser(new a(this));
        }
    }

    public static String b(int i7, int i8, int i9) {
        HashMap map = new HashMap();
        map.put("http_code", "" + i7);
        map.put("http_business_code", "" + i8);
        map.put("http_inner_code", "" + i9);
        return Uri.encode(JSON.toJSONString(map));
    }

    public static String c(Response response) {
        return (response == null || response.raw() == null || response.raw().request() == null || response.raw().request().headers() == null) ? "" : response.raw().request().headers().get(TraceIdEnd.TRACEID_END_HEADER_KEY);
    }

    public static Pair<String, String> d(HttpUrl httpUrl) {
        try {
            return new Pair<>(httpUrl.newBuilder().query((String) null).build().toString(), httpUrl.query());
        } catch (Exception e7) {
            Log.e("SentinelBiliCall", e7.getMessage());
            return null;
        }
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public final void cancel() {
        this.f74486q.cancel();
    }

    public final void e(final Response response, final Throwable th) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f74492w;
        HandlerThreads.post(1, new Runnable(this, response, th, jElapsedRealtime) { // from class: rn0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.bilibili.opd.app.bizcommon.sentinel.bilow.b f126703a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Response f126704b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Throwable f126705c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final long f126706d;

            {
                this.f126703a = this;
                this.f126704b = response;
                this.f126705c = th;
                this.f126706d = jElapsedRealtime;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.bilibili.opd.app.bizcommon.sentinel.bilow.b bVar = this.f126703a;
                Response response2 = this.f126704b;
                Throwable th2 = this.f126705c;
                long j7 = this.f126706d;
                bVar.getClass();
                try {
                    bVar.f(response2, th2, j7);
                } catch (Exception e7) {
                    Log.e("SentinelBiliCall", e7.getMessage());
                }
            }
        });
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public final void enqueue() {
        this.f74491v = System.currentTimeMillis();
        this.f74492w = SystemClock.elapsedRealtime();
        this.f74486q.enqueue(new C0473b(this));
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public final void enqueue(Callback<T> callback) {
        this.f74491v = System.currentTimeMillis();
        this.f74492w = SystemClock.elapsedRealtime();
        this.f74486q.enqueue(new c(this, callback));
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public final Response execute() throws IOException, BiliApiParseException {
        this.f74491v = System.currentTimeMillis();
        this.f74492w = SystemClock.elapsedRealtime();
        Response<T> responseExecute = this.f74486q.execute();
        e(responseExecute, null);
        return responseExecute;
    }

    public final void f(Response response, Throwable th, long j7) {
        int i7;
        int i8;
        Pair<String, String> pairD;
        String str;
        int i9;
        int i10;
        long jContentLength;
        long j8;
        long j9;
        int i11;
        String str2;
        int i12;
        boolean z6;
        int i13;
        SentinelXXX sentinelXXX;
        long j10;
        String str3;
        long j11;
        Pair<String, String> pair;
        String str4;
        int i14;
        String strEncode;
        int i15;
        boolean z7;
        int i16;
        String strString;
        List<com.bilibili.opd.app.bizcommon.sentinel.bilow.a> list;
        if (th instanceof BiliApiParseException) {
            i7 = 163;
            i8 = 2;
        } else {
            i7 = -999999;
            i8 = 1;
        }
        if (response != null) {
            okhttp3.Response responseRaw = response.raw();
            if (responseRaw != null) {
                long jReceivedResponseAtMillis = responseRaw.receivedResponseAtMillis() - responseRaw.sentRequestAtMillis();
                long jSentRequestAtMillis = responseRaw.sentRequestAtMillis() - this.f74491v;
                int iCode = responseRaw.code();
                Pair<String, String> pairD2 = responseRaw.request() == null ? null : d(responseRaw.request().url());
                if (pairD2 == null) {
                    return;
                }
                String strHeader = responseRaw.header("Trace-id");
                String strHeader2 = strHeader;
                if (TextUtils.isEmpty(strHeader)) {
                    strHeader2 = responseRaw.header("trace-id");
                }
                String str5 = strHeader2;
                Request request = responseRaw.request() == null ? this.f74486q.request() : responseRaw.request();
                String string = request.url().toString();
                long length = string.length();
                Headers headers = request.headers();
                long jByteCount = length;
                if (headers != null) {
                    jByteCount = headers.byteCount() + length;
                }
                j10 = jSentRequestAtMillis;
                jContentLength = jByteCount;
                str3 = string;
                j11 = jReceivedResponseAtMillis;
                i14 = iCode;
                pair = pairD2;
                str4 = str5;
                if (TextUtils.equals(request.method(), Constants.HTTP_POST)) {
                    j10 = jSentRequestAtMillis;
                    jContentLength = jByteCount;
                    str3 = string;
                    j11 = jReceivedResponseAtMillis;
                    i14 = iCode;
                    pair = pairD2;
                    str4 = str5;
                    if (request.body() != null) {
                        try {
                            jContentLength = jByteCount + request.body().contentLength();
                            j10 = jSentRequestAtMillis;
                            str3 = string;
                            j11 = jReceivedResponseAtMillis;
                            i14 = iCode;
                            pair = pairD2;
                            str4 = str5;
                        } catch (IOException e7) {
                            Log.e("SentinelBiliCall", e7.getMessage());
                            j10 = jSentRequestAtMillis;
                            jContentLength = jByteCount;
                            str3 = string;
                            j11 = jReceivedResponseAtMillis;
                            i14 = iCode;
                            pair = pairD2;
                            str4 = str5;
                        }
                    }
                }
            } else {
                j10 = -1;
                jContentLength = 0;
                str3 = null;
                j11 = -1;
                pair = null;
                str4 = null;
                i14 = i7;
            }
            i9 = i8;
            Object objBody = response.body();
            boolean z8 = response.isSuccessful() && objBody != null;
            if (z8 && (objBody instanceof GeneralResponse)) {
                GeneralResponse generalResponse = (GeneralResponse) objBody;
                if (generalResponse.isSuccess()) {
                    z7 = z8;
                    strEncode = "";
                    i15 = 200;
                    i16 = Integer.MIN_VALUE;
                    i10 = -1;
                } else {
                    i16 = generalResponse.code;
                    strEncode = generalResponse.message;
                    i9 = 3;
                    i15 = -1;
                    z7 = false;
                    i10 = i16;
                }
            } else {
                strEncode = "";
                i10 = -1;
                i15 = -1;
                z7 = z8;
                i16 = Integer.MIN_VALUE;
            }
            if (!z7 || (list = this.f74488s) == null || list.isEmpty()) {
                strString = strEncode;
                if (!z7) {
                    try {
                        ResponseBody responseBodyErrorBody = response.errorBody();
                        boolean zIsEmpty = TextUtils.isEmpty(strEncode);
                        if (responseBodyErrorBody == null || TextUtils.isEmpty(responseBodyErrorBody.string())) {
                            strString = strEncode;
                            if (zIsEmpty) {
                                strString = "http response empty, check http code";
                            }
                        } else {
                            strString = responseBodyErrorBody.string();
                        }
                    } catch (Exception e8) {
                        Log.e("SentinelBiliCall", e8.getMessage());
                        strString = strEncode;
                    }
                }
                i11 = -1;
            } else {
                Iterator<com.bilibili.opd.app.bizcommon.sentinel.bilow.a> it = this.f74488s.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    a.C0472a c0472aA = it.next().a(objBody, str3);
                    if (c0472aA != null) {
                        strEncode = Uri.encode(c0472aA.f74481b);
                        i11 = c0472aA.f74480a;
                        i9 = 4;
                        i16 = i11;
                        z7 = false;
                        break;
                    }
                }
                strString = strEncode;
            }
            j9 = j11;
            pairD = pair;
            String str6 = str4;
            int i17 = i15;
            i12 = i16;
            i7 = i14;
            str = strString;
            j8 = j10;
            str2 = str6;
            z6 = z7;
            i13 = i17;
        } else {
            pairD = d(this.f74486q.request().url());
            str = "";
            i9 = i8;
            i10 = -1;
            jContentLength = 0;
            j8 = -1;
            j9 = -1;
            i11 = -1;
            str2 = null;
            i12 = Integer.MIN_VALUE;
            z6 = false;
            i13 = -1;
        }
        if (pairD == null) {
            return;
        }
        com.bilibili.opd.app.sentinel.Log logPutExtraString = this.f74487r.customLog(TencentLocation.NETWORK_PROVIDER, pairD.first).subProduct(this.f74487r.getProductKey()).description(pairD.second).putExtraString("respsize", android.support.v4.media.session.a.a(new StringBuilder(), this.f74484A, ""));
        logPutExtraString.putExtraString("tduration", "").putExtraString(DynamicModel.KEY_ABBR_DYNAMIC_TRACE, "").putExtraString("req", jContentLength + "");
        if (z6) {
            HashMap map = new HashMap();
            map.put("t_befSendReq", j8 + "");
            map.put("t_ttfb", android.support.v4.media.session.a.a(new StringBuilder(), j9, ""));
            long j12 = this.f74493x;
            if (j12 != 0) {
                long j13 = this.f74494y;
                if (j13 != 0 && j13 > j12) {
                    map.put("t_parse", android.support.v4.media.session.a.a(new StringBuilder(), this.f74494y - this.f74493x, ""));
                }
            }
            logPutExtraString.duration(j7).debug(this.f74495z, null).monitorBySucRate(true).putExtraString("detail", JSON.toJSONString(map)).putExtraString("http_code", b(i7, i10, i11)).putExtraString("traceid_end", c(response)).putExtraString("code", i7 + "");
        } else {
            com.bilibili.opd.app.sentinel.Log logError = logPutExtraString.monitorBySucRate(false).error(str, th);
            StringBuilder sb = new StringBuilder();
            int i18 = i12;
            if (i12 == Integer.MIN_VALUE) {
                i18 = i7;
            }
            sb.append(i18);
            sb.append("");
            logError.putExtraString("code", sb.toString()).putExtraString("http_code", b(i7, i10, i11)).putExtraString("traceid_end", c(response)).putExtraString(NotificationCompat.CATEGORY_STATUS, i9 + "");
            if (this.f74485B) {
                logPutExtraString.setRepportImmdiate();
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            logPutExtraString.traceId(str2);
        }
        APMRecorder.Builder builder = new APMRecorder.Builder();
        if ("payment".equals(this.f74487r.getProductKey())) {
            builder.product("pay");
        } else {
            builder.product(this.f74487r.getProductKey());
        }
        builder.duration(j8 + "").requestSize(jContentLength + "").responseSize(this.f74484A + "").subEvent(logPutExtraString.mSubEvent).networkCode(i7 + "").bizCode(i13).traceId(str2).tunnel("1").build();
        APMRecorder.Companion companion = APMRecorder.Companion;
        companion.getInstance().record(builder);
        logPutExtraString.report();
        if (response != null) {
            Object objBody2 = response.body();
            if (z6 && (objBody2 instanceof GeneralResponse) && ((GeneralResponse) objBody2).data == null && (sentinelXXX = this.f74487r) != null && sentinelXXX.isEnabled()) {
                String str7 = this.f74487r.getProductKey() + "RespData";
                this.f74487r.customLog(str7, pairD.first).subProduct(this.f74487r.getProductKey()).duration(j7).monitorBySucRate(false).report();
                APMRecorder.Builder builder2 = new APMRecorder.Builder();
                builder2.product(this.f74487r.getProductKey()).subEvent(str7).duration(String.valueOf(j7)).build();
                companion.getInstance().record(builder2);
            }
        }
    }

    @Override // com.bilibili.okretro.call.BiliCall
    @VisibleForTesting
    public final okhttp3.Response getFromCache() {
        return this.f74486q.getFromCache();
    }

    @Override // com.bilibili.okretro.call.BiliCall
    @VisibleForTesting
    public final OkHttpClient getOKHttpClient() {
        return this.f74486q.getOKHttpClient();
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public final Type getResponseType() {
        return this.f74486q.getResponseType();
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public final boolean isCanceled() {
        return this.f74486q.isCanceled();
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public final boolean isExecuted() {
        boolean zIsExecuted;
        synchronized (this) {
            zIsExecuted = this.f74486q.isExecuted();
        }
        return zIsExecuted;
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public final boolean removeCache() {
        return this.f74486q.removeCache();
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public final Request request() {
        return this.f74486q.request();
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public final BiliCall<T> setParser(IParser iParser) {
        this.f74486q.setParser(iParser);
        return this;
    }

    @Override // com.bilibili.okretro.call.BiliCall
    public final BiliCall<T> setRequestAddit(IRequestInterceptor iRequestInterceptor) {
        this.f74486q.setRequestAddit(iRequestInterceptor);
        return this;
    }
}
