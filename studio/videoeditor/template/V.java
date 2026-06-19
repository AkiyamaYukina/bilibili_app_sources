package com.bilibili.studio.videoeditor.template;

import android.widget.FrameLayout;
import com.bilibili.base.MainThread;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import fD0.InterfaceC7041a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/V.class */
public final /* synthetic */ class V implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f110005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f110006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiliTemplateEngineManager f110007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f110008d;

    public /* synthetic */ V(Function2 function2, Function1 function1, BiliTemplateEngineManager biliTemplateEngineManager, FrameLayout frameLayout) {
        this.f110005a = function2;
        this.f110006b = function1;
        this.f110007c = biliTemplateEngineManager;
        this.f110008d = frameLayout;
    }

    public final Object invoke(Object obj) {
        Unit unit;
        final FrameLayout frameLayout = this.f110008d;
        if (((Boolean) obj).booleanValue()) {
            final Function1 function1 = this.f110006b;
            final BiliTemplateEngineManager biliTemplateEngineManager = this.f110007c;
            MainThread.postOnMainThread(new Function0(function1, biliTemplateEngineManager, frameLayout) { // from class: com.bilibili.studio.videoeditor.template.W

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function1 f110009a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final BiliTemplateEngineManager f110010b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final FrameLayout f110011c;

                {
                    this.f110009a = function1;
                    this.f110010b = biliTemplateEngineManager;
                    this.f110011c = frameLayout;
                }

                public final Object invoke() {
                    FrameLayout frameLayout2 = this.f110011c;
                    InterfaceC7041a interfaceC7041a = this.f110010b.f109914e;
                    this.f110009a.invoke(interfaceC7041a != null ? Boolean.valueOf(interfaceC7041a.stopCollisionAnim(frameLayout2)) : null);
                    return Unit.INSTANCE;
                }
            });
            unit = Unit.INSTANCE;
        } else {
            this.f110005a.invoke(CaptureSchema.OLD_INVALID_ID_STRING, "checkTribeInstalledState fail");
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
