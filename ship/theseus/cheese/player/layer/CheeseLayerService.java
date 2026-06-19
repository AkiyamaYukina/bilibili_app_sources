package com.bilibili.ship.theseus.cheese.player.layer;

import Eu0.q;
import Ua.w;
import X1.C3081k;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.text.selection.E0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import com.bilibili.app.authorspace.header.D;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.C6101w;
import com.bilibili.ship.theseus.cheese.pay.purchase.CheesePurchaseRepository;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.playingarea.g;
import com.bilibili.ship.theseus.united.page.playingarea.i;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import eu0.C6978A;
import eu0.C6985d;
import eu0.C6987f;
import eu0.C6994m;
import eu0.C7007z;
import hu0.C7503a;
import hu0.C7504b;
import hu0.C7505c;
import hu0.C7506d;
import java.util.Map;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IToastService;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheeseLayerService.class */
@StabilityInferred(parameters = 0)
public final class CheeseLayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.cheese.player.playviewextra.a f90585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C6985d f90586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f90587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IToastService f90588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C6987f f90589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C7007z f90590g;

    @NotNull
    public final C6978A h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Context f90591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Activity f90592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f90593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final h f90594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final CheesePurchaseRepository f90595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final DanmakuCompoundRepository f90596n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final C6101w f90597o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final C6994m f90598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f90599q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final g f90600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f90601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final i f90602t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final PageReportService f90603u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f90604v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final EpisodeExtraInfoRepository f90605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Lifecycle f90606x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f90607y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public e f90608z;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.layer.CheeseLayerService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheeseLayerService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.layer.CheeseLayerService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheeseLayerService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheeseLayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CheeseLayerService cheeseLayerService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cheeseLayerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(c.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                C7505c c7505c;
                String string;
                String strA;
                Context context;
                int i7;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c.a aVar = (c.a) this.L$0;
                e eVar = this.this$0.f90608z;
                if (eVar != null) {
                    eVar.f90636k.setValue(aVar);
                }
                CheeseLayerService cheeseLayerService = this.this$0;
                if (cheeseLayerService.f90607y) {
                    return Unit.INSTANCE;
                }
                C7504b c7504b = (C7504b) cheeseLayerService.f90585b.f90751a.getValue();
                if (c7504b != null) {
                    c7505c = c7504b.f121487e;
                } else {
                    tb0.h hVar = C7503a.f121482a;
                    c7505c = new C7505c("", "", "");
                }
                C6985d c6985d = cheeseLayerService.f90586c;
                String str = c6985d.f117512g;
                boolean z6 = false;
                boolean z7 = c6985d.f117509d == 3;
                boolean z8 = aVar.f102988b;
                StringBuilder sbB = C3081k.b("layerService updatePayLayerData = ", str, ", preview = ", ", halfScreen = ", z7);
                sbB.append(!z8);
                sbB.append(", playerMask = ");
                sbB.append(c7505c);
                BLog.d("CheeseLayerService", sbB.toString());
                C6987f c6987f = cheeseLayerService.f90589f;
                if (c6987f.f117533c == 1) {
                    z6 = true;
                }
                if (z6) {
                    String str2 = c7505c.f121489a;
                    string = str2;
                    if (str2.length() == 0) {
                        string = cheeseLayerService.f90591i.getString(2131848817);
                    }
                } else {
                    int i8 = c6985d.f117509d;
                    string = (i8 == 1 || i8 == 3) ? i8 == 3 ? cheeseLayerService.f90591i.getString(2131848817) : cheeseLayerService.f90591i.getString(2131848828) : "";
                }
                c7505c.f121489a = string;
                int length = c7505c.f121490b.length();
                C7007z c7007z = cheeseLayerService.f90590g;
                if (length == 0) {
                    if (c7007z.c()) {
                        context = cheeseLayerService.f90591i;
                        i7 = 2131848819;
                    } else {
                        context = cheeseLayerService.f90591i;
                        i7 = 2131848846;
                    }
                    c7505c.f121490b = context.getString(i7);
                }
                if (c7505c.f121491c.length() == 0) {
                    c7505c.f121491c = cheeseLayerService.f90591i.getString(2131848883);
                }
                boolean zC = c7007z.c();
                StringBuilder sb = new StringBuilder("layerService getPriceText = ");
                C6978A c6978a = cheeseLayerService.h;
                sb.append(c6978a);
                sb.append(", hasCoupon = ");
                sb.append(zC);
                BLog.d("CheeseLayerService", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                if (c7007z.c()) {
                    sb2.append(" ");
                    sb2.append(c6978a.f117488b);
                    strA = C8770a.a(sb2, c6978a.f117487a, " ");
                } else {
                    sb2.append(" ");
                    sb2.append(c6978a.f117490d);
                    strA = C8770a.a(sb2, c6978a.f117487a, " ");
                }
                e eVar2 = new e(c7505c, strA, c7007z.b(cheeseLayerService.f90591i, c6987f), cheeseLayerService.f90589f, new CheeseLayerService$updatePayLayerData$1(cheeseLayerService), new w(cheeseLayerService, 3), new Xr0.b(cheeseLayerService, 4), false, 384);
                eVar2.f90635j.setValue(cheeseLayerService.f90597o.a());
                eVar2.f90636k.setValue(aVar);
                cheeseLayerService.f90608z = eVar2;
                CheeseLayerService cheeseLayerService2 = this.this$0;
                int i9 = cheeseLayerService2.f90586c.f117509d;
                if (i9 != 1 && i9 != 3) {
                    cheeseLayerService2.b(ShowLayerFrom.CAN_NOT_PREVIEW);
                    CheeseLayerService cheeseLayerService3 = this.this$0;
                    PageReportService pageReportService = cheeseLayerService3.f90603u;
                    Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                    C6985d c6985dA = cheeseLayerService3.f90604v.a();
                    String strValueOf = "";
                    if (c6985dA != null) {
                        strValueOf = String.valueOf(c6985dA.f117521q);
                        if (strValueOf == null) {
                            strValueOf = "";
                        }
                    }
                    mapCreateMapBuilder.put("epid", strValueOf);
                    mapCreateMapBuilder.put("masking_type", "1");
                    Unit unit = Unit.INSTANCE;
                    PageReportService.i(pageReportService, "pugv.pugv-player.toast-masking.0.show", MapsKt.build(mapCreateMapBuilder), 4);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CheeseLayerService cheeseLayerService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cheeseLayerService;
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
                StateFlow stateFlowC = this.this$0.f90587d.c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowC, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.layer.CheeseLayerService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheeseLayerService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.layer.CheeseLayerService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheeseLayerService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheeseLayerService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.layer.CheeseLayerService$3$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheeseLayerService$3$1$2.class */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<Lifecycle.State, Continuation<? super Boolean>, Object> {
                Object L$0;
                int label;

                public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                public final Object invoke(Lifecycle.State state, Continuation<? super Boolean> continuation) {
                    return create(state, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(((Lifecycle.State) this.L$0) == Lifecycle.State.RESUMED);
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.layer.CheeseLayerService$3$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheeseLayerService$3$1$a.class */
            public static final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final int[] f90609a;

                static {
                    int[] iArr = new int[PlayerAvailability.values().length];
                    try {
                        iArr[PlayerAvailability.FORBIDDEN.ordinal()] = 1;
                    } catch (NoSuchFieldError e7) {
                    }
                    try {
                        iArr[PlayerAvailability.COMPLETED.ordinal()] = 2;
                    } catch (NoSuchFieldError e8) {
                    }
                    f90609a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CheeseLayerService cheeseLayerService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cheeseLayerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Unit> continuation) {
                return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    Method dump skipped, instruction units count: 262
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.player.layer.CheeseLayerService.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CheeseLayerService cheeseLayerService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = cheeseLayerService;
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
                CheeseLayerService cheeseLayerService = this.this$0;
                if (cheeseLayerService.f90586c.f117509d == 3) {
                    MutableStateFlow<PlayerAvailability> mutableStateFlow = cheeseLayerService.f90594l.f91107a.f79286c;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheeseLayerService, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.layer.CheeseLayerService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheeseLayerService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.layer.CheeseLayerService$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheeseLayerService$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7504b, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheeseLayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CheeseLayerService cheeseLayerService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cheeseLayerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C7504b c7504b, Continuation<? super Unit> continuation) {
                return create(c7504b, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                C7506d c7506d;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C7504b c7504b = (C7504b) this.L$0;
                CheeseLayerService cheeseLayerService = this.this$0;
                cheeseLayerService.getClass();
                if (c7504b != null) {
                    C7506d c7506d2 = c7504b.f121486d;
                    if (!cheeseLayerService.f90607y) {
                        StringBuilder sb = new StringBuilder("layerService tryShowRiskLayer riskControlTitle: ");
                        String str = c7506d2.f121493b;
                        sb.append(str);
                        BLog.d(sb.toString());
                        if (str.length() > 0) {
                            c.a aVarH = cheeseLayerService.f90587d.h();
                            C7504b c7504b2 = (C7504b) cheeseLayerService.f90585b.f90751a.getValue();
                            if (c7504b2 != null) {
                                c7506d = c7504b2.f121486d;
                            } else {
                                tb0.h hVar = C7503a.f121482a;
                                c7506d = new C7506d(false, "", "", "", "", "");
                            }
                            C6985d c6985d = cheeseLayerService.f90586c;
                            String str2 = c6985d.f117512g;
                            boolean z6 = c6985d.f117509d == 3;
                            boolean z7 = aVarH.f102988b;
                            StringBuilder sbB = C3081k.b("layerService updateRiskLayerData = ", str2, ", preview = ", ", halfScreen = ", z6);
                            sbB.append(!z7);
                            sbB.append(", risk = ");
                            sbB.append(c7506d);
                            BLog.d("CheeseLayerService", sbB.toString());
                            cheeseLayerService.f90608z = new e(new C7505c(c7506d.f121493b, c7506d.f121494c, ""), "", c7506d.f121495d, null, new CheeseLayerService$updateRiskLayerData$1(cheeseLayerService), new q(1, c7506d, cheeseLayerService), new E0(cheeseLayerService, 3), true, 264);
                            cheeseLayerService.b(ShowLayerFrom.DEAFULT);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(CheeseLayerService cheeseLayerService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = cheeseLayerService;
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
                CheeseLayerService cheeseLayerService = this.this$0;
                StateFlow<C7504b> stateFlow = cheeseLayerService.f90585b.f90751a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheeseLayerService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.layer.CheeseLayerService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheeseLayerService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.layer.CheeseLayerService$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheeseLayerService$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7007z, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheeseLayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CheeseLayerService cheeseLayerService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cheeseLayerService;
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
                e eVar = this.this$0.f90608z;
                if (eVar != null) {
                    eVar.f90635j.setValue(c7007z);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(CheeseLayerService cheeseLayerService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = cheeseLayerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CheeseLayerService cheeseLayerService = this.this$0;
                StateFlow<C7007z> stateFlow = cheeseLayerService.f90597o.f89782d;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheeseLayerService, null);
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
    public CheeseLayerService(@NotNull CoroutineScope coroutineScope, boolean z6, @NotNull com.bilibili.ship.theseus.cheese.player.playviewextra.a aVar, @NotNull C6985d c6985d, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull IToastService iToastService, @NotNull C6987f c6987f, @NotNull C7007z c7007z, @NotNull C6978A c6978a, @NotNull Context context, @NotNull Activity activity, @NotNull IControlContainerService iControlContainerService, @NotNull h hVar, @NotNull CheesePurchaseRepository cheesePurchaseRepository, @NotNull DanmakuCompoundRepository danmakuCompoundRepository, @NotNull C6101w c6101w, @NotNull C6994m c6994m, @NotNull BackActionRepository backActionRepository, @NotNull g gVar, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull i iVar, @NotNull PageReportService pageReportService, @NotNull CheesePlayRepository cheesePlayRepository, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull Lifecycle lifecycle) {
        this.f90584a = coroutineScope;
        this.f90585b = aVar;
        this.f90586c = c6985d;
        this.f90587d = cVar;
        this.f90588e = iToastService;
        this.f90589f = c6987f;
        this.f90590g = c7007z;
        this.h = c6978a;
        this.f90591i = context;
        this.f90592j = activity;
        this.f90593k = iControlContainerService;
        this.f90594l = hVar;
        this.f90595m = cheesePurchaseRepository;
        this.f90596n = danmakuCompoundRepository;
        this.f90597o = c6101w;
        this.f90598p = c6994m;
        this.f90599q = backActionRepository;
        this.f90600r = gVar;
        this.f90601s = theseusFloatLayerService;
        this.f90602t = iVar;
        this.f90603u = pageReportService;
        this.f90604v = cheesePlayRepository;
        this.f90605w = episodeExtraInfoRepository;
        this.f90606x = lifecycle;
        if (c6994m.f117554a && c6994m.f117555b.length() > 0) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CheeseLayerService$keepCheeseCustomDanmakuClick$1(this, new D(this, 3), null), 3, (Object) null);
        }
        if (!z6) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
    }

    public static final BiliImageView a(CheeseLayerService cheeseLayerService, Context context) {
        cheeseLayerService.getClass();
        BiliImageView biliImageView = new BiliImageView(context);
        biliImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        BiliImageLoader.INSTANCE.with(context).url(cheeseLayerService.f90589f.f117535e).bitmapTransformation(new ua0.c(3, 10, (BitmapTransformation) null)).into(biliImageView);
        return biliImageView;
    }

    public final void b(ShowLayerFrom showLayerFrom) {
        this.f90607y = true;
        this.f90593k.hide();
        e eVar = this.f90608z;
        if (eVar != null) {
            eVar.f90634i = showLayerFrom;
        }
        BuildersKt.launch$default(this.f90584a, (CoroutineContext) null, (CoroutineStart) null, new CheeseLayerService$showPayLayer$1(this, null), 3, (Object) null);
        this.f90588e.removeAllToast();
        BuildersKt.launch$default(this.f90584a, (CoroutineContext) null, (CoroutineStart) null, new CheeseLayerService$keepCheeseCustomDanmakuClick$1(this, new com.bilibili.lib.fasthybrid.game.scenarios.game.about.a(this, 1), null), 3, (Object) null);
        BuildersKt.launch$default(this.f90584a, (CoroutineContext) null, (CoroutineStart) null, new CheeseLayerService$showPayLayer$3(this, null), 3, (Object) null);
    }
}
