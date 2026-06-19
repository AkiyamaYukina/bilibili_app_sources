package com.bilibili.lib.projection.internal.feedback;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bilibili.lib.projection.ProjectionTheme;
import com.bilibili.lib.projection.internal.feedback.PlayerCastFeedbackActivity;
import com.bilibili.lib.projection.internal.feedback.c;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.magicasakura.widgets.TintButton;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/feedback/PlayerCastFeedbackFragment.class */
public final class PlayerCastFeedbackFragment extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f63177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ProjectionReportLayout f63178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public View f63179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public com.bilibili.lib.projection.internal.feedback.c f63180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TextView f63181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public PlayerCastFeedbackActivity.a f63182g;

    @NotNull
    public final b h = new b(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/feedback/PlayerCastFeedbackFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f63183a;

        static {
            int[] iArr = new int[ProjectionTheme.values().length];
            try {
                iArr[ProjectionTheme.PINK.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ProjectionTheme.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f63183a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/feedback/PlayerCastFeedbackFragment$b.class */
    public static final class b implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerCastFeedbackFragment f63184a;

        public b(PlayerCastFeedbackFragment playerCastFeedbackFragment) {
            this.f63184a = playerCastFeedbackFragment;
        }

        @Override // com.bilibili.lib.projection.internal.feedback.c.a
        public final void onFailed() {
            PlayerCastFeedbackActivity.a aVar;
            PlayerCastFeedbackFragment playerCastFeedbackFragment = this.f63184a;
            if (playerCastFeedbackFragment.isAdded() && (aVar = playerCastFeedbackFragment.f63182g) != null) {
                aVar.f63176a.finish();
            }
        }

        @Override // com.bilibili.lib.projection.internal.feedback.c.a
        public final void onSuccess() {
            PlayerCastFeedbackActivity.a aVar;
            PlayerCastFeedbackFragment playerCastFeedbackFragment = this.f63184a;
            if (playerCastFeedbackFragment.isAdded() && (aVar = playerCastFeedbackFragment.f63182g) != null) {
                aVar.f63176a.finish();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/feedback/PlayerCastFeedbackFragment$c.class */
    public static final class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerCastFeedbackFragment f63185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TintButton f63186b;

        public c(PlayerCastFeedbackFragment playerCastFeedbackFragment, TintButton tintButton) {
            this.f63185a = playerCastFeedbackFragment;
            this.f63186b = tintButton;
        }

        @Override // com.bilibili.lib.projection.internal.feedback.h
        public final void a(String str) {
            if (str == null) {
                return;
            }
            PlayerCastFeedbackFragment playerCastFeedbackFragment = this.f63185a;
            ProjectionReportLayout projectionReportLayout = playerCastFeedbackFragment.f63178c;
            String otherStr = null;
            String reportId = projectionReportLayout != null ? projectionReportLayout.getReportId() : null;
            ProjectionReportLayout projectionReportLayout2 = playerCastFeedbackFragment.f63178c;
            if (projectionReportLayout2 != null) {
                otherStr = projectionReportLayout2.getOtherStr();
            }
            if (TextUtils.equals(reportId, "4")) {
                TintButton tintButton = this.f63186b;
                if (otherStr == null || otherStr.length() >= 2) {
                    tintButton.setEnabled(true);
                    tintButton.setTextColor(playerCastFeedbackFragment.getResources().getColor(2131101423));
                } else {
                    tintButton.setEnabled(false);
                    tintButton.setTextColor(playerCastFeedbackFragment.getResources().getColor(2131101422));
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131495221, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(2131299774);
        View viewInflate2 = layoutInflater.inflate(2131495222, viewGroup2, false);
        if (viewInflate2 == null) {
            throw new NullPointerException("The custom view cannot be null!");
        }
        if (viewGroup2 != viewInflate2) {
            if (viewInflate2.getParent() == null) {
                viewGroup2.addView(viewInflate2);
            } else if (viewInflate2.getParent() != viewGroup2) {
                throw new IllegalStateException("The specified custom view already has a parent.");
            }
        }
        return viewInflate;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0235 A[LOOP:1: B:42:0x022f->B:44:0x0235, LOOP_END] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r9, @org.jetbrains.annotations.Nullable android.os.Bundle r10) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.feedback.PlayerCastFeedbackFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
