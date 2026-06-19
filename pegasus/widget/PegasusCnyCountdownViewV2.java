package com.bilibili.pegasus.widget;

import G3.O;
import I.E;
import X9.n;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.compose.runtime.internal.StabilityInferred;
import aq0.C4844V;
import com.bilibili.droid.TypeFaceHelper;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.ThumbnailUrlTransformStrategy;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import gp0.C7373a;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widget/PegasusCnyCountdownViewV2.class */
@StabilityInferred(parameters = 0)
public final class PegasusCnyCountdownViewV2 extends FrameLayout {
    public static final int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<b> f79107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<b> f79108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f79109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public C7373a f79110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public Function0<Unit> f79111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Typeface f79112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Job f79113g;

    /* JADX INFO: renamed from: com.bilibili.pegasus.widget.PegasusCnyCountdownViewV2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widget/PegasusCnyCountdownViewV2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<C4844V> $binding;
        int label;
        final PegasusCnyCountdownViewV2 this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.widget.PegasusCnyCountdownViewV2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widget/PegasusCnyCountdownViewV2$1$1.class */
        public static final class C05091 extends SuspendLambda implements Function2<b, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<C4844V> $binding;
            Object L$0;
            int label;
            final PegasusCnyCountdownViewV2 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05091(Ref.ObjectRef<C4844V> objectRef, PegasusCnyCountdownViewV2 pegasusCnyCountdownViewV2, Continuation<? super C05091> continuation) {
                super(2, continuation);
                this.$binding = objectRef;
                this.this$0 = pegasusCnyCountdownViewV2;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05091 c05091 = new C05091(this.$binding, this.this$0, continuation);
                c05091.L$0 = obj;
                return c05091;
            }

            public final Object invoke(b bVar, Continuation<? super Unit> continuation) {
                return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                b bVar = (b) this.L$0;
                if (bVar != null) {
                    TextView textView = ((C4844V) this.$binding.element).f53890b;
                    PegasusCnyCountdownViewV2 pegasusCnyCountdownViewV2 = this.this$0;
                    a aVar = bVar.f79118a;
                    textView.setText(aVar.f79115b);
                    int i7 = bVar.f79119b;
                    textView.setTextColor(i7);
                    textView.setTypeface(pegasusCnyCountdownViewV2.f79112f);
                    ImageExtentionKt.displayImage$default(((C4844V) this.$binding.element).f53891c, bVar.f79121d, (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, (ScaleType) null, (BitmapTransformation) null, false, 1022, (Object) null);
                    TextView textView2 = ((C4844V) this.$binding.element).f53892d;
                    textView2.setText(2131851773);
                    int i8 = bVar.f79120c;
                    textView2.setTextColor(i8);
                    TextView textView3 = ((C4844V) this.$binding.element).f53893e;
                    PegasusCnyCountdownViewV2 pegasusCnyCountdownViewV22 = this.this$0;
                    textView3.setText(aVar.f79116c);
                    textView3.setTextColor(i7);
                    textView3.setTypeface(pegasusCnyCountdownViewV22.f79112f);
                    ImageExtentionKt.displayImage$default(((C4844V) this.$binding.element).f53894f, bVar.f79121d, (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, (ScaleType) null, (BitmapTransformation) null, false, 1022, (Object) null);
                    TextView textView4 = ((C4844V) this.$binding.element).f53895g;
                    textView4.setText(2131851774);
                    textView4.setTextColor(i8);
                    TextView textView5 = ((C4844V) this.$binding.element).h;
                    PegasusCnyCountdownViewV2 pegasusCnyCountdownViewV23 = this.this$0;
                    textView5.setText(aVar.f79117d);
                    textView5.setTextColor(i7);
                    textView5.setTypeface(pegasusCnyCountdownViewV23.f79112f);
                    ImageExtentionKt.displayImage$default(((C4844V) this.$binding.element).f53896i, bVar.f79121d, (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, (ScaleType) null, (BitmapTransformation) null, false, 1022, (Object) null);
                    TextView textView6 = ((C4844V) this.$binding.element).f53897j;
                    textView6.setText(2131851775);
                    textView6.setTextColor(i8);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PegasusCnyCountdownViewV2 pegasusCnyCountdownViewV2, Ref.ObjectRef<C4844V> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = pegasusCnyCountdownViewV2;
            this.$binding = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PegasusCnyCountdownViewV2 pegasusCnyCountdownViewV2 = this.this$0;
                StateFlow<b> stateFlow = pegasusCnyCountdownViewV2.f79108b;
                C05091 c05091 = new C05091(this.$binding, pegasusCnyCountdownViewV2, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c05091, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widget/PegasusCnyCountdownViewV2$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f79114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f79115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f79116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f79117d;

        public a() {
            this("00", "00", "00", "00");
        }

        public a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            this.f79114a = str;
            this.f79115b = str2;
            this.f79116c = str3;
            this.f79117d = str4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f79114a, aVar.f79114a) && Intrinsics.areEqual(this.f79115b, aVar.f79115b) && Intrinsics.areEqual(this.f79116c, aVar.f79116c) && Intrinsics.areEqual(this.f79117d, aVar.f79117d);
        }

        public final int hashCode() {
            return this.f79117d.hashCode() + E.a(E.a(this.f79114a.hashCode() * 31, 31, this.f79115b), 31, this.f79116c);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("CountdownDate(day=");
            sb.append(this.f79114a);
            sb.append(", hour=");
            sb.append(this.f79115b);
            sb.append(", minute=");
            sb.append(this.f79116c);
            sb.append(", second=");
            return C8770a.a(sb, this.f79117d, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widget/PegasusCnyCountdownViewV2$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final a f79118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f79119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f79120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f79121d;

        public b(@NotNull a aVar, int i7, int i8, @Nullable String str) {
            this.f79118a = aVar;
            this.f79119b = i7;
            this.f79120c = i8;
            this.f79121d = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f79118a, bVar.f79118a) && this.f79119b == bVar.f79119b && this.f79120c == bVar.f79120c && Intrinsics.areEqual(this.f79121d, bVar.f79121d);
        }

        public final int hashCode() {
            int iA = I.a(this.f79120c, I.a(this.f79119b, this.f79118a.hashCode() * 31, 31), 31);
            String str = this.f79121d;
            return iA + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("CountdownState(countDownData=");
            sb.append(this.f79118a);
            sb.append(", numberColor=");
            sb.append(this.f79119b);
            sb.append(", unitColor=");
            sb.append(this.f79120c);
            sb.append(", numberBg=");
            return C8770a.a(sb, this.f79121d, ")");
        }
    }

    @JvmOverloads
    public PegasusCnyCountdownViewV2(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public PegasusCnyCountdownViewV2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public PegasusCnyCountdownViewV2(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        MutableStateFlow<b> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f79107a = MutableStateFlow;
        this.f79108b = FlowKt.asStateFlow(MutableStateFlow);
        CoroutineScope coroutineScopeB = n.b();
        this.f79109c = coroutineScopeB;
        this.f79111e = new O(8);
        this.f79112f = TypeFaceHelper.createFromAsset(context, "xx-bin-bold.otf");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C4844V c4844vInflate = C4844V.inflate(LayoutInflater.from(context), this, false);
        objectRef.element = c4844vInflate;
        addView(c4844vInflate.f53889a);
        BuildersKt.launch$default(coroutineScopeB, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, objectRef, null), 3, (Object) null);
    }

    public static String b(long j7) {
        return j7 < 10 ? C3751q.a(j7, "0") : j7 < 100 ? String.valueOf(j7) : String.valueOf(j7 % ((long) 100));
    }

    public final void a(@Nullable C7373a c7373a, @NotNull Function0<Unit> function0) {
        Job job;
        this.f79110d = c7373a;
        this.f79111e = function0;
        if (isAttachedToWindow()) {
            Job job2 = this.f79113g;
            if (job2 != null && job2.isActive() && (job = this.f79113g) != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            if (c7373a == null) {
                this.f79107a.setValue((Object) null);
            } else {
                this.f79113g = BuildersKt.launch$default(this.f79109c, (CoroutineContext) null, (CoroutineStart) null, new PegasusCnyCountdownViewV2$bindData$2(this, c7373a, function0, null), 3, (Object) null);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7373a c7373a = this.f79110d;
        if (c7373a != null) {
            a(c7373a, this.f79111e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Job job = this.f79113g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }
}
