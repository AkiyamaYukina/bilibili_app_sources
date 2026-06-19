package com.bilibili.playerbizcommonv2.widget.setting;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/a.class */
@Stable
public final class C5829a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final State<String> f83182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final State<String> f83183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final State<Integer> f83184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<C5830b> f83185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final State<String> f83186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f83187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f83188g;

    public /* synthetic */ C5829a(State state, State state2, State state3, List list, State state4, com.bilibili.bililive.room.component.compat.h hVar, int i7) {
        this((State<String>) ((i7 & 1) != 0 ? SnapshotStateKt.mutableStateOf$default("", null, 2, null) : state), (State<String>) ((i7 & 2) != 0 ? SnapshotStateKt.mutableStateOf$default("", null, 2, null) : state2), (State<Integer>) state3, (List<C5830b>) list, (State<String>) ((i7 & 16) != 0 ? SnapshotStateKt.mutableStateOf$default(null, null, 2, null) : state4), (Function0<Unit>) ((i7 & 32) != 0 ? null : hVar), (String) null);
    }

    public C5829a(@NotNull State<String> state, @NotNull State<String> state2, @NotNull State<Integer> state3, @NotNull List<C5830b> list, @NotNull State<String> state4, @Nullable Function0<Unit> function0, @Nullable String str) {
        this.f83182a = state;
        this.f83183b = state2;
        this.f83184c = state3;
        this.f83185d = list;
        this.f83186e = state4;
        this.f83187f = function0;
        this.f83188g = str;
    }
}
