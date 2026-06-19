package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/f.class */
public final /* synthetic */ class C6292f implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f100467a;

    @Override // android.widget.ViewSwitcher.ViewFactory
    public final View makeView() {
        Context context = this.f100467a;
        TextView textView = new TextView(context);
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setTextColor(ContextCompat.getColor(context, R$color.Ga5));
        return textView;
    }
}
