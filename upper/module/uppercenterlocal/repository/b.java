package com.bilibili.upper.module.uppercenterlocal.repository;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.common.hilowebview.http.j;
import com.bilibili.studio.videoeditor.extension.d;
import com.bilibili.upper.module.uppercenterlocal.repository.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.SafeContinuation;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/repository/b.class */
public final class b implements Callback<ResponseBody> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SafeContinuation f114266a;

    public b(SafeContinuation safeContinuation) {
        this.f114266a = safeContinuation;
    }

    public final void onFailure(Call<ResponseBody> call, Throwable th) {
        BLog.e("MainDataRepository", "onFailure: " + th.getMessage());
        d.b(new a.C1236a(null, null, new j.a(440, C4496a.a("http failed: ", th.getMessage()))), this.f114266a);
    }

    public final void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
        a.C1236a c1236a;
        int iCode = response.code();
        Map multimap = response.headers().toMultimap();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(multimap.size()));
        for (Map.Entry entry : multimap.entrySet()) {
            linkedHashMap.put(entry.getKey(), (String) CollectionsKt.first((List) entry.getValue()));
        }
        Map mutableMap = MapsKt.toMutableMap(linkedHashMap);
        if (response.isSuccessful()) {
            ResponseBody responseBody = (ResponseBody) response.body();
            byte[] bArrBytes = responseBody != null ? responseBody.bytes() : null;
            if (bArrBytes != null) {
                String strMessage = response.message();
                String str = strMessage;
                if (strMessage.length() == 0) {
                    str = "success";
                }
                c1236a = new a.C1236a(bArrBytes, new a.b(iCode, str, mutableMap), null);
            } else {
                BLog.e("MainDataRepository", "onResponse null, code=" + iCode);
                c1236a = new a.C1236a(null, null, new j.a(iCode, "response data is empty"));
            }
        } else {
            BLog.e("MainDataRepository", "onResponse error code=" + iCode + ", message=" + response.message());
            c1236a = new a.C1236a(null, null, new j.a(iCode, response.message()));
        }
        d.b(c1236a, this.f114266a);
    }
}
