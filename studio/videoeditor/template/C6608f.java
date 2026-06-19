package com.bilibili.studio.videoeditor.template;

import gD0.InterfaceC7248b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.template.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/f.class */
public final /* synthetic */ class C6608f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliTemplateEngineManager f110075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110076b;

    public /* synthetic */ C6608f(BiliTemplateEngineManager biliTemplateEngineManager, int i7) {
        this.f110075a = biliTemplateEngineManager;
        this.f110076b = i7;
    }

    public final Object invoke() {
        InterfaceC7248b interfaceC7248b = this.f110075a.f109919k;
        if (interfaceC7248b != null) {
            interfaceC7248b.Z2(this.f110076b);
        }
        return Unit.INSTANCE;
    }
}
