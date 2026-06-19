package com.bilibili.playerbizcommonv2.widget.dialog;

import Pr0.h;
import Pr0.i;
import X1.C3081k;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultCaller;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import androidx.constraintlayout.widget.e;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c6.P;
import com.bilibili.lib.theme.R$color;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.playerbizcommonv2.widget.dialog.PlayerFullScreenDialogFragment;
import com.bilibili.playerbizcommonv2.widget.dialog.PlayerFullScreenDragHandleBehavior;
import com.bilibili.playerbizcommonv2.widget.dialog.a;
import com.bilibili.search2.halfscreen.SearchCoreHostFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import lV.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dialog/PlayerFullScreenDialogFragment.class */
@StabilityInferred(parameters = 0)
public final class PlayerFullScreenDialogFragment extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public Pr0.b f82445b = new Pr0.b(0, 0.0f, 0, (Integer) null, 31);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public a.C0541a f82446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PlayerFullScreenDragHandleBehavior f82447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public E8.a f82448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public DialogInterface.OnDismissListener f82449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public BottomSheetBehavior.BottomSheetCallback f82450g;

    @Nullable
    public Pr0.c h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f82451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public b f82452j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dialog/PlayerFullScreenDialogFragment$DragMode.class */
    public static final class DragMode {
        private static final EnumEntries $ENTRIES;
        private static final DragMode[] $VALUES;

        @NotNull
        private final String logName;
        public static final DragMode WHOLE_SHEET = new DragMode("WHOLE_SHEET", 0, "wholeSheet");
        public static final DragMode HANDLE_ONLY = new DragMode("HANDLE_ONLY", 1, "handleOnly");

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dialog/PlayerFullScreenDialogFragment$DragMode$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f82453a;

            static {
                int[] iArr = new int[DragMode.values().length];
                try {
                    iArr[DragMode.WHOLE_SHEET.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[DragMode.HANDLE_ONLY.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                f82453a = iArr;
            }
        }

        private static final /* synthetic */ DragMode[] $values() {
            return new DragMode[]{WHOLE_SHEET, HANDLE_ONLY};
        }

        static {
            DragMode[] dragModeArr$values = $values();
            $VALUES = dragModeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(dragModeArr$values);
        }

        private DragMode(String str, int i7, String str2) {
            this.logName = str2;
        }

        @NotNull
        public static EnumEntries<DragMode> getEntries() {
            return $ENTRIES;
        }

        public static DragMode valueOf(String str) {
            return (DragMode) Enum.valueOf(DragMode.class, str);
        }

        public static DragMode[] values() {
            return (DragMode[]) $VALUES.clone();
        }

        @NotNull
        public final String getLogName() {
            return this.logName;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final int resolveAreaHeightPx(int i7, int i8) throws NoWhenBranchMatchedException {
            int i9 = a.f82453a[ordinal()];
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i7 = i8;
            }
            return i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dialog/PlayerFullScreenDialogFragment$a.class */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v19, types: [androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment, com.bilibili.playerbizcommonv2.widget.dialog.PlayerFullScreenDialogFragment] */
        @Nullable
        public static PlayerFullScreenDialogFragment a(@NotNull FragmentManager fragmentManager, @NotNull a.C0541a c0541a, @NotNull Pr0.b bVar) {
            if (fragmentManager.isStateSaved()) {
                defpackage.a.b("show skipped stateSaved=true ", i.b(bVar), "FullScreenDialogFragment");
                return null;
            }
            Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("FullScreenDialogFragment");
            if (fragmentFindFragmentByTag != 0 && fragmentFindFragmentByTag.isAdded()) {
                bilibili.live.app.service.resolver.b.a(C3081k.b("show reuse existing=", fragmentFindFragmentByTag.getClass().getSimpleName(), " isRemoving=", " ", fragmentFindFragmentByTag.isRemoving()), i.b(bVar), "FullScreenDialogFragment");
                PlayerFullScreenDialogFragment playerFullScreenDialogFragment = null;
                if (fragmentFindFragmentByTag instanceof PlayerFullScreenDialogFragment) {
                    playerFullScreenDialogFragment = (PlayerFullScreenDialogFragment) fragmentFindFragmentByTag;
                }
                return playerFullScreenDialogFragment;
            }
            BLog.i("FullScreenDialogFragment", "show new contentSpec=" + a.C0541a.class.getSimpleName() + " " + i.b(bVar));
            ?? playerFullScreenDialogFragment2 = new PlayerFullScreenDialogFragment();
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("cfg_dragTopAreaHeightPx", bVar.f19067a);
            bundle2.putFloat("cfg_dimAmount", bVar.f19068b);
            bundle2.putInt("cfg_peekHeightPx", bVar.f19069c);
            Integer num = bVar.f19070d;
            if (num != null) {
                bundle2.putInt("cfg_navigationBarColor", num.intValue());
            }
            bundle2.putBoolean("cfg_allowCollapseOnContentOverscroll", bVar.f19071e);
            bundle.putBundle("key_config", bundle2);
            playerFullScreenDialogFragment2.f82446c = c0541a;
            playerFullScreenDialogFragment2.setArguments(bundle);
            playerFullScreenDialogFragment2.show(fragmentManager, "FullScreenDialogFragment");
            return playerFullScreenDialogFragment2;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dialog/PlayerFullScreenDialogFragment$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f82454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f82455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f82456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f82457d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f82458e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f82459f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f82460g;
        public final int h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f82461i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f82462j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f82463k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f82464l;

        public b(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f82454a = i7;
            this.f82455b = i8;
            this.f82456c = i9;
            this.f82457d = i10;
            this.f82458e = i11;
            this.f82459f = i12;
            this.f82460g = i13;
            this.h = i14;
            this.f82461i = i15;
            this.f82462j = i16;
            this.f82463k = i17;
            this.f82464l = i18;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f82454a == bVar.f82454a && this.f82455b == bVar.f82455b && this.f82456c == bVar.f82456c && this.f82457d == bVar.f82457d && this.f82458e == bVar.f82458e && this.f82459f == bVar.f82459f && this.f82460g == bVar.f82460g && this.h == bVar.h && this.f82461i == bVar.f82461i && this.f82462j == bVar.f82462j && this.f82463k == bVar.f82463k && this.f82464l == bVar.f82464l;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f82464l) + I.a(this.f82463k, I.a(this.f82462j, I.a(this.f82461i, I.a(this.h, I.a(this.f82460g, I.a(this.f82459f, I.a(this.f82458e, I.a(this.f82457d, I.a(this.f82456c, I.a(this.f82455b, Integer.hashCode(this.f82454a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ContentAreaLog(rootHeight=");
            sb.append(this.f82454a);
            sb.append(", rootWidth=");
            sb.append(this.f82455b);
            sb.append(", navigationBarHeight=");
            sb.append(this.f82456c);
            sb.append(", visibleNavigationBarHeight=");
            sb.append(this.f82457d);
            sb.append(", stableNavigationBarHeight=");
            sb.append(this.f82458e);
            sb.append(", topInset=");
            sb.append(this.f82459f);
            sb.append(", contentHeight=");
            sb.append(this.f82460g);
            sb.append(", contentWidth=");
            sb.append(this.h);
            sb.append(", configuredPeekHeight=");
            sb.append(this.f82461i);
            sb.append(", targetPeekHeight=");
            sb.append(this.f82462j);
            sb.append(", oldPeekHeight=");
            sb.append(this.f82463k);
            sb.append(", appliedPeekHeight=");
            return C4277b.a(this.f82464l, ")", sb);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dialog/PlayerFullScreenDialogFragment$c.class */
    public static final class c extends Dialog {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerFullScreenDialogFragment f82465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PlayerFullScreenDialogFragment f82466b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PlayerFullScreenDialogFragment playerFullScreenDialogFragment, PlayerFullScreenDialogFragment playerFullScreenDialogFragment2, Context context) {
            super(context, 2131889139);
            this.f82465a = playerFullScreenDialogFragment;
            this.f82466b = playerFullScreenDialogFragment2;
        }

        @Override // android.app.Dialog, android.content.DialogInterface
        public final void cancel() {
            PlayerFullScreenDialogFragment.jf("dialogCancel state=" + this.f82465a.m8390if());
            PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior = this.f82466b.f82447d;
            PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior2 = playerFullScreenDragHandleBehavior;
            if (playerFullScreenDragHandleBehavior == null) {
                Intrinsics.throwUninitializedPropertyAccessException("behavior");
                playerFullScreenDragHandleBehavior2 = null;
            }
            playerFullScreenDragHandleBehavior2.setState(5);
        }

        @Override // android.app.Dialog, android.view.Window.Callback
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            E8.a aVar;
            boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (aVar = this.f82465a.f82448e) != null) {
                aVar.invoke();
            }
            return zDispatchTouchEvent;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void hf(PlayerFullScreenDialogFragment playerFullScreenDialogFragment, View view, int i7, int i8, int i9, int i10, WindowInsetsCompat windowInsetsCompat) {
        Pr0.a aVar;
        int iRoundToInt;
        Insets insets;
        Window window;
        View decorView;
        if (windowInsetsCompat == null) {
            Dialog dialog = playerFullScreenDialogFragment.getDialog();
            windowInsetsCompat = (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : ViewCompat.getRootWindowInsets(decorView);
        }
        if (windowInsetsCompat != null) {
            int i11 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom;
            int i12 = windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.navigationBars()).bottom;
            aVar = new Pr0.a(Math.max(i11, i12), i11, i12);
        } else {
            aVar = null;
        }
        int i13 = aVar != null ? aVar.f19064a : 0;
        view.setPadding(i7, i8, i9, i10 + i13);
        int i14 = aVar != null ? aVar.f19065b : 0;
        int i15 = aVar != null ? aVar.f19066c : 0;
        int i16 = (windowInsetsCompat == null || (insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars())) == null) ? 0 : insets.top;
        if (playerFullScreenDialogFragment.f82447d == null) {
            return;
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast(view.getHeight() - i13, 0);
        int width = view.getWidth();
        int i17 = playerFullScreenDialogFragment.f82445b.f19069c;
        Integer numValueOf = Integer.valueOf(i17);
        if (i17 <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iRoundToInt = numValueOf.intValue();
        } else {
            if (iCoerceAtLeast <= 0 || width <= 0) {
                int height = view.getHeight();
                int width2 = view.getWidth();
                int i18 = playerFullScreenDialogFragment.f82445b.f19069c;
                PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior = playerFullScreenDialogFragment.f82447d;
                PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior2 = playerFullScreenDragHandleBehavior;
                if (playerFullScreenDragHandleBehavior == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("behavior");
                    playerFullScreenDragHandleBehavior2 = null;
                }
                int peekHeight = playerFullScreenDragHandleBehavior2.getPeekHeight();
                PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior3 = playerFullScreenDialogFragment.f82447d;
                if (playerFullScreenDragHandleBehavior3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("behavior");
                    playerFullScreenDragHandleBehavior3 = null;
                }
                playerFullScreenDialogFragment.lf(new b(height, width2, i13, i14, i15, i16, iCoerceAtLeast, width, i18, 0, peekHeight, playerFullScreenDragHandleBehavior3.getPeekHeight()));
                return;
            }
            iRoundToInt = (iCoerceAtLeast - MathKt.roundToInt(width / 1.7777778f)) - i16;
        }
        PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior4 = playerFullScreenDialogFragment.f82447d;
        PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior5 = playerFullScreenDragHandleBehavior4;
        if (playerFullScreenDragHandleBehavior4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("behavior");
            playerFullScreenDragHandleBehavior5 = null;
        }
        int peekHeight2 = playerFullScreenDragHandleBehavior5.getPeekHeight();
        PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior6 = playerFullScreenDialogFragment.f82447d;
        if (playerFullScreenDragHandleBehavior6 != null) {
            playerFullScreenDragHandleBehavior6.getPeekHeight();
            int iCoerceAtLeast2 = RangesKt.coerceAtLeast(iRoundToInt, 0);
            PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior7 = playerFullScreenDialogFragment.f82447d;
            PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior8 = playerFullScreenDragHandleBehavior7;
            if (playerFullScreenDragHandleBehavior7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("behavior");
                playerFullScreenDragHandleBehavior8 = null;
            }
            playerFullScreenDragHandleBehavior8.setPeekHeight(iCoerceAtLeast2);
        }
        int height2 = view.getHeight();
        int width3 = view.getWidth();
        int i19 = playerFullScreenDialogFragment.f82445b.f19069c;
        PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior9 = playerFullScreenDialogFragment.f82447d;
        if (playerFullScreenDragHandleBehavior9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("behavior");
            playerFullScreenDragHandleBehavior9 = null;
        }
        playerFullScreenDialogFragment.lf(new b(height2, width3, i13, i14, i15, i16, iCoerceAtLeast, width, i19, iRoundToInt, peekHeight2, playerFullScreenDragHandleBehavior9.getPeekHeight()));
    }

    public static void jf(String str) {
        BLog.d("FullScreenDialogFragment", str);
    }

    public static void kf(String str) {
        BLog.i("FullScreenDialogFragment", str);
    }

    public final void dismissAllowingStateLoss() {
        try {
            kf("dismissAllowingStateLoss state=" + m8390if());
            super.dismissAllowingStateLoss();
        } catch (Exception e7) {
            BLog.e("FullScreenDialogFragment", "dismissAllowingStateLoss failed", e7);
        }
    }

    public final int getTheme() {
        return 2131889139;
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public final String m8390if() {
        PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior = this.f82447d;
        return playerFullScreenDragHandleBehavior != null ? i.a(playerFullScreenDragHandleBehavior.getState()) : "UNINITIALIZED";
    }

    public final void lf(b bVar) {
        if (Intrinsics.areEqual(this.f82452j, bVar)) {
            return;
        }
        this.f82452j = bVar;
        kf("updateContentArea rootHeight=" + bVar.f82454a + " rootWidth=" + bVar.f82455b + " navigationBarHeight=" + bVar.f82456c + " visibleNavigationBarHeight=" + bVar.f82457d + " stableNavigationBarHeight=" + bVar.f82458e + " topInset=" + bVar.f82459f + " contentHeight=" + bVar.f82460g + " contentWidth=" + bVar.h + " configuredPeekHeight=" + bVar.f82461i + " targetPeekHeight=" + bVar.f82462j + " oldPeekHeight=" + bVar.f82463k + " appliedPeekHeight=" + bVar.f82464l);
    }

    public final void mf() {
        if (this.f82447d == null) {
            kf("setBehaviorState ignored request=" + i.a(3) + " behaviorInitialized=false");
            return;
        }
        String strA = i.a(3);
        PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior = this.f82447d;
        PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior2 = playerFullScreenDragHandleBehavior;
        if (playerFullScreenDragHandleBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("behavior");
            playerFullScreenDragHandleBehavior2 = null;
        }
        kf("setBehaviorState request=" + strA + " current=" + i.a(playerFullScreenDragHandleBehavior2.getState()));
        PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior3 = this.f82447d;
        if (playerFullScreenDragHandleBehavior3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("behavior");
            playerFullScreenDragHandleBehavior3 = null;
        }
        playerFullScreenDragHandleBehavior3.setState(3);
    }

    public final void nf(@Nullable BottomSheetBehavior.BottomSheetCallback bottomSheetCallback) {
        this.f82450g = bottomSheetCallback;
        jf("setBottomSheetCallback hasCallback=" + (bottomSheetCallback != null));
    }

    public final void of(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        this.f82449f = onDismissListener;
        jf("setOnDismissListener hasListener=" + (onDismissListener != null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        Pr0.b bVar;
        super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
        Bundle arguments = getArguments();
        Integer numValueOf = null;
        Bundle bundle2 = arguments != null ? arguments.getBundle("key_config") : null;
        if (bundle2 == null) {
            bVar = new Pr0.b(0, 0.0f, 0, (Integer) null, 31);
        } else {
            int i7 = bundle2.containsKey("cfg_dragTopAreaHeightPx") ? bundle2.getInt("cfg_dragTopAreaHeightPx", 0) : 0;
            float f7 = bundle2.containsKey("cfg_dimAmount") ? bundle2.getFloat("cfg_dimAmount", 0.0f) : 0.0f;
            int i8 = bundle2.containsKey("cfg_peekHeightPx") ? bundle2.getInt("cfg_peekHeightPx", 0) : 0;
            if (bundle2.containsKey("cfg_navigationBarColor")) {
                numValueOf = Integer.valueOf(bundle2.getInt("cfg_navigationBarColor"));
            }
            bVar = new Pr0.b(i7, f7, i8, numValueOf, bundle2.containsKey("cfg_allowCollapseOnContentOverscroll") ? bundle2.getBoolean("cfg_allowCollapseOnContentOverscroll", true) : true);
        }
        this.f82445b = bVar;
        boolean z6 = bundle != null;
        kf("onCreate restored=" + z6 + " " + i.b(bVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        c cVar = new c(this, this, requireContext());
        cVar.setOnShowListener(new DialogInterface.OnShowListener(this) { // from class: Pr0.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerFullScreenDialogFragment f19075a;

            {
                this.f19075a = this;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                PlayerFullScreenDialogFragment playerFullScreenDialogFragment = this.f19075a;
                PlayerFullScreenDialogFragment.kf("dialogOnShow requestState=" + i.a(4) + " state=" + playerFullScreenDialogFragment.m8390if());
                PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior = playerFullScreenDialogFragment.f82447d;
                PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior2 = playerFullScreenDragHandleBehavior;
                if (playerFullScreenDragHandleBehavior == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("behavior");
                    playerFullScreenDragHandleBehavior2 = null;
                }
                playerFullScreenDragHandleBehavior2.setState(4);
            }
        });
        boolean z6 = true;
        cVar.setCanceledOnTouchOutside(true);
        Window window = cVar.getWindow();
        if (window != null) {
            WindowCompat.setDecorFitsSystemWindows(window, false);
            window.clearFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
            window.addFlags(Integer.MIN_VALUE);
            window.getDecorView().setSystemUiVisibility(1280);
            window.setStatusBarColor(0);
            Integer num = this.f82445b.f19070d;
            int iIntValue = num != null ? num.intValue() : ContextCompat.getColor(requireContext(), R$color.f64616Wh0);
            window.setNavigationBarColor(iIntValue);
            boolean z7 = ColorUtils.calculateLuminance(iIntValue) > 0.5d;
            boolean z8 = Build.VERSION.SDK_INT >= 26;
            if (z8) {
                new WindowInsetsControllerCompat(window, window.getDecorView()).setAppearanceLightNavigationBars(z7);
            }
            String strA = C4496a.a("#", StringsKt.padStart(Integer.toHexString(iIntValue), 8, '0'));
            if (this.f82445b.f19070d == null) {
                z6 = false;
            }
            StringBuilder sbB = C3081k.b("applyNavigationBarColor color=", strA, " configured=", " wantsLightNavigationBar=", z6);
            sbB.append(z7);
            sbB.append(" supportsLightNavigationBar=");
            sbB.append(z8);
            kf(sbB.toString());
        } else {
            kf("onCreateDialog window=null");
        }
        return cVar;
    }

    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131503029, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        super/*androidx.fragment.app.DialogFragment*/.onDismiss(dialogInterface);
        kf("onDismiss state=" + m8390if());
        DialogInterface.OnDismissListener onDismissListener = this.f82449f;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        Window window;
        super/*androidx.fragment.app.DialogFragment*/.onStart();
        jf("onStart hiddenForSlide=" + this.f82451i + " state=" + m8390if());
        if (!this.f82451i) {
            this.f82451i = true;
            PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior = this.f82447d;
            PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior2 = playerFullScreenDragHandleBehavior;
            if (playerFullScreenDragHandleBehavior == null) {
                Intrinsics.throwUninitializedPropertyAccessException("behavior");
                playerFullScreenDragHandleBehavior2 = null;
            }
            playerFullScreenDragHandleBehavior2.setState(5);
            kf("onStart initialHideApplied state=" + m8390if());
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setDimAmount(0.0f);
        window.setBackgroundDrawable(new ColorDrawable(0));
        jf("onStart windowLayout=MATCH_PARENT dimAmount=0 background=transparent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior, com.bilibili.playerbizcommonv2.widget.dialog.PlayerFullScreenDragHandleBehavior, com.google.android.material.bottomsheet.BottomSheetBehavior] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View$OnClickListener, java.lang.Object] */
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        final View viewFindViewById = view.findViewById(2131321946);
        final View viewFindViewById2 = view.findViewById(2131321951);
        View viewFindViewById3 = view.findViewById(2131321945);
        kf("onViewCreated contentSpec=".concat(this.f82446c != null ? a.C0541a.class.getSimpleName() : "null"));
        viewFindViewById2.setClickable(true);
        viewFindViewById2.setOnClickListener(new Object());
        final int i7 = 0;
        viewFindViewById3.setOnClickListener(new View.OnClickListener(i7, viewFindViewById2, this) { // from class: Pr0.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f19072a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f19073b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f19074c;

            {
                this.f19072a = i7;
                this.f19073b = viewFindViewById2;
                this.f19074c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Dialog dialog;
                switch (this.f19072a) {
                    case 0:
                        View view3 = (View) this.f19073b;
                        BottomSheetDialogFragment bottomSheetDialogFragment = (PlayerFullScreenDialogFragment) this.f19074c;
                        if (view3.getTop() > 0 && (dialog = bottomSheetDialogFragment.getDialog()) != null) {
                            dialog.cancel();
                            break;
                        }
                        break;
                    case 1:
                        b.a aVar = (b.a) this.f19073b;
                        lV.b bVar = (lV.b) this.f19074c;
                        Function1 function1 = aVar.e;
                        if (function1 != null) {
                            function1.invoke(view2.getContext());
                        }
                        bVar.dismiss();
                        break;
                    default:
                        tv.danmaku.bili.ui.garb.digital.h hVar = (tv.danmaku.bili.ui.garb.digital.h) this.f19073b;
                        hVar.y(((rf1.a) this.f19074c).l);
                        hVar.A();
                        break;
                }
            }
        });
        final int iCoerceAtLeast = RangesKt.coerceAtLeast(this.f82445b.f19067a, 0);
        DragMode dragMode = iCoerceAtLeast > 0 ? DragMode.HANDLE_ONLY : DragMode.WHOLE_SHEET;
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) viewFindViewById2.getLayoutParams();
        Pr0.c cVar = null;
        ?? playerFullScreenDragHandleBehavior = new PlayerFullScreenDragHandleBehavior(viewFindViewById2.getContext(), null, 2, null);
        playerFullScreenDragHandleBehavior.setAllowContentNestedScrollAsDrag(dragMode == DragMode.WHOLE_SHEET);
        playerFullScreenDragHandleBehavior.setAllowCollapseOnContentOverscroll(dragMode == DragMode.HANDLE_ONLY && this.f82445b.f19071e);
        final DragMode dragMode2 = dragMode;
        playerFullScreenDragHandleBehavior.setTouchInDragAreaPredicate(new Function1(this, viewFindViewById2, dragMode2, iCoerceAtLeast) { // from class: com.bilibili.playerbizcommonv2.widget.dialog.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerFullScreenDialogFragment f82483a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final View f82484b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final PlayerFullScreenDialogFragment.DragMode f82485c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f82486d;

            {
                this.f82483a = this;
                this.f82484b = viewFindViewById2;
                this.f82485c = dragMode2;
                this.f82486d = iCoerceAtLeast;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                View view2 = this.f82484b;
                MotionEvent motionEvent = (MotionEvent) obj;
                int iResolveAreaHeightPx = this.f82485c.resolveAreaHeightPx(view2.getHeight(), this.f82486d);
                this.f82483a.getClass();
                float left = view2.getLeft();
                float top = view2.getTop();
                float right = view2.getRight();
                float fMin = Math.min(iResolveAreaHeightPx, view2.getHeight()) + view2.getTop();
                float x6 = motionEvent.getX();
                return Boolean.valueOf(left <= x6 && x6 <= right && motionEvent.getY() >= top && motionEvent.getY() <= fMin);
            }
        });
        layoutParams.setBehavior(playerFullScreenDragHandleBehavior);
        viewFindViewById2.setLayoutParams(layoutParams);
        this.f82447d = playerFullScreenDragHandleBehavior;
        playerFullScreenDragHandleBehavior.setHideable(true);
        String logName = dragMode.getLogName();
        boolean allowContentNestedScrollAsDrag = playerFullScreenDragHandleBehavior.getAllowContentNestedScrollAsDrag();
        boolean allowCollapseOnContentOverscroll = playerFullScreenDragHandleBehavior.getAllowCollapseOnContentOverscroll();
        PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior2 = this.f82447d;
        PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior3 = playerFullScreenDragHandleBehavior2;
        if (playerFullScreenDragHandleBehavior2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("behavior");
            playerFullScreenDragHandleBehavior3 = null;
        }
        String strA = i.a(playerFullScreenDragHandleBehavior3.getState());
        PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior4 = this.f82447d;
        PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior5 = playerFullScreenDragHandleBehavior4;
        if (playerFullScreenDragHandleBehavior4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("behavior");
            playerFullScreenDragHandleBehavior5 = null;
        }
        int peekHeight = playerFullScreenDragHandleBehavior5.getPeekHeight();
        PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior6 = this.f82447d;
        PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior7 = playerFullScreenDragHandleBehavior6;
        if (playerFullScreenDragHandleBehavior6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("behavior");
            playerFullScreenDragHandleBehavior7 = null;
        }
        boolean zIsHideable = playerFullScreenDragHandleBehavior7.isHideable();
        StringBuilder sbA = e.a(iCoerceAtLeast, "setupSheetBehavior dragMode=", logName, " dragTopAreaHeightPx=", " contentNestedScrollAsDrag=");
        P.a(" contentOverscrollDismiss=", " state=", sbA, allowContentNestedScrollAsDrag, allowCollapseOnContentOverscroll);
        H0.e.b(peekHeight, strA, " peekHeight=", " isHideable=", sbA);
        sbA.append(zIsHideable);
        kf(sbA.toString());
        PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior8 = this.f82447d;
        PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior9 = playerFullScreenDragHandleBehavior8;
        if (playerFullScreenDragHandleBehavior8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("behavior");
            playerFullScreenDragHandleBehavior9 = null;
        }
        playerFullScreenDragHandleBehavior9.addBottomSheetCallback(new h(this));
        final int paddingLeft = viewFindViewById.getPaddingLeft();
        final int paddingTop = viewFindViewById.getPaddingTop();
        final int paddingRight = viewFindViewById.getPaddingRight();
        final int paddingBottom = viewFindViewById.getPaddingBottom();
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new OnApplyWindowInsetsListener(this, viewFindViewById, paddingLeft, paddingTop, paddingRight, paddingBottom) { // from class: Pr0.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerFullScreenDialogFragment f19076a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final View f19077b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f19078c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f19079d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f19080e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final int f19081f;

            {
                this.f19076a = this;
                this.f19077b = viewFindViewById;
                this.f19078c = paddingLeft;
                this.f19079d = paddingTop;
                this.f19080e = paddingRight;
                this.f19081f = paddingBottom;
            }

            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                PlayerFullScreenDialogFragment.hf(this.f19076a, this.f19077b, this.f19078c, this.f19079d, this.f19080e, this.f19081f, windowInsetsCompat);
                return windowInsetsCompat;
            }
        });
        viewFindViewById.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this, viewFindViewById, paddingLeft, paddingTop, paddingRight, paddingBottom) { // from class: Pr0.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerFullScreenDialogFragment f19082a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final View f19083b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f19084c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f19085d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f19086e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final int f19087f;

            {
                this.f19082a = this;
                this.f19083b = viewFindViewById;
                this.f19084c = paddingLeft;
                this.f19085d = paddingTop;
                this.f19086e = paddingRight;
                this.f19087f = paddingBottom;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                PlayerFullScreenDialogFragment playerFullScreenDialogFragment = this.f19082a;
                View view3 = this.f19083b;
                int i16 = this.f19084c;
                int i17 = this.f19085d;
                int i18 = this.f19086e;
                int i19 = this.f19087f;
                if (i13 == view2.getTop() && i15 == view2.getBottom() && i12 == view2.getLeft() && i14 == view2.getRight()) {
                    return;
                }
                PlayerFullScreenDialogFragment.hf(playerFullScreenDialogFragment, view3, i16, i17, i18, i19, ViewCompat.getRootWindowInsets(view2));
            }
        });
        ViewCompat.requestApplyInsets(viewFindViewById);
        ActivityResultCaller activityResultCallerFindFragmentByTag = getChildFragmentManager().findFragmentByTag("content_fragment_tag");
        if (activityResultCallerFindFragmentByTag != null) {
            Pr0.c cVar2 = null;
            if (activityResultCallerFindFragmentByTag instanceof Pr0.c) {
                cVar2 = (Pr0.c) activityResultCallerFindFragmentByTag;
            }
            this.h = cVar2;
            kf("attachContentFragment reuse fragment=" + activityResultCallerFindFragmentByTag.getClass().getSimpleName() + " hasDragCallback=" + (this.h != null));
        } else {
            a.C0541a c0541a = this.f82446c;
            SearchCoreHostFragment searchCoreHostFragment = c0541a != null ? c0541a.f82482a : null;
            if (searchCoreHostFragment == null) {
                kf("attachContentFragment skipped contentSpec=null");
            } else {
                getChildFragmentManager().beginTransaction().replace(2131321926, searchCoreHostFragment, "content_fragment_tag").commitNowAllowingStateLoss();
                if (searchCoreHostFragment instanceof Pr0.c) {
                    cVar = (Pr0.c) searchCoreHostFragment;
                }
                this.h = cVar;
                kf("attachContentFragment attached fragment=SearchCoreHostFragment hasDragCallback=" + (cVar != null));
            }
        }
        this.f82448e = new E8.a(this, 2);
    }
}
