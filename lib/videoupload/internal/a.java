package com.bilibili.lib.videoupload.internal;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.runtime.C4277b;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.C4618g;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.videoupload.bean.UploadRiskControlBean;
import com.bilibili.studio.comm.report.editor.bean.EditorAction;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ng0.C8092b;
import ng0.f;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import qg0.C8429a;
import sg0.C8590c;
import ug0.C8730c;
import vg0.C8808b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/internal/a.class */
public abstract class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f65057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f65058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ng0.g f65059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Call f65060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C8590c f65061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public f.b f65062g;
    public volatile boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f65063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f65064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f65065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f65066l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f65067m;

    /* JADX INFO: renamed from: com.bilibili.lib.videoupload.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/internal/a$a.class */
    public final class C0363a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f65068a;

        public C0363a(a aVar) {
            this.f65068a = aVar;
        }

        public final void onFailure(@NonNull Call call, @NonNull IOException iOException) {
            this.f65068a.k("[BiliUpload] deleteUps failed: " + iOException.getMessage());
        }

        public final void onResponse(@NonNull Call call, @NonNull Response response) {
            this.f65068a.l("[BiliUpload] deleteUps success: " + response.isSuccessful());
        }
    }

    public a(Context context, int i7, ng0.g gVar) {
        this.f65065k = 2;
        this.f65056a = context.getApplicationContext();
        this.f65058c = i7;
        this.f65059d = gVar;
        if (((Boolean) vg0.c.f128197A.getValue()).booleanValue()) {
            this.f65065k = 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int w() {
        /*
            android.app.Application r0 = com.bilibili.base.BiliContext.application()
            ug0.c r0 = ug0.C8730c.b(r0)
            com.bilibili.lib.videoupload.bean.UploadClientTimeoutConfig r0 = r0.f()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L1a
            r0 = r3
            int r0 = r0.retryCount
            r2 = r0
            r0 = r2
            if (r0 <= 0) goto L1a
            goto L1d
        L1a:
            r0 = 10
            r2 = r0
        L1d:
            r0 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.videoupload.internal.a.w():int");
    }

    public final void A(int i7, int i8) {
        B(i7, i8, "");
    }

    public final void B(int i7, int i8, String str) {
        long j7;
        this.f65059d.N(str);
        ng0.g gVar = this.f65059d;
        synchronized (gVar) {
            gVar.f124202g = i7;
        }
        C8429a c8429aC = C8429a.c(this.f65056a);
        long j8 = this.f65059d.f124196a;
        c8429aC.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(i7));
        contentValues.put("upload_error_msg", str);
        ((q50.a) ((CV.b) c8429aC).a).getWritableDatabase().update("video_upload", contentValues, "taskid=?", new String[]{com.bilibili.app.authorspace.local.service.j.a(j8, "")});
        l("[BiliUpload] updateTaskStatus: " + bO0.a.b(i7) + ", error: " + C8092b.a(i8));
        switch (i7) {
            case 2:
                this.f65059d.M(i8);
                n(1);
                return;
            case 3:
                n(2);
                return;
            case 4:
                n(3);
                return;
            case 5:
                n(4);
                return;
            case 6:
                if (this.f65059d != null && vg0.c.b()) {
                    ng0.g gVar2 = this.f65059d;
                    synchronized (gVar2) {
                        j7 = gVar2.f124197b;
                    }
                    vg0.m mVar = vg0.m.f128244a;
                    String strE = this.f65059d.e();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    synchronized (mVar) {
                        if (vg0.c.b()) {
                            vg0.m.f128245b.put(strE, new vg0.l(j7, jCurrentTimeMillis));
                        }
                    }
                }
                n(11);
                return;
            case 7:
                this.f65059d.M(i8);
                if (i8 == 1) {
                    if (!vg0.c.c() || this.f65059d.E()) {
                        n(13);
                        return;
                    } else {
                        n(17);
                        return;
                    }
                }
                if (i8 == 2) {
                    n(12);
                    return;
                }
                if (i8 == 3) {
                    n(14);
                    return;
                } else if (i8 == 4) {
                    n(15);
                    return;
                } else {
                    if (i8 != 5) {
                        return;
                    }
                    n(21);
                    return;
                }
            case 8:
                if (this.f65059d.E()) {
                    n(13);
                    return;
                } else {
                    n(17);
                    return;
                }
            case 9:
                n(22);
                return;
            default:
                return;
        }
    }

    public final void C(@NonNull m mVar) {
        l("[BiliUpload] uploadStepResult result=" + mVar);
        int i7 = mVar.f65100d;
        ng0.g gVar = this.f65059d;
        int i8 = mVar.f65097a;
        if (i8 == 0) {
            if (!ConfigManager.ab2().getWithDefault("upper.upload_optimize", true) || this.f65058c == gVar.i()) {
                p(gVar.i());
                synchronized (gVar) {
                    gVar.h++;
                }
                C8429a.c(this.f65056a).f(gVar);
                e eVar = this.f65057b;
                if (eVar != null) {
                    eVar.z();
                    return;
                }
                return;
            }
            return;
        }
        if (i8 == 3) {
            gVar.i();
            o(1, i7, mVar.f65098b, mVar.f65099c);
            return;
        }
        if (i8 == 4) {
            gVar.i();
            o(2, i7, mVar.f65098b, mVar.f65099c);
            return;
        }
        if (i8 == 5) {
            gVar.i();
            o(3, i7, mVar.f65098b, mVar.f65099c);
            return;
        }
        if (i8 == 6) {
            gVar.i();
            o(4, i7, mVar.f65098b, mVar.f65099c);
            return;
        }
        if (i8 != 7) {
            return;
        }
        UploadRiskControlBean uploadRiskControlBean = mVar.f65101e;
        if (uploadRiskControlBean == null || TextUtils.isEmpty(uploadRiskControlBean.vVoucher)) {
            gVar.i();
            o(3, i7, mVar.f65098b, mVar.f65099c);
            return;
        }
        String str = uploadRiskControlBean.vVoucher;
        synchronized (gVar) {
            gVar.f124194U = str;
        }
        gVar.i();
        o(5, i7, mVar.f65098b, mVar.f65099c);
    }

    public final Map<String, String> a() {
        String str;
        HashMap map = new HashMap();
        ng0.g gVar = this.f65059d;
        synchronized (gVar) {
            str = gVar.f124216v;
        }
        String str2 = str;
        if (str == null) {
            l("[BiliUpload] buildHeader, auth is null");
            str2 = "";
        }
        map.put("X-Upos-Auth", str2);
        return map;
    }

    public final void b() {
        synchronized (this) {
            l("[BiliUpload][Cancel] thread=" + Thread.currentThread().getName());
            if (this.f65058c != this.f65059d.i()) {
                e eVar = this.f65057b;
                if (eVar != null) {
                    eVar.b();
                }
            } else {
                if (this.f65063i) {
                    return;
                }
                this.f65063i = true;
                String[] strArr = vg0.k.f128240a;
                vg0.k.l(this.f65066l, "cancel", "", "", this.f65059d, "", false);
                A(5, 0);
                this.f65059d.b(this.f65067m);
                c();
                g();
            }
        }
    }

    public void c() {
        l("[BiliUpload][Cancel] cancelStep thread=" + Thread.currentThread().getName());
        this.f65064j = true;
        this.f65059d.A();
        Call call = this.f65060e;
        if (call != null) {
            call.cancel();
        }
    }

    public final void d(Response response) {
        if (((Boolean) vg0.c.f128202F.getValue()).booleanValue() && response.code() == 403) {
            r.a(new vg0.o(this.f65058c, this.f65059d));
        }
    }

    @Nullable
    public UploadRiskControlBean e(String str) {
        return null;
    }

    @NonNull
    public m f() {
        return h();
    }

    public final void g() {
        String str;
        String str2;
        Response responseExecute;
        synchronized (this) {
            if (p.f65112d) {
                int i7 = this.f65058c;
                if (i7 <= 1 || i7 > 4) {
                    return;
                }
                if (TextUtils.isEmpty(this.f65059d.x())) {
                    return;
                }
                OkHttpClient okHttpClient = C8730c.b(this.f65056a).f127860b;
                Request.Builder builder = new Request.Builder();
                for (Map.Entry entry : ((HashMap) a()).entrySet()) {
                    builder.addHeader((String) entry.getKey(), (String) entry.getValue());
                }
                HashMap map = new HashMap(2);
                ng0.g gVar = this.f65059d;
                synchronized (gVar) {
                    str = gVar.f124179F;
                }
                map.put("uploadId", str);
                builder.url(vg0.p.l(this.f65059d.x(), map));
                builder.delete();
                Call callNewCall = okHttpClient.newCall(builder.build());
                if (vg0.c.f128213b) {
                    callNewCall.enqueue(new C0363a(this));
                    return;
                }
                try {
                    try {
                        responseExecute = callNewCall.execute();
                    } catch (Exception e7) {
                        e7.printStackTrace();
                        str2 = "[BiliUpload] deleteUps deleteUps success=false";
                    }
                    try {
                        boolean zIsSuccessful = responseExecute.isSuccessful();
                        responseExecute.close();
                        str2 = "[BiliUpload] deleteUps deleteUps success=" + zIsSuccessful;
                        l(str2);
                    } catch (Throwable th) {
                        if (responseExecute != null) {
                            try {
                                responseExecute.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    l("[BiliUpload] deleteUps deleteUps success=false");
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x04ec  */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bilibili.lib.videoupload.internal.m h() {
        /*
            Method dump skipped, instruction units count: 1318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.videoupload.internal.a.h():com.bilibili.lib.videoupload.internal.m");
    }

    public Response i(Response response) {
        return null;
    }

    public final void j() {
        l("[BiliUpload][Interrupt] thread=" + Thread.currentThread().getName());
        if (this.f65058c != this.f65059d.i()) {
            e eVar = this.f65057b;
            if (eVar != null) {
                eVar.j();
                return;
            }
            return;
        }
        if (this.h || this.f65063i) {
            return;
        }
        this.h = true;
        String[] strArr = vg0.k.f128240a;
        vg0.k.l(this.f65066l, EditorAction.ACTION_STOP, "", "", this.f65059d, "", false);
        this.f65059d.b(this.f65067m);
        c();
        A(8, 0);
    }

    public final void k(String str) {
        C8808b.a(str + (" " + this.f65059d.q()));
    }

    public final void l(String str) {
        C8808b.b(str + (" " + this.f65059d.s()));
    }

    @Nullable
    public abstract Call m(String str);

    public final void n(int i7) {
        C8590c c8590c = this.f65061f;
        if (c8590c != null) {
            c8590c.a(i7, this.f65059d);
        }
    }

    public final void o(int i7, int i8, String str, String str2) {
        String strC = com.bilibili.mall.kmm.order.combine.api.c.c(i8);
        String strB = com.bilibili.mall.kmm.order.combine.api.c.b(i8);
        if (!TextUtils.isEmpty(str)) {
            strB = str;
        }
        String str3 = TextUtils.isEmpty(str2) ? strB : str2;
        StringBuilder sbA = G0.b.a("[BiliUpload][Fail] onStepTaskFail errorMsg=", strC, ", uploadErrorMsg = ", str, ", errorDesc=");
        sbA.append(strB);
        sbA.append(", host=");
        ng0.g gVar = this.f65059d;
        sbA.append(gVar.x());
        k(sbA.toString());
        String[] strArr = vg0.k.f128240a;
        vg0.k.l(this.f65066l, "error", C4618g.a(i8, ""), strC, this.f65059d, str3, false);
        gVar.f124190Q = i8;
        gVar.f124191R = str2;
        gVar.b(this.f65067m);
        if (i7 != 1 || gVar.E()) {
            B(7, i7, str);
        } else {
            B(8, i7, str);
        }
    }

    public final void p(int i7) {
        l("[BiliUpload][Success] onStepTaskSuccess");
        String[] strArr = vg0.k.f128240a;
        vg0.k.l(this.f65066l, "success", "0", "", this.f65059d, "", false);
        if (i7 == 4) {
            l("[BiliUpload][Success] UploadTask success!!!");
        }
        ng0.g gVar = this.f65059d;
        gVar.f124190Q = 0;
        gVar.f124191R = "";
        gVar.b(this.f65067m);
        if (i7 == 1) {
            n(7);
            return;
        }
        if (i7 == 2) {
            n(8);
            return;
        }
        if (i7 == 3) {
            n(9);
        } else {
            if (i7 != 4) {
                return;
            }
            n(10);
            A(6, 0);
        }
    }

    public abstract boolean q(String str) throws JSONException;

    public String r(String str) {
        return null;
    }

    public final void s() {
        synchronized (this) {
            l("[BiliUpload][Pause] thread=" + Thread.currentThread().getName());
            if (this.f65058c == this.f65059d.i()) {
                if (this.h || this.f65063i) {
                    if (this.f65059d.t() == 3) {
                        return;
                    }
                }
                this.h = true;
                String[] strArr = vg0.k.f128240a;
                vg0.k.l(this.f65066l, EditorAction.ACTION_STOP, "", "", this.f65059d, "", false);
                this.f65059d.b(this.f65067m);
                A(3, 0);
                c();
            } else {
                e eVar = this.f65057b;
                if (eVar != null) {
                    eVar.s();
                }
            }
        }
    }

    public final void t() {
        l("[BiliUpload][Pending] thread=" + Thread.currentThread().getName());
        if (this.f65058c != this.f65059d.i()) {
            e eVar = this.f65057b;
            if (eVar != null) {
                eVar.t();
                return;
            }
            return;
        }
        if ((this.h || this.f65063i) && this.f65059d.t() == 9) {
            return;
        }
        this.h = true;
        String[] strArr = vg0.k.f128240a;
        vg0.k.l(this.f65066l, EditorAction.ACTION_STOP, "", "", this.f65059d, "", false);
        this.f65059d.b(this.f65067m);
        c();
        A(9, 0);
    }

    public i u() {
        if ((this instanceof h) && ((Boolean) vg0.c.f128224n.getValue()).booleanValue()) {
            return new i(0);
        }
        ng0.g gVar = this.f65059d;
        if (TextUtils.isEmpty(gVar.f124199d)) {
            l("[BiliUpload] preCheck: upload file path is null");
            A(7, 2);
            return new i(101);
        }
        if (new File(gVar.f124199d).exists()) {
            if (gVar.f124201f != 0) {
                return new i(0);
            }
            l("[BiliUpload] preCheck: upload file length is 0");
            A(7, 2);
            return new i(103);
        }
        l("[BiliUpload] preCheck: upload file not exist: " + gVar.f124199d);
        A(7, 2);
        return new i(102);
    }

    public final void v(@Nullable Call call) {
        ng0.g gVar;
        if ((!((Boolean) vg0.c.f128229s.getValue()).booleanValue() && !((Boolean) vg0.c.f128198B.getValue()).booleanValue()) || call == null || (gVar = this.f65059d) == null) {
            return;
        }
        String string = call.request().url().toString();
        synchronized (gVar) {
            gVar.f124188O = string;
        }
    }

    public final void x(f.b bVar) {
        this.f65062g = bVar;
        e eVar = this.f65057b;
        if (eVar != null) {
            eVar.x(bVar);
        }
    }

    public final void y(C8590c c8590c) {
        this.f65061f = c8590c;
        e eVar = this.f65057b;
        if (eVar != null) {
            eVar.y(c8590c);
        }
    }

    public final void z() {
        l("[BiliUpload][Start] thread=" + Thread.currentThread());
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f65066l = jCurrentTimeMillis;
        this.f65067m = jCurrentTimeMillis;
        ng0.g gVar = this.f65059d;
        float fP = gVar.p();
        synchronized (gVar) {
            gVar.f124212r = fP;
        }
        if (this.f65059d.t() == 6) {
            n(5);
            A(6, 0);
            return;
        }
        if (this.f65059d.i() != this.f65058c) {
            e eVar = this.f65057b;
            if (eVar != null) {
                eVar.z();
                return;
            }
            return;
        }
        synchronized (this) {
            if (this.h) {
                A(4, 0);
            }
            this.f65063i = false;
            this.h = false;
            this.f65064j = false;
        }
        i iVarU = u();
        int i7 = iVarU.f65083a;
        if (i7 == 0) {
            A(2, 0);
            n(5);
            C(f());
            return;
        }
        ng0.g gVar2 = this.f65059d;
        gVar2.f124190Q = i7;
        gVar2.f124191R = com.bilibili.mall.kmm.order.combine.api.c.b(i7);
        this.f65059d.b(this.f65067m);
        String[] strArr = vg0.k.f128240a;
        vg0.k.l(this.f65066l, "error", C4277b.a(iVarU.f65083a, "", new StringBuilder()), com.bilibili.mall.kmm.order.combine.api.c.c(iVarU.f65083a), this.f65059d, com.bilibili.mall.kmm.order.combine.api.c.b(iVarU.f65083a), false);
    }
}
