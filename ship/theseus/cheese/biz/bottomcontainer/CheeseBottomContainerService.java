package com.bilibili.ship.theseus.cheese.biz.bottomcontainer;

import H3.C2023a0;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import au0.C4911a;
import com.bilibili.app.gemini.share.f;
import com.bilibili.app.gemini.share.t;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.playerbizcommonv2.guideBubble.BiliGuideBubble;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.C6101w;
import com.bilibili.ship.theseus.cheese.biz.modules.CheesePlayerActionDelegateImpl;
import com.bilibili.ship.theseus.cheese.pay.purchase.CheesePurchaseRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.bilibili.ship.theseus.united.page.view.StatData;
import com.bilibili.ship.theseus.united.widget.PinnedBottomFrameLayout;
import eu0.C6978A;
import eu0.C6980C;
import eu0.C6982a;
import eu0.C6987f;
import eu0.C6989h;
import eu0.C7001t;
import eu0.C7002u;
import eu0.C7007z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.inject.Inject;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import nu0.C8142a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService.class */
@StabilityInferred(parameters = 0)
public final class CheeseBottomContainerService {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f89017A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public n f89018B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final Lazy f89019C = LazyKt.lazy(new Jr.c(6));

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f89020D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public ConsultButtonStatus f89021E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public ConsultButtonStatus f89022F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final d f89023G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f89024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Flow<b> f89025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Context f89026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f89027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C7001t f89028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C4911a f89029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final FragmentManager f89030g;

    @NotNull
    public final CheesePurchaseRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f89031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final String f89032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final C6978A f89033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final C6101w f89034l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final CheesePlayerActionDelegateImpl f89035m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.gemini.share.d f89036n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final PageReportService f89037o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final i f89038p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f89039q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f89040r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final C6987f f89041s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final C6982a f89042t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final RelationRepository f89043u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final C6980C f89044v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final IPlayDirector f89045w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final yk.c f89046x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f89047y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public t f89048z;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseBottomContainerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$1$1.class */
        public static final class C05991 extends SuspendLambda implements Function2<StatData, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheeseBottomContainerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05991(CheeseBottomContainerService cheeseBottomContainerService, Continuation<? super C05991> continuation) {
                super(2, continuation);
                this.this$0 = cheeseBottomContainerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05991 c05991 = new C05991(this.this$0, continuation);
                c05991.L$0 = obj;
                return c05991;
            }

            public final Object invoke(StatData statData, Continuation<? super Unit> continuation) {
                return create(statData, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                StatData statData = (StatData) this.L$0;
                this.this$0.f(statData != null ? statData.f104021c : 0L);
                CheeseBottomContainerService cheeseBottomContainerService = this.this$0;
                long j7 = 0;
                if (statData != null) {
                    j7 = statData.f104024f;
                }
                cheeseBottomContainerService.g(j7);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseBottomContainerService cheeseBottomContainerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseBottomContainerService;
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
                CheeseBottomContainerService cheeseBottomContainerService = this.this$0;
                StateFlow<StatData> stateFlow = cheeseBottomContainerService.f89043u.f104004m;
                C05991 c05991 = new C05991(cheeseBottomContainerService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c05991, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final CheeseBottomContainerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<b, Continuation<? super Unit>, Object> {
            final CoroutineScope $$this$launch;
            Object L$0;
            int label;
            final CheeseBottomContainerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CoroutineScope coroutineScope, CheeseBottomContainerService cheeseBottomContainerService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$$this$launch = coroutineScope;
                this.this$0 = cheeseBottomContainerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$launch, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(b bVar, Continuation<? super Unit> continuation) {
                return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:100:0x0262  */
            /* JADX WARN: Removed duplicated region for block: B:111:0x02ad  */
            /* JADX WARN: Removed duplicated region for block: B:121:0x02d7  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0121  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x014d  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x01b9  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x01e5  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x0236  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    Method dump skipped, instruction units count: 1060
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerService.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CheeseBottomContainerService cheeseBottomContainerService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cheeseBottomContainerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CheeseBottomContainerService cheeseBottomContainerService = this.this$0;
                Flow<b> flow = cheeseBottomContainerService.f89025b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, cheeseBottomContainerService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseBottomContainerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final CheeseBottomContainerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CheeseBottomContainerService cheeseBottomContainerService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cheeseBottomContainerService;
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
                boolean z6 = this.Z$0;
                n nVar = this.this$0.f89018B;
                if (nVar != null) {
                    nVar.f89096a.f89059g.setValue(Boolean.valueOf(z6));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CheeseBottomContainerService cheeseBottomContainerService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = cheeseBottomContainerService;
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
                CheeseBottomContainerService cheeseBottomContainerService = this.this$0;
                StateFlow<Boolean> stateFlow = cheeseBottomContainerService.f89038p.f89089b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheeseBottomContainerService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseBottomContainerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerService$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7007z, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheeseBottomContainerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CheeseBottomContainerService cheeseBottomContainerService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cheeseBottomContainerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C7007z c7007z, Continuation<? super Unit> continuation) {
                return create(c7007z, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C7007z c7007z = (C7007z) this.L$0;
                n nVar = this.this$0.f89018B;
                if (nVar != null) {
                    nVar.f89099d.f89061j.setValue(c7007z);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(CheeseBottomContainerService cheeseBottomContainerService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = cheeseBottomContainerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CheeseBottomContainerService cheeseBottomContainerService = this.this$0;
                StateFlow<C7007z> stateFlow = cheeseBottomContainerService.f89034l.f89782d;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheeseBottomContainerService, null);
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$ConsultButtonStatus.class */
    public static final class ConsultButtonStatus {
        private static final EnumEntries $ENTRIES;
        private static final ConsultButtonStatus[] $VALUES;
        private final int code;
        public static final ConsultButtonStatus None = new ConsultButtonStatus(TextSource.STR_SCROLL_NONE, 0, 0);
        public static final ConsultButtonStatus NormalBubble = new ConsultButtonStatus("NormalBubble", 1, 1);
        public static final ConsultButtonStatus WXIcon = new ConsultButtonStatus("WXIcon", 2, 2);
        public static final ConsultButtonStatus WXBubbleStay = new ConsultButtonStatus("WXBubbleStay", 3, 3);
        public static final ConsultButtonStatus WXBubbleSlide = new ConsultButtonStatus("WXBubbleSlide", 4, 4);

        private static final /* synthetic */ ConsultButtonStatus[] $values() {
            return new ConsultButtonStatus[]{None, NormalBubble, WXIcon, WXBubbleStay, WXBubbleSlide};
        }

        static {
            ConsultButtonStatus[] consultButtonStatusArr$values = $values();
            $VALUES = consultButtonStatusArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(consultButtonStatusArr$values);
        }

        private ConsultButtonStatus(String str, int i7, int i8) {
            this.code = i8;
        }

        @NotNull
        public static EnumEntries<ConsultButtonStatus> getEntries() {
            return $ENTRIES;
        }

        public static ConsultButtonStatus valueOf(String str) {
            return (ConsultButtonStatus) Enum.valueOf(ConsultButtonStatus.class, str);
        }

        public static ConsultButtonStatus[] values() {
            return (ConsultButtonStatus[]) $VALUES.clone();
        }

        public final int getCode() {
            return this.code;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$a.class */
    @BaseUrl("https://api.bilibili.com")
    public interface a {
        @GET("/pugv/view/app/season/consult")
        @Nullable
        Object cheeseConsult(@Query("csource") @NotNull String str, @Query("from_spm_id") @NotNull String str2, @Query("season_id") @NotNull String str3, @NotNull Continuation<? super BiliApiResponse<? extends Object>> continuation);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final PinnedBottomFrameLayout f89049a;

        public b(@NotNull PinnedBottomFrameLayout pinnedBottomFrameLayout) {
            this.f89049a = pinnedBottomFrameLayout;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f89049a, ((b) obj).f89049a);
        }

        public final int hashCode() {
            return this.f89049a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Views(flBottomContainer=" + this.f89049a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$c.class */
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f89050a;

        static {
            int[] iArr = new int[ConsultButtonStatus.values().length];
            try {
                iArr[ConsultButtonStatus.NormalBubble.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ConsultButtonStatus.WXBubbleStay.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[ConsultButtonStatus.WXBubbleSlide.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[ConsultButtonStatus.WXIcon.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[ConsultButtonStatus.None.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f89050a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$d.class */
    public static final class d implements f.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheeseBottomContainerService f89051a;

        public d(CheeseBottomContainerService cheeseBottomContainerService) {
            this.f89051a = cheeseBottomContainerService;
        }

        public final String[] a() {
            ArrayList arrayList = new ArrayList();
            CollectionsKt.e(arrayList, com.bilibili.app.gemini.share.f.m);
            String str = this.f89051a.f89032j;
            if (str != null && !StringsKt.isBlank(str)) {
                arrayList.add("OPEN_WEB");
            }
            return (String[]) arrayList.toArray(new String[0]);
        }

        public final boolean d(String str, com.bilibili.app.gemini.share.g gVar) {
            return CheeseBottomContainerService.a(this.f89051a, str);
        }

        public final void e() {
        }

        public final void onShareSuccess() {
            this.f89051a.f89043u.p();
        }
    }

    @Inject
    public CheeseBottomContainerService(@NotNull CoroutineScope coroutineScope, @NotNull Flow<b> flow, @NotNull Context context, @NotNull FragmentActivity fragmentActivity, @NotNull C7001t c7001t, @NotNull C4911a c4911a, @NotNull FragmentManager fragmentManager, @NotNull CheesePurchaseRepository cheesePurchaseRepository, boolean z6, @Nullable String str, @NotNull C6978A c6978a, @NotNull C6101w c6101w, @NotNull CheesePlayerActionDelegateImpl cheesePlayerActionDelegateImpl, @NotNull com.bilibili.app.gemini.share.d dVar, @NotNull PageReportService pageReportService, @NotNull i iVar, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar, @NotNull C6987f c6987f, @NotNull C6982a c6982a, @NotNull RelationRepository relationRepository, @NotNull C6980C c6980c, @NotNull IPlayDirector iPlayDirector, @NotNull yk.c cVar, @NotNull IControlContainerService iControlContainerService) {
        this.f89024a = coroutineScope;
        this.f89025b = flow;
        this.f89026c = context;
        this.f89027d = fragmentActivity;
        this.f89028e = c7001t;
        this.f89029f = c4911a;
        this.f89030g = fragmentManager;
        this.h = cheesePurchaseRepository;
        this.f89031i = z6;
        this.f89032j = str;
        this.f89033k = c6978a;
        this.f89034l = c6101w;
        this.f89035m = cheesePlayerActionDelegateImpl;
        this.f89036n = dVar;
        this.f89037o = pageReportService;
        this.f89038p = iVar;
        this.f89039q = introContentSizeRepository;
        this.f89040r = aVar;
        this.f89041s = c6987f;
        this.f89042t = c6982a;
        this.f89043u = relationRepository;
        this.f89044v = c6980c;
        this.f89045w = iPlayDirector;
        this.f89046x = cVar;
        this.f89047y = iControlContainerService;
        ConsultButtonStatus consultButtonStatus = ConsultButtonStatus.None;
        this.f89021E = consultButtonStatus;
        this.f89022F = consultButtonStatus;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        this.f89023G = new d(this);
    }

    public static final boolean a(CheeseBottomContainerService cheeseBottomContainerService, String str) {
        boolean z6;
        cheeseBottomContainerService.getClass();
        if (Intrinsics.areEqual(str, "OPEN_WEB")) {
            String str2 = cheeseBottomContainerService.f89032j;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                BLRouter.routeTo(RouteRequestKt.toRouteRequest(str2), cheeseBottomContainerService.f89026c);
            }
            z6 = true;
        } else {
            z6 = false;
        }
        return z6;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerService r6, boolean r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerService.b(com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerService, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        WeakReference<View> weakReference;
        View view;
        C6989h c6989h;
        n nVar = this.f89018B;
        if ((nVar != null ? (Drawable) nVar.f89097b.f89067p.getValue() : null) != null || (weakReference = this.f89020D) == null || (view = weakReference.get()) == null) {
            return;
        }
        C7002u c7002u = this.f89028e.f117578c;
        String str = (c7002u == null || (c6989h = c7002u.f117586f) == null) ? null : c6989h.f117538c;
        if (str == null || str.length() == 0) {
            return;
        }
        BuildersKt.launch$default(this.f89024a, (CoroutineContext) null, (CoroutineStart) null, new CheeseBottomContainerService$executeShowWXIcon$1$1(new WeakReference(this), view, str, null), 3, (Object) null);
    }

    public final void d() {
        BuildersKt.launch$default(this.f89024a, (CoroutineContext) null, (CoroutineStart) null, new CheeseBottomContainerService$onClickFavorite$1(this, null), 3, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void e(ConsultButtonStatus consultButtonStatus) throws NoWhenBranchMatchedException {
        WeakReference<View> weakReference;
        View view;
        C6989h c6989h;
        FragmentActivity fragmentActivity = this.f89027d;
        if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed() || (weakReference = this.f89020D) == null || (view = weakReference.get()) == null) {
            return;
        }
        int i7 = c.f89050a[consultButtonStatus.ordinal()];
        if (i7 == 1) {
            this.f89022F = ConsultButtonStatus.NormalBubble;
            if (C8142a.f124389b) {
                return;
            }
            Context context = view.getContext();
            BiliGuideBubble biliGuideBubble = new BiliGuideBubble(context.getString(2131848738), view, true, false, BiliGuideBubble.ArrowPosition.Bottom, 0, Cj0.a.a(context), context, new C2023a0(7), 0, null, 0, 0, 31744);
            biliGuideBubble.setFocusable(false);
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            biliGuideBubble.e(NewPlayerUtilsKt.toPx(49), -(NewPlayerUtilsKt.toPx(42) + rect.height()));
            C8142a.f124389b = true;
            C8142a.a().l("key_pref_consult_bubble_has_show", true);
            return;
        }
        if (i7 == 2) {
            BuildersKt.launch$default(this.f89024a, (CoroutineContext) null, (CoroutineStart) null, new CheeseBottomContainerService$showConsultBubble$1$1(new WeakReference(this), new WeakReference(view), null), 3, (Object) null);
            return;
        }
        if (i7 != 3) {
            if (i7 != 4 && i7 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        this.f89022F = ConsultButtonStatus.WXBubbleSlide;
        PageReportService.i(this.f89037o, "pugv.detail.consult.consult-popup.show", null, 6);
        WeakReference weakReference2 = new WeakReference(this);
        Lazy lazy = C8142a.f124388a;
        C7002u c7002u = this.f89028e.f117578c;
        String str = (c7002u == null || (c6989h = c7002u.f117586f) == null) ? null : c6989h.f117537b;
        String str2 = null;
        if (c7002u != null) {
            C6989h c6989h2 = c7002u.f117586f;
            str2 = null;
            if (c6989h2 != null) {
                str2 = c6989h2.f117538c;
            }
        }
        C8142a.c(view, str, str2, false, new Oo.f(weakReference2, 5));
    }

    public final void f(long j7) {
        Integer num = this.f89042t.f117502a.get("pugv_operate_area_stat_fav");
        if (num != null && num.intValue() == 2) {
            if (j7 > 0) {
                n nVar = this.f89018B;
                if (nVar != null) {
                    com.bilibili.ship.theseus.cheese.biz.bottomcontainer.c cVar = nVar.f89096a;
                    cVar.h.setValue(NumberFormat_androidKt.format$default(Long.valueOf(j7), "0", 0, 2, (Object) null));
                    return;
                }
                return;
            }
            n nVar2 = this.f89018B;
            if (nVar2 != null) {
                com.bilibili.ship.theseus.cheese.biz.bottomcontainer.c cVar2 = nVar2.f89096a;
                cVar2.h.setValue(this.f89026c.getString(2131846948));
            }
        }
    }

    public final void g(long j7) {
        n nVar;
        com.bilibili.ship.theseus.cheese.biz.bottomcontainer.c cVar;
        Integer num = this.f89042t.f117502a.get("pugv_operate_area_stat_share");
        if (num == null || num.intValue() != 2 || j7 <= 0 || (nVar = this.f89018B) == null || (cVar = nVar.f89098c) == null) {
            return;
        }
        cVar.f89060i.setValue(NumberFormat_androidKt.format$default(Long.valueOf(j7), "0", 0, 2, (Object) null));
    }
}
