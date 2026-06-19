package com.bilibili.playerbizcommonv2.widget.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.droid.DimenUtilsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.WindowInset;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/RightInsetWithShadowFunctionWidget.class */
@StabilityInferred(parameters = 0)
public abstract class RightInsetWithShadowFunctionWidget extends AbsFunctionWidget {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f82378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public View f82379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public View f82380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public View f82381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @InjectPlayerService
    private IControlContainerService f82382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @InjectPlayerService
    private AbsFunctionWidgetService f82383f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/RightInsetWithShadowFunctionWidget$ShadowSize.class */
    public static final class ShadowSize {
        private static final EnumEntries $ENTRIES;
        private static final ShadowSize[] $VALUES;
        public static final ShadowSize SMALL = new ShadowSize("SMALL", 0);
        public static final ShadowSize MEDIUM = new ShadowSize("MEDIUM", 1);

        private static final /* synthetic */ ShadowSize[] $values() {
            return new ShadowSize[]{SMALL, MEDIUM};
        }

        static {
            ShadowSize[] shadowSizeArr$values = $values();
            $VALUES = shadowSizeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(shadowSizeArr$values);
        }

        private ShadowSize(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<ShadowSize> getEntries() {
            return $ENTRIES;
        }

        public static ShadowSize valueOf(String str) {
            return (ShadowSize) Enum.valueOf(ShadowSize.class, str);
        }

        public static ShadowSize[] values() {
            return (ShadowSize[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/RightInsetWithShadowFunctionWidget$a.class */
    public static final class a {
        @NotNull
        public static IFunctionContainer.LayoutParams a(@NotNull ScreenModeType screenModeType) {
            int layoutType;
            IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
            if (screenModeType == ScreenModeType.VERTICAL_FULLSCREEN) {
                layoutType = layoutParams.getLayoutType() | 8;
            } else {
                layoutParams.setExitAnim(2130772463);
                layoutParams.setEnterAnim(2130772462);
                layoutType = layoutParams.getLayoutType() | 4;
            }
            layoutParams.setLayoutType(layoutType);
            return layoutParams;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/RightInsetWithShadowFunctionWidget$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f82384a;

        static {
            int[] iArr = new int[ShadowSize.values().length];
            try {
                iArr[ShadowSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ShadowSize.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f82384a = iArr;
        }
    }

    public RightInsetWithShadowFunctionWidget(@NotNull Context context) {
        super(context);
    }

    public static void g(RightInsetWithShadowFunctionWidget rightInsetWithShadowFunctionWidget) {
        AbsFunctionWidgetService absFunctionWidgetService = rightInsetWithShadowFunctionWidget.f82383f;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        absFunctionWidgetService2.hideWidget(rightInsetWithShadowFunctionWidget);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static int h(ShadowSize shadowSize) throws NoWhenBranchMatchedException {
        int iDpToPx;
        int i7 = b.f82384a[shadowSize.ordinal()];
        if (i7 == 1) {
            iDpToPx = DimenUtilsKt.dpToPx(130.0f);
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iDpToPx = DimenUtilsKt.dpToPx(228.0f);
        }
        return iDpToPx;
    }

    @NotNull
    public abstract View contentView(@NotNull Context context);

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public final View createContentView(@NotNull Context context) throws NoWhenBranchMatchedException {
        IControlContainerService iControlContainerService = this.f82382e;
        IControlContainerService iControlContainerService2 = iControlContainerService;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
            iControlContainerService2 = null;
        }
        boolean z6 = iControlContainerService2.getScreenModeType() == ScreenModeType.VERTICAL_FULLSCREEN;
        ShadowSize shadowSize = shadowSize();
        View viewContentView = contentView(context);
        this.f82379b = viewContentView;
        this.f82378a = viewContentView.getPaddingRight();
        FrameLayout frameLayout = new FrameLayout(context);
        int iDpToPx = -1;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        imageView.setScaleType(scaleType);
        if (z6) {
            imageView.setImageDrawable(ContextCompat.getDrawable(context, 2131242772));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, DimenUtilsKt.dpToPx(310.0f));
            layoutParams.bottomMargin = h(shadowSize);
            layoutParams.gravity = 80;
            imageView.setLayoutParams(layoutParams);
        } else {
            imageView.setImageDrawable(ContextCompat.getDrawable(context, 2131242770));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(DimenUtilsKt.dpToPx(310.0f), -1);
            layoutParams2.rightMargin = h(shadowSize);
            layoutParams2.gravity = 5;
            imageView.setLayoutParams(layoutParams2);
            this.f82381d = imageView;
        }
        frameLayout.addView(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(ContextCompat.getDrawable(context, 2131242771));
        imageView2.setScaleType(scaleType);
        if (z6) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, h(shadowSize));
            layoutParams3.gravity = 80;
            imageView2.setLayoutParams(layoutParams3);
        } else {
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(h(shadowSize), -1);
            layoutParams4.gravity = 5;
            imageView2.setLayoutParams(layoutParams4);
            this.f82380c = imageView2;
        }
        frameLayout.addView(imageView2);
        if (!z6) {
            int i7 = b.f82384a[shadowSize.ordinal()];
            if (i7 == 1) {
                iDpToPx = DimenUtilsKt.dpToPx(240);
            } else {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iDpToPx = DimenUtilsKt.dpToPx(352);
            }
        }
        int iDpToPx2 = -2;
        if (z6) {
            iDpToPx2 = getVerticalWrapContent() ? -2 : DimenUtilsKt.dpToPx(382);
        }
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iDpToPx, iDpToPx2);
        layoutParams5.gravity = z6 ? 80 : 21;
        Unit unit = Unit.INSTANCE;
        frameLayout.addView(viewContentView, layoutParams5);
        frameLayout.setOnClickListener(new Gf1.b(this, 2));
        return frameLayout;
    }

    @NotNull
    public tv.danmaku.biliplayerv2.service.f getFunctionInsetConfig() {
        return new tv.danmaku.biliplayerv2.service.f(0, 30);
    }

    public boolean getVerticalWrapContent() {
        return false;
    }

    public void onRelease() {
    }

    public void onWindowInsetChanged(@NotNull WindowInset windowInset) {
        int paddingRight;
        getView();
        int iCoerceAtLeast = RangesKt.coerceAtLeast(windowInset.getRightPadding(), this.f82378a);
        View view = this.f82379b;
        if (view == null || (paddingRight = view.getPaddingRight()) == iCoerceAtLeast) {
            return;
        }
        if (paddingRight != this.f82378a || paddingRight < iCoerceAtLeast) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = (layoutParams.width - paddingRight) + iCoerceAtLeast;
            view.setLayoutParams(layoutParams);
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), iCoerceAtLeast, view.getPaddingBottom());
            View view2 = this.f82380c;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                layoutParams3.width = (layoutParams3.width - paddingRight) + iCoerceAtLeast;
                view2.setLayoutParams(layoutParams3);
            }
            View view3 = this.f82381d;
            if (view3 != null) {
                ViewGroup.LayoutParams layoutParams4 = view3.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
                layoutParams5.rightMargin = (layoutParams5.rightMargin - paddingRight) + iCoerceAtLeast;
                view3.setLayoutParams(layoutParams5);
            }
        }
    }

    @NotNull
    public abstract ShadowSize shadowSize();
}
