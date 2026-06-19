package com.bilibili.ship.theseus.ugc.toolbar.actionview.listen;

import KQ0.e;
import Vu0.J;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.alibaba.fastjson.JSON;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ship.theseus.united.page.toolbar.C6418b;
import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import com.bilibili.ship.theseus.united.utils.h;
import com.bilibili.ship.theseus.united.utils.q;
import com.mall.data.page.collect.bean.CollectGoodBean;
import com.mall.ui.page.collect.MallCollectFragment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
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
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import pf.g;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toolbar/actionview/listen/ToolbarListenRepository.class */
@StabilityInferred(parameters = 0)
public final class ToolbarListenRepository extends yv0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ToolbarRepository f98531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final a f98532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f98533g;

    @NotNull
    public final SharedFlow<Unit> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final HashSet<C6418b> f98534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f98535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f98536k;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toolbar.actionview.listen.ToolbarListenRepository$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toolbar/actionview/listen/ToolbarListenRepository$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ToolbarListenRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toolbar.actionview.listen.ToolbarListenRepository$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toolbar/actionview/listen/ToolbarListenRepository$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final ToolbarListenRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ToolbarListenRepository toolbarListenRepository, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = toolbarListenRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f98532f.setVisibility(!this.Z$0 ? 0 : 8);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ToolbarListenRepository toolbarListenRepository, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = toolbarListenRepository;
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
                ToolbarListenRepository toolbarListenRepository = this.this$0;
                StateFlow<Boolean> stateFlow = toolbarListenRepository.f129911c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(toolbarListenRepository, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toolbar.actionview.listen.ToolbarListenRepository$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toolbar/actionview/listen/ToolbarListenRepository$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ToolbarListenRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toolbar.actionview.listen.ToolbarListenRepository$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toolbar/actionview/listen/ToolbarListenRepository$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final ToolbarListenRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ToolbarListenRepository toolbarListenRepository, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = toolbarListenRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = this.Z$0 ? R$color.Ga7_u : R$color.Wh0_u;
                a aVar = this.this$0.f98532f;
                J j7 = aVar.f98546a;
                J j8 = j7;
                if (j7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    j8 = null;
                }
                h.a(ContextCompat.getColor(aVar.getContext(), i7), j8.f25844b.getDrawable());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ToolbarListenRepository toolbarListenRepository, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = toolbarListenRepository;
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
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ToolbarListenRepository toolbarListenRepository = this.this$0;
                StateFlow<Boolean> stateFlow = toolbarListenRepository.f98536k;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(toolbarListenRepository, null);
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

    @Inject
    public ToolbarListenRepository(@NotNull CoroutineScope coroutineScope, @NotNull ToolbarRepository toolbarRepository, @NotNull final IReporterService iReporterService, @NotNull Context context) {
        this.f98530d = coroutineScope;
        this.f98531e = toolbarRepository;
        a aVar = new a(context);
        this.f98532f = aVar;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, (Object) null);
        this.f98533g = mutableSharedFlowMutableSharedFlow$default;
        this.h = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.f98534i = new HashSet<>();
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f98535j = MutableStateFlow;
        this.f98536k = FlowKt.asStateFlow(MutableStateFlow);
        final int i7 = 0;
        aVar.setOnClickListener(new View.OnClickListener(i7, this, iReporterService) { // from class: com.bilibili.ship.theseus.ugc.toolbar.actionview.listen.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f98547a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f98548b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f98549c;

            {
                this.f98547a = i7;
                this.f98548b = this;
                this.f98549c = iReporterService;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object next;
                switch (this.f98547a) {
                    case 0:
                        ToolbarListenRepository toolbarListenRepository = (ToolbarListenRepository) this.f98548b;
                        IReporterService iReporterService2 = (IReporterService) this.f98549c;
                        if (!toolbarListenRepository.f98534i.isEmpty()) {
                            Iterator it = CollectionsKt.reversed(toolbarListenRepository.f98534i).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (((C6418b) next).f103380a.length() > 0) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            C6418b c6418b = (C6418b) next;
                            q.c(c6418b != null ? c6418b.f103380a : null);
                        } else {
                            iReporterService2.report(new NeuronsEvents.NormalEvent("player.player.listen.click.player", new String[0]));
                            toolbarListenRepository.f98533g.tryEmit(Unit.INSTANCE);
                        }
                        break;
                    default:
                        kR0.h hVar = (kR0.h) this.f98548b;
                        CollectGoodBean collectGoodBean = (CollectGoodBean) this.f98549c;
                        CollectGoodBean collectGoodBean2 = hVar.w;
                        if (collectGoodBean2 != null) {
                            e.g("mall.my-favorite-goodslist.goods-card.0.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("itemid", String.valueOf(collectGoodBean2.getItemsId())), TuplesKt.to("index", String.valueOf(hVar.x))}));
                        }
                        HashMap mapA = g.a(5, "pos", "1");
                        mapA.put("goodsid", String.valueOf(collectGoodBean.getItemsId()));
                        mapA.put("shopId", String.valueOf(collectGoodBean.getShopId()));
                        String strEncode = Uri.encode(JSON.toJSONString(mapA));
                        MallCollectFragment mallCollectFragment = hVar.u;
                        KQ0.b.a().onEvent(1, new String[]{mallCollectFragment != null ? mallCollectFragment.getString(2131830332) : null, "click", "1", strEncode});
                        if (mallCollectFragment != null) {
                            mallCollectFragment.startPageBySchema(collectGoodBean.getJump2GoodsDetail4H5());
                        }
                        break;
                }
            }
        });
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }
}
