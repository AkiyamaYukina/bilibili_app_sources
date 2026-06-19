package com.bilibili.playerbizcommonv2.service.ai;

import Dr0.u;
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
import com.bilibili.app.gemini.ui.m;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.media.resource.LanguageItem;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommonv2.utils.p;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/ai/PlayerAiSelectComponent.class */
@StabilityInferred(parameters = 0)
public final class PlayerAiSelectComponent extends m<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f81823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Flow<LanguageItem> f81824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f81825c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/ai/PlayerAiSelectComponent$BackgroundType.class */
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/ai/PlayerAiSelectComponent$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f81826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f81827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f81828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final BackgroundType f81829d;

        public a(@NotNull String str, @NotNull String str2, int i7, @NotNull BackgroundType backgroundType) {
            this.f81826a = str;
            this.f81827b = str2;
            this.f81828c = i7;
            this.f81829d = backgroundType;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/ai/PlayerAiSelectComponent$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f81830a;

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
            f81830a = iArr;
        }
    }

    public PlayerAiSelectComponent(@NotNull a aVar, @NotNull Flow<LanguageItem> flow, @NotNull Function0<Unit> function0) {
        this.f81823a = aVar;
        this.f81824b = flow;
        this.f81825c = function0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object a(ViewBinding viewBinding, Continuation continuation) throws NoWhenBranchMatchedException {
        float[] fArr;
        u uVar = (u) viewBinding;
        ConstraintLayout constraintLayout = uVar.f3151a;
        Context context = constraintLayout.getContext();
        TextView textView = uVar.f3154d;
        View view = uVar.f3153c;
        TextView textView2 = uVar.f3152b;
        a aVar = this.f81823a;
        textView.setText(aVar.f81826a);
        constraintLayout.setOnClickListener(new com.bilibili.app.comment3.ui.holder.u(this, 2));
        BackgroundType backgroundType = BackgroundType.BOTTOM;
        int i7 = 8;
        BackgroundType backgroundType2 = aVar.f81829d;
        if (backgroundType2 == backgroundType || backgroundType2 == BackgroundType.TOP_BOTTOM) {
            Lazy lazy = p.f81943a;
            view.setVisibility(8);
        } else {
            Lazy lazy2 = p.f81943a;
            view.setVisibility(0);
        }
        int color = ContextCompat.getColor(context, R$color.Bg1_float);
        float fDpToPx = DimenUtilsKt.dpToPx(8.0f);
        int i8 = b.f81830a[backgroundType2.ordinal()];
        if (i8 == 1) {
            fArr = new float[]{fDpToPx, fDpToPx, fDpToPx, fDpToPx, 0.0f, 0.0f, 0.0f, 0.0f};
        } else if (i8 == 2) {
            fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        } else if (i8 == 3) {
            fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, fDpToPx, fDpToPx, fDpToPx, fDpToPx};
        } else {
            if (i8 != 4) {
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
        if (aVar.f81828c == 2) {
            i7 = 0;
        }
        textView2.setVisibility(i7);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new PlayerAiSelectComponent$bind$3(this, textView, context, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return u.inflate(LayoutInflater.from(context), viewGroup, false);
    }
}
