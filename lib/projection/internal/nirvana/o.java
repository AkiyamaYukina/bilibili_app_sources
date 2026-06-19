package com.bilibili.lib.projection.internal.nirvana;

import com.bilibili.lib.projection.internal.nirvana.NirvanaEngine;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionPlayableItem;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.android.log.BLog;
import ue0.C8721d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/o.class */
public final class o<T, R> implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NirvanaEngine.a f63333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StandardProjectionPlayableItem f63334b;

    public o(NirvanaEngine.a aVar, StandardProjectionPlayableItem standardProjectionPlayableItem) {
        this.f63333a = aVar;
        this.f63334b = standardProjectionPlayableItem;
    }

    public final Object apply(Object obj) {
        Observable observableEmpty;
        com.bilibili.lib.nirvana.api.c cVar = (com.bilibili.lib.nirvana.api.c) obj;
        boolean zAreEqual = Intrinsics.areEqual(cVar.a, "NO_MEDIA_PRESENT");
        NirvanaEngine.a aVar = this.f63333a;
        if (zAreEqual || Intrinsics.areEqual(cVar.a, "NO_MEDIA_PRESENT")) {
            BLog.i("NirvanaEngine", "Restoring device " + aVar.h() + "is stopped or idle.");
            observableEmpty = Observable.empty();
        } else {
            aVar.getClass();
            observableEmpty = Observable.create(new C8721d(aVar)).flatMap(new n(aVar, this.f63334b));
        }
        return observableEmpty;
    }
}
