package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.droid.BVCompat;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.videopage.common.widget.view.ExpandableTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcIntroductionComponent.class */
@StabilityInferred(parameters = 0)
public final class UgcIntroductionComponent implements UIComponent<com.bilibili.app.gemini.ui.n<Vu0.B>> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f97270m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UgcHeadlineService.b f97271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f97272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f97273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public CharSequence f97274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public SpannableStringBuilder f97275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public CharSequence f97276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public WeakReference<yh1.c> f97277g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Drawable f97278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ExpandableTextView.e f97279j = new ExpandableTextView.c();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ExpandableTextView.e f97280k = new ExpandableTextView.c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f97281l = new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new Df.i(this, 4));

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent$bindToView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcIntroductionComponent$bindToView$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        Object result;
        final UgcIntroductionComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcIntroductionComponent ugcIntroductionComponent, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = ugcIntroductionComponent;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.bindToView(null, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent$bindToView$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcIntroductionComponent$bindToView$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
        final com.bilibili.app.gemini.ui.n<Vu0.B> $viewEntry;
        private Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        final UgcIntroductionComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent$bindToView$2$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcIntroductionComponent$bindToView$2$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final ConstraintLayout $root;
            int label;
            final UgcIntroductionComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent$bindToView$2$3$1, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcIntroductionComponent$bindToView$2$3$1.class */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
                final ConstraintLayout $root;
                int I$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(ConstraintLayout constraintLayout, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$root = constraintLayout;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$root, continuation);
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
                    int iDpToPx = DimenUtilsKt.dpToPx(this.I$0);
                    ConstraintLayout constraintLayout = this.$root;
                    constraintLayout.setPadding(iDpToPx, constraintLayout.getPaddingTop(), iDpToPx, this.$root.getPaddingBottom());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(UgcIntroductionComponent ugcIntroductionComponent, ConstraintLayout constraintLayout, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = ugcIntroductionComponent;
                this.$root = constraintLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$root, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Integer> stateFlow = this.this$0.f97272b;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$root, null);
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent$bindToView$2$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcIntroductionComponent$bindToView$2$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final TintTextView $online;
            int label;
            final UgcIntroductionComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent$bindToView$2$4$1, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcIntroductionComponent$bindToView$2$4$1.class */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
                final TintTextView $online;
                Object L$0;
                int label;
                final UgcIntroductionComponent this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(UgcIntroductionComponent ugcIntroductionComponent, TintTextView tintTextView, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = ugcIntroductionComponent;
                    this.$online = tintTextView;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$online, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return create(str, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    String str = (String) this.L$0;
                    defpackage.a.b("[theseus-ugc-UgcIntroductionComponent$bindToView$2$4$1-invokeSuspend] ", C4496a.a("onlineTextFlow: ", str), "UgcIntroductionComponent$bindToView$2$4$1-invokeSuspend");
                    UgcIntroductionComponent.c(this.this$0, this.$online, str);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(UgcIntroductionComponent ugcIntroductionComponent, TintTextView tintTextView, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = ugcIntroductionComponent;
                this.$online = tintTextView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$online, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    UgcIntroductionComponent ugcIntroductionComponent = this.this$0;
                    UgcHeadlineService.b bVar = ugcIntroductionComponent.f97271a;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(ugcIntroductionComponent, this.$online, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(bVar.f97259d, anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent$bindToView$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcIntroductionComponent$bindToView$2$a.class */
        public static final class a extends ExpandableTextView.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UgcIntroductionComponent f97294a;

            public a(UgcIntroductionComponent ugcIntroductionComponent) {
                this.f97294a = ugcIntroductionComponent;
            }

            public final void a(boolean z6) {
                UgcHeadlineService.b bVar = this.f97294a.f97271a;
            }

            public final void b(boolean z6) {
                this.f97294a.f97271a.f97257b.f97244g.f97377g.setValue(Boolean.valueOf(z6));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(com.bilibili.app.gemini.ui.n<Vu0.B> nVar, UgcIntroductionComponent ugcIntroductionComponent, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$viewEntry = nVar;
            this.this$0 = ugcIntroductionComponent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r14v0 */
        /* JADX WARN: Type inference failed for: r14v1 */
        /* JADX WARN: Type inference failed for: r14v2, types: [android.text.SpannableString] */
        public static final CharSequence invokeSuspend$lambda$2(UgcIntroductionComponent ugcIntroductionComponent, Context context, CharSequence charSequence, boolean z6) {
            UgcHeadlineService ugcHeadlineService;
            ?? spannableString = charSequence;
            if (z6) {
                int i7 = UgcIntroductionComponent.f97270m;
                ugcIntroductionComponent.getClass();
                spannableString = new SpannableString(charSequence);
                Iterator it = ((ArrayList) BVCompat.c(charSequence)).iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    UgcHeadlineService.b bVar = ugcIntroductionComponent.f97271a;
                    ugcHeadlineService = bVar.f97257b;
                    if (!zHasNext) {
                        break;
                    }
                    BVCompat.b bVar2 = (BVCompat.b) it.next();
                    int i8 = bVar2.b;
                    int i9 = bVar2.c + 1;
                    String strA = C3751q.a(bVar.a(), "AV");
                    String str = bVar2.d;
                    if (!TextUtils.equals(strA, str) && !TextUtils.equals(bVar.b(), str)) {
                        spannableString.setSpan(new s(bVar2, ugcIntroductionComponent, str), i8, i9, 33);
                        Integer numH = ugcHeadlineService.f97245i.h();
                        spannableString.setSpan(new ForegroundColorSpan(numH != null ? numH.intValue() : ThemeUtils.getColorById(context, R$color.Lb6_u)), i8, i9, 18);
                    }
                }
                Pattern pattern = (Pattern) sh1.f.a.getValue();
                if (pattern != null) {
                    Matcher matcher = pattern.matcher(charSequence);
                    while (matcher.find()) {
                        String strGroup = matcher.group();
                        int iStart = matcher.start();
                        int iEnd = matcher.end();
                        Integer numH2 = ugcHeadlineService.f97245i.h();
                        int iIntValue = numH2 != null ? numH2.intValue() : ThemeUtils.getColorById(context, R$color.Lb6_u);
                        spannableString.setSpan(new URLSpan(strGroup), iStart, iEnd, 33);
                        spannableString.setSpan(new ForegroundColorSpan(iIntValue), iStart, iEnd, 18);
                    }
                }
            }
            return spannableString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.Object invokeSuspend$updateIcons(android.widget.TextView r13, com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent r14, com.bilibili.magicasakura.widgets.TintTextView r15, android.widget.TextView r16, androidx.constraintlayout.widget.ConstraintLayout r17, android.content.Context r18, kotlinx.coroutines.CoroutineScope r19, com.bilibili.magicasakura.widgets.TintTextView r20, com.bilibili.magicasakura.widgets.TintTextView r21, com.bilibili.magicasakura.widgets.TintTextView r22, com.bilibili.magicasakura.widgets.TintTextView r23, com.bilibili.magicasakura.widgets.TintTextView r24, tv.danmaku.bili.videopage.common.widget.view.ExpandableTextView r25, kotlin.coroutines.Continuation<? super kotlin.Unit> r26) {
            /*
                Method dump skipped, instruction units count: 1018
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent.AnonymousClass2.invokeSuspend$updateIcons(android.widget.TextView, com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent, com.bilibili.magicasakura.widgets.TintTextView, android.widget.TextView, androidx.constraintlayout.widget.ConstraintLayout, android.content.Context, kotlinx.coroutines.CoroutineScope, com.bilibili.magicasakura.widgets.TintTextView, com.bilibili.magicasakura.widgets.TintTextView, com.bilibili.magicasakura.widgets.TintTextView, com.bilibili.magicasakura.widgets.TintTextView, com.bilibili.magicasakura.widgets.TintTextView, tv.danmaku.bili.videopage.common.widget.view.ExpandableTextView, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$viewEntry, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:112:0x05e0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1561
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public UgcIntroductionComponent(@NotNull UgcHeadlineService.b bVar, @NotNull StateFlow stateFlow) {
        this.f97271a = bVar;
        this.f97272b = stateFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0b2f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0b35  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(final com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent r23, android.content.Context r24, tv.danmaku.bili.videopage.common.widget.view.ExpandableTextView r25, int r26, int r27, boolean r28, final android.widget.TextView r29, android.widget.TextView r30, android.widget.TextView[] r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
        /*
            Method dump skipped, instruction units count: 4138
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent.a(com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent, android.content.Context, tv.danmaku.bili.videopage.common.widget.view.ExpandableTextView, int, int, boolean, android.widget.TextView, android.widget.TextView, android.widget.TextView[], kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent r5, android.view.View r6, java.lang.String r7, int r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent.b(com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent, android.view.View, java.lang.String, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void c(UgcIntroductionComponent ugcIntroductionComponent, TextView textView, String str) {
        ugcIntroductionComponent.getClass();
        defpackage.a.b("[theseus-ugc-UgcIntroductionComponent-updateOnlineInfo] ", "updateOnlineInfo: " + str, "UgcIntroductionComponent-updateOnlineInfo");
        if (!ugcIntroductionComponent.f97271a.g() || str == null || str.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new com.bilibili.app.gemini.ui.n(Vu0.B.inflate(LayoutInflater.from(context), viewGroup, false));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object bindToView(@org.jetbrains.annotations.NotNull com.bilibili.app.gemini.ui.n<Vu0.B> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) throws kotlin.KotlinNothingValueException {
        /*
            r6 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent.AnonymousClass1
            if (r0 == 0) goto L29
            r0 = r8
            com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent$bindToView$1 r0 = (com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent.AnonymousClass1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r8 = r0
            goto L33
        L29:
            com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent$bindToView$1 r0 = new com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent$bindToView$1
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L33:
            r0 = r8
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L5e
            r0 = r9
            r1 = 1
            if (r0 == r1) goto L56
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L56:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            goto L80
        L5e:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent$bindToView$2 r0 = new com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent$bindToView$2
            r1 = r0
            r2 = r7
            r3 = r6
            r4 = 0
            r1.<init>(r2, r3, r4)
            r7 = r0
            r0 = r8
            r1 = 1
            r0.label = r1
            r0 = r7
            r1 = r8
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r1 = r10
            if (r0 != r1) goto L80
            r0 = r10
            return r0
        L80:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent.bindToView(com.bilibili.app.gemini.ui.n, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
