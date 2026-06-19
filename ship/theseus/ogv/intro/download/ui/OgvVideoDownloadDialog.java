package com.bilibili.ship.theseus.ogv.intro.download.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.droid.DimenUtilsKt;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/OgvVideoDownloadDialog.class */
@StabilityInferred(parameters = 0)
public final class OgvVideoDownloadDialog extends BottomSheetDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HeightStyle f92487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<WindowSizeClass> f92488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f92489c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/OgvVideoDownloadDialog$HeightStyle.class */
    public static final class HeightStyle {
        private static final EnumEntries $ENTRIES;
        private static final HeightStyle[] $VALUES;
        public static final HeightStyle BELOW_VIDEO_AREA = new HeightStyle("BELOW_VIDEO_AREA", 0);
        public static final HeightStyle WRAP_CONTENT = new HeightStyle("WRAP_CONTENT", 1);

        private static final /* synthetic */ HeightStyle[] $values() {
            return new HeightStyle[]{BELOW_VIDEO_AREA, WRAP_CONTENT};
        }

        static {
            HeightStyle[] heightStyleArr$values = $values();
            $VALUES = heightStyleArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(heightStyleArr$values);
        }

        private HeightStyle(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<HeightStyle> getEntries() {
            return $ENTRIES;
        }

        public static HeightStyle valueOf(String str) {
            return (HeightStyle) Enum.valueOf(HeightStyle.class, str);
        }

        public static HeightStyle[] values() {
            return (HeightStyle[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/OgvVideoDownloadDialog$a.class */
    public static final class a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvVideoDownloadDialog f92490a;

        public a(OgvVideoDownloadDialog ogvVideoDownloadDialog) {
            this.f92490a = ogvVideoDownloadDialog;
        }

        public final void onSlide(View view, float f7) {
            float f8 = f7 > 0.0f ? 1.0f : 1 + f7;
            Window window = this.f92490a.getWindow();
            if (window != null) {
                window.setDimAmount(f8 * 0.5f);
            }
        }

        public final void onStateChanged(View view, int i7) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/OgvVideoDownloadDialog$b.class */
    public static final class b implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CancellableContinuationImpl f92491a;

        public b(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f92491a = cancellableContinuationImpl;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            com.bilibili.ogv.infra.coroutine.a.a(this.f92491a, Unit.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/OgvVideoDownloadDialog$c.class */
    public static final class c implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvVideoDownloadDialog f92492a;

        public c(OgvVideoDownloadDialog ogvVideoDownloadDialog) {
            this.f92492a = ogvVideoDownloadDialog;
        }

        public final Object invoke(Object obj) {
            BottomSheetDialog bottomSheetDialog = this.f92492a;
            bottomSheetDialog.setOnDismissListener(null);
            bottomSheetDialog.cancel();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.download.ui.OgvVideoDownloadDialog$onCreate$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/OgvVideoDownloadDialog$onCreate$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final View $bottomSheet;
        int label;
        final OgvVideoDownloadDialog this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.download.ui.OgvVideoDownloadDialog$onCreate$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/OgvVideoDownloadDialog$onCreate$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvVideoDownloadDialog f92493a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final View f92494b;

            public a(OgvVideoDownloadDialog ogvVideoDownloadDialog, View view) {
                this.f92493a = ogvVideoDownloadDialog;
                this.f92494b = view;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [android.app.Dialog, com.bilibili.ship.theseus.ogv.intro.download.ui.OgvVideoDownloadDialog] */
            public final Object emit(Object obj, Continuation continuation) {
                boolean zD = com.bilibili.ship.theseus.united.page.screensize.b.d((WindowSizeClass) obj);
                ?? r02 = this.f92493a;
                if (!zD) {
                    View view = this.f92494b;
                    if (view != null) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams.width = DimenUtilsKt.dpToPx(480.0f);
                        if (r02.f92487a == HeightStyle.BELOW_VIDEO_AREA) {
                            layoutParams.height = DimenUtilsKt.dpToPx(487.0f);
                        }
                        view.setLayoutParams(layoutParams);
                    }
                } else if (r02.f92487a == HeightStyle.BELOW_VIDEO_AREA) {
                    int i7 = r02.getContext().getResources().getDisplayMetrics().heightPixels;
                    int i8 = (r02.getContext().getResources().getDisplayMetrics().widthPixels * 9) / 16;
                    View view2 = this.f92494b;
                    if (view2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams2.height = i7 - i8;
                        view2.setLayoutParams(layoutParams2);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvVideoDownloadDialog ogvVideoDownloadDialog, View view, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvVideoDownloadDialog;
            this.$bottomSheet = view;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$bottomSheet, continuation);
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
                OgvVideoDownloadDialog ogvVideoDownloadDialog = this.this$0;
                StateFlow<WindowSizeClass> stateFlow = ogvVideoDownloadDialog.f92488b;
                a aVar = new a(ogvVideoDownloadDialog, this.$bottomSheet);
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

    public OgvVideoDownloadDialog(@NotNull Context context, @NotNull HeightStyle heightStyle, @NotNull StateFlow<WindowSizeClass> stateFlow) {
        super(context, 2131889077);
        this.f92487a = heightStyle;
        this.f92488b = stateFlow;
        this.f92489c = new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object j(@NotNull Continuation<? super Unit> continuation) {
        show();
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        setOnDismissListener(new b(cancellableContinuationImpl));
        cancellableContinuationImpl.invokeOnCancellation(new c(this));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        View viewFindViewById = findViewById(R.id.design_bottom_sheet);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, viewFindViewById, null), 3, (Object) null);
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(AppCompatResources.getDrawable(getContext(), 2131241880));
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
            bottomSheetBehaviorFrom.addBottomSheetCallback(this.f92489c);
            bottomSheetBehaviorFrom.setState(3);
            bottomSheetBehaviorFrom.setSkipCollapsed(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setDimAmount(0.5f);
        }
    }
}
