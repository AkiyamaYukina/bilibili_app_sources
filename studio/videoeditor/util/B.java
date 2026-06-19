package com.bilibili.studio.videoeditor.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.StringRes;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.search2.result.bangumi.ViewOnClickListenerC6065e;
import com.bilibili.studio.editor.moudle.home.presenter.a;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/B.class */
public final class B {
    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "dismiss", owner = {"android.widget.PopupWindow"}, scope = {})
    public static void a(@NotNull Object obj) {
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!androidx.appcompat.app.n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(Pb.F.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", Pb.G.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
            }
        }
        ((PopupWindow) obj).dismiss();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [android.widget.PopupWindow, com.bilibili.studio.videoeditor.util.w, java.lang.Object] */
    public static C6649w b(final Context context, View view, @StringRes int i7, final String str, boolean z6, int i8, int i9, int i10, boolean z7) {
        int iDp2px;
        int iDp2px2;
        if (context == null) {
            return null;
        }
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(context);
        if ((activityFindActivityOrNull != null && (activityFindActivityOrNull.isDestroyed() || activityFindActivityOrNull.isFinishing())) || BiliGlobalPreferenceHelper.getInstance(context).optBoolean(str, false)) {
            return null;
        }
        View viewInflate = LayoutInflater.from(context).inflate(2131495206, (ViewGroup) null);
        final ?? popupWindow = new PopupWindow(viewInflate, z7 ? (int) (((double) DensityUtil.getDevicesWidthPixels(context)) * 0.6d) : -2, -2);
        View viewFindViewById = viewInflate.findViewById(2131305588);
        View viewFindViewById2 = viewInflate.findViewById(2131303602);
        View viewFindViewById3 = viewInflate.findViewById(2131303593);
        viewFindViewById2.setVisibility(z6 ? 0 : 8);
        viewFindViewById3.setVisibility(z6 ? 8 : 0);
        ((TextView) viewInflate.findViewById(2131314658)).setText(i7);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        viewFindViewById.measure(0, 0);
        ViewGroup.LayoutParams layoutParams = z6 ? viewFindViewById2.getLayoutParams() : viewFindViewById3.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            if (z7) {
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = DensityUtil.dp2px(context, i10) + (viewFindViewById.getMeasuredWidth() / 2);
            } else {
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = DensityUtil.dp2px(context, i10);
            }
        }
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        if (z7) {
            iDp2px = DensityUtil.dp2px(context, i8);
            iDp2px2 = DensityUtil.dp2px(context, i9) + (-(view.getMeasuredHeight() + viewFindViewById.getMeasuredHeight()));
        } else {
            iDp2px = DensityUtil.dp2px(context, i8) + ((-(viewFindViewById.getMeasuredWidth() - view.getMeasuredWidth())) / 2);
            iDp2px2 = DensityUtil.dp2px(context, i9);
        }
        if (view.getWindowToken() != null) {
            try {
                popupWindow.showAsDropDown(view, iDp2px, iDp2px2);
            } catch (Exception e7) {
                BLog.efmt("EditorGuideUtil", "handleShowGuide...e = %s", new Object[]{e7.fillInStackTrace()});
            }
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC6650x(popupWindow, view, iDp2px, iDp2px2));
        }
        viewInflate.findViewById(2131303599).setOnClickListener(new ViewOnClickListenerC6065e(popupWindow, 1));
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener(context, str, popupWindow) { // from class: com.bilibili.studio.videoeditor.util.t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Context f110249a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f110250b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final C6649w f110251c;

            {
                this.f110249a = context;
                this.f110250b = str;
                this.f110251c = popupWindow;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                Context context2 = this.f110249a;
                String str2 = this.f110250b;
                C6649w c6649w = this.f110251c;
                BiliGlobalPreferenceHelper.getInstance(context2).setBoolean(str2, true);
                Lazy<com.bilibili.studio.editor.moudle.home.presenter.a> lazy = com.bilibili.studio.editor.moudle.home.presenter.a.f107228b;
                a.C1194a.a().f107229a.remove(c6649w);
            }
        });
        return popupWindow;
    }
}
