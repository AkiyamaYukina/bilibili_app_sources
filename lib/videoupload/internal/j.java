package com.bilibili.lib.videoupload.internal;

import Qh1.v;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.alipaysecuritysdk.rds.constant.DictionaryKeys;
import com.bilibili.api.BiliConfig;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.foundation.Foundation;
import com.bilibili.lib.videoupload.bean.UploadDynamicConcurrencyConfig;
import com.bilibili.lib.videoupload.bean.UploadRiskControlBean;
import com.bilibili.lib.videoupload.speeddetect.Line;
import com.bilibili.lib.videoupload.speeddetect.UploadLineSpeedDetect;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.nativelibrary.LibBili;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ug0.C8730c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/internal/j.class */
public class j extends e {
    @Override // com.bilibili.lib.videoupload.internal.e
    public final boolean D(int i7) {
        List<Integer> preUploadStepCodeList = C8730c.b(BiliContext.application()).c().getPreUploadStepCodeList();
        if (preUploadStepCodeList == null || preUploadStepCodeList.isEmpty()) {
            return true;
        }
        return !preUploadStepCodeList.contains(Integer.valueOf(i7));
    }

    public Map<String, String> G() {
        int i7;
        this.f65059d.J(vg0.p.f());
        this.f65059d.K(vg0.p.g());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        if (TextUtils.isEmpty(this.f65059d.f124200e)) {
            concurrentHashMap.put("name", "");
        } else {
            concurrentHashMap.put("name", this.f65059d.f124200e);
        }
        if (TextUtils.isEmpty(this.f65059d.f124199d)) {
            concurrentHashMap.put("path", "");
        } else {
            concurrentHashMap.put("path", this.f65059d.f124199d);
        }
        concurrentHashMap.put(TextSource.CFG_SIZE, android.support.v4.media.session.a.a(new StringBuilder(), this.f65059d.f124201f, ""));
        StringBuilder sb = new StringBuilder();
        ng0.g gVar = this.f65059d;
        synchronized (gVar) {
            i7 = gVar.f124207m;
        }
        sb.append(i7);
        sb.append("");
        concurrentHashMap.put("net_state", sb.toString());
        concurrentHashMap.put("os_version", Build.VERSION.RELEASE);
        concurrentHashMap.put("device", Build.BRAND + "|" + Build.MODEL);
        String versionName = Foundation.instance().getApps().getVersionName();
        if (TextUtils.isEmpty(versionName)) {
            concurrentHashMap.put("version", "");
        } else {
            concurrentHashMap.put("version", versionName);
        }
        if (this.f65059d.D()) {
            concurrentHashMap.put("upcdn", "bili");
        }
        UploadDynamicConcurrencyConfig uploadDynamicConcurrencyConfigD = C8730c.b(this.f65056a).d();
        if (uploadDynamicConcurrencyConfigD.getEnableDynamicConcurrency() == 1) {
            concurrentHashMap.put("chunk_size_mb", uploadDynamicConcurrencyConfigD.getChunkSize() + "");
        }
        if (vg0.c.d() && !TextUtils.isEmpty(this.f65059d.r())) {
            concurrentHashMap.put("gaia_vtoken", this.f65059d.r());
        }
        return concurrentHashMap;
    }

    @Override // com.bilibili.lib.videoupload.internal.a
    public final UploadRiskControlBean e(String str) {
        UploadRiskControlBean uploadRiskControlBean;
        if (!vg0.c.d()) {
            return null;
        }
        ng0.g gVar = this.f65059d;
        if (gVar != null && gVar.E()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("code");
            uploadRiskControlBean = null;
            if (iOptInt == 601) {
                uploadRiskControlBean = new UploadRiskControlBean();
                try {
                    uploadRiskControlBean.errorMsg = jSONObject.optString("message");
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("detail");
                    if (jSONObjectOptJSONObject != null) {
                        uploadRiskControlBean.vVoucher = jSONObjectOptJSONObject.optString("v_voucher");
                    }
                    l("[BiliUpload] checkRiskControlMsg, code = " + iOptInt + ", riskControl = " + uploadRiskControlBean);
                } catch (Exception e7) {
                    e = e7;
                    StringBuilder sbB = v.b("[BiliUpload] checkRiskControlMsg exception: ", e);
                    sbB.append(e.getMessage());
                    l(sbB.toString());
                }
            }
        } catch (Exception e8) {
            e = e8;
            uploadRiskControlBean = null;
        }
        return uploadRiskControlBean;
    }

    @Override // com.bilibili.lib.videoupload.internal.a
    public final Call m(String str) {
        Line line;
        Unit unit;
        List listR;
        OkHttpClient okHttpClient = C8730c.b(this.f65056a).f127860b;
        Request.Builder builder = new Request.Builder();
        vg0.n.a(builder);
        Map<String, String> mapG = G();
        Context context = this.f65056a;
        String accessKey = BiliAccounts.get(context).getAccessKey();
        if (TextUtils.isEmpty(accessKey)) {
            ((ConcurrentHashMap) mapG).put(Tm0.a.f24206c, "");
        } else {
            ((ConcurrentHashMap) mapG).put(Tm0.a.f24206c, accessKey);
        }
        String appKey = BiliConfig.getAppKey();
        if (TextUtils.isEmpty(appKey)) {
            ((ConcurrentHashMap) mapG).put(DictionaryKeys.V2_APPKEY, "");
        } else {
            ((ConcurrentHashMap) mapG).put(DictionaryKeys.V2_APPKEY, appKey);
        }
        String str2 = BiliAccounts.get(context).mid() + "";
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) mapG;
        concurrentHashMap.put(EditCustomizeSticker.TAG_MID, str2);
        concurrentHashMap.put("r", "upos");
        String strO = this.f65059d.o();
        if (TextUtils.isEmpty(strO)) {
            concurrentHashMap.put("profile", "");
        } else {
            concurrentHashMap.put("profile", strO);
        }
        String strB = vg0.p.b();
        if (TextUtils.isEmpty(strB)) {
            concurrentHashMap.put("build", "");
        } else {
            concurrentHashMap.put("build", strB);
        }
        String mobiApp = BiliConfig.getMobiApp();
        if (TextUtils.isEmpty(mobiApp)) {
            concurrentHashMap.put("mobi_app", "");
        } else {
            concurrentHashMap.put("mobi_app", mobiApp);
        }
        ConcurrentHashMap<String, Line> concurrentHashMap2 = UploadLineSpeedDetect.f65120a;
        if (((Boolean) vg0.c.f128218g.getValue()).booleanValue()) {
            ConcurrentHashMap<String, Line> concurrentHashMap3 = UploadLineSpeedDetect.f65120a;
            String strD = UploadLineSpeedDetect.d();
            if (strD != null && (line = UploadLineSpeedDetect.f65120a.get(strD)) != null && (UploadLineSpeedDetect.e(strD) || UploadLineSpeedDetect.b(line))) {
                concurrentHashMap.put("r", line.getOs());
                try {
                    Result.Companion companion = Result.Companion;
                    String query = line.getQuery();
                    if (query == null || (listR = StringsKt.R(query, new String[]{"&"}, 0, 6)) == null) {
                        unit = null;
                    } else {
                        Iterator it = listR.iterator();
                        while (it.hasNext()) {
                            List listR2 = StringsKt.R((String) it.next(), new String[]{"="}, 0, 6);
                            if (listR2.size() == 2) {
                                concurrentHashMap.put(listR2.get(0), listR2.get(1));
                            }
                        }
                        unit = Unit.INSTANCE;
                    }
                    Result.constructor-impl(unit);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Result.constructor-impl(ResultKt.createFailure(th));
                }
            }
        }
        builder.url(vg0.p.k("https://member.bilibili.com/preupload", LibBili.signQuery(mapG).toString()));
        return okHttpClient.newCall(builder.build());
    }

    @Override // com.bilibili.lib.videoupload.internal.a
    public final boolean q(String str) throws JSONException {
        String str2;
        l("[BiliUpload] Parse PreuploadStep response: " + str);
        JSONObject jSONObject = new JSONObject(str);
        ng0.g gVar = this.f65059d;
        String strOptString = jSONObject.optString("upos_uri");
        synchronized (gVar) {
            gVar.f124217w = strOptString;
        }
        ng0.g gVar2 = this.f65059d;
        String strOptString2 = jSONObject.optString("biz_id");
        synchronized (gVar2) {
            gVar2.f124218x = strOptString2;
        }
        String strOptString3 = jSONObject.optString("endpoint");
        if (!TextUtils.isEmpty(strOptString3)) {
            this.f65059d.a(strOptString3);
            ng0.g gVar3 = this.f65059d;
            gVar3.c(vg0.p.j(strOptString3, gVar3.z()));
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("endpoints");
        if (jSONArrayOptJSONArray != null) {
            for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                String string = jSONArrayOptJSONArray.getString(i7);
                if (!TextUtils.isEmpty(string)) {
                    this.f65059d.a(string);
                    ng0.g gVar4 = this.f65059d;
                    gVar4.c(vg0.p.j(string, gVar4.z()));
                }
            }
        }
        ng0.g gVar5 = this.f65059d;
        String strOptString4 = jSONObject.optString("auth");
        synchronized (gVar5) {
            gVar5.f124216v = strOptString4;
        }
        ng0.g gVar6 = this.f65059d;
        synchronized (gVar6) {
            str2 = gVar6.f124216v;
        }
        if (str2 == null) {
            k("[BiliUpload] setAuth, auth is null");
        }
        String strOptString5 = jSONObject.optString("chunk_size");
        ng0.g gVar7 = this.f65059d;
        int i8 = vg0.p.i(strOptString5, 4194304);
        synchronized (gVar7) {
            gVar7.f124174A = i8;
        }
        String strOptString6 = jSONObject.optString("chunk_retry");
        ng0.g gVar8 = this.f65059d;
        int i9 = vg0.p.i(strOptString6, 10);
        synchronized (gVar8) {
            gVar8.f124176C = i9;
        }
        String strOptString7 = jSONObject.optString("chunk_retry_delay");
        ng0.g gVar9 = this.f65059d;
        int i10 = vg0.p.i(strOptString7, 1);
        synchronized (gVar9) {
            gVar9.f124175B = i10;
        }
        String strOptString8 = jSONObject.optString("timeout");
        ng0.g gVar10 = this.f65059d;
        int i11 = vg0.p.i(strOptString8, 600);
        synchronized (gVar10) {
            gVar10.f124177D = i11;
        }
        ng0.g gVar11 = this.f65059d;
        int iOptInt = jSONObject.optInt("threads");
        synchronized (gVar11) {
            gVar11.f124178E = iOptInt;
        }
        synchronized (this.f65059d) {
        }
        ng0.g gVar12 = this.f65059d;
        synchronized (gVar12) {
            gVar12.f124194U = null;
        }
        ng0.g gVar13 = this.f65059d;
        synchronized (gVar13) {
            gVar13.f124195V = null;
        }
        return true;
    }

    @Override // com.bilibili.lib.videoupload.internal.a
    public final String r(String str) {
        String strOptString;
        String str2 = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("code");
            strOptString = null;
            if (iOptInt >= 400) {
                strOptString = null;
                if (iOptInt < 500) {
                    strOptString = jSONObject.optString("message");
                }
            }
            String str3 = strOptString;
            StringBuilder sb = new StringBuilder("[BiliUpload] parseServerErrorMsg, code = ");
            String str4 = strOptString;
            sb.append(iOptInt);
            String str5 = strOptString;
            sb.append(", message = ");
            String str6 = strOptString;
            sb.append(strOptString);
            str2 = strOptString;
            l(sb.toString());
        } catch (Exception e7) {
            e7.printStackTrace();
            strOptString = str2;
        }
        return strOptString;
    }
}
