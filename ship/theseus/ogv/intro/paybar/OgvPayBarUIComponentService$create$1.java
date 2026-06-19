package com.bilibili.ship.theseus.ogv.intro.paybar;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import com.bilibili.community.follow.FollowSeasonRepository$flowOfFollowSeason$;
import com.bilibili.community.follow.FollowSeasonStatus;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.lib.theme.R$color;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.ship.theseus.ogv.intro.paybar.OgvPayBarUIComponentService;
import com.bilibili.ship.theseus.ogv.intro.paybar.a;
import com.bilibili.ship.theseus.ogv.playviewextra.PayTip;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/paybar/OgvPayBarUIComponentService$create$1.class */
public final class OgvPayBarUIComponentService$create$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final a.C0708a $payBarVm;
    int label;
    final OgvPayBarUIComponentService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.paybar.OgvPayBarUIComponentService$create$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/paybar/OgvPayBarUIComponentService$create$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a.C0708a $payBarVm;
        private Object L$0;
        int label;
        final OgvPayBarUIComponentService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.paybar.OgvPayBarUIComponentService$create$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/paybar/OgvPayBarUIComponentService$create$1$1$1.class */
        public static final class C07071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final a.C0708a $payBarVm;
            int label;
            final OgvPayBarUIComponentService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.paybar.OgvPayBarUIComponentService$create$1$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/paybar/OgvPayBarUIComponentService$create$1$1$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final a.C0708a f93343a;

                public a(a.C0708a c0708a) {
                    this.f93343a = c0708a;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    a.C0708a c0708a = this.f93343a;
                    if (iIntValue != c0708a.f93348D) {
                        c0708a.f93348D = iIntValue;
                        c0708a.notifyPropertyChanged(284);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07071(OgvPayBarUIComponentService ogvPayBarUIComponentService, a.C0708a c0708a, Continuation<? super C07071> continuation) {
                super(2, continuation);
                this.this$0 = ogvPayBarUIComponentService;
                this.$payBarVm = c0708a;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07071(this.this$0, this.$payBarVm, continuation);
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
                    StateFlow<Integer> stateFlow = this.this$0.f93341j.f100020a;
                    a aVar = new a(this.$payBarVm);
                    this.label = 1;
                    if (stateFlow.collect(aVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.paybar.OgvPayBarUIComponentService$create$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/paybar/OgvPayBarUIComponentService$create$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function3<PayTip, com.bilibili.community.follow.b, Continuation<? super Unit>, Object> {
            final a.C0708a $payBarVm;
            Object L$0;
            Object L$1;
            int label;
            final OgvPayBarUIComponentService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(OgvPayBarUIComponentService ogvPayBarUIComponentService, a.C0708a c0708a, Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
                this.this$0 = ogvPayBarUIComponentService;
                this.$payBarVm = c0708a;
            }

            public final Object invoke(PayTip payTip, com.bilibili.community.follow.b bVar, Continuation<? super Unit> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$payBarVm, continuation);
                anonymousClass2.L$0 = payTip;
                anonymousClass2.L$1 = bVar;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PayTip payTip = (PayTip) this.L$0;
                com.bilibili.community.follow.b bVar = (com.bilibili.community.follow.b) this.L$1;
                if (payTip != null) {
                    OgvPayBarUIComponentService ogvPayBarUIComponentService = this.this$0;
                    a.C0708a c0708a = this.$payBarVm;
                    ogvPayBarUIComponentService.getClass();
                    if (!Intrinsics.areEqual(payTip, c0708a.f93352d)) {
                        c0708a.f93352d = payTip;
                        c0708a.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MAX_THRESHOLD);
                    }
                    String strG = payTip.g();
                    if (!Intrinsics.areEqual(strG, c0708a.f93365r)) {
                        c0708a.f93365r = strG;
                        c0708a.notifyPropertyChanged(725);
                    }
                    Integer numValueOf = Integer.valueOf(ogvPayBarUIComponentService.b(R$color.Wh0_u, payTip.j(), payTip.k()));
                    if (!Intrinsics.areEqual(numValueOf, c0708a.f93356i)) {
                        c0708a.f93356i = numValueOf;
                        c0708a.notifyPropertyChanged(632);
                    }
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(ogvPayBarUIComponentService.b(2131104028, payTip.b(), payTip.c()));
                    gradientDrawable.setStroke(Uj0.c.b(0.5f, ogvPayBarUIComponentService.f93334b), ogvPayBarUIComponentService.b(R.color.transparent, payTip.d(), payTip.e()));
                    Context context = ogvPayBarUIComponentService.f93334b;
                    float f7 = 40;
                    gradientDrawable.setCornerRadius(Uj0.c.a(f7, context));
                    if (!Intrinsics.areEqual(gradientDrawable, c0708a.f93354f)) {
                        c0708a.f93354f = gradientDrawable;
                        c0708a.notifyPropertyChanged(54);
                    }
                    Drawable drawable = AppCompatResources.getDrawable(ogvPayBarUIComponentService.f93334b, 2131240887);
                    if (!Intrinsics.areEqual(drawable, c0708a.f93355g)) {
                        c0708a.f93355g = drawable;
                        c0708a.notifyPropertyChanged(60);
                    }
                    int i7 = OgvPayBarUIComponentService.a.f93342a[payTip.i().ordinal()];
                    String str = payTip.f94355a;
                    if (i7 == 1) {
                        c0708a.z(true);
                        c0708a.m(true);
                        c0708a.r(false);
                        c0708a.w(true);
                        c0708a.n(true);
                        c0708a.o(true);
                        c0708a.s(false);
                        if (!Intrinsics.areEqual(str, c0708a.f93358k)) {
                            c0708a.f93358k = str;
                            c0708a.notifyPropertyChanged(723);
                        }
                    } else if (i7 == 2) {
                        c0708a.z(true);
                        c0708a.m(true);
                        c0708a.r(false);
                        c0708a.w(true);
                        c0708a.n(true);
                        c0708a.o(true);
                        c0708a.s(false);
                        if (!Intrinsics.areEqual(str, c0708a.f93358k)) {
                            c0708a.f93358k = str;
                            c0708a.notifyPropertyChanged(723);
                        }
                    } else if (i7 == 3) {
                        Context context2 = ogvPayBarUIComponentService.f93334b;
                        String strA = payTip.a();
                        String strF = payTip.f();
                        c0708a.z(false);
                        c0708a.m(false);
                        c0708a.r(true);
                        c0708a.w(false);
                        c0708a.n(false);
                        c0708a.o(false);
                        c0708a.s(false);
                        float screenWidth = ((ogvPayBarUIComponentService.f93340i.h().f102987a ? ScreenUtil.getScreenWidth(context2) : ScreenUtil.getScreenHeight(context2)) / context2.getResources().getDisplayMetrics().density) - 24.0f;
                        if (screenWidth <= 600.0f) {
                            int i8 = (int) ((screenWidth / 351) * f7);
                            if (i8 != c0708a.f93347C) {
                                c0708a.f93347C = i8;
                                c0708a.notifyPropertyChanged(584);
                            }
                            if (!Intrinsics.areEqual(strA, c0708a.f93363p)) {
                                c0708a.f93363p = strA;
                                c0708a.notifyPropertyChanged(582);
                            }
                        } else {
                            int i9 = (int) ((screenWidth / 794) * f7);
                            if (i9 != c0708a.f93347C) {
                                c0708a.f93347C = i9;
                                c0708a.notifyPropertyChanged(584);
                            }
                            if (!Intrinsics.areEqual(strF, c0708a.f93363p)) {
                                c0708a.f93363p = strF;
                                c0708a.notifyPropertyChanged(582);
                            }
                        }
                    } else if (i7 == 4) {
                        c0708a.z(false);
                        c0708a.m(false);
                        c0708a.r(false);
                        c0708a.w(false);
                        c0708a.n(true);
                        c0708a.o(true);
                        c0708a.s(true);
                        if (!Intrinsics.areEqual(str, c0708a.f93360m)) {
                            c0708a.f93360m = str;
                            c0708a.notifyPropertyChanged(585);
                        }
                    } else {
                        if (i7 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c0708a.z(false);
                        c0708a.m(false);
                        c0708a.r(false);
                        c0708a.w(false);
                        c0708a.n(false);
                        c0708a.o(false);
                        c0708a.s(false);
                        if (c0708a.f93367t) {
                            c0708a.f93367t = false;
                            c0708a.notifyPropertyChanged(457);
                        }
                        if (true != c0708a.f93366s) {
                            c0708a.f93366s = true;
                            c0708a.notifyPropertyChanged(459);
                        }
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setCornerRadius(Uj0.c.a(20, ogvPayBarUIComponentService.f93334b));
                        gradientDrawable2.setColor(ContextCompat.getColor(ogvPayBarUIComponentService.f93334b, R$color.Ga1));
                        if (!Intrinsics.areEqual(gradientDrawable2, c0708a.f93368u)) {
                            c0708a.f93368u = gradientDrawable2;
                            c0708a.notifyPropertyChanged(458);
                        }
                        long j7 = ogvPayBarUIComponentService.f93335c.f94449a;
                        com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
                        com.bilibili.community.follow.b bVar2 = (com.bilibili.community.follow.b) com.bilibili.community.follow.c.c.c(com.bilibili.community.follow.c.a(j7));
                        com.bilibili.community.follow.b bVar3 = bVar2;
                        if (bVar2 == null) {
                            bVar3 = new com.bilibili.community.follow.b(false, FollowSeasonStatus.UNKNOWN);
                        }
                        if (bVar3.a) {
                            c0708a.q(false);
                            c0708a.u(ogvPayBarUIComponentService.f93334b.getString(2131847401));
                            c0708a.v(ContextCompat.getColor(ogvPayBarUIComponentService.f93334b, R$color.Ga5));
                        } else {
                            c0708a.q(true);
                            int color = ContextCompat.getColor(ogvPayBarUIComponentService.f93334b, R$color.Pi5);
                            if (color != c0708a.f93345A) {
                                c0708a.f93345A = color;
                                c0708a.notifyPropertyChanged(666);
                            }
                            c0708a.u(ogvPayBarUIComponentService.f93334b.getString(2131847137));
                            c0708a.v(ContextCompat.getColor(ogvPayBarUIComponentService.f93334b, R$color.Pi5));
                        }
                        int color2 = ContextCompat.getColor(ogvPayBarUIComponentService.f93334b, R$color.Ga8);
                        if (color2 != c0708a.f93369v) {
                            c0708a.f93369v = color2;
                            c0708a.notifyPropertyChanged(665);
                        }
                        int color3 = ContextCompat.getColor(ogvPayBarUIComponentService.f93334b, R$color.Ga5);
                        if (color3 != c0708a.f93370w) {
                            c0708a.f93370w = color3;
                            c0708a.notifyPropertyChanged(354);
                        }
                    }
                    ExposureEntry exposureEntry = new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new Ld.a(1, payTip, ogvPayBarUIComponentService));
                    if (!Intrinsics.areEqual(exposureEntry, c0708a.f93351c)) {
                        c0708a.f93351c = exposureEntry;
                        c0708a.notifyPropertyChanged(109);
                    }
                    OgvPayBarUIComponentService ogvPayBarUIComponentService2 = this.this$0;
                    a.C0708a c0708a2 = this.$payBarVm;
                    Context context3 = ogvPayBarUIComponentService2.f93334b;
                    PayTip.ShowType showTypeI = payTip.i();
                    boolean z6 = bVar.a;
                    if (showTypeI == PayTip.ShowType.LEFT_TEXT_RIGHT_BUTTON) {
                        if (z6) {
                            c0708a2.q(false);
                            c0708a2.u(context3.getString(2131847401));
                            c0708a2.v(ContextCompat.getColor(context3, R$color.Ga5));
                        } else {
                            c0708a2.q(true);
                            int color4 = ContextCompat.getColor(context3, R$color.Pi5);
                            if (color4 != c0708a2.f93345A) {
                                c0708a2.f93345A = color4;
                                c0708a2.notifyPropertyChanged(666);
                            }
                            c0708a2.u(context3.getString(2131847137));
                            c0708a2.v(ContextCompat.getColor(context3, R$color.Pi5));
                        }
                    }
                    a.C0708a c0708a3 = this.$payBarVm;
                    if (true != c0708a3.f93346B) {
                        c0708a3.f93346B = true;
                        c0708a3.notifyPropertyChanged(720);
                    }
                } else {
                    a.C0708a c0708a4 = this.$payBarVm;
                    if (c0708a4.f93346B) {
                        c0708a4.f93346B = false;
                        c0708a4.notifyPropertyChanged(720);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvPayBarUIComponentService ogvPayBarUIComponentService, a.C0708a c0708a, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvPayBarUIComponentService;
            this.$payBarVm = c0708a;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$payBarVm, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C07071(this.this$0, this.$payBarVm, null), 3, (Object) null);
            OgvPayBarUIComponentService ogvPayBarUIComponentService = this.this$0;
            Flow<PayTip> flow = ogvPayBarUIComponentService.f93338f;
            long j7 = ogvPayBarUIComponentService.f93335c.f94449a;
            com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
            FlowKt.launchIn(FlowKt.combine(flow, new FollowSeasonRepository$flowOfFollowSeason$.inlined.map.1(com.bilibili.community.follow.c.c.b(com.bilibili.community.follow.c.a(j7))), new AnonymousClass2(this.this$0, this.$payBarVm, null)), coroutineScope);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvPayBarUIComponentService$create$1(OgvPayBarUIComponentService ogvPayBarUIComponentService, a.C0708a c0708a, Continuation<? super OgvPayBarUIComponentService$create$1> continuation) {
        super(1, continuation);
        this.this$0 = ogvPayBarUIComponentService;
        this.$payBarVm = c0708a;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OgvPayBarUIComponentService$create$1(this.this$0, this.$payBarVm, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$payBarVm, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
