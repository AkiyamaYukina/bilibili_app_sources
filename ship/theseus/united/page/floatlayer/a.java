package com.bilibili.ship.theseus.united.page.floatlayer;

import android.view.ViewGroup;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.FloatLayerManager;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/a.class */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f99677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatLayerManager f99678b;

    public /* synthetic */ a(ViewGroup viewGroup, FloatLayerManager floatLayerManager) {
        this.f99677a = viewGroup;
        this.f99678b = floatLayerManager;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        ViewGroup viewGroup = this.f99677a;
        FloatLayerManager.b bVar = (FloatLayerManager.b) obj;
        int i7 = FloatLayerManager.d.f99649a[bVar.f99648b.ordinal()];
        FloatLayerManager.a aVar = bVar.f99647a;
        FloatLayerManager floatLayerManager = this.f99678b;
        UIComponent<?> uIComponent = aVar.f99643a;
        if (i7 == 1) {
            BLog.i("FloatLayerManager-bindContainer$lambda$1", "[theseus-united-FloatLayerManager-bindContainer$lambda$1] " + ("container add layer " + uIComponent + " in callback"));
            floatLayerManager.getClass();
            aVar.f99646d = BuildersKt.launch$default(aVar.f99645c, (CoroutineContext) null, (CoroutineStart) null, new FloatLayerManager$addLayer$1(aVar, viewGroup, null, floatLayerManager, null), 3, (Object) null);
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            defpackage.a.b("[theseus-united-FloatLayerManager-bindContainer$lambda$1] ", "container remove layer " + uIComponent, "FloatLayerManager-bindContainer$lambda$1");
            floatLayerManager.d(viewGroup, aVar, null);
        }
        return Unit.INSTANCE;
    }
}
