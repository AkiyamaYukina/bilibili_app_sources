package com.bilibili.ship.theseus.ogv.endpage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.TextView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ship.theseus.ogv.C6153e;
import com.bilibili.ship.theseus.ogv.endpage.OgvPlayerEndPageVerticalFullScreenFunctionWidget;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.intro.module.relate.o0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/j.class */
public final class j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvPlayerEndPageVerticalFullScreenFunctionWidget.d f92094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OgvPlayerEndPageVerticalFullScreenFunctionWidget f92095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f92096c;

    public j(OgvPlayerEndPageVerticalFullScreenFunctionWidget.d dVar, OgvPlayerEndPageVerticalFullScreenFunctionWidget ogvPlayerEndPageVerticalFullScreenFunctionWidget, o0 o0Var) {
        this.f92094a = dVar;
        this.f92095b = ogvPlayerEndPageVerticalFullScreenFunctionWidget;
        this.f92096c = o0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f92094a.f92068f.setVisibility(8);
        View view = this.f92094a.f92069g;
        if (view != null) {
            view.setVisibility(0);
        }
        this.f92094a.f92067e.setVisibility(8);
        this.f92094a.f92066d.setVisibility(8);
        this.f92094a.h.setVisibility(8);
        OgvPlayerEndPageVerticalFullScreenFunctionWidget ogvPlayerEndPageVerticalFullScreenFunctionWidget = this.f92095b;
        ogvPlayerEndPageVerticalFullScreenFunctionWidget.f92044o.f91811a = 0;
        TextView textView = ogvPlayerEndPageVerticalFullScreenFunctionWidget.f92016C;
        if (textView != null) {
            textView.setText(ogvPlayerEndPageVerticalFullScreenFunctionWidget.f92035e.getText(2131846816));
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f92094a.f92068f.setVisibility(8);
        View view = this.f92094a.f92069g;
        if (view != null) {
            view.setVisibility(0);
        }
        this.f92094a.f92067e.setVisibility(8);
        this.f92094a.f92066d.setVisibility(8);
        this.f92094a.h.setVisibility(8);
        OgvPlayerEndPageVerticalFullScreenFunctionWidget ogvPlayerEndPageVerticalFullScreenFunctionWidget = this.f92095b;
        com.bilibili.ship.theseus.ogv.continuousplay.d dVar = ogvPlayerEndPageVerticalFullScreenFunctionWidget.f92044o;
        int i7 = dVar.f91811a + 1;
        dVar.f91811a = i7;
        long j7 = ogvPlayerEndPageVerticalFullScreenFunctionWidget.f92041l.f93555a;
        OgvSeason ogvSeason = ogvPlayerEndPageVerticalFullScreenFunctionWidget.f92039j;
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
        C6153e c6153e = this.f92095b.f92038i;
        long j8 = this.f92096c.f101323i.f101279a;
        OgvPlayerEndPageVerticalFullScreenFunctionWidget ogvPlayerEndPageVerticalFullScreenFunctionWidget2 = this.f92095b;
        C6153e.f(c6153e, Long.valueOf(j8), null, ogvPlayerEndPageVerticalFullScreenFunctionWidget2.f92044o.f91811a, ogvPlayerEndPageVerticalFullScreenFunctionWidget2.f92053x.a().f123881c, 99, 2);
        OgvPlayerEndPageVerticalFullScreenFunctionWidget ogvPlayerEndPageVerticalFullScreenFunctionWidget3 = this.f92095b;
        TextView textView = ogvPlayerEndPageVerticalFullScreenFunctionWidget3.f92016C;
        if (textView != null) {
            textView.setText(ogvPlayerEndPageVerticalFullScreenFunctionWidget3.f92035e.getText(2131846816));
        }
    }
}
