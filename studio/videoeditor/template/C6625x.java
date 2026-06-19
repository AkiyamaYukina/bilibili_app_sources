package com.bilibili.studio.videoeditor.template;

import android.widget.FrameLayout;
import com.bilibili.base.MainThread;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import fD0.InterfaceC7041a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.template.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/x.class */
public final /* synthetic */ class C6625x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f110175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f110176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiliTemplateEngineManager f110177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f110178d;

    public /* synthetic */ C6625x(Function2 function2, Function1 function1, BiliTemplateEngineManager biliTemplateEngineManager, FrameLayout frameLayout) {
        this.f110175a = function2;
        this.f110176b = function1;
        this.f110177c = biliTemplateEngineManager;
        this.f110178d = frameLayout;
    }

    public final Object invoke(Object obj) {
        Unit unit;
        final FrameLayout frameLayout = this.f110178d;
        if (((Boolean) obj).booleanValue()) {
            final Function1 function1 = this.f110176b;
            final BiliTemplateEngineManager biliTemplateEngineManager = this.f110177c;
            MainThread.postOnMainThread(new Function0(function1, biliTemplateEngineManager, frameLayout) { // from class: com.bilibili.studio.videoeditor.template.K

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function1 f109953a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final BiliTemplateEngineManager f109954b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final FrameLayout f109955c;

                {
                    this.f109953a = function1;
                    this.f109954b = biliTemplateEngineManager;
                    this.f109955c = frameLayout;
                }

                public final Object invoke() {
                    FrameLayout frameLayout2 = this.f109955c;
                    InterfaceC7041a interfaceC7041a = this.f109954b.f109914e;
                    this.f109953a.invoke(interfaceC7041a != null ? Boolean.valueOf(interfaceC7041a.destroyCollisionView(frameLayout2)) : null);
                    return Unit.INSTANCE;
                }
            });
            unit = Unit.INSTANCE;
        } else {
            this.f110175a.invoke(CaptureSchema.OLD_INVALID_ID_STRING, "checkTribeInstalledState fail");
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
