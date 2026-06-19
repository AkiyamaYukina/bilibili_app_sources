package com.bilibili.ogv.kmm.operation.banner;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.bilibili.ogv.kmm.operation.banner.C5449m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import ml0.C8013d;

/* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/i.class */
public final class C5445i implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f68116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f68117b;

    public C5445i(List list, float f7) {
        this.f68116a = list;
        this.f68117b = f7;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        LazyItemScope lazyItemScope = (LazyItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i7 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
        } else {
            i7 = iIntValue2;
        }
        int i8 = i7;
        if ((iIntValue2 & 48) == 0) {
            i8 = i7 | (composer.changed(iIntValue) ? 32 : 16);
        }
        if (composer.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(802480018, i8, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            C5449m.a aVar = (C5449m.a) ((ArrayList) this.f68116a).get(iIntValue);
            composer.startReplaceGroup(1118708865);
            new nl0.q(aVar.f68129a, null, ComposableLambdaKt.rememberComposableLambda(-1622003413, true, new C5443g(aVar), composer, 54), E.f68024a, E.f68025b, null, 8162).a(C8013d.a(SizeKt.m1377width3ABfNKs(Modifier.Companion, this.f68117b), aVar.f68130b), 0.0f, composer, 512);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
