package com.bilibili.lib.videoupload.internal;

import Qh1.v;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bilibili.base.BiliContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
import ug0.C8730c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/internal/h.class */
public final class h extends e {
    @Override // com.bilibili.lib.videoupload.internal.e
    public final boolean D(int i7) {
        List<Integer> mergeStepCodeList = C8730c.b(BiliContext.application()).c().getMergeStepCodeList();
        if (mergeStepCodeList == null || mergeStepCodeList.isEmpty()) {
            return true;
        }
        return !mergeStepCodeList.contains(Integer.valueOf(i7));
    }

    public final Map<String, String> G() {
        String str;
        int i7;
        int i8;
        HashMap map = new HashMap(16);
        ng0.g gVar = this.f65059d;
        synchronized (gVar) {
            str = gVar.f124179F;
        }
        map.put("uploadId", str);
        synchronized (this.f65059d) {
        }
        map.put("profile", this.f65059d.o());
        ng0.g gVar2 = this.f65059d;
        synchronized (gVar2) {
            i7 = gVar2.f124187N;
        }
        if (i7 > 0) {
            StringBuilder sb = new StringBuilder();
            ng0.g gVar3 = this.f65059d;
            synchronized (gVar3) {
                i8 = gVar3.f124187N;
            }
            sb.append(i8);
            sb.append("");
            map.put("resolution", sb.toString());
        }
        map.put("from", this.f65059d.j());
        map.put("biz_id", this.f65059d.e());
        map.put("output", "json");
        return map;
    }

    @Override // com.bilibili.lib.videoupload.internal.a
    public final Response i(Response response) {
        ng0.g gVar = this.f65059d;
        l("[BiliUpload] interceptResponse");
        if (!((Boolean) vg0.c.f128232v.getValue()).booleanValue() || response.code() != 400) {
            return null;
        }
        int i7 = 0;
        while (i7 <= 2) {
            try {
                String[] strArr = vg0.k.f128240a;
                vg0.k.f(0, "start", gVar.x(), gVar.f124196a, gVar.e(), "");
                OkHttpClient okHttpClient = C8730c.b(this.f65056a).f127860b;
                Request.Builder builder = new Request.Builder();
                vg0.p.a(builder, a());
                vg0.n.a(builder);
                builder.url(vg0.p.l(gVar.F(), G()));
                builder.head();
                Response responseExecute = okHttpClient.newCall(builder.build()).execute();
                if (responseExecute.code() == 200 && !Objects.equals(responseExecute.header("X-Luffy-Object-Status"), "Uploading")) {
                    l("[BiliUpload] checkIsMerged response=merge success");
                    vg0.k.f(0, "success", gVar.x(), gVar.f124196a, gVar.e(), "");
                    return responseExecute;
                }
                vg0.k.f(responseExecute.code(), "fail", gVar.x(), gVar.f124196a, gVar.e(), responseExecute.message());
                k("[BiliUpload] checkIsMerged response=merge error=" + responseExecute.code() + " msg=" + responseExecute.message());
                return null;
            } catch (Exception e7) {
                k("[BiliUpload] duplicateMerge error=" + e7.getMessage());
                if (i7 == 2) {
                    String[] strArr2 = vg0.k.f128240a;
                    vg0.k.f(-1, "fail", gVar.x(), gVar.f124196a, gVar.e(), e7.getMessage());
                    return null;
                }
                i7++;
                try {
                    Thread.sleep(e.F(i7));
                } catch (Exception e8) {
                    k("[BiliUpload] duplicateMerge sleep exception=" + e8.getMessage());
                    e8.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override // com.bilibili.lib.videoupload.internal.a
    @Nullable
    public final Call m(String str) {
        OkHttpClient okHttpClient = C8730c.b(this.f65056a).f127860b;
        Request.Builder builder = new Request.Builder();
        vg0.p.a(builder, a());
        vg0.n.a(builder);
        Map<String, String> mapG = G();
        RequestBody requestBodyCreate = RequestBody.create((MediaType) null, "");
        builder.url(vg0.p.l(str, mapG));
        builder.post(requestBodyCreate);
        return okHttpClient.newCall(builder.build());
    }

    @Override // com.bilibili.lib.videoupload.internal.a
    public final boolean q(String str) throws JSONException {
        l("[BiliUpload] Parse MergeChunkStep response: " + str);
        try {
            String strOptString = new JSONObject(str).optString("key");
            if (TextUtils.isEmpty(strOptString)) {
                return true;
            }
            ng0.g gVar = this.f65059d;
            synchronized (gVar) {
                gVar.f124180G = strOptString;
            }
            return true;
        } catch (Exception e7) {
            StringBuilder sbB = v.b("[BiliUpload] mergeChunk parseResponse:", e7);
            sbB.append(e7.getMessage());
            k(sbB.toString());
            return true;
        }
    }
}
