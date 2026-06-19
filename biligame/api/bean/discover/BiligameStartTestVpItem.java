package com.bilibili.biligame.api.bean.discover;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/discover/BiligameStartTestVpItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameStartTestVpItem {
    public static final int $stable = 8;

    @Nullable
    private List<? extends BiligameBetaGame> betaGameList;

    public BiligameStartTestVpItem() {
        this(null, 1, null);
    }

    public BiligameStartTestVpItem(@Nullable List<? extends BiligameBetaGame> list) {
        this.betaGameList = list;
    }

    public /* synthetic */ BiligameStartTestVpItem(List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : list);
    }

    @Nullable
    public final List<BiligameBetaGame> getBetaGameList() {
        return this.betaGameList;
    }

    public final void setBetaGameList(@Nullable List<? extends BiligameBetaGame> list) {
        this.betaGameList = list;
    }
}
