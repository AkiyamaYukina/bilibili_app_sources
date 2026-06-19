package com.bilibili.biligame.api.call;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.api.BiliApiException;
import com.bilibili.api.base.ok.BiliCache;
import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.api.call.disaster.Disaster;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.search2.result.vertical.live.report.ReporterMap;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/call/BiligameDisasterCall.class */
public final class BiligameDisasterCall<T> extends BiliGameCall<T> {

    @NotNull
    public static final String BASE_DISASTER_URL = "https://line3-statics-h5-mobile-api.biligame.net/disaster/game/center/h5/";

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    public static final String GAME_API_DISASTER_TOLERANT = "ff_game_api_disaster_tolerant";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final List<Annotation> f62158q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final OkHttpClient f62159r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final BiliCache f62160s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f62161t;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/call/BiligameDisasterCall$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/call/BiligameDisasterCall$b.class */
    public static final class b implements BiliGameCallback<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliGameCallback<T> f62162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BiligameDisasterCall<T> f62163b;

        public b(BiliGameCallback<T> biliGameCallback, BiligameDisasterCall<T> biligameDisasterCall) {
            this.f62162a = biliGameCallback;
            this.f62163b = biligameDisasterCall;
        }

        @Override // com.bilibili.biligame.api.call.BiliGameCallback
        public final void onCacheResopnse(T t7) {
            BiliGameCallback<T> biliGameCallback = this.f62162a;
            if (biliGameCallback != null) {
                biliGameCallback.onCacheResopnse(t7);
            }
        }

        public final void onFailure(Call<T> call, Throwable th) {
            BiligameDisasterCall<T> biligameDisasterCall = this.f62163b;
            boolean disasterEnable = biligameDisasterCall.getDisasterEnable();
            BiliGameCallback<T> biliGameCallback = this.f62162a;
            if (disasterEnable) {
                BiligameDisasterCall.Companion.getClass();
                Boolean bool = (Boolean) ConfigManager.Companion.ab().get(BiligameDisasterCall.GAME_API_DISASTER_TOLERANT, Boolean.TRUE);
                if (bool != null ? bool.booleanValue() : true) {
                    BiligameDisasterCall.access$requestDisasterResource(biligameDisasterCall, biliGameCallback, call, th);
                    return;
                }
            }
            if (biliGameCallback != null) {
                biliGameCallback.onFailure(call, th);
            }
        }

        public final void onResponse(Call<T> call, Response<T> response) {
            if (!response.isSuccessful()) {
                onFailure(call, new HttpException(response));
                return;
            }
            Object objBody = response.body();
            BiligameApiResponse biligameApiResponse = objBody instanceof BiligameApiResponse ? (BiligameApiResponse) objBody : null;
            if (biligameApiResponse == null) {
                onFailure(call, new Throwable());
                return;
            }
            if (!biligameApiResponse.isSuccess() || biligameApiResponse.data == null) {
                onFailure(call, new BiliApiException(biligameApiResponse.code, biligameApiResponse.message));
                return;
            }
            BiliGameCallback<T> biliGameCallback = this.f62162a;
            if (biliGameCallback != null) {
                biliGameCallback.onResponse(call, response);
            }
        }
    }

    public BiligameDisasterCall(@Nullable Request request, @Nullable Type type, @Nullable Annotation[] annotationArr, @Nullable OkHttpClient okHttpClient, @Nullable BiliCache biliCache) {
        super(request, type, annotationArr, okHttpClient, biliCache);
        this.f62158q = annotationArr != null ? ArraysKt.asList(annotationArr) : null;
        this.f62159r = okHttpClient;
        this.f62160s = biliCache;
        this.f62161t = true;
    }

    public static final void access$requestDisasterResource(BiligameDisasterCall biligameDisasterCall, BiliGameCallback biliGameCallback, Call call, Throwable th) {
        Annotation annotation;
        String str;
        T next;
        Request request = biligameDisasterCall.request();
        if (request == null) {
            if (biliGameCallback != null) {
                biliGameCallback.onFailure(call, th);
                return;
            }
            return;
        }
        List<Annotation> list = biligameDisasterCall.f62158q;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((Annotation) next) instanceof Disaster) {
                        break;
                    }
                }
            }
            annotation = (Annotation) next;
        } else {
            annotation = null;
        }
        Disaster disaster = annotation instanceof Disaster ? (Disaster) annotation : null;
        if (disaster == null) {
            if (biliGameCallback != null) {
                biliGameCallback.onFailure(call, th);
                return;
            }
            return;
        }
        if ((th instanceof BiliApiException) && disaster.excludeCode().length != 0 && ArraysKt.contains(disaster.excludeCode(), ((BiliApiException) th).mCode)) {
            if (biliGameCallback != null) {
                biliGameCallback.onFailure(call, th);
                return;
            }
            return;
        }
        String strMethod = disaster.method();
        String strUrl = disaster.url();
        if (StringsKt.isBlank(strMethod) || StringsKt.isBlank(strUrl)) {
            if (biliGameCallback != null) {
                biliGameCallback.onFailure(call, th);
                return;
            }
            return;
        }
        HttpUrl httpUrlUrl = request.url();
        int iQuerySize = httpUrlUrl.querySize();
        int i7 = 0;
        String str2 = strUrl;
        while (true) {
            str = str2;
            if (i7 >= iQuerySize) {
                break;
            }
            String strQueryParameterName = httpUrlUrl.queryParameterName(i7);
            String strL = str;
            if (StringsKt.n(str, ReporterMap.LEFT_BRACES + strQueryParameterName + ReporterMap.RIGHT_BRACES)) {
                strL = StringsKt.L(str, android.support.v4.media.a.a(ReporterMap.LEFT_BRACES, strQueryParameterName, ReporterMap.RIGHT_BRACES), httpUrlUrl.queryParameterValue(i7));
            }
            i7++;
            str2 = strL;
        }
        Request requestBuild = request.newBuilder().method(strMethod, request.body()).url(C4496a.a(BASE_DISASTER_URL, str)).build();
        Type responseType = biligameDisasterCall.getResponseType();
        List<Annotation> list2 = biligameDisasterCall.f62158q;
        Annotation[] annotationArr = null;
        if (list2 != null) {
            annotationArr = (Annotation[]) list2.toArray(new Annotation[0]);
        }
        BiliGameCall biliGameCall = new BiliGameCall(requestBuild, responseType, annotationArr, biligameDisasterCall.f62159r, biligameDisasterCall.f62160s);
        biliGameCall.setCacheReadable(false);
        biliGameCall.setCacheWritable(false);
        biliGameCall.enqueue(biliGameCallback);
    }

    @Override // com.bilibili.biligame.api.call.BiliGameCall
    public void enqueue(@Nullable BiliGameCallback<T> biliGameCallback) {
        super.enqueue((BiliGameCallback) new b(biliGameCallback, this));
    }

    public final boolean getDisasterEnable() {
        return this.f62161t;
    }

    public final void setDisasterEnable(boolean z6) {
        this.f62161t = z6;
    }
}
