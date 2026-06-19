package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import android.content.Context;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.lazy.C3465i;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.bapis.bilibili.account.interfaces.v1.k;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.comment.TheseusCommentService;
import com.bilibili.ship.theseus.united.page.danmaku.DanmakuRefreshTriggerRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.b;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.dialog.BiliCommonDialog;
import tv.danmaku.bili.widget.dialog.CustomButtonInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsService.class */
@StabilityInferred(parameters = 0)
public final class InteractiveSettingsService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f99783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f99784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final d f99785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final DanmakuRefreshTriggerRepository f99786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TheseusCommentService f99787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f99788g;

    @NotNull
    public final PageReportService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Context f99789i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final FragmentManager f99790j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final C7893a f99791k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f99792l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a> f99793m = StateFlowKt.MutableStateFlow(new a(CollectionsKt.emptyList()));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f99794n = LazyKt.lazy(new C3465i(this, 4));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Job f99795o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f99796p;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InteractiveSettingsService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InteractiveSettingsService f99797a;

            public a(InteractiveSettingsService interactiveSettingsService) {
                this.f99797a = interactiveSettingsService;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                String string;
                b.a aVar = (b.a) obj;
                final InteractiveSettingsService interactiveSettingsService = this.f99797a;
                interactiveSettingsService.getClass();
                if (!(aVar instanceof b.a.C0990a)) {
                    throw new NoWhenBranchMatchedException();
                }
                b.a.C0990a c0990a = (b.a.C0990a) aVar;
                final InteractionItem interactionItem = c0990a.f99804a;
                int iH = interactionItem.h();
                if (iH == InteractionItemType.UploaderProtected.getType()) {
                    BLRouter.routeTo(new RouteRequest.Builder(i5.d.a(interactiveSettingsService.f99788g.mid(), interactionItem.d(), "&uid=")).build(), interactiveSettingsService.f99789i);
                } else {
                    int type = InteractionItemType.DanmakuInterceptWords.getType();
                    C7893a c7893a = interactiveSettingsService.f99791k;
                    if (iH == type) {
                        String strD = interactionItem.d();
                        C7893a.C1318a.C1319a c1319a = c7893a.c().f123395a;
                        StringBuilder sbA = C0.d.a(strD, "&aid=");
                        sbA.append(c1319a.f123397a);
                        BLRouter.routeTo(new RouteRequest.Builder(sbA.toString()).build(), interactiveSettingsService.f99789i);
                    } else if (iH == InteractionItemType.CommentInterceptWords.getType()) {
                        String strD2 = interactionItem.d();
                        C7893a.C1318a.C1319a c1319a2 = c7893a.c().f123395a;
                        StringBuilder sbA2 = C0.d.a(strD2, "&aid=");
                        sbA2.append(c1319a2.f123397a);
                        BLRouter.routeTo(new RouteRequest.Builder(sbA2.toString()).build(), interactiveSettingsService.f99789i);
                    } else {
                        InteractionItemType interactionItemType = InteractionItemType.DanmakuSwitch;
                        if (iH == interactionItemType.getType() || iH == InteractionItemType.CommentSwitch.getType() || iH == InteractionItemType.NiceCommentSwitch.getType() || iH == InteractionItemType.ChargeCommentSwitch.getType()) {
                            String string2 = interactiveSettingsService.f99789i.getString(2131841445);
                            String string3 = interactiveSettingsService.f99789i.getString(2131851592);
                            boolean z6 = interactionItem.f() == InteractionItemStatus.On.getStatus();
                            BiliCommonDialog.Builder builder = new BiliCommonDialog.Builder(interactiveSettingsService.f99789i);
                            int iH2 = interactionItem.h();
                            d dVar = interactiveSettingsService.f99785d;
                            dVar.getClass();
                            BiliCommonDialog.Builder buttonStyle = builder.setTitle(iH2 == interactionItemType.getType() ? z6 ? dVar.f99807b.getString(2131845917) : dVar.f99807b.getString(2131847205) : iH2 == InteractionItemType.CommentSwitch.getType() ? z6 ? dVar.f99807b.getString(2131845766) : dVar.f99807b.getString(2131847471) : iH2 == InteractionItemType.NiceCommentSwitch.getType() ? z6 ? dVar.f99807b.getString(2131845601) : dVar.f99807b.getString(2131847103) : iH2 == InteractionItemType.ChargeCommentSwitch.getType() ? z6 ? dVar.f99807b.getString(2131846836) : dVar.f99807b.getString(2131845885) : "").setButtonStyle(0);
                            int iH3 = interactionItem.h();
                            if (iH3 == interactionItemType.getType()) {
                                string = z6 ? dVar.f99807b.getString(2131847332) : dVar.f99807b.getString(2131845878);
                            } else if (iH3 == InteractionItemType.CommentSwitch.getType()) {
                                string = z6 ? dVar.f99807b.getString(2131847144) : dVar.f99807b.getString(2131846022);
                            } else if (iH3 == InteractionItemType.NiceCommentSwitch.getType()) {
                                string = z6 ? dVar.f99807b.getString(2131845506) : dVar.f99807b.getString(2131845918);
                            } else {
                                string = "";
                                if (iH3 == InteractionItemType.ChargeCommentSwitch.getType()) {
                                    string = z6 ? dVar.f99807b.getString(2131847233) : dVar.f99807b.getString(2131845660);
                                }
                            }
                            final boolean z7 = z6;
                            BiliCommonDialog.Builder.setNegativeButton$default(BiliCommonDialog.Builder.setPositiveButton$default(buttonStyle.setContentText(string), string2, new BiliCommonDialog.OnDialogTextClickListener(interactiveSettingsService, z7, interactionItem) { // from class: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.f

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final InteractiveSettingsService f99822a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final boolean f99823b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final InteractionItem f99824c;

                                {
                                    this.f99822a = interactiveSettingsService;
                                    this.f99823b = z7;
                                    this.f99824c = interactionItem;
                                }

                                public final void onDialogTextClicked(View view, BiliCommonDialog biliCommonDialog) {
                                    int iH4 = this.f99824c.h();
                                    InteractiveSettingsService interactiveSettingsService2 = this.f99822a;
                                    interactiveSettingsService2.getClass();
                                    BuildersKt.launch$default(interactiveSettingsService2.f99782a, (CoroutineContext) null, (CoroutineStart) null, new InteractiveSettingsService$onItemCheckChanged$1(interactiveSettingsService2, iH4, this.f99823b, null), 3, (Object) null);
                                }
                            }, true, (CustomButtonInfo) null, 8, (Object) null), string3, (BiliCommonDialog.OnDialogTextClickListener) null, true, (CustomButtonInfo) null, 10, (Object) null).build().show(interactiveSettingsService.f99790j, "close-blocks-sure-confirm");
                        }
                    }
                }
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                mapCreateMapBuilder.put("button_type", String.valueOf(c0990a.f99804a.h()));
                PageReportService.g(interactiveSettingsService.h, "united.player-video-detail.interact-setting.all.click", MapsKt.build(mapCreateMapBuilder), 4);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InteractiveSettingsService interactiveSettingsService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interactiveSettingsService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<b.a> sharedFlow = ((b) this.this$0.f99794n.getValue()).f99802d;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InteractiveSettingsService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends InteractionSection>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final InteractiveSettingsService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InteractiveSettingsService interactiveSettingsService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = interactiveSettingsService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(List<InteractionSection> list, Continuation<? super Unit> continuation) {
                return create(list, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List list = (List) this.L$0;
                InteractiveSettingsService interactiveSettingsService = this.this$0;
                ((a) interactiveSettingsService.f99793m.getValue()).getClass();
                interactiveSettingsService.f99793m.setValue(new a(list));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InteractiveSettingsService interactiveSettingsService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = interactiveSettingsService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                InteractiveSettingsService interactiveSettingsService = this.this$0;
                StateFlow<List<InteractionSection>> stateFlow = interactiveSettingsService.f99785d.f99809d;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interactiveSettingsService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InteractiveSettingsService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(InteractiveSettingsService interactiveSettingsService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = interactiveSettingsService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
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
                Job job = this.this$0.f99795o;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                this.this$0.f99795o = null;
                throw th;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<InteractionSection> f99798a;

        public a(@NotNull List<InteractionSection> list) {
            this.f99798a = list;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f99798a, ((a) obj).f99798a);
        }

        public final int hashCode() {
            return this.f99798a.hashCode();
        }

        @NotNull
        public final String toString() {
            return k.a("ComponentState(sectionList=", ")", this.f99798a);
        }
    }

    @Inject
    public InteractiveSettingsService(@NotNull CoroutineScope coroutineScope, @NotNull ComponentActivity componentActivity, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull d dVar, @NotNull DanmakuRefreshTriggerRepository danmakuRefreshTriggerRepository, @NotNull TheseusCommentService theseusCommentService, @NotNull BiliAccounts biliAccounts, @NotNull PageReportService pageReportService, @NotNull Context context, @NotNull FragmentManager fragmentManager, @NotNull C7893a c7893a, @NotNull BackActionRepository backActionRepository) {
        this.f99782a = coroutineScope;
        this.f99783b = componentActivity;
        this.f99784c = gVar;
        this.f99785d = dVar;
        this.f99786e = danmakuRefreshTriggerRepository;
        this.f99787f = theseusCommentService;
        this.f99788g = biliAccounts;
        this.h = pageReportService;
        this.f99789i = context;
        this.f99790j = fragmentManager;
        this.f99791k = c7893a;
        this.f99792l = backActionRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        this.f99796p = StateFlowKt.MutableStateFlow(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService r5, boolean r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService$onDanmakuRefresh$1
            if (r0 == 0) goto L2e
            r0 = r7
            com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService$onDanmakuRefresh$1 r0 = (com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService$onDanmakuRefresh$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2e
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L38
        L2e:
            com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService$onDanmakuRefresh$1 r0 = new com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService$onDanmakuRefresh$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L38:
            r0 = r7
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L6c
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L62
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r10
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.unbox-impl()
            r7 = r0
            goto L91
        L62:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6c:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r5
            com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.d r0 = r0.f99785d
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.b(r1, r2)
            r10 = r0
            r0 = r10
            r7 = r0
            r0 = r10
            r1 = r9
            if (r0 != r1) goto L91
            r0 = r9
            r5 = r0
            goto Lba
        L91:
            r0 = r7
            boolean r0 = kotlin.Result.isSuccess-impl(r0)
            if (r0 == 0) goto Laa
            r0 = r7
            kotlin.Unit r0 = (kotlin.Unit) r0
            r9 = r0
            r0 = r5
            com.bilibili.ship.theseus.united.page.danmaku.DanmakuRefreshTriggerRepository r0 = r0.f99786e
            r0.a()
            r0 = 2131841348(0x7f115144, float:1.9316001E38)
            com.bilibili.ship.theseus.united.utils.q.a(r0)
        Laa:
            r0 = r7
            java.lang.Throwable r0 = kotlin.Result.exceptionOrNull-impl(r0)
            if (r0 == 0) goto Lb6
            r0 = 2131846990(0x7f11674e, float:1.9327445E38)
            com.bilibili.ship.theseus.united.utils.q.a(r0)
        Lb6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r5 = r0
        Lba:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService.a(com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b() {
        BuildersKt.launch$default(this.f99782a, (CoroutineContext) null, (CoroutineStart) null, new InteractiveSettingsService$showPanel$1(this, null), 3, (Object) null);
    }
}
