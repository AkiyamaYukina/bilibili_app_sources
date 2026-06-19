package com.bilibili.studio.videoeditor.template;

import android.app.Activity;
import android.os.Bundle;
import com.bilibili.base.MainThread;
import fD0.InterfaceC7041a;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/H.class */
public final /* synthetic */ class H implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f109935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiliTemplateEngineManager f109936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f109937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f109938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f109939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f109940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f109941g;
    public final Function2 h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Function3 f109942i;

    public /* synthetic */ H(int i7, Activity activity, Bundle bundle, BiliTemplateEngineManager biliTemplateEngineManager, String str, String str2, Function1 function1, Function2 function2, Function3 function3) {
        this.f109935a = function1;
        this.f109936b = biliTemplateEngineManager;
        this.f109937c = activity;
        this.f109938d = str;
        this.f109939e = str2;
        this.f109940f = i7;
        this.f109941g = bundle;
        this.h = function2;
        this.f109942i = function3;
    }

    public final Object invoke(Object obj) {
        Unit unit;
        final Bundle bundle = this.f109941g;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        final Function1 function1 = this.f109935a;
        if (zBooleanValue) {
            final Function2 function2 = this.h;
            final Function3 function3 = this.f109942i;
            final BiliTemplateEngineManager biliTemplateEngineManager = this.f109936b;
            final Activity activity = this.f109937c;
            final String str = this.f109938d;
            final String str2 = this.f109939e;
            final int i7 = this.f109940f;
            biliTemplateEngineManager.e(false, false, new Function1(i7, activity, bundle, biliTemplateEngineManager, str, str2, function1, function2, function3) { // from class: com.bilibili.studio.videoeditor.template.O

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function1 f109972a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final BiliTemplateEngineManager f109973b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Activity f109974c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f109975d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final String f109976e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f109977f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final Bundle f109978g;
                public final Function2 h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final Function3 f109979i;

                {
                    this.f109972a = function1;
                    this.f109973b = biliTemplateEngineManager;
                    this.f109974c = activity;
                    this.f109975d = str;
                    this.f109976e = str2;
                    this.f109977f = i7;
                    this.f109978g = bundle;
                    this.h = function2;
                    this.f109979i = function3;
                }

                public final Object invoke(Object obj2) {
                    Unit unit2;
                    final Bundle bundle2 = this.f109978g;
                    boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                    final Function1 function12 = this.f109972a;
                    if (zBooleanValue2) {
                        final Function2 function22 = this.h;
                        final Function3 function32 = this.f109979i;
                        final BiliTemplateEngineManager biliTemplateEngineManager2 = this.f109973b;
                        final Activity activity2 = this.f109974c;
                        final String str3 = this.f109975d;
                        final String str4 = this.f109976e;
                        final int i8 = this.f109977f;
                        MainThread.runOnMainThread(new Function0(i8, activity2, bundle2, biliTemplateEngineManager2, str3, str4, function12, function22, function32) { // from class: com.bilibili.studio.videoeditor.template.S

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final BiliTemplateEngineManager f109991a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final Activity f109992b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final String f109993c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final String f109994d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            public final int f109995e;

                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                            public final Bundle f109996f;

                            /* JADX INFO: renamed from: g, reason: collision with root package name */
                            public final Function2 f109997g;
                            public final Function3 h;

                            /* JADX INFO: renamed from: i, reason: collision with root package name */
                            public final Function1 f109998i;

                            {
                                this.f109991a = biliTemplateEngineManager2;
                                this.f109992b = activity2;
                                this.f109993c = str3;
                                this.f109994d = str4;
                                this.f109995e = i8;
                                this.f109996f = bundle2;
                                this.f109997g = function22;
                                this.h = function32;
                                this.f109998i = function12;
                            }

                            public final Object invoke() {
                                Bundle bundle3 = this.f109996f;
                                List listMutableListOf = CollectionsKt.mutableListOf(new Integer[]{2, 1});
                                InterfaceC7041a interfaceC7041a = this.f109991a.f109914e;
                                if (interfaceC7041a != null) {
                                    interfaceC7041a.l(this.f109992b, this.f109993c, this.f109994d, listMutableListOf, this.f109995e, bundle3, this.f109997g, this.h, this.f109998i);
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        unit2 = Unit.INSTANCE;
                    } else {
                        function12.invoke(new Throwable("tribe installed state error"));
                        unit2 = Unit.INSTANCE;
                    }
                    return unit2;
                }
            });
            unit = Unit.INSTANCE;
        } else {
            function1.invoke(new Throwable("editor engine mod state error"));
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
