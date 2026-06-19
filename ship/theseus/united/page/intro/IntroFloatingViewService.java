package com.bilibili.ship.theseus.united.page.intro;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroFloatingViewService.class */
@StabilityInferred(parameters = 0)
public final class IntroFloatingViewService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f100033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<UIComponent<?>> f100034b = StateFlowKt.MutableStateFlow((Object) null);

    @Inject
    public IntroFloatingViewService(@NotNull Context context) {
        this.f100033a = context;
    }

    @Nullable
    public final Object a(@NotNull ViewGroup viewGroup, @NotNull Continuation<? super Unit> continuation) {
        Object objCollectLatest = FlowKt.collectLatest(this.f100034b, new IntroFloatingViewService$bindContainer$2(viewGroup, this, null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }
}
