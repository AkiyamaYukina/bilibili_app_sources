package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tv.danmaku.bili.fullscreen.state.E0;
import tv.danmaku.bili.fullscreen.state.F0;
import tv.danmaku.bili.fullscreen.state.G0;
import tv.danmaku.bili.fullscreen.state.S;
import tv.danmaku.bili.fullscreen.state.U;
import tv.danmaku.bili.fullscreen.state.q2;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.setting.v2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/h.class */
public final /* synthetic */ class C5788h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f81435b;

    public /* synthetic */ C5788h(Object obj, int i7) {
        this.f81434a = i7;
        this.f81435b = obj;
    }

    public final Object invoke(Object obj) {
        switch (this.f81434a) {
            case 0:
                Float f7 = (Float) obj;
                f7.floatValue();
                ((DanmakuSettingsDialog) this.f81435b).f81307t.setValue(f7);
                return Unit.INSTANCE;
            case 1:
                if (!((Boolean) obj).booleanValue()) {
                    ((com.bilibili.upper.module.template.vm.g) this.f81435b).M0();
                }
                return Unit.INSTANCE;
            case 2:
                mL.a aVar = (mL.a) this.f81435b;
                Iterator it = aVar.r.entrySet().iterator();
                while (it.hasNext()) {
                    ((aL.b) ((Map.Entry) it.next()).getValue()).a().c();
                }
                Iterator it2 = aVar.s.entrySet().iterator();
                while (it2.hasNext()) {
                    ((aL.b) ((Map.Entry) it2.next()).getValue()).a().c();
                }
                return Unit.INSTANCE;
            default:
                U.h hVar = (S) obj;
                E0 g02 = null;
                if (hVar instanceof U.h) {
                    if (!hVar.a) {
                        g02 = E0.a;
                    }
                } else if (hVar instanceof U.i) {
                    g02 = new F0(((U.i) hVar).a);
                } else if (hVar instanceof U.j) {
                    g02 = new G0(((U.j) hVar).a, ((q2) this.f81435b).j);
                }
                return g02;
        }
    }
}
