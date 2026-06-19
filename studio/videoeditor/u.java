package com.bilibili.studio.videoeditor;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/u.class */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<t> f110192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<t> f110193b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/u$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f110194a;

        static {
            int[] iArr = new int[LoadStatus.values().length];
            try {
                iArr[LoadStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[LoadStatus.NotLoad.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[LoadStatus.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[LoadStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f110194a = iArr;
        }
    }

    public u() {
        MutableStateFlow<t> MutableStateFlow = StateFlowKt.MutableStateFlow(new t(0));
        this.f110192a = MutableStateFlow;
        this.f110193b = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a(@NotNull s sVar, @NotNull LoadStatus loadStatus) throws NoWhenBranchMatchedException {
        t tVar;
        StateFlow<t> stateFlow = this.f110193b;
        t tVar2 = (t) stateFlow.getValue();
        t tVar3 = (t) stateFlow.getValue();
        LoadStatus loadStatus2 = tVar3.f109901a.contains(sVar) ? LoadStatus.Loading : tVar3.f109902b.contains(sVar) ? LoadStatus.SUCCESS : tVar3.f109903c.contains(sVar) ? LoadStatus.FAILED : LoadStatus.NotLoad;
        int[] iArr = a.f110194a;
        int i7 = iArr[loadStatus.ordinal()];
        if (i7 != 1) {
            tVar = tVar2;
            if (i7 != 2) {
                if (i7 == 3) {
                    tVar = tVar2;
                    if (loadStatus2 != LoadStatus.SUCCESS) {
                        tVar = loadStatus2 == LoadStatus.Loading ? tVar2 : new t(SetsKt.plus(tVar2.f109901a, sVar), tVar2.f109902b, SetsKt.minus(tVar2.f109903c, sVar));
                    }
                } else {
                    if (i7 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tVar = tVar2;
                    if (loadStatus2 != LoadStatus.SUCCESS) {
                        tVar = loadStatus2 == LoadStatus.FAILED ? tVar2 : new t(SetsKt.minus(tVar2.f109901a, sVar), tVar2.f109902b, SetsKt.plus(tVar2.f109903c, sVar));
                    }
                }
            }
        } else {
            tVar = iArr[loadStatus2.ordinal()] == 1 ? tVar2 : new t(SetsKt.minus(tVar2.f109901a, sVar), SetsKt.plus(tVar2.f109902b, sVar), SetsKt.minus(tVar2.f109903c, sVar));
        }
        this.f110192a.setValue(tVar);
    }
}
