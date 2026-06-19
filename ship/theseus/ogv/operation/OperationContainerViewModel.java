package com.bilibili.ship.theseus.ogv.operation;

import aC.K;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.intro.S;
import java.util.concurrent.CancellationException;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/OperationContainerViewModel.class */
@StabilityInferred(parameters = 0)
public final class OperationContainerViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final S f94079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LD.g f94080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableState f94081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableState f94082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableState f94083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Job f94084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableState f94085g;

    @NotNull
    public final State h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableState f94086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableState f94087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public CoroutineScope f94088k;

    public OperationContainerViewModel(@NotNull S s7, @NotNull LD.g gVar) {
        this.f94079a = s7;
        this.f94080b = gVar;
        Boolean bool = Boolean.FALSE;
        this.f94081c = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f94082d = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f94083e = SnapshotStateKt.mutableStateOf$default(Duration.box-impl(Duration.Companion.getZERO-UwyO8pc()), null, 2, null);
        this.f94085g = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.h = SnapshotStateKt.derivedStateOf(new K(this, 4));
        this.f94086i = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f94087j = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f94088k = CoroutineScopeKt.MainScope();
    }

    public final void a() {
        this.f94081c.setValue(Boolean.TRUE);
        CoroutineScopeKt.cancel$default(this.f94088k, (CancellationException) null, 1, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(@org.jetbrains.annotations.Nullable com.bilibili.ship.theseus.ogv.operation.OperationActivityVo r11) {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.operation.OperationContainerViewModel.b(com.bilibili.ship.theseus.ogv.operation.OperationActivityVo):void");
    }
}
