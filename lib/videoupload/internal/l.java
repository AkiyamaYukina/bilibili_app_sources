package com.bilibili.lib.videoupload.internal;

import WS0.t;
import android.content.Context;
import androidx.annotation.Nullable;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.videoupload.bean.UploadClientTimeoutConfig;
import com.bilibili.lib.videoupload.bean.UploadDynamicConcurrencyConfig;
import com.bilibili.lib.videoupload.internal.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.NetworkBridgeInterceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import qg0.C8429a;
import sg0.C8590c;
import tg0.InterfaceC8662a;
import ug0.C8730c;
import vg0.C8808b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/internal/l.class */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f65085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ng0.g f65086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C8590c f65087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f65088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o.a f65089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f65090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f65091g;
    public long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC8662a f65092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Call f65093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f65094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f65095l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f65096m;

    public l() {
        this.f65095l = 2;
        if (((Boolean) vg0.c.f128197A.getValue()).booleanValue()) {
            this.f65095l = 1;
        }
    }

    public static boolean g(int i7) {
        if (!vg0.c.c()) {
            return false;
        }
        List<Integer> uploadChunkStepCodeList = C8730c.b(BiliContext.application()).c().getUploadChunkStepCodeList();
        if (uploadChunkStepCodeList == null || uploadChunkStepCodeList.isEmpty()) {
            return true;
        }
        return !uploadChunkStepCodeList.contains(Integer.valueOf(i7));
    }

    public final void a(boolean z6) {
        synchronized (this) {
            this.f65094k = z6;
            if (z6) {
                this.h = 0L;
                Call call = this.f65093j;
                if (call != null) {
                    call.cancel();
                }
                ng0.g gVar = this.f65086b;
                long j7 = this.h;
                synchronized (gVar) {
                    gVar.f124213s -= j7;
                    gVar.d();
                }
                c cVar = this.f65096m;
                if (cVar != null) {
                    cVar.a();
                }
            }
        }
    }

    public final void b(Response response) {
        if (((Boolean) vg0.c.f128202F.getValue()).booleanValue() && response.code() == 403) {
            r.a(new vg0.o(3, this.f65086b));
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0b0b  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0b61  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0bb6 A[Catch: InterruptedException -> 0x0c12, TRY_LEAVE, TryCatch #10 {InterruptedException -> 0x0c12, blocks: (B:411:0x0bb0, B:413:0x0bb6, B:416:0x0bc7, B:425:0x0c0b, B:417:0x0bd1, B:418:0x0bf6, B:419:0x0bfe, B:423:0x0c08, B:432:0x0c1e, B:421:0x0c01), top: B:483:0x0bb0, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0bf6 A[Catch: InterruptedException -> 0x0c12, TRY_ENTER, TryCatch #10 {InterruptedException -> 0x0c12, blocks: (B:411:0x0bb0, B:413:0x0bb6, B:416:0x0bc7, B:425:0x0c0b, B:417:0x0bd1, B:418:0x0bf6, B:419:0x0bfe, B:423:0x0c08, B:432:0x0c1e, B:421:0x0c01), top: B:483:0x0bb0, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0c3c A[LOOP:0: B:12:0x003b->B:439:0x0c3c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0c2e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.lib.videoupload.internal.m c() {
        /*
            Method dump skipped, instruction units count: 3267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.videoupload.internal.l.c():com.bilibili.lib.videoupload.internal.m");
    }

    public final Map<String, String> d() {
        if (!((Boolean) vg0.c.f128225o.getValue()).booleanValue()) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        map.put("chunk_index", String.valueOf(this.f65088d));
        map.put("chunk_size", String.valueOf(this.f65090f));
        map.put("chunk_offset", String.valueOf(this.f65091g));
        return map;
    }

    public final void e(String str) {
        C8808b.a(str + ("," + this.f65086b.q()));
    }

    public final void f(String str) {
        C8808b.b(str + ("," + this.f65086b.s()));
    }

    public final Call h(String str) {
        String str2;
        String str3;
        UploadClientTimeoutConfig uploadClientTimeoutConfigF = C8730c.b(this.f65085a).f();
        UploadDynamicConcurrencyConfig uploadDynamicConcurrencyConfigD = C8730c.b(this.f65085a).d();
        int uploadTimeout = uploadClientTimeoutConfigF.chunkWriteTimeout;
        if (uploadDynamicConcurrencyConfigD.getEnableDynamicConcurrency() == 1) {
            uploadTimeout = uploadDynamicConcurrencyConfigD.getUploadTimeout();
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = C8730c.b(this.f65085a).f127860b.newBuilder().writeTimeout(uploadTimeout, timeUnit).readTimeout(uploadClientTimeoutConfigF.chunkReadTimeout, timeUnit).connectTimeout(uploadClientTimeoutConfigF.chunkConnectTimeout, timeUnit).bridgeFactory((NetworkBridgeInterceptor.Factory) null).build();
        if (this.f65092i == null) {
            return null;
        }
        long j7 = C8730c.b(BiliContext.application()).f().chunkNoChangeTimeout;
        if (this.f65096m == null) {
            this.f65096m = new c(j7 * 1000, new t(this, 1));
        }
        d dVar = new d(this.f65092i, Long.valueOf(this.f65086b.f124196a), this.f65096m, new k(this));
        Request.Builder builder = new Request.Builder();
        vg0.n.a(builder);
        HashMap map = new HashMap(2);
        ng0.g gVar = this.f65086b;
        synchronized (gVar) {
            str2 = gVar.f124216v;
        }
        map.put("X-Upos-Auth", str2);
        for (Map.Entry entry : map.entrySet()) {
            builder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        HashMap map2 = new HashMap(2);
        map2.put("partNumber", (this.f65088d + 1) + "");
        ng0.g gVar2 = this.f65086b;
        synchronized (gVar2) {
            str3 = gVar2.f124179F;
        }
        map2.put("uploadId", str3);
        builder.url(vg0.p.l(str, map2));
        builder.put(dVar);
        return okHttpClientBuild.newCall(builder.build());
    }

    public final void i(@Nullable Call call) {
        if ((!((Boolean) vg0.c.f128229s.getValue()).booleanValue() && !((Boolean) vg0.c.f128198B.getValue()).booleanValue()) || call == null || this.f65086b == null) {
            return;
        }
        String string = call.request().url().toString();
        ng0.g gVar = this.f65086b;
        synchronized (gVar) {
            gVar.f124188O = string;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j7;
        f("[BiliUpload] Start to upload chunk=" + this.f65088d + " in thread " + Thread.currentThread().getName());
        ng0.g gVar = this.f65086b;
        if (gVar == null) {
            return;
        }
        long jG = ((long) this.f65088d) * ((long) gVar.g());
        this.f65091g = jG;
        if (jG >= this.f65086b.f124201f) {
            return;
        }
        this.f65090f = (int) Math.min(r0.g(), this.f65086b.f124201f - this.f65091g);
        f("[BiliUpload] Upload chunk chunkSize=" + this.f65090f + ",task.size=" + this.f65086b.g() + ",task.length=" + this.f65086b.f124201f + ",offset=" + this.f65091g + ",mChunkIndex=" + this.f65088d);
        m mVarC = c();
        StringBuilder sb = new StringBuilder("[BiliUpload] Upload chunk ");
        sb.append(this.f65088d);
        sb.append(" result: ");
        sb.append(mVarC);
        f(sb.toString());
        int i7 = mVarC.f65097a;
        if (i7 == 0) {
            vg0.n.d(this.f65086b, "success", d());
            o.a aVar = this.f65089e;
            if (aVar != null) {
                synchronized (aVar.f65108a) {
                    aVar.f65108a.l("[BiliUpload] thread=" + Thread.currentThread().getName() + " Upload chunk " + this.f65088d + " success!!!");
                    ng0.g gVar2 = aVar.f65108a.f65059d;
                    long j8 = (long) this.f65090f;
                    synchronized (gVar2) {
                        gVar2.f124208n += j8;
                    }
                    o oVar = aVar.f65108a;
                    oVar.f65059d.b(oVar.f65067m);
                    aVar.f65108a.f65067m = System.currentTimeMillis();
                    ng0.g gVar3 = aVar.f65108a.f65059d;
                    int i8 = this.f65088d;
                    synchronized (gVar3) {
                        if (gVar3.f124205k != null) {
                            ((ArrayList) gVar3.f124205k).remove(Integer.valueOf(i8));
                        }
                    }
                    ((CopyOnWriteArrayList) aVar.f65108a.f65105p).remove(this);
                    this.f65089e = null;
                    this.f65092i = null;
                    this.f65087c = null;
                    C8429a c8429aC = C8429a.c(aVar.f65108a.f65056a);
                    ng0.g gVar4 = aVar.f65108a.f65059d;
                    long j9 = gVar4.f124196a;
                    String strH = gVar4.h();
                    ng0.g gVar5 = aVar.f65108a.f65059d;
                    synchronized (gVar5) {
                        j7 = gVar5.f124208n;
                    }
                    c8429aC.g(j9, j7, aVar.f65108a.f65059d.f124192S, strH);
                    if (!((CopyOnWriteArrayList) aVar.f65108a.f65104o).isEmpty() && !aVar.f65108a.f65063i) {
                        l lVar = (l) ((CopyOnWriteArrayList) aVar.f65108a.f65104o).remove(0);
                        ((CopyOnWriteArrayList) aVar.f65108a.f65105p).add(lVar);
                        lVar.a(false);
                        ((ThreadPoolExecutor) C8730c.b(aVar.f65108a.f65056a).e()).execute(lVar);
                    }
                    o oVar2 = aVar.f65108a;
                    boolean z6 = false;
                    if (((CopyOnWriteArrayList) oVar2.f65105p).isEmpty()) {
                        z6 = false;
                        if (((CopyOnWriteArrayList) oVar2.f65104o).isEmpty()) {
                            z6 = true;
                        }
                    }
                    if (z6 && aVar.f65108a.f65059d.i() == 3) {
                        aVar.f65108a.l("Upload all chunk success!!!");
                        o oVar3 = aVar.f65108a;
                        oVar3.p(oVar3.f65059d.i());
                        ng0.g gVar6 = aVar.f65108a.f65059d;
                        synchronized (gVar6) {
                            gVar6.h++;
                        }
                        C8429a.c(aVar.f65108a.f65056a).f(aVar.f65108a.f65059d);
                        e eVar = aVar.f65108a.f65057b;
                        if (eVar != null) {
                            eVar.z();
                        }
                    }
                }
            }
        } else if (i7 == 3) {
            vg0.n.d(this.f65086b, "error", d());
            o.a aVar2 = this.f65089e;
            if (aVar2 != null) {
                aVar2.a(this, 1, mVarC.f65100d, mVarC.f65099c);
            }
        } else if (i7 == 4) {
            vg0.n.d(this.f65086b, "error", d());
            o.a aVar3 = this.f65089e;
            if (aVar3 != null) {
                aVar3.a(this, 2, mVarC.f65100d, mVarC.f65099c);
            }
        } else if (i7 == 5) {
            vg0.n.d(this.f65086b, "error", d());
            o.a aVar4 = this.f65089e;
            if (aVar4 != null) {
                aVar4.a(this, 3, mVarC.f65100d, mVarC.f65099c);
            }
        } else if (i7 == 6) {
            vg0.n.d(this.f65086b, "error", d());
            o.a aVar5 = this.f65089e;
            if (aVar5 != null) {
                aVar5.a(this, 4, mVarC.f65100d, mVarC.f65099c);
            }
        }
        f("[BiliUpload] End to upload chunk=" + this.f65088d + " in thread " + Thread.currentThread().getName());
    }
}
