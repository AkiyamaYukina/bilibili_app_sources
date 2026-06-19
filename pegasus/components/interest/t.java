package com.bilibili.pegasus.components.interest;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.common.widget.bottomsheet.drag.ListThreePointMenuDialogFragment;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.app.screen.adjust.widget.PopupBgColor;
import com.bilibili.app.screen.adjust.widget.ScreenAdjustPopupDialog;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.pegasus.PegasusDDConfigKt;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import java.util.List;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/t.class */
public final class t {
    public static final void a(@NotNull final Context context, @Nullable final A a7, final int i7, final long j7, @Nullable final InterestPageType interestPageType, @Nullable final String str, @Nullable View view) {
        Neurons.reportClick(true, "main.interest-select.three-point.0.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("style", String.valueOf(i7)), TuplesKt.to("unique_id", String.valueOf(j7)), TuplesKt.to("strategy", str)}));
        if (view == null || PegasusDDConfigKt.isWidthNormal(ScreenAdjustUtilsKt.windowSize(context))) {
            List listListOf = CollectionsKt.listOf(new com.bilibili.app.comm.list.common.widget.bottomsheet.drag.model.d(CollectionsKt.listOf(new com.bilibili.app.comm.list.common.widget.bottomsheet.drag.model.b[]{new com.bilibili.app.comm.list.common.widget.bottomsheet.drag.model.b(2131845128, false), new com.bilibili.app.comm.list.common.widget.bottomsheet.drag.model.b(2131841696, true)}), new Function1(a7, interestPageType, i7, j7, str) { // from class: com.bilibili.pegasus.components.interest.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final A f76351a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final InterestPageType f76352b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f76353c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final long f76354d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final String f76355e;

                {
                    this.f76351a = a7;
                    this.f76352b = interestPageType;
                    this.f76353c = i7;
                    this.f76354d = j7;
                    this.f76355e = str;
                }

                public final Object invoke(Object obj) {
                    int iIntValue = ((Integer) obj).intValue();
                    if (iIntValue == 0) {
                        A a8 = this.f76351a;
                        if (a8 != null) {
                            a8.W(this.f76352b);
                        }
                    } else if (iIntValue == 1) {
                        e.p(this.f76353c, this.f76354d, this.f76355e);
                    }
                    return Unit.INSTANCE;
                }
            }));
            FragmentActivity fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(context);
            FragmentManager supportFragmentManager = fragmentActivityFindFragmentActivityOrNull != null ? fragmentActivityFindFragmentActivityOrNull.getSupportFragmentManager() : null;
            if (supportFragmentManager != null) {
                ListThreePointMenuDialogFragment.show$default(ListThreePointMenuDialogFragment.Companion.newInstance(), supportFragmentManager, listListOf, "interest", (Function0) null, 8, (Object) null);
                return;
            }
            return;
        }
        Context contextFindActivityOrNull = ContextUtilKt.findActivityOrNull(context);
        if (contextFindActivityOrNull == null) {
            contextFindActivityOrNull = context;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i8 = iArr[0];
        Rect rect = new Rect(i8, iArr[1], view.getWidth() + i8, view.getHeight() + iArr[1]);
        final MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        new ScreenAdjustPopupDialog(contextFindActivityOrNull, rect, ComposableLambdaKt.composableLambdaInstance(1179684619, true, new Function2(a7, interestPageType, MutableStateFlow, i7, j7, str, context) { // from class: com.bilibili.pegasus.components.interest.q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final A f76356a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final InterestPageType f76357b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final MutableStateFlow f76358c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f76359d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final long f76360e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final String f76361f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Context f76362g;

            {
                this.f76356a = a7;
                this.f76357b = interestPageType;
                this.f76358c = MutableStateFlow;
                this.f76359d = i7;
                this.f76360e = j7;
                this.f76361f = str;
                this.f76362g = context;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0173  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0321  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 1075
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.q.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }), 200, MutableStateFlow, (Function0) null, (PopupBgColor) null, false, false, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, (DefaultConstructorMarker) null).show();
    }

    public static /* synthetic */ void b(Context context, A a7, int i7, long j7, InterestPageType interestPageType, String str, int i8) {
        if ((i8 & 8) != 0) {
            interestPageType = null;
        }
        if ((i8 & 16) != 0) {
            str = null;
        }
        a(context, a7, i7, j7, interestPageType, str, null);
    }
}
