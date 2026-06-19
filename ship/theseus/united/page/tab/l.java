package com.bilibili.ship.theseus.united.page.tab;

import android.content.res.ColorStateList;
import com.bapis.bilibili.app.viewunite.v1.IntroductionTab;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.united.page.TheseusIntroductionFragment;
import com.bilibili.ship.theseus.united.page.tab.TabPage;
import com.bilibili.ship.theseus.united.page.tab.j;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/l.class */
public final class l implements TabPage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntroductionTab f103200a;

    public l(IntroductionTab introductionTab) {
        this.f103200a = introductionTab;
    }

    @Override // com.bilibili.ship.theseus.united.page.tab.TabPage
    public final Qj0.d a() {
        return new Qj0.d(TheseusIntroductionFragment.class, null);
    }

    @Override // com.bilibili.ship.theseus.united.page.tab.TabPage
    public final TabPage.LocatableTag b() {
        return TabPage.LocatableTag.Introduction;
    }

    @Override // com.bilibili.ship.theseus.united.page.tab.TabPage
    public final RunningUIComponent c(TheseusTabPagerService$_init_$lambda$1$$inlined$map$1 theseusTabPagerService$_init_$lambda$1$$inlined$map$1, ColorStateList colorStateList, boolean z6) {
        j.a aVar = new j.a();
        String title = this.f103200a.getTitle();
        if (!Intrinsics.areEqual(title, aVar.f103195a)) {
            aVar.f103195a = title;
            aVar.notifyPropertyChanged(640);
        }
        aVar.f103197c = colorStateList;
        if (z6) {
            aVar.f103198d = 15.0f;
            aVar.f103199e = true;
        }
        return new RunningUIComponent(new j(aVar), 0, new IntroductionTabPageProvider$provide$1$1$newTabUIComponent$1(theseusTabPagerService$_init_$lambda$1$$inlined$map$1, aVar, null), 2);
    }

    @Override // com.bilibili.ship.theseus.united.page.tab.TabPage
    public final Map<String, String> e() {
        return MapsKt.mapOf(TuplesKt.to("tab_name", this.f103200a.getTitle()));
    }
}
