package com.bilibili.lib.videoupload.internal;

import android.content.Context;
import androidx.annotation.Nullable;
import com.bilibili.lib.videoupload.speeddetect.UploadSpeedDetect;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import okhttp3.Call;
import qg0.C8429a;
import ug0.C8730c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/internal/o.class */
public class o extends e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f65103n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<l> f65104o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<l> f65105p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f65106q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f65107r;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/internal/o$a.class */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f65108a;

        public a(o oVar) {
            this.f65108a = oVar;
        }

        public final void a(l lVar, int i7, int i8, String str) {
            synchronized (this.f65108a) {
                this.f65108a.k("[BiliUpload] thread=" + Thread.currentThread().getName() + " Upload chunk " + lVar.f65088d + " Fail!!!");
                o oVar = this.f65108a;
                oVar.f65059d.i();
                oVar.o(i7, i8, "", str);
                this.f65108a.c();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.bilibili.lib.videoupload.internal.n] */
    public o(Context context, ng0.g gVar) {
        super(context, 3, gVar);
        this.f65104o = new CopyOnWriteArrayList();
        this.f65105p = new CopyOnWriteArrayList();
        this.f65106q = new a(this);
        this.f65107r = new com.bilibili.lib.videoupload.speeddetect.a(this) { // from class: com.bilibili.lib.videoupload.internal.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final o f65102a;

            {
                this.f65102a = this;
            }

            @Override // com.bilibili.lib.videoupload.speeddetect.a
            public final void a(int i7) {
                o oVar = this.f65102a;
                synchronized (oVar) {
                    oVar.f65103n = i7;
                    C8730c.b(oVar.f65056a).g(oVar.f65103n, p.f65111c);
                    while (((CopyOnWriteArrayList) oVar.f65105p).size() < i7 && !((CopyOnWriteArrayList) oVar.f65104o).isEmpty()) {
                        l lVar = (l) ((CopyOnWriteArrayList) oVar.f65104o).remove(0);
                        ((CopyOnWriteArrayList) oVar.f65105p).add(lVar);
                        lVar.a(false);
                        ((ThreadPoolExecutor) C8730c.b(oVar.f65056a).e()).execute(lVar);
                    }
                }
            }
        };
    }

    @Override // com.bilibili.lib.videoupload.internal.e
    public final boolean D(int i7) {
        return false;
    }

    public final void G() {
        long j7;
        StringBuilder sb = new StringBuilder("[BiliUpload] Create chunk list, chunk count: ");
        ng0.g gVar = this.f65059d;
        sb.append(gVar.f());
        l(sb.toString());
        ((CopyOnWriteArrayList) this.f65105p).clear();
        ((CopyOnWriteArrayList) this.f65104o).clear();
        C8429a c8429aC = C8429a.c(this.f65056a);
        long j8 = gVar.f124196a;
        String strH = gVar.h();
        synchronized (gVar) {
            j7 = gVar.f124208n;
        }
        c8429aC.g(j8, j7, gVar.f124192S, strH);
    }

    public void H() {
        synchronized (this) {
            int iF = this.f65059d.f();
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < iF; i7++) {
                arrayList.add(Integer.valueOf(i7));
            }
            ng0.g gVar = this.f65059d;
            synchronized (gVar) {
                gVar.f124205k = arrayList;
            }
        }
    }

    @Override // com.bilibili.lib.videoupload.internal.a
    public final void c() {
        synchronized (this) {
            l("[BiliUpload] thread=" + Thread.currentThread() + "cancelStep uploadChunkStepTask");
            this.f65059d.A();
            List<l> list = this.f65105p;
            for (l lVar : (l[]) ((CopyOnWriteArrayList) list).toArray(new l[((CopyOnWriteArrayList) list).size()])) {
                if (lVar != null) {
                    int i7 = lVar.f65088d;
                    lVar.a(true);
                    List<l> list2 = this.f65104o;
                    l lVar2 = new l();
                    lVar2.f65085a = this.f65056a.getApplicationContext();
                    lVar2.f65086b = this.f65059d;
                    lVar2.f65088d = i7;
                    lVar2.f65087c = this.f65061f;
                    lVar2.f65089e = this.f65106q;
                    ((CopyOnWriteArrayList) list2).add(lVar2);
                }
            }
            ((CopyOnWriteArrayList) this.f65105p).clear();
            UploadSpeedDetect.f65127e.remove(this.f65107r);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2  */
    @Override // com.bilibili.lib.videoupload.internal.e, com.bilibili.lib.videoupload.internal.a
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.lib.videoupload.internal.m h() {
        /*
            Method dump skipped, instruction units count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.videoupload.internal.o.h():com.bilibili.lib.videoupload.internal.m");
    }

    @Override // com.bilibili.lib.videoupload.internal.a
    @Nullable
    public final Call m(String str) {
        return null;
    }

    @Override // com.bilibili.lib.videoupload.internal.a
    public final boolean q(String str) {
        return false;
    }
}
