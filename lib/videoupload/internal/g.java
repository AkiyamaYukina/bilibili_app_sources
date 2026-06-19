package com.bilibili.lib.videoupload.internal;

import com.bilibili.base.BiliContext;
import java.util.List;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;
import ug0.C8730c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/internal/g.class */
public class g extends e {
    @Override // com.bilibili.lib.videoupload.internal.e
    public final boolean D(int i7) {
        List<Integer> initStepCodeList = C8730c.b(BiliContext.application()).c().getInitStepCodeList();
        if (initStepCodeList == null || initStepCodeList.isEmpty()) {
            return true;
        }
        return !initStepCodeList.contains(Integer.valueOf(i7));
    }

    @Override // com.bilibili.lib.videoupload.internal.a
    public Call m(String str) {
        OkHttpClient okHttpClient = C8730c.b(this.f65056a).f127860b;
        Request.Builder builder = new Request.Builder();
        RequestBody requestBodyCreate = RequestBody.create((MediaType) null, "");
        vg0.n.a(builder);
        vg0.p.a(builder, a());
        builder.url(str + "?uploads&output=json");
        builder.post(requestBodyCreate);
        return okHttpClient.newCall(builder.build());
    }

    @Override // com.bilibili.lib.videoupload.internal.a
    public final boolean q(String str) throws JSONException {
        l("[BiliUpload] Parse InitUploadStep response: " + str);
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("upload_id");
        ng0.g gVar = this.f65059d;
        synchronized (gVar) {
            gVar.f124179F = strOptString;
        }
        String strOptString2 = jSONObject.optString("key");
        synchronized (gVar) {
            gVar.f124180G = strOptString2;
        }
        String strOptString3 = jSONObject.optString("bucket");
        synchronized (gVar) {
            gVar.f124181H = strOptString3;
        }
        return true;
    }
}
