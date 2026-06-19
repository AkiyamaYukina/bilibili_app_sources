package com.bilibili.ship.theseus.ogv.operation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.intro.S;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/layout/g.class */
@StabilityInferred(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final S f94138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LD.g f94139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableState f94140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Map<String, String> f94141d;

    public g() {
        throw null;
    }

    public g(S s7, LD.g gVar) {
        this.f94138a = s7;
        this.f94139b = gVar;
        this.f94140c = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }
}
