package com.bilibili.ship.theseus.united.page.floatlayer;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.lib.accounts.AccountException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference2Impl;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/FloatLayerManager.class */
@Deprecated(message = "Use ScreenAdjustFloatLayerManager instead")
@StabilityInferred(parameters = 0)
public class FloatLayerManager {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final KProperty<Object>[] f99637f = {new MutablePropertyReference2Impl(FloatLayerManager.class, "floatLayer", "getFloatLayer(Landroid/view/View;)Lcom/bilibili/ship/theseus/united/page/floatlayer/FloatLayerManager$FloatLayer;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList<a> f99638a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f99639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f99640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public com.bilibili.ship.theseus.united.page.floatlayer.a f99641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f99642e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/FloatLayerManager$FloatLayerListOperationType.class */
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/FloatLayerManager$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final UIComponent<?> f99643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final CompletableDeferred<Boolean> f99644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final CoroutineScope f99645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Job f99646d;

        public a(@NotNull UIComponent<?> uIComponent, @NotNull CompletableDeferred<Boolean> completableDeferred, @NotNull CoroutineScope coroutineScope) {
            this.f99643a = uIComponent;
            this.f99644b = completableDeferred;
            this.f99645c = coroutineScope;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/FloatLayerManager$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final a f99647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final FloatLayerListOperationType f99648b;

        public b(@NotNull a aVar, @NotNull FloatLayerListOperationType floatLayerListOperationType) {
            this.f99647a = aVar;
            this.f99648b = floatLayerListOperationType;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/FloatLayerManager$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/FloatLayerManager$d.class */
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f99649a;

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
            f99649a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/FloatLayerManager$e.class */
    public static final class e implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewGroup f99650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f99651b;

        public e(View view, ViewGroup viewGroup) {
            this.f99650a = viewGroup;
            this.f99651b = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            final ViewGroup viewGroup = this.f99650a;
            final int i7 = 0;
            final View view = this.f99651b;
            viewGroup.post(new Runnable(i7, viewGroup, view) { // from class: com.bilibili.ship.theseus.united.page.floatlayer.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f99679a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f99680b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f99681c;

                {
                    this.f99679a = i7;
                    this.f99680b = viewGroup;
                    this.f99681c = view;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f99679a) {
                        case 0:
                            ((ViewGroup) this.f99680b).removeView((View) this.f99681c);
                            break;
                        default:
                            AccountException accountException = (AccountException) this.f99680b;
                            e10.f fVar = (e10.f) this.f99681c;
                            M.b("qrCodeAuthCode error :: ", accountException.getMessage(), "QrCodeLoginPresenter");
                            fVar.b.G1();
                            accountException.code();
                            accountException.getMessage();
                            fVar.b.a(3);
                            break;
                    }
                }
            });
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public FloatLayerManager() {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f99639b = MutableStateFlow;
        this.f99640c = MutableStateFlow;
        this.f99642e = 2131313242;
    }

    public static /* synthetic */ Object c(FloatLayerManager floatLayerManager, UIComponent uIComponent, ContinuationImpl continuationImpl) {
        floatLayerManager.getClass();
        return floatLayerManager.b(uIComponent, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0162 A[LOOP:0: B:39:0x0158->B:41:0x0162, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull android.view.ViewGroup r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.floatlayer.FloatLayerManager.a(android.view.ViewGroup, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public final Object b(@NotNull UIComponent uIComponent, @NotNull ContinuationImpl continuationImpl) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new FloatLayerManager$keepLayerShowing$2(this, uIComponent, null, null), continuationImpl);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public final void d(ViewGroup viewGroup, a aVar, Animation animation) {
        for (View view : ViewGroupKt.getChildren(viewGroup)) {
            KProperty<Object> kProperty = f99637f[0];
            if (Intrinsics.areEqual((a) view.getTag(this.f99642e), aVar)) {
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
