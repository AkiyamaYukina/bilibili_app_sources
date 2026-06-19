package com.bilibili.lib.stagger.internal;

import android.content.Context;
import android.os.Handler;
import com.bilibili.lib.neuron.util.HandlerThreads;
import com.bilibili.ship.theseus.united.page.screenstate.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import mf0.InterfaceC7991f;
import pf0.InterfaceC8298a;
import qf0.C8427b;
import rf0.C8519a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/l.class */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f64558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f64559c;

    public /* synthetic */ l(int i7, Object obj, Object obj2) {
        this.f64557a = i7;
        this.f64558b = obj;
        this.f64559c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f64557a) {
            case 0:
                final o oVar = (o) this.f64558b;
                final InterfaceC7991f.b bVar = (InterfaceC7991f.b) this.f64559c;
                oVar.m().execute(new Runnable(oVar, bVar) { // from class: com.bilibili.lib.stagger.internal.m

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final o f64560a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final InterfaceC7991f.b f64561b;

                    {
                        this.f64560a = oVar;
                        this.f64561b = bVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC8298a c8427b;
                        o oVar2 = this.f64560a;
                        InterfaceC7991f.b bVar2 = this.f64561b;
                        Context context = oVar2.f64564b;
                        Context context2 = context;
                        if (context == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("context");
                            context2 = null;
                        }
                        File dir = context2.getDir("stagger_resource", 0);
                        if (bVar2.f123722a.ab("moss-peak-download", true)) {
                            c.c().d("moss.rest.ManifestProvider", "Moss is enabled, call moss peak download", new Throwable[0]);
                            c8427b = new C8519a(dir, bVar2);
                        } else {
                            c.c().e("moss.rest.ManifestProvider", "Moss is disabled, call retrofit peak download", new Throwable[0]);
                            c8427b = new C8427b(dir, bVar2);
                        }
                        a aVar = c8427b.get();
                        System.currentTimeMillis();
                        oVar2.f64576o = aVar;
                        oVar2.h.k(aVar.f64484b);
                        oVar2.l().e(aVar.f64483a);
                        oVar2.f64573l = true;
                        Iterator it = ((ArrayList) oVar2.f64572k).iterator();
                        while (it.hasNext()) {
                            oVar2.m().execute((Runnable) it.next());
                        }
                    }
                });
                Handler handler = HandlerThreads.getHandler(2);
                Qm0.a aVar = oVar.f64577p;
                handler.removeCallbacks(aVar);
                HandlerThreads.postDelayed(2, aVar, 86400000L);
                d.c("initialize stagger client", "请求接口！", null);
                break;
            default:
                a.c cVar = (a.c) this.f64558b;
                com.bilibili.ship.theseus.united.page.screenstate.a aVar2 = (com.bilibili.ship.theseus.united.page.screenstate.a) this.f64559c;
                if (!cVar.f102979a) {
                    com.bilibili.ship.theseus.united.page.screenstate.a.a(aVar2, -1);
                    cVar.f102979a = true;
                }
                break;
        }
    }
}
