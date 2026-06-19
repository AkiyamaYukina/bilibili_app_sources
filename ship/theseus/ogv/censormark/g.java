package com.bilibili.ship.theseus.ogv.censormark;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import com.bapis.bilibili.pgc.gateway.player.v2.RecordInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/censormark/g.class */
@Stable
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RecordInfo f91694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableState f91695b = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public g(@NotNull RecordInfo recordInfo) {
        this.f91694a = recordInfo;
    }
}
