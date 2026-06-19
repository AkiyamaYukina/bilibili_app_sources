package com.bilibili.okretro.call.rxjava;

import Zl0.f;
import aY0.o;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.bilibili.api.BiliApiException;
import com.bilibili.api.base.util.Types;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.okretro.call.NoSchedulers;
import com.bilibili.okretro.call.rxjava.BiliCall2RxJava3AdapterFactory;
import com.google.gson.JsonElement;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.mixed.CompletableAndThenObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.ConnectException;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.HttpException;
import retrofit2.Response;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/rxjava/BiliCall2RxJava3AdapterFactory.class */
public final class BiliCall2RxJava3AdapterFactory extends CallAdapter.Factory {

    @NotNull
    private final f impl = new f();

    @NotNull
    private final Class<? extends Object>[] supportedTypes = {Observable.class, Single.class, o.class, Flowable.class, aY0.a.class};

    /* JADX INFO: renamed from: com.bilibili.okretro.call.rxjava.BiliCall2RxJava3AdapterFactory$get$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/rxjava/BiliCall2RxJava3AdapterFactory$get$1.class */
    public static final class AnonymousClass1 implements CallAdapter<Object, Object> {
        final CallAdapter<?, ?> $original;
        final Class<?> $rawType;
        final boolean $shouldAddSchedulers;
        final SplitGeneralResponse $splitBaseEntity;
        final BiliCall2RxJava3AdapterFactory this$0;

        public AnonymousClass1(CallAdapter<?, ?> callAdapter, BiliCall2RxJava3AdapterFactory biliCall2RxJava3AdapterFactory, boolean z6, SplitGeneralResponse splitGeneralResponse, Class<?> cls) {
            this.$original = callAdapter;
            this.this$0 = biliCall2RxJava3AdapterFactory;
            this.$shouldAddSchedulers = z6;
            this.$splitBaseEntity = splitGeneralResponse;
            this.$rawType = cls;
        }

        private final aY0.a fastFailingCompletable(final Throwable th) {
            return new io.reactivex.rxjava3.internal.operators.completable.c(new Action(th) { // from class: com.bilibili.okretro.call.rxjava.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Throwable f73430a;

                {
                    this.f73430a = th;
                }

                public final void run() throws ConnectException {
                    BiliCall2RxJava3AdapterFactory.AnonymousClass1.fastFailingCompletable$lambda$0(this.f73430a);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void fastFailingCompletable$lambda$0(Throwable th) throws ConnectException {
            if (ConnectivityMonitor.getInstance().isNetworkActive()) {
                return;
            }
            ConnectException connectException = new ConnectException("no network");
            connectException.initCause(th);
            throw connectException;
        }

        public Object adapt(Call<Object> call) {
            Observable observableIgnoreElements;
            Observable observable = (Observable) this.$original.adapt(call);
            final Exception exc = new Exception("Following is the stacktrace of rx subscription. Args: " + call.request());
            this.this$0.trimStacktrace(exc);
            final SplitGeneralResponse splitGeneralResponse = this.$splitBaseEntity;
            Observable observableOnErrorResumeNext = observable.onErrorResumeNext(new Function(splitGeneralResponse, exc, this) { // from class: com.bilibili.okretro.call.rxjava.BiliCall2RxJava3AdapterFactory$get$1$adapt$1
                final SplitGeneralResponse $splitBaseEntity;
                final Exception $tracker;
                final BiliCall2RxJava3AdapterFactory.AnonymousClass1 this$0;

                {
                    this.$splitBaseEntity = splitGeneralResponse;
                    this.$tracker = exc;
                    this.this$0 = this;
                }

                public final ObservableSource<? extends Object> apply(Throwable th) {
                    SplitGeneralResponse splitGeneralResponse2;
                    RxGeneralResponse rxGeneralResponse;
                    ResponseBody responseBodyErrorBody;
                    if (th instanceof HttpException) {
                        HttpException httpException = (HttpException) th;
                        if (httpException.code() / 100 == 4 && (splitGeneralResponse2 = this.$splitBaseEntity) != null && splitGeneralResponse2.parse4XX()) {
                            Response response = httpException.response();
                            try {
                                rxGeneralResponse = (RxGeneralResponse) JSON.parseObject((response == null || (responseBodyErrorBody = response.errorBody()) == null) ? null : responseBodyErrorBody.string(), Types.newParameterizedType(RxGeneralResponse.class, new Type[]{JSONObject.class}), new Feature[0]);
                            } catch (Exception e7) {
                                rxGeneralResponse = null;
                            }
                            if (rxGeneralResponse != null) {
                                return Observable.error(new BiliRxApiException(rxGeneralResponse.code, rxGeneralResponse.message, (JSONObject) rxGeneralResponse.getData(), this.$tracker));
                            }
                        }
                    }
                    return Observable.error(this.this$0.mapError(th, this.$tracker));
                }
            });
            aY0.a aVarFastFailingCompletable = fastFailingCompletable(exc);
            aVarFastFailingCompletable.getClass();
            Objects.requireNonNull(observableOnErrorResumeNext, "next is null");
            Observable completableAndThenObservable = new CompletableAndThenObservable(aVarFastFailingCompletable, observableOnErrorResumeNext);
            Observable observableObserveOn = completableAndThenObservable;
            if (this.$shouldAddSchedulers) {
                observableObserveOn = completableAndThenObservable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            }
            Observable map = observableObserveOn;
            if (this.$splitBaseEntity != null) {
                if (Intrinsics.areEqual(this.$rawType, aY0.a.class)) {
                    final SplitGeneralResponse splitGeneralResponse2 = this.$splitBaseEntity;
                    map = observableObserveOn.map(new Function(splitGeneralResponse2, exc) { // from class: com.bilibili.okretro.call.rxjava.BiliCall2RxJava3AdapterFactory$get$1$adapt$2
                        final SplitGeneralResponse $splitBaseEntity;
                        final Exception $tracker;

                        {
                            this.$splitBaseEntity = splitGeneralResponse2;
                            this.$tracker = exc;
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.api.BiliApiException */
                        public /* bridge */ /* synthetic */ Object apply(Object obj) throws BiliApiException {
                            apply((RxGeneralResponse<?>) obj);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.api.BiliApiException */
                        public final void apply(RxGeneralResponse<?> rxGeneralResponse) throws BiliApiException {
                            int i7 = rxGeneralResponse.code;
                            String str = rxGeneralResponse.message;
                            if (this.$splitBaseEntity.strict() && !rxGeneralResponse.isSuccess()) {
                                throw new BiliRxApiException(i7, str, null, this.$tracker);
                            }
                        }
                    });
                } else {
                    final SplitGeneralResponse splitGeneralResponse3 = this.$splitBaseEntity;
                    final Class<?> cls = this.$rawType;
                    map = observableObserveOn.map(new Function(splitGeneralResponse3, cls, exc) { // from class: com.bilibili.okretro.call.rxjava.BiliCall2RxJava3AdapterFactory$get$1$adapt$3
                        final Class<?> $rawType;
                        final SplitGeneralResponse $splitBaseEntity;
                        final Exception $tracker;

                        {
                            this.$splitBaseEntity = splitGeneralResponse3;
                            this.$rawType = cls;
                            this.$tracker = exc;
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.api.BiliApiException */
                        public final Object apply(RxGeneralResponse<?> rxGeneralResponse) throws BiliApiException {
                            int i7 = rxGeneralResponse.code;
                            Object data = rxGeneralResponse.getData();
                            String str = rxGeneralResponse.message;
                            if ((!this.$splitBaseEntity.strict() || rxGeneralResponse.isSuccess()) && (data != null || Intrinsics.areEqual(this.$rawType, aY0.a.class))) {
                                return data;
                            }
                            Object json = JSON.toJSON(data);
                            throw new BiliRxApiException(i7, str, json instanceof JSONObject ? (JSONObject) json : null, this.$tracker);
                        }
                    });
                }
            }
            Class<?> cls2 = this.$rawType;
            if (Intrinsics.areEqual(cls2, Flowable.class)) {
                observableIgnoreElements = map.toFlowable(BackpressureStrategy.LATEST);
            } else if (Intrinsics.areEqual(cls2, Single.class)) {
                observableIgnoreElements = map.singleOrError();
            } else if (Intrinsics.areEqual(cls2, o.class)) {
                observableIgnoreElements = map.singleElement();
            } else {
                observableIgnoreElements = map;
                if (Intrinsics.areEqual(cls2, aY0.a.class)) {
                    observableIgnoreElements = map.ignoreElements();
                }
            }
            return observableIgnoreElements;
        }

        public final Throwable mapError(Throwable th, Exception exc) {
            if (th.getCause() == null) {
                th.initCause(exc);
            }
            return th;
        }

        public Type responseType() {
            return this.$original.responseType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trimStacktrace(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i7];
            if (Intrinsics.areEqual(stackTraceElement.getClassName(), Proxy.class.getName()) && Intrinsics.areEqual(stackTraceElement.getMethodName(), "invoke")) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 < 0 || i7 >= stackTrace.length - 2) {
            return;
        }
        th.setStackTrace((StackTraceElement[]) ArraysKt.copyOfRange(stackTrace, i7 + 2, stackTrace.length));
    }

    @Nullable
    public CallAdapter<?, ?> get(@NotNull Type type, @NotNull Annotation[] annotationArr, @NotNull Retrofit retrofit) {
        Annotation annotation;
        boolean z6;
        Class rawType = CallAdapter.Factory.getRawType(type);
        if (!ArraysKt.contains(this.supportedTypes, rawType)) {
            return null;
        }
        int length = annotationArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i7];
            if (annotation instanceof SplitGeneralResponse) {
                break;
            }
            i7++;
        }
        SplitGeneralResponse splitGeneralResponse = (SplitGeneralResponse) annotation;
        CallAdapter<?, ?> callAdapter = this.impl.get(Types.newParameterizedType(Observable.class, new Type[]{splitGeneralResponse != null ? type instanceof ParameterizedType ? Types.newParameterizedType(RxGeneralResponse.class, new Type[]{((ParameterizedType) type).getActualTypeArguments()[0]}) : Types.newParameterizedType(RxGeneralResponse.class, new Type[]{JsonElement.class}) : type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Unit.class}), annotationArr, retrofit);
        if (callAdapter == null) {
            return null;
        }
        int length2 = annotationArr.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length2) {
                z6 = true;
                break;
            }
            if (annotationArr[i8] instanceof NoSchedulers) {
                z6 = false;
                break;
            }
            i8++;
        }
        return new AnonymousClass1(callAdapter, this, z6, splitGeneralResponse, rawType);
    }
}
