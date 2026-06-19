package com.bilibili.ship.theseus.united.page.tab;

import By0.z1;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import androidx.compose.foundation.gestures.C3392f;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.z;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.lib.config.BLRemoteConfig;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.tab.TabPage;
import com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository;
import com.bilibili.ship.theseus.united.widget.UnitedTabLayout;
import com.bilibili.ship.theseus.united.widget.UnitedViewPager;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService.class */
@StabilityInferred(parameters = 0)
public final class TheseusTabPagerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f103132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Flow<c> f103133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final FragmentManager f103134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final b f103135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final u f103136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final i f103137g;

    @Nullable
    public final a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final PageReportService f103138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final TheseusPageUIStyleRepository f103139j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f103140k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f103141l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final o f103142m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final List<UIComponent<?>> f103143n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final TabControl f103144o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final p f103145p;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusTabPagerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            int label;
            final TheseusTabPagerService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$3$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$3$1$1.class */
            public static final class C11201 extends SuspendLambda implements Function2<c, Continuation<? super Unit>, Object> {
                Object L$0;
                int label;
                final TheseusTabPagerService this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$3$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$3$1$1$1.class */
                public static final class C11211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final c $views;
                    private Object L$0;
                    int label;
                    final TheseusTabPagerService this$0;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$3$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$3$1$1$1$1.class */
                    public static final class C11221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final c $views;
                        int label;
                        final TheseusTabPagerService this$0;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$3$1$1$1$1$2, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$3$1$1$1$1$2.class */
                        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Pair<? extends Boolean, ? extends String>, Continuation<? super Unit>, Object> {
                            final c $views;
                            Object L$0;
                            int label;
                            final TheseusTabPagerService this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass2(TheseusTabPagerService theseusTabPagerService, c cVar, Continuation<? super AnonymousClass2> continuation) {
                                super(2, continuation);
                                this.this$0 = theseusTabPagerService;
                                this.$views = cVar;
                            }

                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$views, continuation);
                                anonymousClass2.L$0 = obj;
                                return anonymousClass2;
                            }

                            public final Object invoke(Pair<Boolean, String> pair, Continuation<? super Unit> continuation) {
                                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                Pair pair = (Pair) this.L$0;
                                Boolean bool = (Boolean) pair.component1();
                                boolean zBooleanValue = bool.booleanValue();
                                String str = (String) pair.component2();
                                TheseusTabPagerService theseusTabPagerService = this.this$0;
                                ImageView imageView = this.$views.f103159b;
                                Integer num = theseusTabPagerService.f103135e.f103157c;
                                StringBuilder sbB = z.b("updateTabBackground, ", num, " ", str, " isWideScreen=");
                                sbB.append(zBooleanValue);
                                BLog.i("TheseusTabPagerService", sbB.toString());
                                Pair pair2 = TuplesKt.to(bool, str);
                                imageView.setTag(2131321868, pair2);
                                if (str == null || StringsKt.isBlank(str)) {
                                    imageView.setImageDrawable(null);
                                    if (num != null) {
                                        imageView.setBackgroundColor(num.intValue());
                                    } else {
                                        theseusTabPagerService.a(imageView);
                                    }
                                } else {
                                    BiliImageLoader.INSTANCE.acquire(imageView).useOrigin().asDrawable().url(str).submit().subscribe(new s(imageView, pair2, zBooleanValue, theseusTabPagerService));
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C11221(TheseusTabPagerService theseusTabPagerService, c cVar, Continuation<? super C11221> continuation) {
                            super(2, continuation);
                            this.this$0 = theseusTabPagerService;
                            this.$views = cVar;
                        }

                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C11221(this.this$0, this.$views, continuation);
                        }

                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i7 = this.label;
                            if (i7 == 0) {
                                ResultKt.throwOnFailure(obj);
                                final TheseusTabPagerService theseusTabPagerService = this.this$0;
                                final StateFlow<WindowSizeClass> stateFlow = theseusTabPagerService.f103140k.f102939c;
                                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Pair<? extends Boolean, ? extends String>>(stateFlow, theseusTabPagerService) { // from class: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$3$1$1$1$1$invokeSuspend$$inlined$map$1

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final Flow f103146a;

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final TheseusTabPagerService f103147b;

                                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$3$1$1$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$3$1$1$1$1$invokeSuspend$$inlined$map$1$2.class */
                                    public static final class AnonymousClass2<T> implements FlowCollector {

                                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                                        public final FlowCollector f103148a;

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final TheseusTabPagerService f103149b;

                                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$3$1$1$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$3$1$1$1$1$invokeSuspend$$inlined$map$1$2$1.class */
                                        public static final class AnonymousClass1 extends ContinuationImpl {
                                            Object L$0;
                                            int label;
                                            Object result;
                                            final AnonymousClass2 this$0;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                                                super(continuation);
                                                this.this$0 = anonymousClass2;
                                            }

                                            public final Object invokeSuspend(Object obj) {
                                                this.result = obj;
                                                this.label |= Integer.MIN_VALUE;
                                                return this.this$0.emit(null, this);
                                            }
                                        }

                                        public AnonymousClass2(FlowCollector flowCollector, TheseusTabPagerService theseusTabPagerService) {
                                            this.f103148a = flowCollector;
                                            this.f103149b = theseusTabPagerService;
                                        }

                                        /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
                                        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                                        */
                                        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                                            /*
                                                Method dump skipped, instruction units count: 224
                                                To view this dump change 'Code comments level' option to 'DEBUG'
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$3$1$1$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                                        }
                                    }

                                    {
                                        this.f103146a = stateFlow;
                                        this.f103147b = theseusTabPagerService;
                                    }

                                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                                        Object objCollect = this.f103146a.collect(new AnonymousClass2(flowCollector, this.f103147b), continuation);
                                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                                    }
                                });
                                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$views, null);
                                this.label = 1;
                                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11211(TheseusTabPagerService theseusTabPagerService, c cVar, Continuation<? super C11211> continuation) {
                        super(2, continuation);
                        this.this$0 = theseusTabPagerService;
                        this.$views = cVar;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C11211 c11211 = new C11211(this.this$0, this.$views, continuation);
                        c11211.L$0 = obj;
                        return c11211;
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C11221(this.this$0, this.$views, null), 3, (Object) null);
                            TheseusTabPagerService theseusTabPagerService = this.this$0;
                            c cVar = this.$views;
                            UnitedTabLayout unitedTabLayout = cVar.f103158a;
                            UnitedViewPager unitedViewPager = cVar.f103160c;
                            this.label = 1;
                            theseusTabPagerService.getClass();
                            BLog.i("TheseusTabPagerService", "initTabPager");
                            unitedViewPager.setOffscreenPageLimit(2);
                            unitedViewPager.setAdapter(theseusTabPagerService.f103145p);
                            BLog.i("TheseusTabPagerService-initTabPager", "[theseus-united-TheseusTabPagerService-initTabPager] ------adapter init------");
                            unitedTabLayout.setupWithViewPager(unitedViewPager);
                            Integer num = theseusTabPagerService.f103135e.f103156b;
                            unitedTabLayout.setSelectedTabIndicatorColor(num != null ? num.intValue() : ThemeUtils.getColorById(theseusTabPagerService.f103132b, 2131103284));
                            r rVar = new r(theseusTabPagerService);
                            unitedTabLayout.addOnTabSelectedListener(rVar);
                            q qVar = new q(theseusTabPagerService);
                            TabControl tabControl = theseusTabPagerService.f103144o;
                            if (tabControl == null || tabControl.e() || !tabControl.b()) {
                                unitedTabLayout.f104914a = -1;
                                unitedViewPager.f104916a = true;
                            } else {
                                unitedTabLayout.setDisableClickPosition(1);
                                unitedTabLayout.setDisableClickPositionListener(new z1(theseusTabPagerService, 2));
                                unitedViewPager.f104916a = false;
                            }
                            unitedViewPager.addOnPageChangeListener(qVar);
                            Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new TheseusTabPagerService$initTabPager$3(theseusTabPagerService, unitedTabLayout, unitedViewPager, rVar, qVar, null), this);
                            if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objCoroutineScope = Unit.INSTANCE;
                            }
                            if (objCoroutineScope == coroutine_suspended) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C11201(TheseusTabPagerService theseusTabPagerService, Continuation<? super C11201> continuation) {
                    super(2, continuation);
                    this.this$0 = theseusTabPagerService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C11201 c11201 = new C11201(this.this$0, continuation);
                    c11201.L$0 = obj;
                    return c11201;
                }

                public final Object invoke(c cVar, Continuation<? super Unit> continuation) {
                    return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        c cVar = (c) this.L$0;
                        if (cVar == null) {
                            return Unit.INSTANCE;
                        }
                        C11211 c11211 = new C11211(this.this$0, cVar, null);
                        this.label = 1;
                        if (CoroutineScopeKt.coroutineScope(c11211, this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TheseusTabPagerService theseusTabPagerService, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = theseusTabPagerService;
            }

            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Continuation<? super Unit> continuation) {
                return create(continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    TheseusTabPagerService theseusTabPagerService = this.this$0;
                    Flow<c> flow = theseusTabPagerService.f103133c;
                    C11201 c11201 = new C11201(theseusTabPagerService, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c11201, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TheseusTabPagerService theseusTabPagerService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = theseusTabPagerService;
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
                TheseusTabPagerService theseusTabPagerService = this.this$0;
                o oVar = theseusTabPagerService.f103142m;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(theseusTabPagerService, null);
                this.label = 1;
                if (oVar.a(anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusTabPagerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(TheseusTabPagerService theseusTabPagerService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = theseusTabPagerService;
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
                BLog.i("TheseusTabPagerService$4-invokeSuspend", "[theseus-united-TheseusTabPagerService$4-invokeSuspend] TabPagerService finally block, clear fragments");
                FragmentTransaction fragmentTransactionBeginTransaction = this.this$0.f103134d.beginTransaction();
                Set<Pair<Qj0.d, Fragment>> set = this.this$0.f103145p.f103203c;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add((Fragment) ((Pair) it.next()).getSecond());
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    fragmentTransactionBeginTransaction.remove((Fragment) it2.next());
                }
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
                p pVar = this.this$0.f103145p;
                defpackage.a.b("[theseus-united-TheseusPagerAdapter-clear] ", C3392f.a(pVar.f103203c.size(), "clear pager adapter, clear ", " fragments"), "TheseusPagerAdapter-clear");
                pVar.f103203c.clear();
                throw th;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final TabPage.LocatableTag f103154a;

        public a(@Nullable TabPage.LocatableTag locatableTag) {
            this.f103154a = locatableTag;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Integer f103155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Integer f103156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Integer f103157c;

        public b() {
            this(null, null, null);
        }

        public b(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
            this.f103155a = num;
            this.f103156b = num2;
            this.f103157c = num3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f103155a, bVar.f103155a) && Intrinsics.areEqual(this.f103156b, bVar.f103156b) && Intrinsics.areEqual(this.f103157c, bVar.f103157c);
        }

        public final int hashCode() {
            int iHashCode = 0;
            Integer num = this.f103155a;
            int iHashCode2 = num == null ? 0 : num.hashCode();
            Integer num2 = this.f103156b;
            int iHashCode3 = num2 == null ? 0 : num2.hashCode();
            Integer num3 = this.f103157c;
            if (num3 != null) {
                iHashCode = num3.hashCode();
            }
            return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("StyleConfig(textColor=");
            sb.append(this.f103155a);
            sb.append(", darkTextColor=");
            sb.append(this.f103156b);
            sb.append(", backgroundColor=");
            return e4.c.a(sb, this.f103157c, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final UnitedTabLayout f103158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ImageView f103159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final UnitedViewPager f103160c;

        public c(@NotNull UnitedTabLayout unitedTabLayout, @NotNull ImageView imageView, @NotNull UnitedViewPager unitedViewPager) {
            this.f103158a = unitedTabLayout;
            this.f103159b = imageView;
            this.f103160c = unitedViewPager;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$_init_$lambda$1$$inlined$map$1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int[], int[][]] */
    @Inject
    public TheseusTabPagerService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull Flow<c> flow, @NotNull FragmentManager fragmentManager, @NotNull b bVar, @NotNull u uVar, @NotNull i iVar, @Nullable a aVar, @NotNull PageReportService pageReportService, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull o oVar) {
        this.f103131a = coroutineScope;
        this.f103132b = context;
        this.f103133c = flow;
        this.f103134d = fragmentManager;
        this.f103135e = bVar;
        this.f103136f = uVar;
        this.f103137g = iVar;
        this.h = aVar;
        this.f103138i = pageReportService;
        this.f103139j = theseusPageUIStyleRepository;
        this.f103140k = aVar2;
        this.f103141l = introContentSizeRepository;
        this.f103142m = oVar;
        this.f103145p = new p(fragmentManager, iVar.f103191a);
        Integer num = bVar.f103155a;
        Integer num2 = bVar.f103156b;
        ColorStateList colorStateList = new ColorStateList(new int[]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{num2 != null ? num2.intValue() : ThemeUtils.getColorById(context, 2131103284), num != null ? num.intValue() : ThemeUtils.getColorById(context, 2131101245)});
        List<TabPage> list = iVar.f103191a;
        Iterator it = ((ArrayList) list).iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            TabPage.LocatableTag locatableTagB = ((TabPage) it.next()).b();
            a aVar3 = this.h;
            if (locatableTagB == (aVar3 != null ? aVar3.f103154a : null)) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 < 0 || i7 >= list.size()) {
            com.bilibili.bangumi.logic.page.detail.service.f.a("[theseus-united-TheseusTabPagerService-<init>] ", C3392f.a(i7, "Cannot locate to index ", "!"), "TheseusTabPagerService-<init>", (Throwable) null);
        } else {
            this.f103136f.f103213c.setValue(Integer.valueOf(i7));
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i8 = 0;
        for (Object obj : list) {
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TabPage tabPage = (TabPage) obj;
            TabControl tabControlD = tabPage.d();
            if (tabControlD != null) {
                this.f103144o = tabControlD;
            }
            arrayList.add(tabPage.c(new Flow<Boolean>(this.f103136f.f103214d, i8) { // from class: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$_init_$lambda$1$$inlined$map$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Flow f103150a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f103151b;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$_init_$lambda$1$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$_init_$lambda$1$$inlined$map$1$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f103152a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f103153b;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$_init_$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/TheseusTabPagerService$_init_$lambda$1$$inlined$map$1$2$1.class */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        Object result;
                        final AnonymousClass2 this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                            super(continuation);
                            this.this$0 = anonymousClass2;
                        }

                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return this.this$0.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, int i7) {
                        this.f103152a = flowCollector;
                        this.f103153b = i7;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                        /*
                            r5 = this;
                            r0 = r7
                            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$_init_$lambda$1$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L29
                            r0 = r7
                            com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$_init_$lambda$1$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$_init_$lambda$1$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            r10 = r0
                            r0 = r10
                            int r0 = r0.label
                            r8 = r0
                            r0 = r8
                            r1 = -2147483648(0xffffffff80000000, float:-0.0)
                            r0 = r0 & r1
                            if (r0 == 0) goto L29
                            r0 = r10
                            r1 = r8
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            int r1 = r1 + r2
                            r0.label = r1
                            r0 = r10
                            r7 = r0
                            goto L33
                        L29:
                            com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$_init_$lambda$1$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$_init_$lambda$1$$inlined$map$1$2$1
                            r1 = r0
                            r2 = r5
                            r3 = r7
                            r1.<init>(r2, r3)
                            r7 = r0
                        L33:
                            r0 = r7
                            java.lang.Object r0 = r0.result
                            r11 = r0
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            r10 = r0
                            r0 = r7
                            int r0 = r0.label
                            r8 = r0
                            r0 = r8
                            if (r0 == 0) goto L5e
                            r0 = r8
                            r1 = 1
                            if (r0 != r1) goto L54
                            r0 = r11
                            kotlin.ResultKt.throwOnFailure(r0)
                            goto L98
                        L54:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            r1 = r0
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r0
                        L5e:
                            r0 = r11
                            kotlin.ResultKt.throwOnFailure(r0)
                            r0 = r6
                            java.lang.Number r0 = (java.lang.Number) r0
                            int r0 = r0.intValue()
                            r1 = r5
                            int r1 = r1.f103153b
                            if (r0 != r1) goto L77
                            r0 = 1
                            r9 = r0
                            goto L7a
                        L77:
                            r0 = 0
                            r9 = r0
                        L7a:
                            r0 = r9
                            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                            r6 = r0
                            r0 = r7
                            r1 = 1
                            r0.label = r1
                            r0 = r5
                            kotlinx.coroutines.flow.FlowCollector r0 = r0.f103152a
                            r1 = r6
                            r2 = r7
                            java.lang.Object r0 = r0.emit(r1, r2)
                            r1 = r10
                            if (r0 != r1) goto L98
                            r0 = r10
                            return r0
                        L98:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService$_init_$lambda$1$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f103150a = flow;
                    this.f103151b = i8;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = this.f103150a.collect(new AnonymousClass2(flowCollector, this.f103151b), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, colorStateList, this.f103139j.f103503m));
            i8++;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((RunningUIComponent) it2.next()).a);
        }
        this.f103143n = arrayList2;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            BuildersKt.launch$default(this.f103131a, (CoroutineContext) null, (CoroutineStart) null, new TheseusTabPagerService$2$1((RunningUIComponent) it3.next(), null), 3, (Object) null);
        }
        BLog.i("TheseusTabPagerService", "init TabPagerService");
        BuildersKt.launch$default(this.f103131a, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new AnonymousClass3(this, null), 1, (Object) null);
        BuildersKt.launch$default(this.f103131a, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
    }

    public static final <T extends UIComponent.ViewEntry> Object b(TabLayout tabLayout, int i7, int i8, UIComponent<T> uIComponent, StateFlow<Integer> stateFlow, int i9, Continuation<? super Unit> continuation) {
        TabLayout.Tab tabNewTab = tabLayout.newTab();
        ViewCompat.setPaddingRelative(tabNewTab.view, (int) Uj0.c.a(((Number) stateFlow.getValue()).intValue(), tabLayout.getContext()), 0, (int) Uj0.c.a(((Number) stateFlow.getValue()).intValue(), tabLayout.getContext()), 0);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new TheseusTabPagerService$setTabUiComponent$bindTab$2(uIComponent, tabLayout, tabNewTab, i9, i8, i7, stateFlow, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public final void a(ImageView imageView) {
        imageView.setImageDrawable(null);
        int color = ContextCompat.getColor(this.f103132b, R$color.f64616Wh0);
        if (Cj0.a.a(this.f103132b)) {
            imageView.setBackgroundColor(color);
            return;
        }
        if (this.f103140k.f()) {
            imageView.setBackgroundColor(color);
            return;
        }
        try {
            imageView.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor(BLRemoteConfig.getInstance().getString("Interactive_bar_backcolor", "#F0F0F0")), color}));
        } catch (IllegalArgumentException e7) {
            imageView.setBackgroundColor(color);
        }
    }
}
