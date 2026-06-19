package com.bilibili.studio.videoeditor.template;

import android.app.Activity;
import com.bilibili.base.MainThread;
import fD0.InterfaceC7041a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.template.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/k.class */
public final /* synthetic */ class C6613k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliTemplateEngineManager f110110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f110111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f110112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f110113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f110114e;

    public /* synthetic */ C6613k(BiliTemplateEngineManager biliTemplateEngineManager, Activity activity, int i7, String str, String str2) {
        this.f110110a = biliTemplateEngineManager;
        this.f110111b = activity;
        this.f110112c = i7;
        this.f110113d = str;
        this.f110114e = str2;
    }

    public final Object invoke(Object obj) {
        Unit unit;
        if (((Boolean) obj).booleanValue()) {
            final String str = this.f110113d;
            final String str2 = this.f110114e;
            final BiliTemplateEngineManager biliTemplateEngineManager = this.f110110a;
            final Activity activity = this.f110111b;
            final int i7 = this.f110112c;
            MainThread.runOnMainThread(new Function0(biliTemplateEngineManager, activity, i7, str, str2) { // from class: com.bilibili.studio.videoeditor.template.z

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliTemplateEngineManager f110187a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Activity f110188b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f110189c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f110190d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final String f110191e;

                {
                    this.f110187a = biliTemplateEngineManager;
                    this.f110188b = activity;
                    this.f110189c = i7;
                    this.f110190d = str;
                    this.f110191e = str2;
                }

                public final Object invoke() {
                    InterfaceC7041a interfaceC7041a = this.f110187a.f109914e;
                    if (interfaceC7041a != null) {
                        interfaceC7041a.g(this.f110188b, this.f110190d, this.f110191e, this.f110189c);
                    }
                    return Unit.INSTANCE;
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
