package com.bilibili.ship.theseus.united.page.popupwindow;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.utils.j;
import com.bilibili.ship.theseus.united.page.popupwindow.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/popupwindow/PopupWindowRepository.class */
@StabilityInferred(parameters = 0)
public final class PopupWindowRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C7893a f102412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<b> f102413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SharedFlow<b> f102414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<com.bilibili.playerbizcommonv2.guideBubble.h> f102415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SharedFlow<com.bilibili.playerbizcommonv2.guideBubble.h> f102416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Integer> f102417g;

    @NotNull
    public final SharedFlow<Integer> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Integer> f102418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Integer> f102419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ArrayList<Integer> f102420k;

    @Inject
    public PopupWindowRepository(@NotNull CoroutineScope coroutineScope, @NotNull C7893a c7893a) {
        this.f102411a = coroutineScope;
        this.f102412b = c7893a;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        MutableSharedFlow<b> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f102413c = mutableSharedFlowMutableSharedFlow$default;
        this.f102414d = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<com.bilibili.playerbizcommonv2.guideBubble.h> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f102415e = mutableSharedFlowMutableSharedFlow$default2;
        this.f102416f = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f102417g = mutableSharedFlowMutableSharedFlow$default3;
        this.h = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f102418i = mutableSharedFlowMutableSharedFlow$default4;
        this.f102419j = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        this.f102420k = new ArrayList<>();
    }

    public final void a() {
        BuildersKt.launch$default(this.f102411a, (CoroutineContext) null, (CoroutineStart) null, new PopupWindowRepository$dismissPopupWindow$1(this, 1, null), 3, (Object) null);
    }

    public final void b(@NotNull com.bilibili.playerbizcommonv2.guideBubble.h hVar) {
        BuildersKt.launch$default(this.f102411a, (CoroutineContext) null, (CoroutineStart) null, new PopupWindowRepository$showBiliGuideBubble$1(this, hVar, null), 3, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void c(@NotNull a aVar) throws NoWhenBranchMatchedException {
        Long lB = this.f102412b.b();
        Map<Long, Integer> map = j.f81937a;
        if (lB != null) {
            Map<Long, Integer> map2 = j.f81937a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map2;
            BLog.i("GuideBubbleTimesLimitHelper", "current cid is " + lB + ", bubble show time is " + linkedHashMap.getOrDefault(lB, 0));
            if (((Number) linkedHashMap.getOrDefault(lB, 0)).intValue() < 1) {
                if (aVar instanceof a.b) {
                    d(((a.b) aVar).f102433a);
                } else {
                    if (!(aVar instanceof a.C1103a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b(((a.C1103a) aVar).f102432a);
                }
                map2.put(lB, Integer.valueOf(((Number) linkedHashMap.getOrDefault(lB, 0)).intValue() + 1));
                ga.b.a(((LinkedHashMap) map2).getOrDefault(lB, 0), "record bubble show time succeed, current show time is ", "GuideBubbleTimesLimitHelper");
            }
        }
    }

    public final void d(@NotNull b bVar) {
        BuildersKt.launch$default(this.f102411a, (CoroutineContext) null, (CoroutineStart) null, new PopupWindowRepository$showPopupWindow$1(this, bVar, null), 3, (Object) null);
    }
}
