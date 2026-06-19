package com.bilibili.biligame.beantri;

import androidx.appcompat.app.i;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z4.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/beantri/TabChangeEvent.class */
@StabilityInferred(parameters = 1)
public final class TabChangeEvent {
    public static final int $stable = 0;

    @NotNull
    private final String associateGameBaseId;
    private final boolean isSameBaseId;
    private final int newGameBaseId;
    private final boolean platformSwitchOnly;
    private final int tabIndex;

    public TabChangeEvent(@NotNull String str, int i7, int i8, boolean z6, boolean z7) {
        this.associateGameBaseId = str;
        this.tabIndex = i7;
        this.newGameBaseId = i8;
        this.isSameBaseId = z6;
        this.platformSwitchOnly = z7;
    }

    public /* synthetic */ TabChangeEvent(String str, int i7, int i8, boolean z6, boolean z7, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i7, i8, (i9 & 8) != 0 ? false : z6, (i9 & 16) != 0 ? false : z7);
    }

    public static /* synthetic */ TabChangeEvent copy$default(TabChangeEvent tabChangeEvent, String str, int i7, int i8, boolean z6, boolean z7, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = tabChangeEvent.associateGameBaseId;
        }
        if ((i9 & 2) != 0) {
            i7 = tabChangeEvent.tabIndex;
        }
        if ((i9 & 4) != 0) {
            i8 = tabChangeEvent.newGameBaseId;
        }
        if ((i9 & 8) != 0) {
            z6 = tabChangeEvent.isSameBaseId;
        }
        if ((i9 & 16) != 0) {
            z7 = tabChangeEvent.platformSwitchOnly;
        }
        return tabChangeEvent.copy(str, i7, i8, z6, z7);
    }

    @NotNull
    public final String component1() {
        return this.associateGameBaseId;
    }

    public final int component2() {
        return this.tabIndex;
    }

    public final int component3() {
        return this.newGameBaseId;
    }

    public final boolean component4() {
        return this.isSameBaseId;
    }

    public final boolean component5() {
        return this.platformSwitchOnly;
    }

    @NotNull
    public final TabChangeEvent copy(@NotNull String str, int i7, int i8, boolean z6, boolean z7) {
        return new TabChangeEvent(str, i7, i8, z6, z7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabChangeEvent)) {
            return false;
        }
        TabChangeEvent tabChangeEvent = (TabChangeEvent) obj;
        return Intrinsics.areEqual(this.associateGameBaseId, tabChangeEvent.associateGameBaseId) && this.tabIndex == tabChangeEvent.tabIndex && this.newGameBaseId == tabChangeEvent.newGameBaseId && this.isSameBaseId == tabChangeEvent.isSameBaseId && this.platformSwitchOnly == tabChangeEvent.platformSwitchOnly;
    }

    @NotNull
    public final String getAssociateGameBaseId() {
        return this.associateGameBaseId;
    }

    public final int getNewGameBaseId() {
        return this.newGameBaseId;
    }

    public final boolean getPlatformSwitchOnly() {
        return this.platformSwitchOnly;
    }

    public final int getTabIndex() {
        return this.tabIndex;
    }

    public int hashCode() {
        return Boolean.hashCode(this.platformSwitchOnly) + z.a(I.a(this.newGameBaseId, I.a(this.tabIndex, this.associateGameBaseId.hashCode() * 31, 31), 31), 31, this.isSameBaseId);
    }

    public final boolean isSameBaseId() {
        return this.isSameBaseId;
    }

    @NotNull
    public String toString() {
        String str = this.associateGameBaseId;
        int i7 = this.tabIndex;
        int i8 = this.newGameBaseId;
        boolean z6 = this.isSameBaseId;
        boolean z7 = this.platformSwitchOnly;
        StringBuilder sbA = e.a(i7, "TabChangeEvent(associateGameBaseId=", str, ", tabIndex=", ", newGameBaseId=");
        d.a(", isSameBaseId=", ", platformSwitchOnly=", i8, z6, sbA);
        return i.a(sbA, z7, ")");
    }
}
