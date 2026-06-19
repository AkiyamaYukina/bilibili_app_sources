package com.bilibili.ship.theseus.united.widget;

import Cv0.i;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.tabs.TabLayout;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/widget/UnitedTabLayout.class */
@StabilityInferred(parameters = 0)
public final class UnitedTabLayout extends TabLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104913c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f104914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public Function1<? super TabLayout.Tab, Unit> f104915b;

    @JvmOverloads
    public UnitedTabLayout(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public UnitedTabLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public UnitedTabLayout(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f104914a = -1;
        this.f104915b = new i(0);
    }

    public final int getDisableClickPosition() {
        return this.f104914a;
    }

    @NotNull
    public final Function1<TabLayout.Tab, Unit> getDisableClickPositionListener() {
        return this.f104915b;
    }

    public final void selectTab(@Nullable TabLayout.Tab tab) {
        if ((tab != null ? tab.getPosition() : 0) == this.f104914a) {
            this.f104915b.invoke(tab);
        } else {
            super.selectTab(tab);
        }
    }

    public final void setDisableClickPosition(int i7) {
        this.f104914a = i7;
    }

    public final void setDisableClickPositionListener(@NotNull Function1<? super TabLayout.Tab, Unit> function1) {
        this.f104915b = function1;
    }
}
