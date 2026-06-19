package com.bilibili.studio.videoeditor.template;

import fD0.InterfaceC7041a;
import kntr.common.share.core.g;
import kntr.common.share.domain.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/b0.class */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f110051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f110052c;

    public /* synthetic */ b0(int i7, Object obj, Object obj2) {
        this.f110050a = i7;
        this.f110051b = obj;
        this.f110052c = obj2;
    }

    public final Object invoke(Object obj) {
        InterfaceC7041a interfaceC7041a;
        switch (this.f110050a) {
            case 0:
                if (((Boolean) obj).booleanValue() && (interfaceC7041a = ((BiliTemplateEngineManager) this.f110051b).f109914e) != null) {
                    interfaceC7041a.cancelAITask((String) this.f110052c);
                }
                Unit unit = Unit.INSTANCE;
                return unit;
            default:
                g.b bVar = (kntr.common.share.core.g) this.f110052c;
                return new c.e(new g.b((kntr.common.share.core.base.c) this.f110051b, bVar.c, bVar.d));
        }
    }
}
