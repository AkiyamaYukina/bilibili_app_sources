package com.bilibili.tgwt.player;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt;
import com.bilibili.app.gemini.ui.UIComponent;
import java.util.ArrayList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference2Impl;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/FloatLayerManager.class */
@StabilityInferred(parameters = 0)
public class FloatLayerManager {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final KProperty<Object>[] f111519f = {new MutablePropertyReference2Impl(FloatLayerManager.class, "floatLayer", "getFloatLayer(Landroid/view/View;)Lcom/bilibili/tgwt/player/FloatLayerManager$FloatLayer;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList<a> f111520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f111521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f111522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public com.bilibili.tgwt.player.d f111523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f111524e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/FloatLayerManager$FloatLayerListOperationType.class */
    public static final class FloatLayerListOperationType {
        private static final EnumEntries $ENTRIES;
        private static final FloatLayerListOperationType[] $VALUES;
        public static final FloatLayerListOperationType ADD = new FloatLayerListOperationType("ADD", 0);
        public static final FloatLayerListOperationType DELETE = new FloatLayerListOperationType("DELETE", 1);

        private static final /* synthetic */ FloatLayerListOperationType[] $values() {
            return new FloatLayerListOperationType[]{ADD, DELETE};
        }

        static {
            FloatLayerListOperationType[] floatLayerListOperationTypeArr$values = $values();
            $VALUES = floatLayerListOperationTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(floatLayerListOperationTypeArr$values);
        }

        private FloatLayerListOperationType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<FloatLayerListOperationType> getEntries() {
            return $ENTRIES;
        }

        public static FloatLayerListOperationType valueOf(String str) {
            return (FloatLayerListOperationType) Enum.valueOf(FloatLayerListOperationType.class, str);
        }

        public static FloatLayerListOperationType[] values() {
            return (FloatLayerListOperationType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/FloatLayerManager$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final UIComponent<?> f111525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final CoroutineScope f111526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Job f111527c;

        public a(@NotNull UIComponent<?> uIComponent, @NotNull CoroutineScope coroutineScope) {
            this.f111525a = uIComponent;
            this.f111526b = coroutineScope;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/FloatLayerManager$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final a f111528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final FloatLayerListOperationType f111529b;

        public b(@NotNull a aVar, @NotNull FloatLayerListOperationType floatLayerListOperationType) {
            this.f111528a = aVar;
            this.f111529b = floatLayerListOperationType;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/FloatLayerManager$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/FloatLayerManager$d.class */
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f111530a;

        static {
            int[] iArr = new int[FloatLayerListOperationType.values().length];
            try {
                iArr[FloatLayerListOperationType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[FloatLayerListOperationType.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f111530a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/FloatLayerManager$e.class */
    public static final class e implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewGroup f111531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f111532b;

        public e(View view, ViewGroup viewGroup) {
            this.f111531a = viewGroup;
            this.f111532b = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            ViewGroup viewGroup = this.f111531a;
            viewGroup.post(new com.bilibili.opd.app.bizcommon.mangapaysdk.view.d(1, viewGroup, this.f111532b));
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public FloatLayerManager() {
        this(0);
    }

    public FloatLayerManager(int i7) {
        this.f111520a = new ArrayList<>();
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f111521b = MutableStateFlow;
        this.f111522c = MutableStateFlow;
        this.f111524e = 2131319377;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0144 A[LOOP:0: B:39:0x013a->B:41:0x0144, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull android.view.ViewGroup r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.player.FloatLayerManager.a(android.view.ViewGroup, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull com.bilibili.app.gemini.ui.UIComponent r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws kotlin.KotlinNothingValueException {
        /*
            r7 = this;
            r0 = r9
            boolean r0 = r0 instanceof com.bilibili.tgwt.player.FloatLayerManager$keepLayerShowing$1
            if (r0 == 0) goto L29
            r0 = r9
            com.bilibili.tgwt.player.FloatLayerManager$keepLayerShowing$1 r0 = (com.bilibili.tgwt.player.FloatLayerManager$keepLayerShowing$1) r0
            r11 = r0
            r0 = r11
            int r0 = r0.label
            r10 = r0
            r0 = r10
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r11
            r1 = r10
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r11
            r9 = r0
            goto L33
        L29:
            com.bilibili.tgwt.player.FloatLayerManager$keepLayerShowing$1 r0 = new com.bilibili.tgwt.player.FloatLayerManager$keepLayerShowing$1
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            r9 = r0
        L33:
            r0 = r9
            java.lang.Object r0 = r0.result
            r12 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r9
            int r0 = r0.label
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L5e
            r0 = r10
            r1 = 1
            if (r0 == r1) goto L56
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L56:
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)
            goto L81
        L5e:
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.tgwt.player.FloatLayerManager$keepLayerShowing$2 r0 = new com.bilibili.tgwt.player.FloatLayerManager$keepLayerShowing$2
            r1 = r0
            r2 = r8
            r3 = r7
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r8 = r0
            r0 = r9
            r1 = 1
            r0.label = r1
            r0 = r8
            r1 = r9
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r1 = r11
            if (r0 != r1) goto L81
            r0 = r11
            return r0
        L81:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.player.FloatLayerManager.b(com.bilibili.app.gemini.ui.UIComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void c(ViewGroup viewGroup, a aVar, Animation animation) {
        for (View view : ViewGroupKt.getChildren(viewGroup)) {
            KProperty<Object> kProperty = f111519f[0];
            if (Intrinsics.areEqual((a) view.getTag(this.f111524e), aVar)) {
                if (animation == null) {
                    viewGroup.removeView(view);
                    return;
                } else {
                    view.startAnimation(animation);
                    animation.setAnimationListener(new e(view, viewGroup));
                    return;
                }
            }
        }
    }
}
