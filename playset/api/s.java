package com.bilibili.playset.api;

import af0.C3204c;
import android.content.Context;
import com.bilibili.api.BiliApiException;
import com.bilibili.lib.riskcontrol.BiliRiskException;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.GeneralResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/s.class */
public final class s implements Callback<GeneralResponse<Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliApiDataCallback<Object> f84105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f84106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f84108d;

    public s(BiliApiDataCallback biliApiDataCallback, Context context, String str, n nVar) {
        this.f84105a = biliApiDataCallback;
        this.f84106b = context;
        this.f84107c = str;
        this.f84108d = nVar;
    }

    public final void onFailure(Call<GeneralResponse<Object>> call, Throwable th) {
        this.f84105a.onError(th);
    }

    public final void onResponse(Call<GeneralResponse<Object>> call, Response<GeneralResponse<Object>> response) {
        final GeneralResponse generalResponse = (GeneralResponse) response.body();
        final BiliApiDataCallback<Object> biliApiDataCallback = this.f84105a;
        if (generalResponse == null) {
            biliApiDataCallback.onError(new Exception("response body is null"));
            return;
        }
        int i7 = generalResponse.code;
        if (i7 == 0) {
            biliApiDataCallback.onDataSuccess(generalResponse.data);
            return;
        }
        if (i7 != -352) {
            biliApiDataCallback.onError(new BiliApiException(generalResponse.code, generalResponse.message));
            return;
        }
        String str = response.headers().get("x-bili-gaia-vvoucher");
        Context context = this.f84106b;
        final n nVar = this.f84108d;
        Function2 function2 = new Function2(nVar, biliApiDataCallback, generalResponse) { // from class: com.bilibili.playset.api.r

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final n f84102a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliApiDataCallback f84103b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final GeneralResponse f84104c;

            {
                this.f84102a = nVar;
                this.f84103b = biliApiDataCallback;
                this.f84104c = generalResponse;
            }

            public final Object invoke(Object obj, Object obj2) {
                String errorCode;
                String str2 = (String) obj;
                BiliRiskException biliRiskException = (BiliRiskException) obj2;
                if (str2 == null || !(!StringsKt.isBlank(str2))) {
                    this.f84103b.onError(new BiliApiException((biliRiskException == null || (errorCode = biliRiskException.getErrorCode()) == null) ? this.f84104c.code : Integer.parseInt(errorCode), biliRiskException != null ? biliRiskException.getErrorMsg() : null));
                } else {
                    this.f84102a.invoke(str2);
                }
                return Unit.INSTANCE;
            }
        };
        String str2 = this.f84107c;
        C3204c c3204c = C3204c.f31136a;
        String str3 = str;
        if (str == null) {
            str3 = "";
        }
        c3204c.a(context, str3, str2, new q(function2));
    }
}
