package com.bilibili.lib.stagger.internal;

import I3.C2246m0;
import android.content.Context;
import android.os.Handler;
import androidx.collection.ArrayMap;
import com.bilibili.gripper.mod.ModStaggerSource;
import com.bilibili.lib.neuron.util.HandlerThreads;
import com.bilibili.lib.resmanager.DownloadBizType;
import com.bilibili.lib.stagger.internal.e;
import com.bilibili.lib.stagger.internal.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import mf0.InterfaceC7990e;
import mf0.InterfaceC7991f;
import nf0.C8089c;
import nf0.C8090d;
import nf0.p;
import nf0.s;
import nf0.t;
import nf0.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/o.class */
public final class o implements InterfaceC7991f, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f64564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC7991f.b f64565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f64566d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f64567e = LazyKt.lazy(new TK.b(this, 4));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final b f64568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final f f64569g;

    @NotNull
    public final t h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f64570i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final v f64571j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final List<Runnable> f64572k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f64573l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ArrayMap<String, Boolean> f64574m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<InterfaceC7991f.c> f64575n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public com.bilibili.lib.stagger.internal.a f64576o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Qm0.a f64577p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/o$a.class */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f64578a;

        public a(o oVar) {
            this.f64578a = oVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/o$b.class */
    public static final class b extends C8090d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final o f64579d;

        public b(o oVar) {
            this.f64579d = oVar;
        }

        @Override // nf0.C8090d
        public final void a() {
            o oVar = this.f64579d;
            oVar.a("afterEnqueue start scheduler", null);
            t tVar = oVar.h;
            tVar.getClass();
            tVar.a("scheduler started", null);
            Handler handlerJ = tVar.j();
            s sVar = tVar.f124135i;
            handlerJ.removeCallbacks(sVar);
            Handler handlerJ2 = tVar.j();
            p pVar = tVar.h;
            handlerJ2.removeCallbacks(pVar);
            tVar.j().post(pVar);
            tVar.j().post(sVar);
        }

        @Override // nf0.C8090d
        public final void d() {
            o oVar = this.f64579d;
            oVar.a("onPoolEmpty stop scheduler", null);
            t tVar = oVar.h;
            tVar.getClass();
            tVar.a("scheduler stopped", null);
            tVar.j().removeCallbacks(tVar.f124135i);
            tVar.j().removeCallbacks(tVar.h);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/o$c.class */
    public static final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f64580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC7991f.c f64581b;

        public c(o oVar, InterfaceC7991f.c cVar) {
            this.f64580a = oVar;
            this.f64581b = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o oVar = this.f64580a;
            if (!oVar.f64573l) {
                ((ArrayList) oVar.f64572k).add(this);
                return;
            }
            List<C8089c> listG = oVar.l().g(this.f64581b);
            if (((ArrayList) listG).isEmpty()) {
                return;
            }
            this.f64580a.f64568f.b(listG);
        }
    }

    public o() {
        b bVar = new b(this);
        this.f64568f = bVar;
        f fVar = new f();
        this.f64569g = fVar;
        this.h = new t(bVar, new a(this));
        this.f64570i = LazyKt.lazy(new C2246m0(8));
        this.f64571j = new v(fVar.f64523c, new k(this, 0));
        this.f64572k = new ArrayList();
        this.f64574m = new ArrayMap<>();
        this.f64575n = new CopyOnWriteArrayList<>();
        System.currentTimeMillis();
        this.f64577p = new Qm0.a(this, 2);
    }

    @Override // mf0.InterfaceC7991f
    public final void e() {
        m().execute(new WO0.d(this, 1));
    }

    @Override // mf0.InterfaceC7991f
    public final void g(@NotNull InterfaceC7991f interfaceC7991f, @NotNull InterfaceC7991f.c cVar) {
        synchronized (this.f64574m) {
            Boolean bool = this.f64574m.get(cVar.f123730a);
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool, bool2)) {
                return;
            }
            Intrinsics.areEqual(this.f64574m.get(cVar.f123730a), bool2);
            e.b bVar = (e.b) ((Map) e.f64508c.getValue()).get(cVar.f123730a);
            InterfaceC7991f.c cVar2 = cVar;
            if (bVar != null) {
                InterfaceC7991f.c.a aVar = new InterfaceC7991f.c.a();
                aVar.f123744d = cVar.f123730a;
                aVar.f123741a = cVar.f123735f;
                aVar.f123742b = cVar.f123736g;
                aVar.f123743c = cVar.h;
                aVar.f123749j = cVar.f123737i;
                aVar.h = cVar.f123733d;
                aVar.f123747g = cVar.f123732c;
                aVar.f123748i = cVar.f123738j;
                aVar.f123750k = cVar.f123739k;
                if (cVar.f123740l) {
                    aVar.f123751l = true;
                }
                DownloadBizType downloadBizType = cVar.f123734e;
                if (downloadBizType != null) {
                    aVar.f123745e = downloadBizType;
                }
                String str = cVar.f123731b;
                if (str != null) {
                    aVar.f123746f = str;
                }
                Boolean bool3 = bVar.f64516c;
                if (bool3 != null) {
                    aVar.h = bool3.booleanValue();
                }
                Boolean bool4 = bVar.f64515b;
                if (bool4 != null) {
                    aVar.f123747g = bool4.booleanValue();
                }
                Boolean bool5 = bVar.f64517d;
                if (bool5 != null) {
                    aVar.f123748i = bool5.booleanValue();
                }
                Long l7 = bVar.f64518e;
                if (l7 != null) {
                    aVar.f123749j = l7.longValue();
                }
                Boolean bool6 = bVar.f64519f;
                if (bool6 != null) {
                    aVar.f123750k = bool6.booleanValue();
                }
                Boolean bool7 = bVar.f64520g;
                if (bool7 != null && bool7.booleanValue()) {
                    aVar.f123751l = true;
                }
                cVar2 = new InterfaceC7991f.c(aVar);
                a("apply remote options: " + bVar, null);
            }
            this.f64575n.add(cVar2);
            a("provide download options: " + cVar2, null);
            m().execute(new c(this, cVar2));
        }
    }

    @Override // com.bilibili.lib.stagger.internal.d
    @NotNull
    public final String getLogTag() {
        return "Client";
    }

    @Override // mf0.InterfaceC7991f
    @NotNull
    public final InterfaceC7990e getResources() {
        return this.f64571j;
    }

    @Override // mf0.InterfaceC7991f
    public final void h(@NotNull Context context, @NotNull InterfaceC7991f.b bVar) {
        if (this.f64566d.getAndSet(true)) {
            return;
        }
        this.f64564b = context;
        this.f64565c = bVar;
        com.bilibili.lib.stagger.internal.c cVar = bVar.f123723b;
        synchronized (com.bilibili.lib.stagger.internal.c.class) {
            try {
                com.bilibili.lib.stagger.internal.c.f64500a = cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        m().execute(new Qm0.d(this, 2));
        d.c("initialize stagger client", "需要请求接口！", null);
        HandlerThreads.postDelayed(2, new l(0, this, bVar), ((Number) e.f64510e.getValue()).longValue() * ((long) 1000));
    }

    @Override // mf0.InterfaceC7991f
    public final void j(@NotNull ModStaggerSource.a aVar) {
        f fVar = this.f64569g;
        synchronized (fVar.f64526f) {
            f.a aVar2 = new f.a(aVar);
            fVar.f64525e.put(aVar, aVar2);
            ArrayMap<String, List<f.a>> arrayMap = fVar.f64524d;
            List<f.a> list = arrayMap.get("mod");
            List<f.a> arrayList = list;
            if (list == null) {
                arrayList = new ArrayList<>();
                arrayMap.put("mod", arrayList);
            }
            arrayList.add(aVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    @Override // mf0.InterfaceC7991f
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final mf0.InterfaceC7991f.d k() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.lib.stagger.internal.a r0 = r0.f64576o
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L14
            r0 = r3
            mf0.f$d r0 = r0.f64484b
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1c
        L14:
            mf0.f$d r0 = mf0.InterfaceC7991f.d.f123752c
            r3 = r0
            mf0.f$d r0 = mf0.InterfaceC7991f.d.f123752c
            r3 = r0
        L1c:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.stagger.internal.o.k():mf0.f$d");
    }

    public final nf0.h l() {
        return (nf0.h) this.f64567e.getValue();
    }

    public final Executor m() {
        return (Executor) this.f64570i.getValue();
    }
}
