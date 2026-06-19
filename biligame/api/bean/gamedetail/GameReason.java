package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameReason.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameReason {
    public static final int $stable = 8;
    private boolean checked;

    @Nullable
    private String name;

    @NotNull
    private String otherReason;
    private int type;

    public GameReason() {
        this(0, null, false, null, 15, null);
    }

    public GameReason(int i7, @Nullable String str, boolean z6, @NotNull String str2) {
        this.type = i7;
        this.name = str;
        this.checked = z6;
        this.otherReason = str2;
    }

    public /* synthetic */ GameReason(int i7, String str, boolean z6, String str2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i7, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? false : z6, (i8 & 8) != 0 ? "" : str2);
    }

    public final boolean getChecked() {
        return this.checked;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getOtherReason() {
        return this.otherReason;
    }

    public final int getType() {
        return this.type;
    }

    public final void setChecked(boolean z6) {
        this.checked = z6;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOtherReason(@NotNull String str) {
        this.otherReason = str;
    }

    public final void setType(int i7) {
        this.type = i7;
    }
}
