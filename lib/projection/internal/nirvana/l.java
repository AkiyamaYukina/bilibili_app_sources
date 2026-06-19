package com.bilibili.lib.projection.internal.nirvana;

import com.bilibili.lib.projection.internal.nirvana.NirvanaEngine;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/l.class */
public final class l<T, R> implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NirvanaEngine.a f63328a;

    public l(NirvanaEngine.a aVar) {
        this.f63328a = aVar;
    }

    public final Object apply(Object obj) {
        Integer num = (Integer) obj;
        final CompositeDisposable compositeDisposable = new CompositeDisposable();
        if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 3)) {
            boolean z6 = false;
            boolean z7 = num != null && num.intValue() == 3;
            NirvanaEngine.a aVar = this.f63328a;
            NirvanaEngine.NirvanaPlayMode nirvanaPlayMode = aVar.f63262q;
            if (nirvanaPlayMode == NirvanaEngine.NirvanaPlayMode.PLAY_MODE_AUTONEXT) {
                z6 = true;
            }
            long j7 = 2;
            if (z6) {
                if (z7) {
                    j7 = 1;
                }
                compositeDisposable.add(Observable.interval(1L, j7, TimeUnit.SECONDS).flatMap(new d(aVar)).subscribe(new e(aVar, z7)));
            } else if (nirvanaPlayMode == NirvanaEngine.NirvanaPlayMode.PLAY_MODE_NORMAL) {
                if (z7) {
                    j7 = 1;
                }
                compositeDisposable.add(Observable.interval(1L, j7, TimeUnit.SECONDS).flatMap(new f(aVar)).subscribe(new g(aVar)));
                compositeDisposable.add(aVar.f63253g.map(h.f63323a).distinctUntilChanged().switchMap(new i(z7)).flatMap(new j(aVar)).subscribe(new k(aVar, z7)));
            }
        }
        return Observable.never().doOnDispose(new Action(compositeDisposable) { // from class: ue0.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CompositeDisposable f127846a;

            {
                this.f127846a = compositeDisposable;
            }

            public final void run() {
                this.f127846a.dispose();
            }
        });
    }
}
