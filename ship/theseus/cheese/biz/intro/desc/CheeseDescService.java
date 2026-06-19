package com.bilibili.ship.theseus.cheese.biz.intro.desc;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerService;
import com.bilibili.ship.theseus.cheese.biz.intro.desc.c;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nu0.C8142a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/CheeseDescService.class */
@StabilityInferred(parameters = 0)
public final class CheeseDescService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f89374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageReportService f89375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final rW0.a<IntroRecycleViewService> f89376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CheeseBottomContainerService f89377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f89378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f89379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a f89380g = new a(this);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.desc.CheeseDescService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/CheeseDescService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseDescService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseDescService cheeseDescService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseDescService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ((IntroRecycleViewService) this.this$0.f89376c.get()).a(this.this$0.f89380g);
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                IntroRecycleViewService introRecycleViewService = (IntroRecycleViewService) this.this$0.f89376c.get();
                ((ArrayList) introRecycleViewService.f100041g).remove(this.this$0.f89380g);
                throw th;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/CheeseDescService$a.class */
    public static final class a extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheeseDescService f89381a;

        public a(CheeseDescService cheeseDescService) {
            this.f89381a = cheeseDescService;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) throws NoWhenBranchMatchedException {
            if (i7 == 0) {
                CheeseDescService cheeseDescService = this.f89381a;
                if (cheeseDescService.f89379f) {
                    CheeseBottomContainerService cheeseBottomContainerService = cheeseDescService.f89377d;
                    CheeseBottomContainerService.ConsultButtonStatus consultButtonStatus = cheeseBottomContainerService.f89021E;
                    if ((consultButtonStatus == CheeseBottomContainerService.ConsultButtonStatus.WXBubbleStay || consultButtonStatus == CheeseBottomContainerService.ConsultButtonStatus.WXIcon) && C8142a.b(false)) {
                        cheeseBottomContainerService.e(CheeseBottomContainerService.ConsultButtonStatus.WXBubbleSlide);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
        }
    }

    @Inject
    public CheeseDescService(@NotNull CoroutineScope coroutineScope, @NotNull PageReportService pageReportService, @NotNull rW0.a<IntroRecycleViewService> aVar, @NotNull CheeseBottomContainerService cheeseBottomContainerService, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f89374a = coroutineScope;
        this.f89375b = pageReportService;
        this.f89376c = aVar;
        this.f89377d = cheeseBottomContainerService;
        this.f89378e = introContentSizeRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    @NotNull
    public final RunningUIComponent a(@NotNull i iVar) {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(iVar);
        c cVar = new c(new c.C0611c(MutableStateFlow, this.f89378e.f100021b));
        return new RunningUIComponent(cVar, 0, new CheeseDescService$createDescImageComponent$1(cVar, this, MutableStateFlow, null), 2);
    }

    @NotNull
    public final RunningUIComponent b(@NotNull i iVar) {
        g gVar = new g(new c.C0611c(StateFlowKt.MutableStateFlow(iVar), this.f89378e.f100021b));
        return new RunningUIComponent(gVar, 0, new CheeseDescService$createDescTextComponent$1(gVar, this, null), 2);
    }
}
