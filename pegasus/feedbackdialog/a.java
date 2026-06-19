package com.bilibili.pegasus.feedbackdialog;

import A80.w;
import android.content.Context;
import android.graphics.Rect;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.pegasus.PegasusDDConfigKt;
import java.util.List;
import kntr.app.pegasus.feedbackdialog.model.Feedback;
import kntr.app.pegasus.feedbackdialog.model.FeedbackItem;
import kntr.app.pegasus.feedbackdialog.model.FeedbackItemType;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/feedbackdialog/a.class */
public final class a {
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.fragment.app.DialogFragment, com.bilibili.pegasus.feedbackdialog.FeedbackDialogFragmentV5, java.lang.Object] */
    public static final void a(@NotNull Fragment fragment, int i7, boolean z6, @Nullable String str, @Nullable String str2, @Nullable List<Feedback> list, @Nullable Function1<? super FeedbackItemType, Unit> function1) {
        List items;
        FeedbackItem feedbackItem;
        if (!fragment.isAdded()) {
            BLog.i("[ThreePoint]FeedbackDialogCompat", "showFeedbackDialogV5, anchor fragment not attached");
            return;
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        if (childFragmentManager.isDestroyed()) {
            childFragmentManager = null;
        }
        if (childFragmentManager != null) {
            if (i7 == 1 && !z6 && list != null && list.size() == 1 && (items = ((Feedback) CollectionsKt.first(list)).getItems()) != null && items.size() == 1) {
                List items2 = ((Feedback) CollectionsKt.first(list)).getItems();
                if (items2 == null || (feedbackItem = (FeedbackItem) CollectionsKt.first(items2)) == null) {
                    return;
                }
                feedbackItem.getOnClick().invoke(feedbackItem);
                return;
            }
            ?? feedbackDialogFragmentV5 = new FeedbackDialogFragmentV5();
            Pair pair = TuplesKt.to("is_second_panel", z6 ? "1" : "0");
            String str3 = str;
            if (str == null) {
                str3 = "invalid";
            }
            Pair pair2 = TuplesKt.to("goto", str3);
            String str4 = str2;
            if (str2 == null) {
                str4 = "invalid";
            }
            try {
                feedbackDialogFragmentV5.f77476c = MapsKt.mapOf(new Pair[]{pair, pair2, TuplesKt.to("card_type", str4)});
                feedbackDialogFragmentV5.f77475b = list;
                feedbackDialogFragmentV5.f77479f = new w(1, (Object) feedbackDialogFragmentV5, function1);
                feedbackDialogFragmentV5.show(childFragmentManager, "FeedbackDialogFragment");
            } catch (IllegalStateException e7) {
                BLog.e("FeedbackDialogFragment", "FeedbackDialogFragment show failed");
            }
        }
    }

    public static final void b(@NotNull Context context, @NotNull Fragment fragment, @Nullable Rect rect, int i7, boolean z6, @Nullable String str, @Nullable String str2, @Nullable List<Feedback> list, @Nullable Function1<? super FeedbackItemType, Unit> function1) {
        List items;
        FeedbackItem feedbackItem;
        FragmentActivity fragmentActivityP3 = fragment.p3();
        WindowSizeClass windowSizeClassWindowSize = fragmentActivityP3 != null ? ScreenAdjustUtilsKt.windowSize(fragmentActivityP3) : null;
        if (windowSizeClassWindowSize == null || PegasusDDConfigKt.isWidthNormal(windowSizeClassWindowSize)) {
            a(fragment, i7, z6, str, str2, list, function1);
            return;
        }
        if (i7 != 1 || z6 || list == null || list.size() != 1 || (items = ((Feedback) CollectionsKt.first(list)).getItems()) == null || items.size() != 1) {
            Pair pair = TuplesKt.to("is_second_panel", z6 ? "1" : "0");
            Pair pair2 = TuplesKt.to("goto", str == null ? "invalid" : str);
            if (str2 == null) {
                str2 = "invalid";
            }
            new FeedbackDialogV5(context, rect, list, MapsKt.mapOf(new Pair[]{pair, pair2, TuplesKt.to("card_type", str2)}), function1, null, 32, null).show();
            return;
        }
        List items2 = ((Feedback) CollectionsKt.first(list)).getItems();
        if (items2 == null || (feedbackItem = (FeedbackItem) CollectionsKt.first(items2)) == null) {
            return;
        }
        feedbackItem.getOnClick().invoke(feedbackItem);
    }
}
