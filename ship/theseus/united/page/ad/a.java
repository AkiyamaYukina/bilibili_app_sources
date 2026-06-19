package com.bilibili.ship.theseus.united.page.ad;

import android.view.View;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.gripper.api.ad.biz.videodetail.AbsAdPanel;
import com.bilibili.gripper.api.ad.biz.videodetail.IPanelData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/a.class */
public final class a<T extends IPanelData> implements UIComponent<UIComponent.b<View>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final AbsAdPanel<T> f98952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final T f98953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public AdPanelUIType f98954c = AdPanelUIType.Normal;

    public a(@Nullable AbsAdPanel<T> absAdPanel, @Nullable T t7) {
        this.f98952a = absAdPanel;
        this.f98953b = t7;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        AbsAdPanel<T> absAdPanel = this.f98952a;
        if (absAdPanel != null) {
            absAdPanel.onShow(this.f98953b);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.app.gemini.ui.UIComponent.ViewEntry createViewEntry(android.content.Context r5, android.view.ViewGroup r6) {
        /*
            r4 = this;
            r0 = r4
            com.bilibili.gripper.api.ad.biz.videodetail.AbsAdPanel<T extends com.bilibili.gripper.api.ad.biz.videodetail.IPanelData> r0 = r0.f98952a
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L15
            r0 = r7
            r1 = r6
            android.view.View r0 = r0.onCreateView(r1)
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L1e
        L15:
            android.view.View r0 = new android.view.View
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
        L1e:
            com.bilibili.app.gemini.ui.UIComponent$b r0 = new com.bilibili.app.gemini.ui.UIComponent$b
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.ad.a.createViewEntry(android.content.Context, android.view.ViewGroup):com.bilibili.app.gemini.ui.UIComponent$ViewEntry");
    }
}
