package com.bilibili.ship.theseus.united.page.activitywindow;

import J81.Q;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/n.class */
public final class n implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n f98879a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy f98880b = LazyKt.lazy(new Q(8));

    @Override // com.bilibili.ship.theseus.united.page.activitywindow.s
    public final int a(@NotNull WindowInsetsCompat windowInsetsCompat) {
        if (!windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime())) {
            return 0;
        }
        int iIntValue = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom;
        Integer numValueOf = Integer.valueOf(iIntValue - windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom);
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        }
        return iIntValue;
    }

    @Override // com.bilibili.ship.theseus.united.page.activitywindow.s
    @NotNull
    public final String b(@NotNull WindowInsetsCompat windowInsetsCompat) {
        return "statusAndCutout=" + windowInsetsCompat.getInsets(WindowInsetsCompat.Type.statusBars() | WindowInsetsCompat.Type.displayCutout()) + ", navigationBars=" + windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars()) + ", tappableElement=" + windowInsetsCompat.getInsets(WindowInsetsCompat.Type.tappableElement()) + ", mandatorySystemGestures=" + windowInsetsCompat.getInsets(WindowInsetsCompat.Type.mandatorySystemGestures()) + ", ime=" + windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()) + ", imeVisible=" + windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime());
    }

    @Override // com.bilibili.ship.theseus.united.page.activitywindow.s
    @NotNull
    public final Insets c(@NotNull WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.statusBars() | WindowInsetsCompat.Type.displayCutout());
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars());
        Insets insets3 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.tappableElement());
        Insets insetsOf = Insets.of(Math.max(insets2.left, insets3.left), Math.max(insets2.top, insets3.top), Math.max(insets2.right, insets3.right), Math.max(insets2.bottom, insets3.bottom));
        return Insets.of(Math.max(insets.left, insetsOf.left), Math.max(insets.top, insetsOf.top), Math.max(insets.right, insetsOf.right), Math.max(insets.bottom, insetsOf.bottom));
    }

    @Override // com.bilibili.ship.theseus.united.page.activitywindow.s
    @NotNull
    public final String getName() {
        return (String) f98880b.getValue();
    }
}
