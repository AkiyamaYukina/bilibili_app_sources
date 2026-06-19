package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.unit.Dp;
import com.bilibili.app.comm.list.common.utils.CommonExtensionKt;
import com.bilibili.app.comm.servercomm.ServerClock;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.bplus.im.conversation.E0;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.C6081b;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryComponent$bind$2;
import com.bilibili.ship.theseus.cheese.widget.ExpandableTextView;
import eu0.C6978A;
import eu0.C7007z;
import fu0.C7174A;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryComponent$bind$2.class */
final class CheesePrimaryComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final C7174A $binding;
    final Context $context;
    private Object L$0;
    int label;
    final C6081b this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7174A $binding;
        int label;
        final C6081b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryComponent$bind$2$1$1.class */
        public static final class C06141 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final C6081b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06141(C6081b c6081b, Continuation<? super C06141> continuation) {
                super(2, continuation);
                this.this$0 = c6081b;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06141(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f89713b.tryEmit(C6081b.a.C0617a.f89715a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C7174A c7174a, C6081b c6081b, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$binding = c7174a;
            this.this$0 = c6081b;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$binding, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$binding.f119407l);
                C06141 c06141 = new C06141(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, c06141, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7174A $binding;
        int label;
        final C6081b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryComponent$bind$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryComponent$bind$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final C6081b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C6081b c6081b, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = c6081b;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f89713b.tryEmit(C6081b.a.c.f89717a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C7174A c7174a, C6081b c6081b, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$binding = c7174a;
            this.this$0 = c6081b;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$binding, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$binding.f119401e);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryComponent$bind$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryComponent$bind$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7174A $binding;
        int label;
        final C6081b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryComponent$bind$2$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryComponent$bind$2$3$a.class */
        public static final class a extends ExpandableTextView.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C7174A f89588a;

            public a(C7174A c7174a) {
                this.f89588a = c7174a;
            }

            @Override // com.bilibili.ship.theseus.cheese.widget.ExpandableTextView.e
            public final void a(boolean z6) {
                C7174A c7174a = this.f89588a;
                if (z6) {
                    c7174a.f119406k.setMaxLines(Integer.MAX_VALUE);
                } else {
                    c7174a.f119406k.setMaxLines(2);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C7174A c7174a, C6081b c6081b, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$binding = c7174a;
            this.this$0 = c6081b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(C7174A c7174a, View view) {
            c7174a.f119405j.performClick();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(C6081b c6081b) {
            c6081b.f89713b.tryEmit(C6081b.a.f.f89720a);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3(C7174A c7174a, C6081b c6081b) {
            if (c7174a.f119407l.getText().length() > 0) {
                c6081b.f89713b.tryEmit(C6081b.a.d.f89718a);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public static final Unit invokeSuspend$lambda$4(final C6081b c6081b, Composer composer, int i7) {
            if (composer.shouldExecute((i7 & 3) != 2, i7 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1711445838, i7, -1, "com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryComponent.bind.<anonymous>.<anonymous>.<anonymous> (CheesePrimaryComponent.kt:176)");
                }
                BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(84842090, true, new Function2(c6081b) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.primary.h

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final C6081b f89738a;

                    {
                        this.f89738a = c6081b;
                    }

                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return CheesePrimaryComponent$bind$2.AnonymousClass3.invokeSuspend$lambda$4$0(this.f89738a, (Composer) obj, iIntValue);
                    }
                }, composer, 54), composer, 384, 3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:24:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x019b  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x01e6  */
        @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.Composable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final kotlin.Unit invokeSuspend$lambda$4$0(final com.bilibili.ship.theseus.cheese.biz.intro.primary.C6081b r12, androidx.compose.runtime.Composer r13, int r14) {
            /*
                Method dump skipped, instruction units count: 586
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryComponent$bind$2.AnonymousClass3.invokeSuspend$lambda$4$0(com.bilibili.ship.theseus.cheese.biz.intro.primary.b, androidx.compose.runtime.Composer, int):kotlin.Unit");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$4$0$0$0$0(C6081b c6081b, Map map) {
            c6081b.f89713b.tryEmit(new C6081b.a.i(map));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$4$0$0$1$0(C6081b c6081b, long j7, Map map) {
            c6081b.f89713b.tryEmit(new C6081b.a.h(j7, map));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$4$0$0$2$0(C6081b c6081b, RelatedCourses relatedCourses) {
            c6081b.f89713b.tryEmit(new C6081b.a.g(relatedCourses.f89654a));
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$binding, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                final C7174A c7174a = this.$binding;
                c7174a.f119406k.setOnClickListener(new View.OnClickListener(c7174a) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.primary.c

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final C7174A f89733a;

                    {
                        this.f89733a = c7174a;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CheesePrimaryComponent$bind$2.AnonymousClass3.invokeSuspend$lambda$0(this.f89733a, view);
                    }
                });
                C7174A c7174a2 = this.$binding;
                c7174a2.f119405j.setExpandListener(new a(c7174a2));
                C6081b c6081b = this.this$0;
                tv.danmaku.bili.videopage.common.widget.view.ExpandableTextView expandableTextView = this.$binding.f119406k;
                C6081b.C0619b c0619b = c6081b.f89712a;
                V v7 = c0619b.f89729d;
                List<S> list = c0619b.f89730e;
                this.label = 1;
                if (C6081b.e(c6081b, expandableTextView, v7.f89690a, list, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            a0 a0Var = this.this$0.f89712a.f89729d.f89692c;
            this.$binding.f119399c.setImageResource(Intrinsics.areEqual(a0Var.f89710d, "playtime-square-line@500") ? 2131235257 : 2131235038);
            this.$binding.f119409n.setText(a0Var.f89708b);
            List<X> list2 = this.this$0.f89712a.f89729d.f89694e.f89702b;
            if (list2.isEmpty()) {
                this.$binding.f119405j.setOriginText(new ExpandableTextView.b(this.this$0.f89712a.f89729d.f89691b));
            } else {
                String strP = CollectionsKt.p(list2, " · ", (CharSequence) null, (CharSequence) null, (Function1) new Object(), 30);
                if (strP.length() > 0) {
                    this.$binding.f119405j.setOriginText(new ExpandableTextView.b(strP));
                }
            }
            W w7 = this.this$0.f89712a.f89729d.f89693d;
            LinearLayout linearLayout = this.$binding.f119401e;
            U u7 = w7.f89698a;
            linearLayout.setVisibility((u7.f89688a.length() <= 0 || u7.f89689b.length() <= 0) ? 8 : 0);
            String str = u7.f89688a;
            boolean z6 = false;
            if (str.length() > 0) {
                z6 = false;
                if (u7.f89689b.length() > 0) {
                    z6 = true;
                }
            }
            E0 e02 = com.bilibili.ship.theseus.cheese.biz.report.c.f90463a;
            if (z6) {
                LinearLayout linearLayout2 = this.$binding.f119401e;
                final C6081b c6081b2 = this.this$0;
                ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(linearLayout2, new ExposureEntry(e02, new Function0(c6081b2) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.primary.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final C6081b f89734a;

                    {
                        this.f89734a = c6081b2;
                    }

                    public final Object invoke() {
                        return CheesePrimaryComponent$bind$2.AnonymousClass3.invokeSuspend$lambda$2(this.f89734a);
                    }
                }));
                this.$binding.f119410o.setText(str);
            }
            String str2 = this.this$0.f89712a.f89729d.f89695f.f89687a;
            if (str2.length() > 0) {
                this.$binding.f119408m.setText(str2);
            }
            final C7174A c7174a3 = this.$binding;
            TextView textView = c7174a3.f119407l;
            final C6081b c6081b3 = this.this$0;
            ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(textView, new ExposureEntry(e02, new Function0(c7174a3, c6081b3) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.primary.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C7174A f89735a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final C6081b f89736b;

                {
                    this.f89735a = c7174a3;
                    this.f89736b = c6081b3;
                }

                public final Object invoke() {
                    return CheesePrimaryComponent$bind$2.AnonymousClass3.invokeSuspend$lambda$3(this.f89735a, this.f89736b);
                }
            }));
            ComposeView composeView = this.$binding.f119398b;
            final C6081b c6081b4 = this.this$0;
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1711445838, true, new Function2(c6081b4) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.primary.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C6081b f89737a;

                {
                    this.f89737a = c6081b4;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return CheesePrimaryComponent$bind$2.AnonymousClass3.invokeSuspend$lambda$4(this.f89737a, (Composer) obj2, iIntValue);
                }
            }));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryComponent$bind$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryComponent$bind$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7174A $binding;
        int label;
        final C6081b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryComponent$bind$2$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryComponent$bind$2$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final C7174A $binding;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C7174A c7174a, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = c7174a;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, continuation);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = this.I$0;
                CommonExtensionKt.setMarginLeft(this.$binding.f119400d, DimenUtilsKt.dpToPx(i7));
                CommonExtensionKt.setMarginRight(this.$binding.f119400d, DimenUtilsKt.dpToPx(i7));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(C6081b c6081b, C7174A c7174a, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = c6081b;
            this.$binding = c7174a;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> stateFlow = this.this$0.f89712a.f89731f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryComponent$bind$2$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryComponent$bind$2$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7174A $binding;
        final Context $context;
        int label;
        final C6081b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryComponent$bind$2$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryComponent$bind$2$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7007z, Continuation<? super Unit>, Object> {
            final C7174A $binding;
            final Context $context;
            Object L$0;
            int label;
            final C6081b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C6081b c6081b, C7174A c7174a, Context context, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = c6081b;
                this.$binding = c7174a;
                this.$context = context;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public static final Unit invokeSuspend$lambda$0(final C6081b c6081b, final C7007z c7007z, Composer composer, int i7) {
                if (composer.shouldExecute((i7 & 3) != 2, i7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(454344088, i7, -1, "com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryComponent.bind.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheesePrimaryComponent.kt:238)");
                    }
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(804215520, true, new Function2(c6081b, c7007z) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.primary.m

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final C6081b f89745a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final C7007z f89746b;

                        {
                            this.f89745a = c6081b;
                            this.f89746b = c7007z;
                        }

                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return CheesePrimaryComponent$bind$2.AnonymousClass5.AnonymousClass1.invokeSuspend$lambda$0$0(this.f89745a, this.f89746b, (Composer) obj, iIntValue);
                        }
                    }, composer, 54), composer, 384, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public static final Unit invokeSuspend$lambda$0$0(C6081b c6081b, C7007z c7007z, Composer composer, int i7) {
                if (composer.shouldExecute((i7 & 3) != 2, i7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(804215520, i7, -1, "com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryComponent.bind.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheesePrimaryComponent.kt:239)");
                    }
                    Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m3880constructorimpl(60));
                    int i8 = C6081b.f89711d;
                    c6081b.c(c7007z, modifierM1358height3ABfNKs, composer, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$binding, this.$context, continuation);
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
                final C7007z c7007z = (C7007z) this.L$0;
                C6081b.C0619b c0619b = this.this$0.f89712a;
                if (!c0619b.f89729d.f89696g) {
                    this.$binding.f119400d.setVisibility(8);
                } else if (c0619b.f89726a) {
                    this.$binding.f119400d.setVisibility(0);
                    this.$binding.f119403g.setText(this.$context.getString(2131847508));
                    this.$binding.f119403g.setTextSize(16.0f);
                    this.$binding.f119407l.setVisibility(8);
                    this.$binding.f119411p.setVisibility(8);
                } else {
                    long j7 = c7007z.f117607g == 2 ? c7007z.f117612m : c7007z.f117613n;
                    if (c7007z.f117614o.length() > 0 && j7 * 1000 > ServerClock.unreliableNow()) {
                        this.$binding.f119400d.setVisibility(8);
                        ComposeView composeView = this.$binding.f119404i;
                        final C6081b c6081b = this.this$0;
                        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(454344088, true, new Function2(c6081b, c7007z) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.primary.l

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final C6081b f89743a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final C7007z f89744b;

                            {
                                this.f89743a = c6081b;
                                this.f89744b = c7007z;
                            }

                            public final Object invoke(Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return CheesePrimaryComponent$bind$2.AnonymousClass5.AnonymousClass1.invokeSuspend$lambda$0(this.f89743a, this.f89744b, (Composer) obj2, iIntValue);
                            }
                        }));
                        return Unit.INSTANCE;
                    }
                    C6978A c6978a = this.this$0.f89712a.f89728c;
                    this.$binding.f119400d.setVisibility(c6978a.f117487a.length() > 0 ? 0 : 8);
                    boolean zC = c7007z.c();
                    this.$binding.f119407l.setVisibility(zC ? 0 : 8);
                    this.$binding.f119402f.setVisibility(zC ? 0 : 8);
                    AppCompatTextView appCompatTextView = this.$binding.f119411p;
                    int i7 = 8;
                    if (zC) {
                        i7 = 0;
                    }
                    appCompatTextView.setVisibility(i7);
                    AppCompatTextView appCompatTextView2 = this.$binding.h;
                    String str = c6978a.f117487a;
                    appCompatTextView2.setText(str);
                    String str2 = c6978a.f117490d;
                    if (zC) {
                        this.$binding.f119411p.setText(c6978a.f117489c);
                        this.$binding.f119403g.setText(c6978a.f117488b);
                        this.$binding.f119402f.setText(str2 + str);
                    } else {
                        this.$binding.f119403g.setText(str2);
                    }
                    AppCompatTextView appCompatTextView3 = this.$binding.f119402f;
                    appCompatTextView3.setPaintFlags(appCompatTextView3.getPaintFlags() | 16);
                    int i8 = c7007z.f117607g;
                    if (i8 == 1 || i8 == 3) {
                        this.$binding.f119407l.setText(this.$context.getString(2131848870));
                    } else {
                        this.$binding.f119407l.setText(c7007z.f117611l);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(C6081b c6081b, C7174A c7174a, Context context, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = c6081b;
            this.$binding = c7174a;
            this.$context = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, this.$binding, this.$context, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                C6081b c6081b = this.this$0;
                StateFlow<C7007z> stateFlow = c6081b.f89712a.f89732g;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(c6081b, this.$binding, this.$context, null);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePrimaryComponent$bind$2(C7174A c7174a, C6081b c6081b, Context context, Continuation<? super CheesePrimaryComponent$bind$2> continuation) {
        super(2, continuation);
        this.$binding = c7174a;
        this.this$0 = c6081b;
        this.$context = context;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheesePrimaryComponent$bind$2 cheesePrimaryComponent$bind$2 = new CheesePrimaryComponent$bind$2(this.$binding, this.this$0, this.$context, continuation);
        cheesePrimaryComponent$bind$2.L$0 = obj;
        return cheesePrimaryComponent$bind$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$binding, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$binding, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$binding, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$binding, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, this.$binding, this.$context, null), 3, (Object) null);
    }
}
