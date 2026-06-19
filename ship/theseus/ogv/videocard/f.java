package com.bilibili.ship.theseus.ogv.videocard;

import com.bilibili.ship.theseus.ogv.bugle.PlayerBugleFunctionWidget;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/f.class */
public final class f<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvVideoCardService f94717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FunctionWidgetToken f94718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bilibili.ship.theseus.ogv.bugle.a f94719c;

    public f(OgvVideoCardService ogvVideoCardService, FunctionWidgetToken functionWidgetToken, com.bilibili.ship.theseus.ogv.bugle.a aVar) {
        this.f94717a = ogvVideoCardService;
        this.f94718b = functionWidgetToken;
        this.f94719c = aVar;
    }

    public final Object emit(Object obj, Continuation continuation) {
        Pair pair = (Pair) obj;
        boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) pair.component2()).booleanValue();
        this.f94717a.f94647r.updateFunctionWidgetConfiguration(this.f94718b, new PlayerBugleFunctionWidget.a(this.f94719c, zBooleanValue, zBooleanValue2));
        return Unit.INSTANCE;
    }
}
