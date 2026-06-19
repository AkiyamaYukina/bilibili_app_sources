package com.bilibili.studio.videoeditor.template;

import android.widget.FrameLayout;
import com.bilibili.base.MainThread;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import fD0.InterfaceC7041a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/G.class */
public final /* synthetic */ class G implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f109931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f109932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiliTemplateEngineManager f109933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f109934d;

    public /* synthetic */ G(Function2 function2, Function1 function1, BiliTemplateEngineManager biliTemplateEngineManager, FrameLayout frameLayout) {
        this.f109931a = function2;
        this.f109932b = function1;
        this.f109933c = biliTemplateEngineManager;
        this.f109934d = frameLayout;
    }

    public final Object invoke(Object obj) {
        Unit unit;
        final FrameLayout frameLayout = this.f109934d;
        if (((Boolean) obj).booleanValue()) {
            final Function1 function1 = this.f109932b;
            final BiliTemplateEngineManager biliTemplateEngineManager = this.f109933c;
            MainThread.postOnMainThread(new Function0(function1, biliTemplateEngineManager, frameLayout) { // from class: com.bilibili.studio.videoeditor.template.P

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function1 f109980a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final BiliTemplateEngineManager f109981b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final FrameLayout f109982c;

                {
                    this.f109980a = function1;
                    this.f109981b = biliTemplateEngineManager;
                    this.f109982c = frameLayout;
                }

                public final Object invoke() {
                    FrameLayout frameLayout2 = this.f109982c;
                    InterfaceC7041a interfaceC7041a = this.f109981b.f109914e;
                    this.f109980a.invoke(interfaceC7041a != null ? Boolean.valueOf(interfaceC7041a.startCollisionAnim(frameLayout2)) : null);
                    return Unit.INSTANCE;
                }
            });
            unit = Unit.INSTANCE;
        } else {
            this.f109931a.invoke(CaptureSchema.OLD_INVALID_ID_STRING, "checkTribeInstalledState fail");
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
