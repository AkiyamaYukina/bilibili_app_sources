package com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.cmtime;

import androidx.compose.runtime.MutableIntState;
import com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.cmtime.CommercialTimeView$showUpperSloganSelector$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import sr0.C8620c;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/cmtime/k.class */
public final class k implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableIntState f81052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f81054c;

    public k(MutableIntState mutableIntState, int i7, j jVar) {
        this.f81052a = mutableIntState;
        this.f81053b = i7;
        this.f81054c = jVar;
    }

    public final Object invoke() {
        MutableIntState mutableIntState = this.f81052a;
        int i7 = this.f81053b;
        mutableIntState.setIntValue(i7);
        j jVar = this.f81054c;
        CommercialTimeView$showUpperSloganSelector$1.a aVar = jVar.f81048b;
        CommandsPanel.Panel.Extra.GuideMaterial guideMaterial = (CommandsPanel.Panel.Extra.GuideMaterial) CollectionsKt.getOrNull(aVar.f81015a, i7);
        if (guideMaterial != null) {
            f fVar = aVar.f81016b;
            fVar.f81039i = i7;
            C8620c c8620c = fVar.f81038g;
            if (c8620c != null) {
                c8620c.b(aVar.f81017c, guideMaterial.getUpperSlogan());
            }
            C8620c c8620c2 = fVar.h;
            if (c8620c2 != null) {
                c8620c2.b(aVar.f81018d, guideMaterial.getUserSlogan());
            }
        }
        jVar.dismiss();
        return Unit.INSTANCE;
    }
}
