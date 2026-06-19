package com.bilibili.ship.theseus.united.player.controlcontainer;

import android.widget.LinearLayout;
import com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualitySwitchWidget;
import com.bilibili.ship.theseus.united.player.controlcontainer.d;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/j.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class j implements Factory<d> {
    public static d a(final rW0.b<TheseusPlayerQualitySwitchWidget> bVar) {
        return (d) Preconditions.checkNotNullFromProvides(new d(bVar) { // from class: com.bilibili.ship.theseus.united.player.controlcontainer.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final rW0.b f104448a;

            {
                this.f104448a = bVar;
            }

            @Override // com.bilibili.ship.theseus.united.player.controlcontainer.d
            public final IControlWidget a(d.a aVar) {
                TheseusPlayerQualitySwitchWidget theseusPlayerQualitySwitchWidget = new TheseusPlayerQualitySwitchWidget(aVar.f104444a, 0);
                this.f104448a.injectMembers(theseusPlayerQualitySwitchWidget);
                theseusPlayerQualitySwitchWidget.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
                theseusPlayerQualitySwitchWidget.setWidgetFrom(1);
                theseusPlayerQualitySwitchWidget.setClipChildren(false);
                theseusPlayerQualitySwitchWidget.setClipToPadding(false);
                return theseusPlayerQualitySwitchWidget;
            }
        });
    }
}
