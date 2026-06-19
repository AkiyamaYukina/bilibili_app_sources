package com.bilibili.ship.theseus.ugc.intro.upcenter;

import K7.L;
import Vu0.H;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.app.gemini.ui.n;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintImageView;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent.class */
@StabilityInferred(parameters = 0)
public final class UgcUpCenterUIComponent implements UIComponent<n<H>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f97523f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Flow<b> f97524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f97525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<a> f97526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SharedFlow<a> f97527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f97528e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$AnimType.class */
    public static final class AnimType {
        private static final EnumEntries $ENTRIES;
        private static final AnimType[] $VALUES;
        public static final AnimType NONE = new AnimType("NONE", 0);
        public static final AnimType EXPAND = new AnimType("EXPAND", 1);
        public static final AnimType FOLD = new AnimType("FOLD", 2);

        private static final /* synthetic */ AnimType[] $values() {
            return new AnimType[]{NONE, EXPAND, FOLD};
        }

        static {
            AnimType[] animTypeArr$values = $values();
            $VALUES = animTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(animTypeArr$values);
        }

        private AnimType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<AnimType> getEntries() {
            return $ENTRIES;
        }

        public static AnimType valueOf(String str) {
            return (AnimType) Enum.valueOf(AnimType.class, str);
        }

        public static AnimType[] values() {
            return (AnimType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$a.class */
    @StabilityInferred(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterUIComponent$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0875a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0875a f97529a = new a();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f97530a = new a();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$a$c.class */
        @StabilityInferred(parameters = 1)
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f97531a = new a();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$a$d.class */
        @StabilityInferred(parameters = 1)
        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f97532a = new a();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$a$e.class */
        @StabilityInferred(parameters = 1)
        public static final class e extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f97533a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final String f97534b;

            public e(int i7, @NotNull String str) {
                this.f97533a = i7;
                this.f97534b = str;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return this.f97533a == eVar.f97533a && Intrinsics.areEqual(this.f97534b, eVar.f97534b);
            }

            public final int hashCode() {
                return this.f97534b.hashCode() + (Integer.hashCode(this.f97533a) * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("OnTabSelected(index=");
                sb.append(this.f97533a);
                sb.append(", title=");
                return C8770a.a(sb, this.f97534b, ")");
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f97535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f97536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f97537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final List<c> f97538d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final AnimType f97539e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f97540f;

        public b() {
            this(0);
        }

        public /* synthetic */ b(int i7) {
            this(true, 0, true, CollectionsKt.emptyList(), AnimType.NONE, 0);
        }

        public b(boolean z6, int i7, boolean z7, @NotNull List<c> list, @NotNull AnimType animType, int i8) {
            this.f97535a = z6;
            this.f97536b = i7;
            this.f97537c = z7;
            this.f97538d = list;
            this.f97539e = animType;
            this.f97540f = i8;
        }

        public static b a(b bVar, boolean z6, int i7, boolean z7, List list, AnimType animType, int i8, int i9) {
            if ((i9 & 1) != 0) {
                z6 = bVar.f97535a;
            }
            if ((i9 & 2) != 0) {
                i7 = bVar.f97536b;
            }
            if ((i9 & 4) != 0) {
                z7 = bVar.f97537c;
            }
            if ((i9 & 8) != 0) {
                list = bVar.f97538d;
            }
            if ((i9 & 16) != 0) {
                animType = bVar.f97539e;
            }
            if ((i9 & 32) != 0) {
                i8 = bVar.f97540f;
            }
            bVar.getClass();
            return new b(z6, i7, z7, list, animType, i8);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f97535a == bVar.f97535a && this.f97536b == bVar.f97536b && this.f97537c == bVar.f97537c && Intrinsics.areEqual(this.f97538d, bVar.f97538d) && this.f97539e == bVar.f97539e && this.f97540f == bVar.f97540f;
        }

        public final int hashCode() {
            int iA = e0.a(z.a(I.a(this.f97536b, Boolean.hashCode(this.f97535a) * 31, 31), 31, this.f97537c), 31, this.f97538d);
            return Integer.hashCode(this.f97540f) + ((this.f97539e.hashCode() + iA) * 31);
        }

        @NotNull
        public final String toString() {
            List<c> list = this.f97538d;
            StringBuilder sb = new StringBuilder("State(expand=");
            sb.append(this.f97535a);
            sb.append(", curTabIndex=");
            sb.append(this.f97536b);
            sb.append(", helpIconVisible=");
            L.b(sb, this.f97537c, ", views=", list, ", animType=");
            sb.append(this.f97539e);
            sb.append(", contentHeight=");
            return C4277b.a(this.f97540f, ")", sb);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterUIComponent$bindToView$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$bindToView$2.class */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final H $binding;
        final Context $context;
        final ConstraintLayout $root;
        final n<H> $viewEntry;
        private Object L$0;
        int label;
        final UgcUpCenterUIComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterUIComponent$bindToView$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$bindToView$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final H $binding;
            final ConstraintLayout $root;
            int label;
            final UgcUpCenterUIComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterUIComponent$bindToView$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$bindToView$2$1$1.class */
            public static final class C08761 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
                final H $binding;
                final ConstraintLayout $root;
                int I$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08761(H h, ConstraintLayout constraintLayout, Continuation<? super C08761> continuation) {
                    super(2, continuation);
                    this.$binding = h;
                    this.$root = constraintLayout;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C08761 c08761 = new C08761(this.$binding, this.$root, continuation);
                    c08761.I$0 = ((Number) obj).intValue();
                    return c08761;
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
                    int iDpToPx = DimenUtilsKt.dpToPx(i7 - 12);
                    int iDpToPx2 = DimenUtilsKt.dpToPx(i7);
                    this.$binding.f25829g.setPadding(iDpToPx, this.$root.getPaddingTop(), iDpToPx, this.$root.getPaddingBottom());
                    this.$binding.f25825c.setPadding(iDpToPx2, this.$root.getPaddingTop(), iDpToPx2, this.$root.getPaddingBottom());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UgcUpCenterUIComponent ugcUpCenterUIComponent, H h, ConstraintLayout constraintLayout, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ugcUpCenterUIComponent;
                this.$binding = h;
                this.$root = constraintLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$binding, this.$root, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Integer> stateFlow = this.this$0.f97525b;
                    C08761 c08761 = new C08761(this.$binding, this.$root, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c08761, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterUIComponent$bindToView$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$bindToView$2$2.class */
        public static final class C08772 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final H $binding;
            int label;
            final UgcUpCenterUIComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterUIComponent$bindToView$2$2$1, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$bindToView$2$2$1.class */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
                int label;
                final UgcUpCenterUIComponent this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(UgcUpCenterUIComponent ugcUpCenterUIComponent, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = ugcUpCenterUIComponent;
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
                    this.this$0.f97526c.tryEmit(a.c.f97531a);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08772(H h, UgcUpCenterUIComponent ugcUpCenterUIComponent, Continuation<? super C08772> continuation) {
                super(2, continuation);
                this.$binding = h;
                this.this$0 = ugcUpCenterUIComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08772(this.$binding, this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowA = UIComponentExtKt.a(this.$binding.f25827e);
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterUIComponent$bindToView$2$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$bindToView$2$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final H $binding;
            final Context $context;
            final n<H> $viewEntry;
            private Object L$0;
            int label;
            final UgcUpCenterUIComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterUIComponent$bindToView$2$3$1, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$bindToView$2$3$1.class */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<b, Continuation<? super Unit>, Object> {
                final CoroutineScope $$this$launch;
                final H $binding;
                final Context $context;
                final n<H> $viewEntry;
                Object L$0;
                int label;
                final UgcUpCenterUIComponent this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterUIComponent$bindToView$2$3$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$bindToView$2$3$1$1.class */
                public static final class C08781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final H $binding;
                    final ValueAnimator $expandAnim;
                    int label;
                    final UgcUpCenterUIComponent this$0;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterUIComponent$bindToView$2$3$1$1$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$bindToView$2$3$1$1$1.class */
                    public static final class C08791 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
                        final ValueAnimator $expandAnim;
                        int label;
                        final UgcUpCenterUIComponent this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C08791(ValueAnimator valueAnimator, UgcUpCenterUIComponent ugcUpCenterUIComponent, Continuation<? super C08791> continuation) {
                            super(2, continuation);
                            this.$expandAnim = valueAnimator;
                            this.this$0 = ugcUpCenterUIComponent;
                        }

                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C08791(this.$expandAnim, this.this$0, continuation);
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
                            AnonymousClass1.invokeSuspend$onClickExpand(this.$expandAnim, this.this$0);
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C08781(H h, ValueAnimator valueAnimator, UgcUpCenterUIComponent ugcUpCenterUIComponent, Continuation<? super C08781> continuation) {
                        super(2, continuation);
                        this.$binding = h;
                        this.$expandAnim = valueAnimator;
                        this.this$0 = ugcUpCenterUIComponent;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C08781(this.$binding, this.$expandAnim, this.this$0, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            Flow flowA = UIComponentExtKt.a(this.$binding.f25826d);
                            C08791 c08791 = new C08791(this.$expandAnim, this.this$0, null);
                            this.label = 1;
                            if (FlowKt.collectLatest(flowA, c08791, this) == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterUIComponent$bindToView$2$3$1$a */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$bindToView$2$3$1$a.class */
                public static final /* synthetic */ class a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final int[] f97541a;

                    static {
                        int[] iArr = new int[AnimType.values().length];
                        try {
                            iArr[AnimType.EXPAND.ordinal()] = 1;
                        } catch (NoSuchFieldError e7) {
                        }
                        try {
                            iArr[AnimType.FOLD.ordinal()] = 2;
                        } catch (NoSuchFieldError e8) {
                        }
                        try {
                            iArr[AnimType.NONE.ordinal()] = 3;
                        } catch (NoSuchFieldError e9) {
                        }
                        f97541a = iArr;
                    }
                }

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterUIComponent$bindToView$2$3$1$b */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$bindToView$2$3$1$b.class */
                public static final class b extends AnimatorListenerAdapter {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final UgcUpCenterUIComponent f97542a;

                    public b(UgcUpCenterUIComponent ugcUpCenterUIComponent) {
                        this.f97542a = ugcUpCenterUIComponent;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        this.f97542a.f97526c.tryEmit(a.C0875a.f97529a);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator, boolean z6) {
                        this.f97542a.f97526c.tryEmit(a.C0875a.f97529a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(H h, UgcUpCenterUIComponent ugcUpCenterUIComponent, CoroutineScope coroutineScope, n<H> nVar, Context context, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$binding = h;
                    this.this$0 = ugcUpCenterUIComponent;
                    this.$$this$launch = coroutineScope;
                    this.$viewEntry = nVar;
                    this.$context = context;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void invokeSuspend$onClickExpand(ValueAnimator valueAnimator, UgcUpCenterUIComponent ugcUpCenterUIComponent) {
                    if (valueAnimator.isRunning()) {
                        BLog.i("UgcUpCenterUIComponent$bindToView$2$3$1-invokeSuspend$onClickExpand", "[theseus-ugc-UgcUpCenterUIComponent$bindToView$2$3$1-invokeSuspend$onClickExpand] anim is running");
                    } else {
                        ugcUpCenterUIComponent.f97526c.tryEmit(a.b.f97530a);
                    }
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.this$0, this.$$this$launch, this.$viewEntry, this.$context, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                public final Object invoke(b bVar, Continuation<? super Unit> continuation) {
                    return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    ValueAnimator valueAnimatorOfInt;
                    int i7;
                    Throwable th;
                    ValueAnimator valueAnimator;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i8 = this.label;
                    if (i8 == 0) {
                        ResultKt.throwOnFailure(obj);
                        b bVar = (b) this.L$0;
                        defpackage.a.b("[theseus-ugc-UgcUpCenterUIComponent$bindToView$2$3$1-invokeSuspend] ", "stateFlow -> " + bVar, "UgcUpCenterUIComponent$bindToView$2$3$1-invokeSuspend");
                        final int paddingBottom = this.$binding.f25825c.getPaddingBottom() + this.$binding.f25825c.getPaddingTop() + bVar.f97540f;
                        UgcUpCenterUIComponent ugcUpCenterUIComponent = this.this$0;
                        final LinearLayout linearLayout = this.$binding.f25825c;
                        b bVar2 = new b(this.this$0);
                        int i9 = UgcUpCenterUIComponent.f97523f;
                        ugcUpCenterUIComponent.getClass();
                        valueAnimatorOfInt = ValueAnimator.ofInt(0, paddingBottom);
                        valueAnimatorOfInt.setDuration(300L);
                        final boolean z6 = false;
                        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(linearLayout, paddingBottom, z6) { // from class: com.bilibili.ship.theseus.ugc.intro.upcenter.g

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final boolean f97561a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final int f97562b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final View f97563c;

                            {
                                this.f97561a = z6;
                                this.f97562b = paddingBottom;
                                this.f97563c = linearLayout;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                boolean z7 = this.f97561a;
                                int i10 = this.f97562b;
                                View view = this.f97563c;
                                Object animatedValue = valueAnimator2.getAnimatedValue();
                                Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                                if (num != null) {
                                    int iIntValue = num.intValue();
                                    int i11 = iIntValue;
                                    if (z7) {
                                        i11 = i10 - iIntValue;
                                    }
                                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                    if (layoutParams == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    }
                                    layoutParams.height = i11;
                                    view.setLayoutParams(layoutParams);
                                }
                            }
                        });
                        valueAnimatorOfInt.addListener(bVar2);
                        BuildersKt.launch$default(this.$$this$launch, (CoroutineContext) null, (CoroutineStart) null, new C08781(this.$binding, valueAnimatorOfInt, this.this$0, null), 3, (Object) null);
                        int height = this.$binding.f25824b.getHeight();
                        int i10 = bVar.f97540f;
                        if (height != i10) {
                            FrameLayout frameLayout = this.$binding.f25824b;
                            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            }
                            layoutParams.height = i10;
                            frameLayout.setLayoutParams(layoutParams);
                        }
                        if (bVar.f97538d.isEmpty()) {
                            this.$viewEntry.a.getRoot().getLayoutParams().height = 0;
                            return Unit.INSTANCE;
                        }
                        if (bVar.f97535a) {
                            this.$binding.f25826d.setRotation(180.0f);
                            ViewGroup.LayoutParams layoutParams2 = this.$binding.f25825c.getLayoutParams();
                            if (layoutParams2 != null) {
                                layoutParams2.height = paddingBottom;
                            }
                        } else {
                            this.$binding.f25826d.setRotation(0.0f);
                            ViewGroup.LayoutParams layoutParams3 = this.$binding.f25825c.getLayoutParams();
                            if (layoutParams3 != null) {
                                layoutParams3.height = 0;
                            }
                        }
                        TintImageView tintImageView = this.$binding.f25827e;
                        Context context = this.$context;
                        tintImageView.setVisibility(bVar.f97537c ? 0 : 8);
                        if (MultipleThemeUtils.isNightTheme(context)) {
                            tintImageView.setImageTintList(2131104027);
                        }
                        this.$binding.h.removeAllViews();
                        this.$binding.f25824b.removeAllViews();
                        List<c> list = bVar.f97538d;
                        Context context2 = this.$context;
                        H h = this.$binding;
                        CoroutineScope coroutineScope = this.$$this$launch;
                        UgcUpCenterUIComponent ugcUpCenterUIComponent2 = this.this$0;
                        Iterator<T> it = list.iterator();
                        int i11 = 0;
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            i7 = bVar.f97536b;
                            if (!zHasNext) {
                                break;
                            }
                            Object next = it.next();
                            if (i11 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            c cVar = (c) next;
                            boolean z7 = i7 == i11;
                            AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
                            appCompatTextView.setText(cVar.f97543a);
                            appCompatTextView.setTextSize(z7 ? 14.0f : 12.0f);
                            appCompatTextView.setTextColor(ThemeUtils.getColorById(context2, z7 ? R$color.Text1 : R$color.Text2));
                            appCompatTextView.setGravity(17);
                            appCompatTextView.setTypeface(z7 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
                            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
                            layoutParams4.setMargins(i11 == 0 ? NewPlayerUtilsKt.toPx(12.0f) : 0, 0, NewPlayerUtilsKt.toPx(16.0f), 0);
                            appCompatTextView.setLayoutParams(layoutParams4);
                            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UgcUpCenterUIComponent$bindToView$2$3$1$4$tabView$1$2(appCompatTextView, ugcUpCenterUIComponent2, i11, cVar, bVar, valueAnimatorOfInt, null), 3, (Object) null);
                            ViewParent parent = appCompatTextView.getParent();
                            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                            if (viewGroup != null) {
                                viewGroup.removeView(appCompatTextView);
                            }
                            h.h.addView(appCompatTextView);
                            i11++;
                        }
                        c cVar2 = (c) CollectionsKt.getOrNull(bVar.f97538d, i7);
                        if (cVar2 != null) {
                            H h7 = this.$binding;
                            ViewParent parent2 = cVar2.f97544b.getParent();
                            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(cVar2.f97544b);
                            }
                            h7.f25824b.addView(cVar2.f97544b);
                        }
                        int i12 = a.f97541a[bVar.f97539e.ordinal()];
                        if (i12 == 1) {
                            valueAnimatorOfInt.start();
                        } else if (i12 == 2) {
                            valueAnimatorOfInt.reverse();
                        } else if (i12 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        try {
                            this.L$0 = valueAnimatorOfInt;
                            this.label = 1;
                            if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            valueAnimatorOfInt.cancel();
                            throw th;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ValueAnimator valueAnimator2 = (ValueAnimator) this.L$0;
                        valueAnimator = valueAnimator2;
                        try {
                            ResultKt.throwOnFailure(obj);
                            valueAnimatorOfInt = valueAnimator2;
                        } catch (Throwable th3) {
                            th = th3;
                            valueAnimatorOfInt = valueAnimator;
                            valueAnimatorOfInt.cancel();
                            throw th;
                        }
                    }
                    ValueAnimator valueAnimator3 = valueAnimatorOfInt;
                    valueAnimator = valueAnimatorOfInt;
                    throw new KotlinNothingValueException();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(UgcUpCenterUIComponent ugcUpCenterUIComponent, H h, n<H> nVar, Context context, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = ugcUpCenterUIComponent;
                this.$binding = h;
                this.$viewEntry = nVar;
                this.$context = context;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$binding, this.$viewEntry, this.$context, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
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
                    UgcUpCenterUIComponent ugcUpCenterUIComponent = this.this$0;
                    Flow<b> flow = ugcUpCenterUIComponent.f97524a;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, ugcUpCenterUIComponent, coroutineScope, this.$viewEntry, this.$context, null);
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterUIComponent$bindToView$2$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$bindToView$2$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final H $binding;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(H h, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$binding = h;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$binding, continuation);
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
                    this.$binding.f25824b.removeAllViews();
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UgcUpCenterUIComponent ugcUpCenterUIComponent, H h, ConstraintLayout constraintLayout, n<H> nVar, Context context, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ugcUpCenterUIComponent;
            this.$binding = h;
            this.$root = constraintLayout;
            this.$viewEntry = nVar;
            this.$context = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$binding, this.$root, this.$viewEntry, this.$context, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$binding, this.$root, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C08772(this.$binding, this.this$0, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$binding, this.$viewEntry, this.$context, null), 3, (Object) null);
            return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.$binding, null), 3, (Object) null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f97543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final View f97544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ExtType f97545c;

        public c(@NotNull String str, @NotNull View view, @NotNull ExtType extType) {
            this.f97543a = str;
            this.f97544b = view;
            this.f97545c = extType;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f97543a, cVar.f97543a) && Intrinsics.areEqual(this.f97544b, cVar.f97544b) && this.f97545c == cVar.f97545c;
        }

        public final int hashCode() {
            int iHashCode = this.f97543a.hashCode();
            return this.f97545c.hashCode() + ((this.f97544b.hashCode() + (iHashCode * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "ViewItem(title=" + this.f97543a + ", view=" + this.f97544b + ", type=" + this.f97545c + ")";
        }
    }

    public UgcUpCenterUIComponent(@NotNull Flow<b> flow, @NotNull StateFlow<Integer> stateFlow) {
        this.f97524a = flow;
        this.f97525b = stateFlow;
        MutableSharedFlow<a> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(0, 3, BufferOverflow.DROP_OLDEST);
        this.f97526c = MutableSharedFlow;
        this.f97527d = FlowKt.asSharedFlow(MutableSharedFlow);
        this.f97528e = new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new f(this, 0));
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        n nVar = (n) viewEntry;
        ViewBinding viewBinding = nVar.a;
        H h = (H) viewBinding;
        ConstraintLayout constraintLayout = h.f25823a;
        Context context = viewBinding.getRoot().getContext();
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(h.f25823a, this.f97528e);
        h.f25828f.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(context.getResources(), R$color.f64616Wh0, null)));
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass2(this, h, constraintLayout, nVar, context, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new n(H.inflate(LayoutInflater.from(context), viewGroup, false));
    }
}
