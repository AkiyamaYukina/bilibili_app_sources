package com.bilibili.ship.theseus.united.page.danmaku;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.tab.TabControl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/m.class */
@StabilityInferred(parameters = 1)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TabControl f99536a;

    public m(@NotNull TabControl tabControl) {
        this.f99536a = tabControl;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.areEqual(this.f99536a, ((m) obj).f99536a);
    }

    public final int hashCode() {
        return this.f99536a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "DanmakuEntrance(danmakuEntrance=" + this.f99536a + ")";
    }
}
