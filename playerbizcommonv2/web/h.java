package com.bilibili.playerbizcommonv2.web;

import NB0.ViewOnClickListenerC2701t;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bilibili.app.comm.aghanim.api.SceneMode;
import com.bilibili.app.comm.aghanim.api.WebRequestKt;
import com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent;
import com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/h.class */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82227a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f82228b;

    public /* synthetic */ h(Context context, PlayerV3WebGeneralUIComponent.a aVar) {
        this.f82228b = context;
    }

    public /* synthetic */ h(IndependentCaptureFragment independentCaptureFragment) {
        this.f82228b = independentCaptureFragment;
    }

    public final Object invoke(Object obj) {
        View view;
        View view2;
        Object obj2 = this.f82228b;
        switch (this.f82227a) {
            case 0:
                Context context = (Context) obj2;
                int i7 = PlayerV3WebGeneralUIComponent.f82092y;
                return WebRequestKt.webRequest$default(Uri.parse((String) obj), context, (SceneMode) null, new com.bilibili.lib.fasthybrid.game.engine.ability.impl.storage.a(1), 4, (Object) null);
            default:
                int i8 = IndependentCaptureFragment.f109161L;
                IndependentCaptureFragment independentCaptureFragment = (IndependentCaptureFragment) obj2;
                if (((Boolean) obj).booleanValue()) {
                    ViewOnClickListenerC2701t viewOnClickListenerC2701t = independentCaptureFragment.f109164C;
                    if (viewOnClickListenerC2701t != null && (view2 = viewOnClickListenerC2701t.f16938m) != null) {
                        view2.setVisibility(0);
                    }
                } else {
                    ViewOnClickListenerC2701t viewOnClickListenerC2701t2 = independentCaptureFragment.f109164C;
                    if (viewOnClickListenerC2701t2 != null && (view = viewOnClickListenerC2701t2.f16938m) != null) {
                        view.setVisibility(8);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
