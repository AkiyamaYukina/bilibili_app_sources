package com.bilibili.ship.theseus.united.page.intro.module.relate.footer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.intro.module.relate.footer.DetailFooterComponent;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/footer/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f101199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<DetailFooterComponent.FooterType> f101200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<DetailFooterComponent.FooterType> f101201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Float> f101202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<Float> f101203e;

    @Inject
    public c(@NotNull CoroutineScope coroutineScope) {
        this.f101199a = coroutineScope;
        MutableStateFlow<DetailFooterComponent.FooterType> MutableStateFlow = StateFlowKt.MutableStateFlow(DetailFooterComponent.FooterType.None);
        this.f101200b = MutableStateFlow;
        this.f101201c = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Float> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Float.valueOf(0.0f));
        this.f101202d = MutableStateFlow2;
        this.f101203e = FlowKt.asStateFlow(MutableStateFlow2);
    }
}
