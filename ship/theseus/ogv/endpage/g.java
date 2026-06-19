package com.bilibili.ship.theseus.ogv.endpage;

import L9.q;
import ZS0.i1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ship.theseus.ogv.endpage.OgvPlayerEndPageFullScreenFunctionWidget;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.intro.module.relate.o0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/g.class */
public final class g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvPlayerEndPageFullScreenFunctionWidget.d f92084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f92085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OgvPlayerEndPageFullScreenFunctionWidget f92086c;

    public g(OgvPlayerEndPageFullScreenFunctionWidget.d dVar, o0 o0Var, OgvPlayerEndPageFullScreenFunctionWidget ogvPlayerEndPageFullScreenFunctionWidget) {
        this.f92084a = dVar;
        this.f92085b = o0Var;
        this.f92086c = ogvPlayerEndPageFullScreenFunctionWidget;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f92084a.f91989f.setVisibility(8);
        View view = this.f92084a.h;
        if (view != null) {
            view.setVisibility(0);
        }
        this.f92084a.f91988e.setVisibility(8);
        this.f92084a.f91987d.setVisibility(8);
        this.f92084a.f91990g.setVisibility(8);
        i1 i1Var = this.f92084a.f91993k;
        if (i1Var != null) {
            i1Var.invoke(Boolean.FALSE);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f92084a.f91989f.setVisibility(8);
        View view = this.f92084a.h;
        if (view != null) {
            view.setVisibility(0);
        }
        this.f92084a.f91988e.setVisibility(8);
        this.f92084a.f91987d.setVisibility(8);
        this.f92084a.f91990g.setVisibility(8);
        o0 o0Var = this.f92085b;
        q qVar = this.f92084a.f91992j;
        if (qVar != null) {
            qVar.invoke(Long.valueOf(o0Var.f101323i.f101279a));
        }
        OgvPlayerEndPageFullScreenFunctionWidget ogvPlayerEndPageFullScreenFunctionWidget = this.f92086c;
        com.bilibili.ship.theseus.ogv.continuousplay.d dVar = ogvPlayerEndPageFullScreenFunctionWidget.f91961n;
        int i7 = dVar.f91811a + 1;
        dVar.f91811a = i7;
        long j7 = ogvPlayerEndPageFullScreenFunctionWidget.f91958k.f93555a;
        OgvSeason ogvSeason = ogvPlayerEndPageFullScreenFunctionWidget.f91956i;
        com.bilibili.ogv.pub.season.a aVar = ogvSeason.f94450b;
        if (i7 >= 0) {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            mapCreateMapBuilder.put("season_type", String.valueOf(aVar.f71782a));
            mapCreateMapBuilder.put("season_id", String.valueOf(ogvSeason.f94449a));
            mapCreateMapBuilder.put("epid", String.valueOf(j7));
            mapCreateMapBuilder.put("index", String.valueOf(i7));
            mapCreateMapBuilder.put("type", "season_continue");
            Unit unit = Unit.INSTANCE;
            Neurons.reportExposure$default(false, "pgc.pgc-video-detail.hookup.0.show", MapsKt.build(mapCreateMapBuilder), (List) null, 8, (Object) null);
        }
        i1 i1Var = this.f92084a.f91993k;
        if (i1Var != null) {
            i1Var.invoke(Boolean.FALSE);
        }
    }
}
