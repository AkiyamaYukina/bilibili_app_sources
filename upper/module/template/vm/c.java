package com.bilibili.upper.module.template.vm;

import By0.I0;
import android.app.Activity;
import android.os.Bundle;
import com.bilibili.base.MainThread;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import com.bilibili.studio.videoeditor.template.C6609g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/vm/c.class */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f114034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I0 f114035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f114036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f114037d;

    public /* synthetic */ c(g gVar, I0 i02, Activity activity, Bundle bundle) {
        this.f114034a = gVar;
        this.f114035b = i02;
        this.f114036c = activity;
        this.f114037d = bundle;
    }

    public final Object invoke(Object obj) {
        final Bundle bundle = this.f114037d;
        final String str = (String) obj;
        final g gVar = this.f114034a;
        gVar.f114049d.postValue(101);
        gVar.O0();
        final I0 i02 = this.f114035b;
        final Activity activity = this.f114036c;
        MainThread.runOnMainThread(new Function0(i02, str, gVar, activity, bundle) { // from class: com.bilibili.upper.module.template.vm.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final I0 f114042a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f114043b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final g f114044c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Activity f114045d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Bundle f114046e;

            {
                this.f114042a = i02;
                this.f114043b = str;
                this.f114044c = gVar;
                this.f114045d = activity;
                this.f114046e = bundle;
            }

            public final Object invoke() {
                Bundle bundle2 = this.f114046e;
                I0 i03 = this.f114042a;
                String str2 = this.f114043b;
                if (((Boolean) i03.invoke(str2)).booleanValue()) {
                    g gVar2 = this.f114044c;
                    gVar2.getClass();
                    String str3 = str2;
                    if (str2 == null) {
                        str3 = "";
                    }
                    BiliTemplateEngineManager biliTemplateEngineManager = gVar2.f114047b;
                    biliTemplateEngineManager.getClass();
                    BiliTemplateEngineManager.c(biliTemplateEngineManager, false, true, false, new C6609g(biliTemplateEngineManager, this.f114045d, str3, bundle2, 0), 4);
                }
                return Unit.INSTANCE;
            }
        });
        return Unit.INSTANCE;
    }
}
