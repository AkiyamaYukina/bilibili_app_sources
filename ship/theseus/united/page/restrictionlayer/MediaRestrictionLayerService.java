package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import javax.inject.Inject;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/MediaRestrictionLayerService.class */
@StabilityInferred(parameters = 0)
public final class MediaRestrictionLayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f102599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j f102600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f102601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f102602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageReportService f102603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Flow<RestrictionLayerVo> f102604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final B f102605g;

    @NotNull
    public final ToolbarRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f102606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f102607j;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.MediaRestrictionLayerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/MediaRestrictionLayerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final MediaRestrictionLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.MediaRestrictionLayerService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/MediaRestrictionLayerService$1$1.class */
        public static final class C11071 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final MediaRestrictionLayerService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.MediaRestrictionLayerService$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/MediaRestrictionLayerService$1$1$a.class */
            public static final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final int[] f102608a;

                static {
                    int[] iArr = new int[RestrictionLayerVo.Style.values().length];
                    try {
                        iArr[RestrictionLayerVo.Style.UNIVERSAL_INTERCEPT.ordinal()] = 1;
                    } catch (NoSuchFieldError e7) {
                    }
                    f102608a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11071(MediaRestrictionLayerService mediaRestrictionLayerService, Continuation<? super C11071> continuation) {
                super(2, continuation);
                this.this$0 = mediaRestrictionLayerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11071 c11071 = new C11071(this.this$0, continuation);
                c11071.L$0 = obj;
                return c11071;
            }

            public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Unit> continuation) {
                return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00e5  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x015e  */
            /* JADX WARN: Type inference failed for: r0v69, types: [com.bilibili.ship.theseus.united.page.restrictionlayer.MediaRestrictionLayerService$showUniversalIntercept$$inlined$map$1] */
            /* JADX WARN: Type inference failed for: r9v1, types: [com.bilibili.ship.theseus.united.page.restrictionlayer.p] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r16) {
                /*
                    Method dump skipped, instruction units count: 744
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.restrictionlayer.MediaRestrictionLayerService.AnonymousClass1.C11071.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MediaRestrictionLayerService mediaRestrictionLayerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = mediaRestrictionLayerService;
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
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<PlayerAvailability> flowD = this.this$0.f102600b.d();
                C11071 c11071 = new C11071(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowD, c11071, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Inject
    public MediaRestrictionLayerService(@NotNull CoroutineScope coroutineScope, @NotNull FragmentActivity fragmentActivity, @NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull PageReportService pageReportService, @NotNull Flow<RestrictionLayerVo> flow, @NotNull B b7, @NotNull ToolbarRepository toolbarRepository, @NotNull BackActionRepository backActionRepository, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar) {
        this.f102599a = fragmentActivity;
        this.f102600b = jVar;
        this.f102601c = gVar;
        this.f102602d = theseusFloatLayerService;
        this.f102603e = pageReportService;
        this.f102604f = flow;
        this.f102605g = b7;
        this.h = toolbarRepository;
        this.f102606i = backActionRepository;
        this.f102607j = cVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
