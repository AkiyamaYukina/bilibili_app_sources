package com.bilibili.playerbizcommonv2.widget.setting;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/F.class */
@Stable
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final State<String> f83087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final State<String> f83088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<E> f83089c;

    public F(SnapshotStateList snapshotStateList) {
        MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.f83087a = mutableStateMutableStateOf$default;
        this.f83088b = mutableStateMutableStateOf$default2;
        this.f83089c = snapshotStateList;
    }
}
