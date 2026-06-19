package com.bilibili.ship.theseus.ugc.endpage;

import I.E;
import Vu0.C2962a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import bo0.ViewOnClickListenerC5142l;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommon.utils.n;
import com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$showInterceptLayer$2$invokeSuspend$$inlined$map$1;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.bili.widget.text.FixedLineSpacingTextView;
import tv.danmaku.biliplayerv2.widget.AbsGroupWidget;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCAutoContinuousInterceptWidget.class */
@StabilityInferred(parameters = 0)
public final class UGCAutoContinuousInterceptWidget extends AbsGroupWidget {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final AutoContinuousInterceptService$showInterceptLayer$2$invokeSuspend$$inlined$map$1 f96462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<b> f96463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SharedFlow<b> f96464f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCAutoContinuousInterceptWidget$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f96465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f96466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f96467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f96468d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f96469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f96470f;

        public a(int i7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
            this.f96465a = str;
            this.f96466b = i7;
            this.f96467c = str2;
            this.f96468d = str3;
            this.f96469e = str4;
            this.f96470f = str5;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f96465a, aVar.f96465a) && this.f96466b == aVar.f96466b && Intrinsics.areEqual(this.f96467c, aVar.f96467c) && Intrinsics.areEqual(this.f96468d, aVar.f96468d) && Intrinsics.areEqual(this.f96469e, aVar.f96469e) && Intrinsics.areEqual(this.f96470f, aVar.f96470f);
        }

        public final int hashCode() {
            return this.f96470f.hashCode() + E.a(E.a(E.a(I.a(this.f96466b, this.f96465a.hashCode() * 31, 31), 31, this.f96467c), 31, this.f96468d), 31, this.f96469e);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("InterceptLayerCardInfo(title=");
            sb.append(this.f96465a);
            sb.append(", viewVtIcon=");
            sb.append(this.f96466b);
            sb.append(", author=");
            sb.append(this.f96467c);
            sb.append(", plays=");
            sb.append(this.f96468d);
            sb.append(", cover=");
            sb.append(this.f96469e);
            sb.append(", duration=");
            return C8770a.a(sb, this.f96470f, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCAutoContinuousInterceptWidget$b.class */
    public interface b {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCAutoContinuousInterceptWidget$b$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f96471a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -705426064;
            }

            @NotNull
            public final String toString() {
                return "Cancel";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.UGCAutoContinuousInterceptWidget$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCAutoContinuousInterceptWidget$b$b.class */
        @StabilityInferred(parameters = 1)
        public static final class C0819b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0819b f96472a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C0819b);
            }

            public final int hashCode() {
                return -272226595;
            }

            @NotNull
            public final String toString() {
                return "Replay";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCAutoContinuousInterceptWidget$b$c.class */
        @StabilityInferred(parameters = 1)
        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f96473a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1432699744;
            }

            @NotNull
            public final String toString() {
                return "ScheduleNext";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCAutoContinuousInterceptWidget$b$d.class */
        @StabilityInferred(parameters = 1)
        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f96474a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1116161495;
            }

            @NotNull
            public final String toString() {
                return "Share";
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCAutoContinuousInterceptWidget$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f96475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f96476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final a f96477c;

        public c(@NotNull String str, int i7, @NotNull a aVar) {
            this.f96475a = str;
            this.f96476b = i7;
            this.f96477c = aVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f96475a, cVar.f96475a) && this.f96476b == cVar.f96476b && Intrinsics.areEqual(this.f96477c, cVar.f96477c);
        }

        public final int hashCode() {
            return this.f96477c.hashCode() + I.a(this.f96476b, this.f96475a.hashCode() * 31, 31);
        }

        @NotNull
        public final String toString() {
            return "State(headline=" + this.f96475a + ", countdown=" + this.f96476b + ", cardInfo=" + this.f96477c + ")";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.UGCAutoContinuousInterceptWidget$onCreateContentView$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCAutoContinuousInterceptWidget$onCreateContentView$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C2962a $binding;
        final Context $context;
        int label;
        final UGCAutoContinuousInterceptWidget this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.UGCAutoContinuousInterceptWidget$onCreateContentView$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCAutoContinuousInterceptWidget$onCreateContentView$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<c, Continuation<? super Unit>, Object> {
            final C2962a $binding;
            final Context $context;
            Object L$0;
            int label;
            final UGCAutoContinuousInterceptWidget this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UGCAutoContinuousInterceptWidget uGCAutoContinuousInterceptWidget, C2962a c2962a, Context context, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = uGCAutoContinuousInterceptWidget;
                this.$binding = c2962a;
                this.$context = context;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$binding, this.$context, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(c cVar, Continuation<? super Unit> continuation) {
                return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c cVar = (c) this.L$0;
                int i7 = cVar.f96476b;
                if (i7 > 0) {
                    UGCAutoContinuousInterceptWidget uGCAutoContinuousInterceptWidget = this.this$0;
                    uGCAutoContinuousInterceptWidget.getClass();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) uGCAutoContinuousInterceptWidget.getMContext().getString(2131849020, Integer.valueOf(i7)));
                    spannableStringBuilder.setSpan(new StyleSpan(1), 0, String.valueOf(i7).length(), 17);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(uGCAutoContinuousInterceptWidget.getMContext(), R$color.Brand_pink)), 0, String.valueOf(i7).length(), 17);
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan(15, true), 0, String.valueOf(i7).length(), 17);
                    this.$binding.f25868d.setText(spannableStringBuilder);
                    this.$binding.f25868d.setVisibility(0);
                    this.$binding.f25866b.setVisibility(0);
                } else {
                    this.$binding.f25866b.setVisibility(4);
                    this.$binding.f25868d.setVisibility(8);
                }
                this.$binding.f25871g.setText(cVar.f96475a);
                FixedLineSpacingTextView fixedLineSpacingTextView = this.$binding.f25874k;
                a aVar = cVar.f96477c;
                fixedLineSpacingTextView.setText(aVar.f96465a);
                VectorTextView vectorTextView = this.$binding.f25867c;
                String str = aVar.f96467c;
                vectorTextView.setText(str);
                VectorTextView vectorTextView2 = this.$binding.f25867c;
                int i8 = cVar.f96476b;
                vectorTextView2.setVisibility((i8 > 0 || str.length() <= 0) ? 8 : 0);
                Drawable drawableB = n.b(aVar.f96466b == 1 ? 2131235257 : 2131235038, this.$context, R$color.Ga5);
                VectorTextView vectorTextView3 = this.$binding.h;
                String str2 = aVar.f96468d;
                vectorTextView3.setText(str2);
                this.$binding.h.setCompoundDrawablesWithIntrinsicBounds(drawableB, null, null, null);
                VectorTextView vectorTextView4 = this.$binding.h;
                int i9 = 8;
                if (i8 <= 0) {
                    i9 = 8;
                    if (str2.length() > 0) {
                        i9 = 0;
                    }
                }
                vectorTextView4.setVisibility(i9);
                String str3 = aVar.f96469e;
                if (str3.length() > 0) {
                    BiliImageLoader.INSTANCE.with(this.$context).url(str3).into(this.$binding.f25869e);
                }
                this.$binding.f25870f.setText(aVar.f96470f);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(UGCAutoContinuousInterceptWidget uGCAutoContinuousInterceptWidget, C2962a c2962a, Context context, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = uGCAutoContinuousInterceptWidget;
            this.$binding = c2962a;
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
                UGCAutoContinuousInterceptWidget uGCAutoContinuousInterceptWidget = this.this$0;
                AutoContinuousInterceptService$showInterceptLayer$2$invokeSuspend$$inlined$map$1 autoContinuousInterceptService$showInterceptLayer$2$invokeSuspend$$inlined$map$1 = uGCAutoContinuousInterceptWidget.f96462d;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(uGCAutoContinuousInterceptWidget, this.$binding, this.$context, null);
                this.label = 1;
                if (FlowKt.collectLatest(autoContinuousInterceptService$showInterceptLayer$2$invokeSuspend$$inlined$map$1, anonymousClass1, this) == coroutine_suspended) {
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
    public UGCAutoContinuousInterceptWidget(@NotNull Context context, @NotNull AutoContinuousInterceptService$showInterceptLayer$2$invokeSuspend$$inlined$map$1 autoContinuousInterceptService$showInterceptLayer$2$invokeSuspend$$inlined$map$1) {
        super(context);
        this.f96462d = autoContinuousInterceptService$showInterceptLayer$2$invokeSuspend$$inlined$map$1;
        MutableSharedFlow<b> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, (Object) null);
        this.f96463e = mutableSharedFlowMutableSharedFlow$default;
        this.f96464f = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final View onCreateContentView(@NotNull Context context) {
        C2962a c2962aInflate = C2962a.inflate(LayoutInflater.from(context));
        c2962aInflate.f25875l.setOnClickListener(new FR.a(this, 2));
        c2962aInflate.f25866b.setOnClickListener(new ViewOnClickListenerC5142l(this, 1));
        c2962aInflate.f25873j.setOnClickListener(new AJ0.a(this, 2));
        c2962aInflate.f25872i.setOnClickListener(new AJ0.b(this, 3));
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, c2962aInflate, context, null), 3, (Object) null);
        return c2962aInflate.f25865a;
    }

    public final void onRelease() {
    }
}
