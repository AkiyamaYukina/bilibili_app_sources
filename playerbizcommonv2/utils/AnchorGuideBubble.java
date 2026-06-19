package com.bilibili.playerbizcommonv2.utils;

import Pb.F;
import Pb.G;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.alipay.sdk.app.PayTask;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.Q;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/AnchorGuideBubble.class */
@StabilityInferred(parameters = 0)
public final class AnchorGuideBubble extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f81880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final View f81881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f81882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f81883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ViewTreeObserverOnGlobalLayoutListenerC5800a f81884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Job f81885f;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.utils.AnchorGuideBubble$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/AnchorGuideBubble$1.class */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final AnchorGuideBubble this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnchorGuideBubble anchorGuideBubble, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = anchorGuideBubble;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
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
            BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnchorGuideBubble$1$invokeSuspend$$inlined$awaitCancel$1(null, this.this$0), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/AnchorGuideBubble$Position.class */
    public static final class Position {
        private static final EnumEntries $ENTRIES;
        private static final Position[] $VALUES;
        public static final Position TopOfAnchor = new Position("TopOfAnchor", 0);
        public static final Position BottomOfAnchor = new Position("BottomOfAnchor", 1);
        public static final Position LeftOfAnchor = new Position("LeftOfAnchor", 2);
        public static final Position RightOfAnchor = new Position("RightOfAnchor", 3);

        private static final /* synthetic */ Position[] $values() {
            return new Position[]{TopOfAnchor, BottomOfAnchor, LeftOfAnchor, RightOfAnchor};
        }

        static {
            Position[] positionArr$values = $values();
            $VALUES = positionArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(positionArr$values);
        }

        private Position(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<Position> getEntries() {
            return $ENTRIES;
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/AnchorGuideBubble$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f81886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f81887b;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f81886a == aVar.f81886a && this.f81887b == aVar.f81887b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f81887b) + (Integer.hashCode(this.f81886a) * 31);
        }

        @NotNull
        public final String toString() {
            return androidx.compose.runtime.collection.d.a(this.f81886a, this.f81887b, "BubbleLocation(x=", ", y=", ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/AnchorGuideBubble$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f81888a;

        static {
            int[] iArr = new int[Position.values().length];
            try {
                iArr[Position.RightOfAnchor.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Position.BottomOfAnchor.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f81888a = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bilibili.playerbizcommonv2.utils.AnchorGuideBubble$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.bilibili.playerbizcommonv2.utils.a] */
    public AnchorGuideBubble(View view, View view2) {
        super(view, -2, -2);
        this.f81880a = view;
        this.f81881b = view2;
        this.f81882c = PayTask.f60018j;
        ?? obj = new Object();
        obj.f81886a = 0;
        obj.f81887b = 0;
        this.f81883d = obj;
        this.f81884e = new ViewTreeObserver.OnGlobalLayoutListener(this) { // from class: com.bilibili.playerbizcommonv2.utils.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AnchorGuideBubble f81907a;

            {
                this.f81907a = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AnchorGuideBubble anchorGuideBubble = this.f81907a;
                boolean zIsAttachedToWindow = anchorGuideBubble.f81881b.isAttachedToWindow();
                boolean globalVisibleRect = anchorGuideBubble.f81881b.getGlobalVisibleRect(new Rect());
                if (zIsAttachedToWindow && globalVisibleRect) {
                    return;
                }
                BLog.i("AnchorGuideBubble", O4.b.b("dismiss cause of notAttached[", "], notVisibleInRoot[", "]", !zIsAttachedToWindow, !globalVisibleRect));
                anchorGuideBubble.dismiss();
            }
        };
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view2);
        LifecycleCoroutineScope lifecycleScope = lifecycleOwner != null ? LifecycleOwnerKt.getLifecycleScope(lifecycleOwner) : null;
        this.f81885f = lifecycleScope != null ? BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, CoroutineStart.LAZY, new AnchorGuideBubble$dismissJob$1(this, null), 1, (Object) null) : null;
        setFocusable(false);
        setOutsideTouchable(true);
        LifecycleOwner lifecycleOwner2 = ViewTreeLifecycleOwner.get(view2);
        LifecycleCoroutineScope lifecycleScope2 = lifecycleOwner2 != null ? LifecycleOwnerKt.getLifecycleScope(lifecycleOwner2) : null;
        if (lifecycleScope2 != null) {
            BuildersKt.launch$default(lifecycleScope2, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        }
    }

    public static void a(AnchorGuideBubble anchorGuideBubble, int i7, Position position, int i8) {
        int i9 = i7;
        if ((i8 & 1) != 0) {
            i9 = 0;
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = anchorGuideBubble.f81881b.getGlobalVisibleRect(rect);
        if (!globalVisibleRect || rect.isEmpty()) {
            Q.a("localVisibleRect - ", ", rect is empty -> ", "AnchorGuideBubble", globalVisibleRect, rect.isEmpty());
            return;
        }
        int[] iArr = b.f81888a;
        int i10 = iArr[position.ordinal()] == 1 ? rect.right : rect.left;
        int i11 = iArr[position.ordinal()] == 2 ? rect.bottom : rect.top;
        anchorGuideBubble.f81880a.measure(-2, -2);
        int measuredHeight = anchorGuideBubble.f81880a.getMeasuredHeight();
        int measuredWidth = anchorGuideBubble.f81880a.getMeasuredWidth();
        a aVar = anchorGuideBubble.f81883d;
        int i12 = i10;
        if (position == Position.LeftOfAnchor) {
            i12 = i10 - measuredWidth;
        }
        aVar.f81886a = RangesKt.coerceAtLeast(i12, 0);
        a aVar2 = anchorGuideBubble.f81883d;
        int i13 = i11;
        if (position == Position.TopOfAnchor) {
            i13 = i11 - measuredHeight;
        }
        aVar2.f81887b = RangesKt.coerceAtLeast(i13, 0);
        a aVar3 = anchorGuideBubble.f81883d;
        int i14 = aVar3.f81886a + i9;
        aVar3.f81886a = i14;
        int i15 = aVar3.f81887b;
        aVar3.f81887b = i15;
        BLog.i("AnchorGuideBubble", androidx.compose.runtime.collection.d.a(i14, i15, "showBubble PopupWindow showAtLocation: [", ", ", "]"));
        View view = anchorGuideBubble.f81881b;
        a aVar4 = anchorGuideBubble.f81883d;
        anchorGuideBubble.showAtLocation(view, 8388659, aVar4.f81886a, aVar4.f81887b);
        ViewTreeObserver viewTreeObserver = anchorGuideBubble.f81881b.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(anchorGuideBubble.f81884e);
            viewTreeObserver.addOnGlobalLayoutListener(anchorGuideBubble.f81884e);
        }
        Job job = anchorGuideBubble.f81885f;
        if (job != null) {
            job.start();
        }
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        if (isShowing()) {
            ViewTreeObserver viewTreeObserver = this.f81880a.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.f81884e);
            }
            Job job = this.f81885f;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            if (this.f81880a.isAttachedToWindow()) {
                Contract contractAb = ConfigManager.Companion.ab();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
                    Thread threadCurrentThread = Thread.currentThread();
                    if (!androidx.appcompat.app.n.a(threadCurrentThread)) {
                        IllegalStateException illegalStateException = new IllegalStateException(F.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                        Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
                    }
                }
                super.dismiss();
            }
        }
    }
}
