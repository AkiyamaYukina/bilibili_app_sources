package com.bilibili.biligame.api;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameBookNotifyGameList.class */
@StabilityInferred(parameters = 0)
public final class BiligameBookNotifyGameList implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private List<BiligameBookNotifyGame> bookNotifyGameList;

    public BiligameBookNotifyGameList() {
        this(null, 1, null);
    }

    public BiligameBookNotifyGameList(@Nullable List<BiligameBookNotifyGame> list) {
        this.bookNotifyGameList = list;
    }

    public /* synthetic */ BiligameBookNotifyGameList(List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : list);
    }

    @Nullable
    public final List<BiligameBookNotifyGame> getBookNotifyGameList() {
        return this.bookNotifyGameList;
    }

    public final void setBookNotifyGameList(@Nullable List<BiligameBookNotifyGame> list) {
        this.bookNotifyGameList = list;
    }
}
