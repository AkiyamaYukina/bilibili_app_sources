package com.bilibili.tgwt.player;

import android.view.ViewGroup;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.tgwt.player.FloatLayerManager;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/d.class */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f111543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatLayerManager f111544b;

    public /* synthetic */ d(ViewGroup viewGroup, FloatLayerManager floatLayerManager) {
        this.f111543a = viewGroup;
        this.f111544b = floatLayerManager;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        ViewGroup viewGroup = this.f111543a;
        FloatLayerManager.b bVar = (FloatLayerManager.b) obj;
        int i7 = FloatLayerManager.d.f111530a[bVar.f111529b.ordinal()];
        FloatLayerManager.a aVar = bVar.f111528a;
        FloatLayerManager floatLayerManager = this.f111544b;
        UIComponent<?> uIComponent = aVar.f111525a;
        if (i7 == 1) {
            BLog.i("FloatLayerManager-bindContainer$lambda$1", "[together-watch-FloatLayerManager-bindContainer$lambda$1] " + ("container add layer " + uIComponent + " in callback"));
            floatLayerManager.getClass();
            aVar.f111527c = BuildersKt.launch$default(aVar.f111526b, (CoroutineContext) null, (CoroutineStart) null, new FloatLayerManager$addLayer$1(aVar, viewGroup, null, floatLayerManager, null), 3, (Object) null);
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            defpackage.a.b("[together-watch-FloatLayerManager-bindContainer$lambda$1] ", "container remove layer " + uIComponent, "FloatLayerManager-bindContainer$lambda$1");
            floatLayerManager.c(viewGroup, aVar, null);
        }
        return Unit.INSTANCE;
    }
}
