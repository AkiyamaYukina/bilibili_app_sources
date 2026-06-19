package com.bilibili.okretro.call.rxjava.rxjava3;

import Zl0.a;
import Zl0.b;
import Zl0.c;
import Zl0.e;
import androidx.annotation.NonNull;
import com.bilibili.api.base.util.Types;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.okretro.call.NoSchedulers;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Observable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/rxjava/rxjava3/RxJava3CallAdapter.class */
public final class RxJava3CallAdapter<R> implements CallAdapter<R, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f73436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f73437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f73438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f73439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f73440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f73441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f73442g;
    public final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Retrofit f73443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Annotation[] f73444j;

    public RxJava3CallAdapter(Type type, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, Retrofit retrofit, Annotation[] annotationArr) {
        this.f73436a = type;
        this.f73437b = z6;
        this.f73438c = z7;
        this.f73439d = z8;
        this.f73440e = z9;
        this.f73441f = z10;
        this.f73442g = z11;
        this.h = z12;
        this.f73443i = retrofit;
        this.f73444j = annotationArr;
    }

    public final Object adapt(@NonNull Call<R> call) {
        Observable aVar;
        Annotation[] annotationArr = this.f73444j;
        Annotation[] annotationArr2 = (Annotation[]) Arrays.copyOf(annotationArr, annotationArr.length + 1);
        annotationArr2[annotationArr2.length - 1] = new NoSchedulers(this) { // from class: com.bilibili.okretro.call.rxjava.rxjava3.RxJava3CallAdapter.1
            final RxJava3CallAdapter this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.annotation.Annotation
            public Class<? extends Annotation> annotationType() {
                return NoSchedulers.class;
            }
        };
        Observable bVar = this.f73437b ? new b((BiliCall) this.f73443i.callAdapter(Types.newParameterizedType(BiliCall.class, new Type[]{this.f73436a}), annotationArr2).adapt(call)) : new c(call);
        if (this.f73438c) {
            aVar = new e(bVar);
        } else {
            aVar = bVar;
            if (this.f73439d) {
                aVar = new a(bVar);
            }
        }
        if (this.f73440e) {
            return aVar.toFlowable(BackpressureStrategy.LATEST);
        }
        if (this.f73441f) {
            return aVar.singleOrError();
        }
        if (this.f73442g) {
            return aVar.singleElement();
        }
        Observable observableIgnoreElements = aVar;
        if (this.h) {
            observableIgnoreElements = aVar.ignoreElements();
        }
        return observableIgnoreElements;
    }

    public final Type responseType() {
        return this.f73436a;
    }
}
