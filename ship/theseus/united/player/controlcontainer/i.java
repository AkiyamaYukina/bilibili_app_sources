package com.bilibili.ship.theseus.united.player.controlcontainer;

import android.graphics.Typeface;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractHistoriesWidget;
import com.bilibili.ship.theseus.united.player.controlcontainer.d;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/i.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class i implements Factory<d> {
    public static d a(final Provider<TheseusInteractHistoriesWidget> provider) {
        return (d) Preconditions.checkNotNullFromProvides(new d(provider) { // from class: com.bilibili.ship.theseus.united.player.controlcontainer.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Provider f104447a;

            {
                this.f104447a = provider;
            }

            @Override // com.bilibili.ship.theseus.united.player.controlcontainer.d
            public final IControlWidget a(d.a aVar) {
                TheseusInteractHistoriesWidget theseusInteractHistoriesWidget = (TheseusInteractHistoriesWidget) this.f104447a.get();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                layoutParams.rightMargin = (int) DpUtils.dp2px(aVar.f104444a, 10.0f);
                theseusInteractHistoriesWidget.setLayoutParams(layoutParams);
                int iDp2px = (int) DpUtils.dp2px(aVar.f104444a, 10.0f);
                theseusInteractHistoriesWidget.setPadding(iDp2px, iDp2px, iDp2px, iDp2px);
                theseusInteractHistoriesWidget.setMinWidth((int) DpUtils.dp2px(aVar.f104444a, 52.0f));
                theseusInteractHistoriesWidget.setGravity(17);
                theseusInteractHistoriesWidget.setBackground(null);
                theseusInteractHistoriesWidget.setVisibility(8);
                theseusInteractHistoriesWidget.setSingleLine();
                theseusInteractHistoriesWidget.setTextColor(AppCompatResources.getColorStateList(aVar.f104444a, 2131103533));
                theseusInteractHistoriesWidget.setTextSize(14.0f);
                theseusInteractHistoriesWidget.setTypeface(Typeface.create("sans-serif-medium", 0));
                return theseusInteractHistoriesWidget;
            }
        });
    }
}
