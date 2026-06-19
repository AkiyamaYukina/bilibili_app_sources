package com.bilibili.studio.videoeditor.template;

import android.app.Activity;
import android.os.Bundle;
import com.bilibili.base.MainThread;
import fD0.InterfaceC7041a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.template.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/g.class */
public final /* synthetic */ class C6609g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliTemplateEngineManager f110081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f110082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f110083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f110084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f110085e;

    public /* synthetic */ C6609g(BiliTemplateEngineManager biliTemplateEngineManager, Activity activity, String str, Bundle bundle, Integer num) {
        this.f110081a = biliTemplateEngineManager;
        this.f110082b = activity;
        this.f110083c = str;
        this.f110084d = bundle;
        this.f110085e = num;
    }

    public final Object invoke(Object obj) {
        Unit unit;
        final Bundle bundle = this.f110084d;
        if (((Boolean) obj).booleanValue()) {
            final String str = this.f110083c;
            final Integer num = this.f110085e;
            final BiliTemplateEngineManager biliTemplateEngineManager = this.f110081a;
            final Activity activity = this.f110082b;
            biliTemplateEngineManager.e(true, true, new Function1(biliTemplateEngineManager, activity, str, bundle, num) { // from class: com.bilibili.studio.videoeditor.template.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliTemplateEngineManager f110135a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Activity f110136b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f110137c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Bundle f110138d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Integer f110139e;

                {
                    this.f110135a = biliTemplateEngineManager;
                    this.f110136b = activity;
                    this.f110137c = str;
                    this.f110138d = bundle;
                    this.f110139e = num;
                }

                public final Object invoke(Object obj2) {
                    Unit unit2;
                    Bundle bundle2 = this.f110138d;
                    if (((Boolean) obj2).booleanValue()) {
                        MainThread.runOnMainThread(new Function0(this.f110135a, this.f110136b, this.f110137c, bundle2, this.f110139e) { // from class: com.bilibili.studio.videoeditor.template.E

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final BiliTemplateEngineManager f109923a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final Activity f109924b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final String f109925c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final Bundle f109926d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            public final Integer f109927e;

                            {
                                this.f109923a = biliTemplateEngineManager;
                                this.f109924b = activity;
                                this.f109925c = str;
                                this.f109926d = bundle2;
                                this.f109927e = num;
                            }

                            public final Object invoke() {
                                Bundle bundle3 = this.f109926d;
                                BiliTemplateEngineManager biliTemplateEngineManager2 = this.f109923a;
                                InterfaceC7041a interfaceC7041a = biliTemplateEngineManager2.f109914e;
                                if (interfaceC7041a != null) {
                                    String str2 = this.f109925c;
                                    String str3 = str2;
                                    if (str2 == null) {
                                        str3 = "";
                                    }
                                    interfaceC7041a.f(this.f109924b, str3, biliTemplateEngineManager2.g(bundle3), this.f109927e);
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        unit2 = Unit.INSTANCE;
                    } else {
                        unit2 = Unit.INSTANCE;
                    }
                    return unit2;
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
