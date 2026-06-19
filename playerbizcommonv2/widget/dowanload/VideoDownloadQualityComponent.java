package com.bilibili.playerbizcommonv2.widget.dowanload;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBinding;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.theme.R$color;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadQualityComponent.class */
@StabilityInferred(parameters = 0)
public final class VideoDownloadQualityComponent extends com.bilibili.app.gemini.ui.m<Dr0.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f82511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f82512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f82513c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadQualityComponent$BackgroundType.class */
    public static final class BackgroundType {
        private static final EnumEntries $ENTRIES;
        private static final BackgroundType[] $VALUES;
        public static final BackgroundType TOP = new BackgroundType("TOP", 0);
        public static final BackgroundType MIDDLE = new BackgroundType("MIDDLE", 1);
        public static final BackgroundType BOTTOM = new BackgroundType("BOTTOM", 2);
        public static final BackgroundType TOP_BOTTOM = new BackgroundType("TOP_BOTTOM", 3);

        private static final /* synthetic */ BackgroundType[] $values() {
            return new BackgroundType[]{TOP, MIDDLE, BOTTOM, TOP_BOTTOM};
        }

        static {
            BackgroundType[] backgroundTypeArr$values = $values();
            $VALUES = backgroundTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(backgroundTypeArr$values);
        }

        private BackgroundType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<BackgroundType> getEntries() {
            return $ENTRIES;
        }

        public static BackgroundType valueOf(String str) {
            return (BackgroundType) Enum.valueOf(BackgroundType.class, str);
        }

        public static BackgroundType[] values() {
            return (BackgroundType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadQualityComponent$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f82514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f82515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f82516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final BackgroundType f82517d;

        public a(int i7, @NotNull String str, boolean z6, @NotNull BackgroundType backgroundType) {
            this.f82514a = i7;
            this.f82515b = str;
            this.f82516c = z6;
            this.f82517d = backgroundType;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadQualityComponent$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f82518a;

        static {
            int[] iArr = new int[BackgroundType.values().length];
            try {
                iArr[BackgroundType.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BackgroundType.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BackgroundType.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[BackgroundType.TOP_BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f82518a = iArr;
        }
    }

    public VideoDownloadQualityComponent(@NotNull a aVar, @NotNull MutableStateFlow mutableStateFlow, @NotNull Function0 function0) {
        this.f82511a = aVar;
        this.f82512b = mutableStateFlow;
        this.f82513c = function0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object a(ViewBinding viewBinding, Continuation continuation) throws NoWhenBranchMatchedException {
        float[] fArr;
        Dr0.k kVar = (Dr0.k) viewBinding;
        ConstraintLayout constraintLayout = kVar.f3100a;
        Context context = constraintLayout.getContext();
        TextView textView = kVar.f3103d;
        TextView textView2 = kVar.f3101b;
        View view = kVar.f3102c;
        a aVar = this.f82511a;
        textView.setText(aVar.f82515b);
        constraintLayout.setOnClickListener(new ar.j(this, 1));
        BackgroundType backgroundType = BackgroundType.BOTTOM;
        BackgroundType backgroundType2 = aVar.f82517d;
        if (backgroundType2 == backgroundType || backgroundType2 == BackgroundType.TOP_BOTTOM) {
            Lazy lazy = com.bilibili.playerbizcommonv2.utils.p.f81943a;
            view.setVisibility(8);
        } else {
            Lazy lazy2 = com.bilibili.playerbizcommonv2.utils.p.f81943a;
            view.setVisibility(0);
        }
        int color = ContextCompat.getColor(context, R$color.Bg1_float);
        float fDpToPx = DimenUtilsKt.dpToPx(8.0f);
        int i7 = b.f82518a[backgroundType2.ordinal()];
        if (i7 == 1) {
            fArr = new float[]{fDpToPx, fDpToPx, fDpToPx, fDpToPx, 0.0f, 0.0f, 0.0f, 0.0f};
        } else if (i7 == 2) {
            fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        } else if (i7 == 3) {
            fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, fDpToPx, fDpToPx, fDpToPx, fDpToPx};
        } else {
            if (i7 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            fArr = new float[]{fDpToPx, fDpToPx, fDpToPx, fDpToPx, fDpToPx, fDpToPx, fDpToPx, fDpToPx};
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setShape(0);
        if (color != 0) {
            gradientDrawable.setColor(color);
        }
        constraintLayout.setBackground(gradientDrawable);
        if (aVar.f82516c) {
            textView2.setVisibility(0);
            textView2.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(ContextCompat.getColor(context, R$color.Pi5), 0.0f, DimenUtilsKt.dpToPx(10.0f), 0));
        } else {
            textView2.setVisibility(8);
        }
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new VideoDownloadQualityComponent$bind$3(this, textView, context, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return Dr0.k.inflate(LayoutInflater.from(context), viewGroup, false);
    }
}
