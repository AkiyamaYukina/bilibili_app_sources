package com.bilibili.okretro.call;

import Yl0.e;
import Yl0.f;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bilibili.api.base.ok.BiliCache;
import com.bilibili.api.base.util.NetworkManager;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.okretro.BiliApiParseException;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.anno.CacheControl;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.converter.BiliConverterFactory;
import com.bilibili.okretro.converter.IParser;
import com.bilibili.okretro.interceptor.IRequestInterceptor;
import com.bilibili.okretro.tracker.ApiTracker;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Timeout;
import retrofit2.Callback;
import retrofit2.Converter;
import retrofit2.Response;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/BiliCall.class */
public class BiliCall<T> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Request f73399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f73400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Annotation[] f73401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BiliCache f73402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f73403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ApiTracker f73404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f73405g;
    public IRequestInterceptor h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final OkHttpClient f73406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Converter f73407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Call f73408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f73409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f73410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f73411n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Callback<T> f73412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f73413p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/BiliCall$a.class */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliCall f73414a;

        public a(BiliCall biliCall) {
            this.f73414a = biliCall;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Callback<T> callback;
            Process.setThreadPriority(10);
            try {
                Response<T> responseExecute = this.f73414a.execute();
                BiliCall biliCall = this.f73414a;
                if (biliCall.f73412o == null || biliCall.isCanceled()) {
                    return;
                }
                synchronized (biliCall) {
                    callback = biliCall.f73412o;
                }
                if (callback == null) {
                    return;
                }
                biliCall.f73403e.execute(new Yl0.a(biliCall, callback, responseExecute));
            } catch (Throwable th) {
                BiliCall biliCall2 = this.f73414a;
                if (biliCall2.f73412o == null || biliCall2.isCanceled()) {
                    return;
                }
                synchronized (biliCall2) {
                    Callback<T> callback2 = biliCall2.f73412o;
                    if (callback2 == null) {
                        return;
                    }
                    biliCall2.f73403e.execute(new Yl0.b(biliCall2, callback2, th));
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/BiliCall$b.class */
    public final class b implements retrofit2.Call, Xl0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliCall f73415a;

        public b(BiliCall biliCall) {
            this.f73415a = biliCall;
        }

        @Override // Xl0.a
        @Nullable
        public final <T> BiliCall<T> a(@NonNull Request request) {
            BiliCall biliCall = this.f73415a;
            return new BiliCall<>(request, biliCall.f73400b, biliCall.f73401c, biliCall.f73406i, biliCall.f73402d, biliCall.f73403e);
        }

        public final void cancel() {
            throw new UnsupportedOperationException();
        }

        public final Object clone() throws CloneNotSupportedException {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final retrofit2.Call<T> m7785clone() {
            throw new UnsupportedOperationException();
        }

        public final void enqueue(Callback<T> callback) {
            throw new UnsupportedOperationException();
        }

        public final Response<T> execute() throws IOException {
            throw new UnsupportedOperationException();
        }

        public final boolean isCanceled() {
            return this.f73415a.isCanceled();
        }

        public final boolean isExecuted() {
            return this.f73415a.isExecuted();
        }

        public final Request request() {
            BiliCall biliCall = this.f73415a;
            Call call = biliCall.f73408k;
            return call != null ? call.request() : biliCall.f73399a;
        }

        public final Timeout timeout() {
            return Timeout.NONE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/BiliCall$c.class */
    public static final class c extends ResponseBody {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ResponseBody f73416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f73417c;

        public c(ResponseBody responseBody, byte[] bArr) {
            this.f73416b = responseBody;
            this.f73417c = bArr;
        }

        public final long contentLength() {
            return this.f73416b.contentLength();
        }

        public final MediaType contentType() {
            return this.f73416b.contentType();
        }

        public final BufferedSource source() {
            return Okio.buffer(Okio.source(new ByteArrayInputStream(this.f73417c)));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/BiliCall$d.class */
    public static final class d extends ResponseBody {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaType f73418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f73419c;

        public d(MediaType mediaType, long j7) {
            this.f73418b = mediaType;
            this.f73419c = j7;
        }

        public final long contentLength() {
            return this.f73419c;
        }

        public final MediaType contentType() {
            return this.f73418b;
        }

        public final BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public BiliCall(Request request, Type type, Annotation[] annotationArr, OkHttpClient okHttpClient, BiliCache biliCache) {
        this(request, type, annotationArr, okHttpClient, biliCache, NetworkManager.getUIExecutor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v76, types: [Yl0.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    public BiliCall(Request request, Type type, Annotation[] annotationArr, OkHttpClient okHttpClient, BiliCache biliCache, Executor executor) {
        ?? r10;
        IRequestInterceptor iRequestInterceptorNewInstance;
        OkHttpClient okHttpClientBuild;
        this.f73413p = new b(this);
        if (request == null || type == null || annotationArr == null || okHttpClient == null || biliCache == null) {
            throw new NullPointerException("Any arguments of BiliCall constructor can not be null");
        }
        this.f73400b = type;
        this.f73401c = annotationArr;
        this.f73402d = biliCache;
        this.f73399a = request;
        this.f73404f = ServiceGenerator.sTrackerFactory.getTracker();
        this.f73403e = executor;
        int length = annotationArr.length;
        int i7 = 0;
        OkHttpClient okHttpClient2 = okHttpClient;
        IRequestInterceptor iRequestInterceptor = null;
        f fVar = null;
        while (i7 < length) {
            Annotation annotation = annotationArr[i7];
            if (annotation instanceof CacheControl) {
                CacheControl cacheControl = (CacheControl) annotation;
                ?? obj = new Object();
                int iConfig = cacheControl.config();
                obj.f28943a = iConfig;
                r10 = obj;
                iRequestInterceptorNewInstance = iRequestInterceptor;
                okHttpClientBuild = okHttpClient2;
                if ((iConfig & 2) != 0) {
                    obj.f28944b = cacheControl.value();
                    r10 = obj;
                    iRequestInterceptorNewInstance = iRequestInterceptor;
                    okHttpClientBuild = okHttpClient2;
                }
            } else if (annotation instanceof RequestInterceptor) {
                try {
                    iRequestInterceptorNewInstance = ((RequestInterceptor) annotation).value().newInstance();
                    r10 = fVar == true ? 1 : 0;
                    okHttpClientBuild = okHttpClient2;
                } catch (Exception e7) {
                    throw new IllegalArgumentException("Can not instantiation IRequestInterceptor", e7);
                }
            } else {
                r10 = fVar == true ? 1 : 0;
                iRequestInterceptorNewInstance = iRequestInterceptor;
                okHttpClientBuild = okHttpClient2;
                if (annotation instanceof com.bilibili.okretro.anno.Timeout) {
                    com.bilibili.okretro.anno.Timeout timeout = (com.bilibili.okretro.anno.Timeout) annotation;
                    long jConn = timeout.conn();
                    long j7 = timeout.read();
                    long jWrite = timeout.write();
                    OkHttpClient.Builder builderNewBuilder = okHttpClient2.newBuilder();
                    if (jConn != -1) {
                        builderNewBuilder.connectTimeout(jConn, TimeUnit.MILLISECONDS);
                    }
                    if (j7 != -1) {
                        builderNewBuilder.readTimeout(j7, TimeUnit.MILLISECONDS);
                    }
                    if (jWrite != -1) {
                        builderNewBuilder.writeTimeout(jWrite, TimeUnit.MILLISECONDS);
                    }
                    okHttpClientBuild = builderNewBuilder.build();
                    iRequestInterceptorNewInstance = iRequestInterceptor;
                    r10 = fVar == true ? 1 : 0;
                }
            }
            i7++;
            fVar = r10 == true ? 1 : 0;
            iRequestInterceptor = iRequestInterceptorNewInstance;
            okHttpClient2 = okHttpClientBuild;
        }
        this.f73405g = fVar;
        this.h = iRequestInterceptor;
        this.f73406i = okHttpClient2;
    }

    public final Response<T> a(okhttp3.Response response) throws IOException, BiliApiParseException {
        ResponseBody responseBodyBody = response.body();
        okhttp3.Response responseBuild = response.newBuilder().body(new d(responseBodyBody.contentType(), responseBodyBody.contentLength())).build();
        int iCode = responseBuild.code();
        if (iCode < 200 || iCode >= 300) {
            try {
                Buffer buffer = new Buffer();
                responseBodyBody.source().readAll(buffer);
                return Response.error(ResponseBody.create(responseBodyBody.contentType(), responseBodyBody.contentLength(), buffer), responseBuild);
            } finally {
                responseBodyBody.close();
            }
        }
        if (iCode == 204 || iCode == 205) {
            return Response.success((Object) null, responseBuild);
        }
        if (this.f73407j == null) {
            this.f73407j = BiliConverterFactory.INSTANCE.responseBodyConverter(this.f73400b, this.f73401c, null);
        }
        try {
            e eVar = (e) responseBuild.request().tag(e.class);
            if (!cacheBodyTag() || eVar == null) {
                return Response.success(this.f73407j.convert(responseBodyBody), responseBuild);
            }
            c cVar = new c(responseBodyBody, responseBodyBody.bytes());
            return Response.success(this.f73407j.convert(cVar), responseBuild.newBuilder().body(cVar).build());
        } catch (RuntimeException e7) {
            throw new BiliApiParseException(e7);
        }
    }

    public boolean cacheBodyTag() {
        try {
            return ((Boolean) ConfigManager.ab().get("net.cache.body.tag", Boolean.TRUE)).booleanValue();
        } catch (Throwable th) {
            return false;
        }
    }

    public void cancel() {
        Call call;
        this.f73409l = true;
        synchronized (this) {
            this.f73412o = null;
            call = this.f73408k;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BiliCall<T> mo7784clone() {
        return new BiliCall<>(this.f73399a, this.f73400b, this.f73401c, this.f73406i, this.f73402d, this.f73403e);
    }

    public void enqueue() {
        enqueue(null);
    }

    public void enqueue(Callback<T> callback) {
        if (this.f73411n && callback != null) {
            callback.onFailure(this.f73413p, new IllegalStateException("Already enqueue"));
            return;
        }
        this.f73411n = true;
        this.f73412o = callback;
        NetworkManager.getNetWorkExecutor().execute(new a(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public retrofit2.Response<T> execute() throws java.io.IOException, com.bilibili.okretro.BiliApiParseException {
        /*
            Method dump skipped, instruction units count: 1929
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.okretro.call.BiliCall.execute():retrofit2.Response");
    }

    public ApiTracker getApiTracker() {
        return this.f73404f;
    }

    @VisibleForTesting
    public okhttp3.Response getFromCache() {
        return this.f73402d.get(this.f73399a);
    }

    @VisibleForTesting
    public OkHttpClient getOKHttpClient() {
        return this.f73406i;
    }

    public Type getResponseType() {
        return this.f73400b;
    }

    public boolean isCanceled() {
        return this.f73409l;
    }

    public boolean isExecuted() {
        boolean z6;
        synchronized (this) {
            z6 = this.f73410m;
        }
        return z6;
    }

    public boolean removeCache() {
        try {
            this.f73402d.remove(this.f73399a);
            return true;
        } catch (IOException e7) {
            e7.printStackTrace();
            return false;
        }
    }

    public Request request() {
        return this.f73399a;
    }

    public void setApiTracker(ApiTracker apiTracker) {
        this.f73404f = apiTracker;
    }

    public BiliCall<T> setCacheConfig(f fVar) {
        this.f73405g = fVar;
        return this;
    }

    public BiliCall<T> setParser(IParser iParser) {
        this.f73407j = iParser;
        return this;
    }

    public BiliCall<T> setRequestAddit(IRequestInterceptor iRequestInterceptor) {
        this.h = iRequestInterceptor;
        return this;
    }
}
