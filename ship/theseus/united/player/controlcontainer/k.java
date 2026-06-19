package com.bilibili.ship.theseus.united.player.controlcontainer;

import android.graphics.Typeface;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import com.bilibili.ship.theseus.united.player.controlcontainer.d;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/k.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class k implements Factory<d> {
    public static d a(final rW0.b<xv0.a> bVar) {
        return (d) Preconditions.checkNotNullFromProvides(new d(bVar) { // from class: com.bilibili.ship.theseus.united.player.controlcontainer.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final rW0.b f104446a;

            {
                this.f104446a = bVar;
            }

            @Override // com.bilibili.ship.theseus.united.player.controlcontainer.d
            public final IControlWidget a(d.a aVar) {
                xv0.a aVar2 = new xv0.a(aVar.f104444a, 0);
                this.f104446a.injectMembers(aVar2);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                layoutParams.rightMargin = (int) DpUtils.dp2px(aVar.f104444a, 10.0f);
                aVar2.setLayoutParams(layoutParams);
                int iDp2px = (int) DpUtils.dp2px(aVar.f104444a, 10.0f);
                aVar2.setPadding(iDp2px, iDp2px, iDp2px, iDp2px);
                aVar2.setMinWidth((int) DpUtils.dp2px(aVar.f104444a, 48.0f));
                aVar2.setGravity(17);
                aVar2.setBackground(null);
                aVar2.setSingleLine();
                aVar2.setTextColor(AppCompatResources.getColorStateList(aVar.f104444a, 2131103533));
                aVar2.setTextSize(14.0f);
                aVar2.setTypeface(Typeface.create("sans-serif-medium", 0));
                aVar2.setWidgetFrom(1);
                return aVar2;
            }
        });
    }
}
