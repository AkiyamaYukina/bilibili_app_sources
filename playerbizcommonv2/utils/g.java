package com.bilibili.playerbizcommonv2.utils;

import android.content.res.Resources;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToObservable;
import io.reactivex.rxjava3.internal.operators.single.SingleToObservable;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/g.class */
public final class g {
    public static final float a(float f7) {
        float f8 = Resources.getSystem().getDisplayMetrics().density;
        if (f8 > 0.0f) {
            f7 /= f8;
        }
        return f7;
    }

    public static boolean b(Object obj, Function function, aY0.c cVar) {
        aY0.e eVar;
        if (!(obj instanceof eY0.i)) {
            return false;
        }
        try {
            Object obj2 = ((eY0.i) obj).get();
            if (obj2 != null) {
                Object objApply = function.apply(obj2);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                eVar = (aY0.e) objApply;
            } else {
                eVar = null;
            }
            if (eVar == null) {
                EmptyDisposable.complete(cVar);
                return true;
            }
            eVar.a(cVar);
            return true;
        } catch (Throwable th) {
            cY0.a.a(th);
            EmptyDisposable.error(th, cVar);
            return true;
        }
    }

    public static boolean c(Object obj, Function function, Observer observer) {
        aY0.q qVar;
        if (!(obj instanceof eY0.i)) {
            return false;
        }
        try {
            Object obj2 = ((eY0.i) obj).get();
            if (obj2 != null) {
                Object objApply = function.apply(obj2);
                Objects.requireNonNull(objApply, "The mapper returned a null MaybeSource");
                qVar = (aY0.q) objApply;
            } else {
                qVar = null;
            }
            if (qVar == null) {
                EmptyDisposable.complete(observer);
                return true;
            }
            qVar.a(MaybeToObservable.c(observer));
            return true;
        } catch (Throwable th) {
            cY0.a.a(th);
            EmptyDisposable.error(th, observer);
            return true;
        }
    }

    public static boolean d(Object obj, Function function, Observer observer) {
        SingleSource singleSource;
        if (!(obj instanceof eY0.i)) {
            return false;
        }
        try {
            Object obj2 = ((eY0.i) obj).get();
            if (obj2 != null) {
                Object objApply = function.apply(obj2);
                Objects.requireNonNull(objApply, "The mapper returned a null SingleSource");
                singleSource = (SingleSource) objApply;
            } else {
                singleSource = null;
            }
            if (singleSource == null) {
                EmptyDisposable.complete(observer);
                return true;
            }
            singleSource.subscribe(SingleToObservable.c(observer));
            return true;
        } catch (Throwable th) {
            cY0.a.a(th);
            EmptyDisposable.error(th, observer);
            return true;
        }
    }
}
