package com.bilibili.ship.theseus.playlist.di.biz;

import android.graphics.Typeface;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.bilibili.ship.theseus.playlist.selector.o;
import com.bilibili.ship.theseus.united.player.controlcontainer.d;
import javax.inject.Provider;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/b.class */
public final /* synthetic */ class b implements com.bilibili.ship.theseus.united.player.controlcontainer.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f95358a;

    @Override // com.bilibili.ship.theseus.united.player.controlcontainer.d
    public final IControlWidget a(d.a aVar) {
        Object obj = this.f95358a.get();
        o oVar = (o) obj;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.rightMargin = (int) DpUtils.dp2px(oVar.getContext(), 10.0f);
        oVar.setLayoutParams(layoutParams);
        int iDp2px = (int) DpUtils.dp2px(oVar.getContext(), 10.0f);
        oVar.setPadding(iDp2px, iDp2px, iDp2px, iDp2px);
        oVar.setMinWidth((int) DpUtils.dp2px(oVar.getContext(), 48.0f));
        oVar.setGravity(17);
        oVar.setBackground(null);
        oVar.setSingleLine();
        oVar.setTextColor(ContextCompat.getColorStateList(oVar.getContext(), 2131103533));
        oVar.setTextSize(14.0f);
        oVar.setTypeface(Typeface.create("sans-serif-medium", 0));
        oVar.setWidgetFrom(1);
        return (IControlWidget) obj;
    }
}
