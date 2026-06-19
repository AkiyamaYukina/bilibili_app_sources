package com.bilibili.okretro.call;

import com.bilibili.api.base.ok.BiliCache;
import com.bilibili.api.base.util.NetworkManager;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/BiliCallAdapterFactory.class */
public class BiliCallAdapterFactory extends CallAdapter.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f73420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiliCache f73421b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/BiliCallAdapterFactory$a.class */
    public final class a implements CallAdapter<Object, BiliCall> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f73422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Annotation[] f73423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BiliCallAdapterFactory f73424c;

        public a(BiliCallAdapterFactory biliCallAdapterFactory, Type type, Annotation[] annotationArr) {
            this.f73424c = biliCallAdapterFactory;
            this.f73422a = type;
            this.f73423b = annotationArr;
        }

        public final Object adapt(Call call) {
            b uIExecutor;
            Annotation[] annotationArr = this.f73423b;
            int length = annotationArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    uIExecutor = NetworkManager.getUIExecutor();
                    break;
                }
                if (annotationArr[i7] instanceof NoSchedulers) {
                    uIExecutor = b.f73425a;
                    break;
                }
                i7++;
            }
            Request request = call.request();
            Type typeResponseType = responseType();
            Annotation[] annotationArr2 = this.f73423b;
            BiliCallAdapterFactory biliCallAdapterFactory = this.f73424c;
            return new BiliCall(request, typeResponseType, annotationArr2, biliCallAdapterFactory.f73420a, biliCallAdapterFactory.f73421b, uIExecutor);
        }

        public final Type responseType() {
            return CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) this.f73422a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/BiliCallAdapterFactory$b.class */
    public static final class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f73425a = new Object();

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public BiliCallAdapterFactory(OkHttpClient okHttpClient, BiliCache biliCache) {
        this.f73420a = okHttpClient;
        this.f73421b = biliCache;
    }

    public CallAdapter<?, BiliCall> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (CallAdapter.Factory.getRawType(type) != BiliCall.class) {
            return null;
        }
        return new a(this, type, annotationArr);
    }
}
