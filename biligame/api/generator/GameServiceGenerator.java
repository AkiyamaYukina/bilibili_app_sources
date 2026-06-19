package com.bilibili.biligame.api.generator;

import com.alipay.sdk.app.PayTask;
import com.bilibili.api.base.Config;
import com.bilibili.api.base.ok.BiliCache;
import com.bilibili.api.base.util.NetworkManager;
import com.bilibili.biligame.api.interceptor.LogInterceptor;
import com.bilibili.lib.okhttp.OkHttpClientWrapper;
import com.bilibili.ogv.operation2.inlinevideo.v;
import com.bilibili.okretro.call.BiliCallAdapterFactory;
import com.bilibili.okretro.call.rxjava.BiliCall2RxJava3AdapterFactory;
import com.bilibili.okretro.converter.BiliConverterFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jo.C7710b;
import jo.d;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/generator/GameServiceGenerator.class */
public class GameServiceGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile OkHttpClient f62164a;
    public static a sOkClientConfig;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/generator/GameServiceGenerator$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<Interceptor> f62165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<Interceptor> f62166b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.biligame.api.generator.GameServiceGenerator$a, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.f62165a = new ArrayList(5);
        obj.f62166b = new ArrayList(5);
        sOkClientConfig = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [go.a, retrofit2.CallAdapter$Factory] */
    /* JADX WARN: Type inference failed for: r0v6, types: [go.d, retrofit2.CallAdapter$Factory] */
    public static <T> T createService(Class<T> cls) {
        if (f62164a == null) {
            synchronized (GameServiceGenerator.class) {
                try {
                    if (f62164a == null) {
                        a aVar = sOkClientConfig;
                        ((ArrayList) aVar.f62165a).add(new C7710b());
                        a aVar2 = sOkClientConfig;
                        ((ArrayList) aVar2.f62165a).add(new d());
                        if (Config.isDebuggable()) {
                            a aVar3 = sOkClientConfig;
                            LogInterceptor logInterceptor = new LogInterceptor();
                            logInterceptor.f62167a = LogInterceptor.LogLevel.BODY;
                            logInterceptor.f62168b = LogInterceptor.ColorLevel.DEBUG;
                            logInterceptor.f62169c = "LogInterceptor";
                            ((ArrayList) aVar3.f62165a).add(logInterceptor);
                        }
                        OkHttpClient.Builder builderNewBuilder = OkHttpClientWrapper.get().newBuilder();
                        sOkClientConfig.getClass();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        builderNewBuilder.connectTimeout(PayTask.f60018j, timeUnit);
                        sOkClientConfig.getClass();
                        builderNewBuilder.readTimeout(v.f70979a, timeUnit);
                        sOkClientConfig.getClass();
                        builderNewBuilder.writeTimeout(v.f70979a, timeUnit);
                        builderNewBuilder.interceptors().addAll(sOkClientConfig.f62165a);
                        builderNewBuilder.networkInterceptors().addAll(sOkClientConfig.f62166b);
                        f62164a = builderNewBuilder.build();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        OkHttpClient okHttpClient = f62164a;
        Retrofit.Builder builderAddCallAdapterFactory = new Retrofit.Builder().addCallAdapterFactory(new BiliCallAdapterFactory(okHttpClient, NetworkManager.getBiliCache())).addCallAdapterFactory(new BiliCall2RxJava3AdapterFactory());
        BiliCache biliCache = NetworkManager.getBiliCache();
        ?? factory = new CallAdapter.Factory();
        factory.f120496a = okHttpClient;
        factory.f120497b = biliCache;
        Retrofit.Builder builderAddCallAdapterFactory2 = builderAddCallAdapterFactory.addCallAdapterFactory((CallAdapter.Factory) factory);
        BiliCache biliCache2 = NetworkManager.getBiliCache();
        ?? factory2 = new CallAdapter.Factory();
        factory2.f120488a = okHttpClient;
        factory2.f120489b = biliCache2;
        return (T) builderAddCallAdapterFactory2.addCallAdapterFactory((CallAdapter.Factory) factory2).addConverterFactory(BiliConverterFactory.INSTANCE).client(okHttpClient).baseUrl(tb1.a.a(cls)).build().create(cls);
    }
}
