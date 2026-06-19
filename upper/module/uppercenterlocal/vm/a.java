package com.bilibili.upper.module.uppercenterlocal.vm;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.common.hilowebview.http.j;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.SafeContinuation;
import okhttp3.ResponseBody;
import q4.M;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/vm/a.class */
public final class a implements Callback<ResponseBody> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SafeContinuation f114300a;

    public a(SafeContinuation safeContinuation) {
        this.f114300a = safeContinuation;
    }

    public final void onFailure(Call<ResponseBody> call, Throwable th) {
        j.a aVar = new j.a(440, C4496a.a("http failed: ", th.getMessage()));
        M.b("fetchInspirationCard onFailure: ", th.getMessage(), "UpperCenterLocalViewModel");
        this.f114300a.resumeWith(Result.constructor-impl(aVar));
    }

    public final void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
        j.b aVar;
        InputStream inputStreamByteStream;
        int iCode = response.code();
        Map multimap = response.headers().toMultimap();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(multimap.size()));
        for (Map.Entry entry : multimap.entrySet()) {
            linkedHashMap.put(entry.getKey(), (String) CollectionsKt.first((List) entry.getValue()));
        }
        Map mutableMap = MapsKt.toMutableMap(linkedHashMap);
        if (response.isSuccessful()) {
            ResponseBody responseBody = (ResponseBody) response.body();
            if (responseBody == null || (inputStreamByteStream = responseBody.byteStream()) == null) {
                aVar = new j.a(iCode, "response data is empty");
                T7.a.a(iCode, "fetchInspirationCard onResponse null, code=", "UpperCenterLocalViewModel");
            } else {
                String strMessage = response.message();
                String str = strMessage;
                if (strMessage.length() == 0) {
                    str = "success";
                }
                aVar = new j.b(iCode, str, mutableMap, inputStreamByteStream);
            }
        } else {
            aVar = new j.a(response.code(), response.message());
            androidx.constraintlayout.widget.a.b(iCode, "fetchInspirationCard onResponse error code=", ", message=", response.message(), "UpperCenterLocalViewModel");
        }
        this.f114300a.resumeWith(Result.constructor-impl(aVar));
    }
}
