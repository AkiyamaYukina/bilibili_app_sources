package com.bilibili.okretro;

import EZ.d;
import Yl0.c;
import androidx.annotation.NonNull;
import com.bilibili.api.base.util.NetworkManager;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.gripper.api.GripperKt;
import com.bilibili.lib.gripper.api.ProducerContainer;
import com.bilibili.lib.okhttp.OkHttpClientWrapper;
import com.bilibili.ogv.operation2.inlinevideo.v;
import com.bilibili.okretro.call.BiliCallAdapterFactory;
import com.bilibili.okretro.call.BiliCallFactory;
import com.bilibili.okretro.call.ExternalCallAdapterFactory;
import com.bilibili.okretro.converter.BiliConverterFactory;
import com.bilibili.okretro.tracker.ApiTracker;
import com.bilibili.okretro.tracker.DefaultTrackerFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;
import tb1.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/ServiceGenerator.class */
public class ServiceGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile OkHttpClient f73393a;
    public static ApiTracker.Factory sTrackerFactory = new DefaultTrackerFactory();
    public static OkClientConfig sOkClientConfig = new OkClientConfig();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/ServiceGenerator$OkClientConfig.class */
    public static class OkClientConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f73394a = v.f70979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f73395b = v.f70979a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f73396c = v.f70979a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<Interceptor> f73397d = new ArrayList(5);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<Interceptor> f73398e = new ArrayList(5);

        public OkClientConfig addInterceptor(Interceptor interceptor) {
            ((ArrayList) this.f73397d).add(interceptor);
            return this;
        }

        public OkClientConfig addNetworkInterceptor(Interceptor interceptor) {
            ((ArrayList) this.f73398e).add(interceptor);
            return this;
        }

        public long connectionTimeout() {
            return this.f73394a;
        }

        public List<Interceptor> interceptors() {
            return this.f73397d;
        }

        public List<Interceptor> networkInterceptors() {
            return this.f73398e;
        }

        public long readTimeout() {
            return this.f73395b;
        }

        public OkClientConfig setConnectTimeout(int i7) {
            this.f73394a = i7;
            return this;
        }

        public OkClientConfig setReadTimeout(int i7) {
            this.f73395b = i7;
            return this;
        }

        public OkClientConfig setWriteTimeout(int i7) {
            this.f73396c = i7;
            return this;
        }

        public long writeTimeout() {
            return this.f73396c;
        }
    }

    public static Retrofit.Builder createRetrofitBuilder() {
        OkHttpClient okHttpClientCreate;
        if (f73393a == null) {
            synchronized (ServiceGenerator.class) {
                try {
                    if (f73393a == null) {
                        try {
                            okHttpClientCreate = ((d) ProducerContainer.get$default(GripperKt.getGripper(FoundationAlias.getFapp()).getContainer(), d.class, (String) null, 2, (Object) null).get()).create();
                        } catch (Throwable th) {
                            okHttpClientCreate = OkHttpClientWrapper.get();
                        }
                        OkHttpClient.Builder builderNewBuilder = okHttpClientCreate.newBuilder();
                        long jConnectionTimeout = sOkClientConfig.connectionTimeout();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        builderNewBuilder.connectTimeout(jConnectionTimeout, timeUnit);
                        builderNewBuilder.readTimeout(sOkClientConfig.readTimeout(), timeUnit);
                        builderNewBuilder.writeTimeout(sOkClientConfig.writeTimeout(), timeUnit);
                        builderNewBuilder.interceptors().addAll(sOkClientConfig.interceptors());
                        builderNewBuilder.networkInterceptors().addAll(sOkClientConfig.networkInterceptors());
                        f73393a = builderNewBuilder.build();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        OkHttpClient okHttpClient = f73393a;
        return new Retrofit.Builder().addCallAdapterFactory(new ExternalCallAdapterFactory()).addCallAdapterFactory(new BiliCallAdapterFactory(okHttpClient, NetworkManager.getBiliCache())).addCallAdapterFactory(new CallAdapter.Factory()).addCallAdapterFactory(new c(okHttpClient, NetworkManager.getBiliCache())).addConverterFactory(BiliConverterFactory.INSTANCE).callFactory(new BiliCallFactory(okHttpClient));
    }

    @NonNull
    public static <T> T createService(Class<T> cls) {
        return (T) createRetrofitBuilder().baseUrl(a.a(cls)).build().create(cls);
    }
}
