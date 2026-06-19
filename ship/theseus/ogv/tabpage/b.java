package com.bilibili.ship.theseus.ogv.tabpage;

import Ig.f;
import Qj0.d;
import android.content.res.ColorStateList;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$$ExternalSyntheticOutline0;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.ogv.chathall.ChatHallFragment;
import com.bilibili.ship.theseus.ogv.tabpage.ActivityTab;
import com.bilibili.ship.theseus.ogv.tabpage.ThirdTabUIComponent;
import com.bilibili.ship.theseus.united.page.WebComponentContainerFragment;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.tab.TabPage;
import com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$_init_$lambda$1$$inlined$map$1;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/tabpage/b.class */
public final class b implements TabPage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f94571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityTab f94572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PageReportService f94573c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/tabpage/b$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f94574a;

        static {
            int[] iArr = new int[ActivityTab.Type.values().length];
            try {
                iArr[ActivityTab.Type.CHAT_HALL.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ActivityTab.Type.WEB.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f94574a = iArr;
        }
    }

    public b(ActivityTab activityTab, PageReportService pageReportService) {
        this.f94572b = activityTab;
        this.f94573c = pageReportService;
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        String strF = activityTab.f();
        mapCreateMapBuilder.put("tab_name", strF == null ? "" : strF);
        Map<String, String> mapE = activityTab.e();
        if (mapE != null) {
            mapCreateMapBuilder.putAll(mapE);
        }
        this.f94571a = MapsKt.build(mapCreateMapBuilder);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.ship.theseus.united.page.tab.TabPage
    public final d a() throws NoWhenBranchMatchedException {
        d dVar;
        ActivityTab activityTab = this.f94572b;
        int i7 = a.f94574a[activityTab.f94553e.ordinal()];
        if (i7 == 1) {
            Bundle bundle = new Bundle();
            TabActivityExtensionField tabActivityExtensionFieldA = activityTab.a();
            bundle.putLong("roomId", tabActivityExtensionFieldA != null ? tabActivityExtensionFieldA.a() : 0L);
            dVar = new d(ChatHallFragment.class, bundle);
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String str = activityTab.f94552d;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            d dVarA = Qj0.c.a(str2);
            dVar = dVarA != null ? dVarA : new d(WebComponentContainerFragment.class, CredentialProviderBeginSignInController$$ExternalSyntheticOutline0.m("link", str2));
        }
        return dVar;
    }

    @Override // com.bilibili.ship.theseus.united.page.tab.TabPage
    public final TabPage.LocatableTag b() {
        return TabPage.LocatableTag.Third;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.ship.theseus.united.page.tab.TabPage
    public final RunningUIComponent c(TheseusTabPagerService$_init_$lambda$1$$inlined$map$1 theseusTabPagerService$_init_$lambda$1$$inlined$map$1, ColorStateList colorStateList, boolean z6) throws NoWhenBranchMatchedException {
        String str;
        ThirdTabUIComponent.a aVar = new ThirdTabUIComponent.a(new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new f(2, this.f94573c, this)));
        ActivityTab activityTab = this.f94572b;
        int i7 = ThirdTabUIComponent.a.C0747a.f94569a[activityTab.f94553e.ordinal()];
        if (i7 == 1) {
            String strF = activityTab.f();
            String str2 = strF;
            if (strF == null) {
                str2 = "";
            }
            if (!Intrinsics.areEqual(str2, aVar.f94565d)) {
                aVar.f94565d = str2;
                aVar.notifyPropertyChanged(640);
            }
            String strC = activityTab.c();
            String str3 = strC;
            if (strC == null) {
                str3 = "";
            }
            String strD = activityTab.d();
            str = strD != null ? strD : "";
            if (!Intrinsics.areEqual(str3, aVar.f94566e)) {
                aVar.f94566e = str3;
                aVar.notifyPropertyChanged(672);
            }
            if (!Intrinsics.areEqual(str, aVar.f94567f)) {
                aVar.f94567f = str;
                aVar.notifyPropertyChanged(551);
            }
            aVar.f94564c = StringsKt.isBlank(str) ? ThirdTabUIComponent.ResType.TEXT : ThirdTabUIComponent.ResType.PNG;
            aVar.f94563b = StringsKt.isBlank(str3) ? ThirdTabUIComponent.ResType.TEXT : ThirdTabUIComponent.ResType.PNG;
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String strF2 = activityTab.f();
            str = strF2 != null ? strF2 : "";
            if (!Intrinsics.areEqual(str, aVar.f94565d)) {
                aVar.f94565d = str;
                aVar.notifyPropertyChanged(640);
            }
        }
        return new RunningUIComponent(new ThirdTabUIComponent(aVar, colorStateList), 0, new ActivityTabProvider$activityTabMapper$1$1$newTabUIComponent$1(theseusTabPagerService$_init_$lambda$1$$inlined$map$1, aVar, null), 2);
    }

    @Override // com.bilibili.ship.theseus.united.page.tab.TabPage
    public final Map<String, String> e() {
        return this.f94571a;
    }
}
