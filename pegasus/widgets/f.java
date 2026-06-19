package com.bilibili.pegasus.widgets;

import Pb.F;
import Pb.G;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.ThumbnailUrlTransformStrategy;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.menu.IFloatMenuItem;
import com.bilibili.lib.ui.menu.NormalMenuItem;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/f.class */
@StabilityInferred(parameters = 0)
public final class f implements IFloatMenuItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f79229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f79230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f79231c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final NormalMenuItem.OnMenuClickListener f79232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public PopupWindow f79233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Dialog f79234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public View f79235g;

    public f(String str, String str2, com.bilibili.pegasus.card.base.t tVar) {
        this.f79229a = str;
        this.f79230b = str2;
        this.f79232d = tVar;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public final int getType() {
        return 683395380;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    @NotNull
    public final View getView(@Nullable View view, @NotNull ViewGroup viewGroup) {
        if (view == null) {
            view = p.a(viewGroup, 2131494629, viewGroup, false);
            view.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.pegasus.widgets.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final f f79228a;

                {
                    this.f79228a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Dialog dialog;
                    PopupWindow popupWindow;
                    f fVar = this.f79228a;
                    PopupWindow popupWindow2 = fVar.f79233e;
                    if (popupWindow2 != null && popupWindow2.isShowing() && (popupWindow = fVar.f79233e) != null) {
                        Contract contractAb = ConfigManager.Companion.ab();
                        Boolean bool = Boolean.TRUE;
                        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
                            Thread threadCurrentThread = Thread.currentThread();
                            if (!androidx.appcompat.app.n.a(threadCurrentThread)) {
                                IllegalStateException illegalStateException = new IllegalStateException(F.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
                            }
                        }
                        popupWindow.dismiss();
                    }
                    Dialog dialog2 = fVar.f79234f;
                    if (dialog2 != null && dialog2.isShowing() && (dialog = fVar.f79234f) != null) {
                        Contract contractAb2 = ConfigManager.Companion.ab();
                        Boolean bool2 = Boolean.TRUE;
                        if (Intrinsics.areEqual(contractAb2.get("bgthread_ui_access_detect_enable", bool2), bool2)) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            if (!androidx.appcompat.app.n.a(threadCurrentThread2)) {
                                IllegalStateException illegalStateException2 = new IllegalStateException(F.b("Dialog.dismiss() called from non-UI thread: ", threadCurrentThread2, ", 请联系 Jackin"));
                                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("Dialog.dismiss() called from non-UI thread: ", threadCurrentThread2, "BgThreadUIAccess", illegalStateException2, illegalStateException2)), TuplesKt.to("threadName", threadCurrentThread2.getName())}), 1, new AT0.c(8));
                            }
                        }
                        dialog.dismiss();
                    }
                    NormalMenuItem.OnMenuClickListener onMenuClickListener = fVar.f79232d;
                    if (onMenuClickListener != null) {
                        onMenuClickListener.onMenuClick(view2);
                    }
                }
            });
        }
        BiliImageView biliImageViewFindViewById = view.findViewById(2131307381);
        TextView textView = (TextView) view.findViewById(2131307409);
        TextView textView2 = (TextView) view.findViewById(2131307407);
        this.f79235g = view.findViewById(2131299397);
        if (this.f79229a == null || !(!StringsKt.isBlank(r0))) {
            biliImageViewFindViewById.setVisibility(8);
        } else {
            biliImageViewFindViewById.setVisibility(0);
            ImageExtentionKt.displayImage$default(biliImageViewFindViewById, this.f79229a, (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, (ScaleType) null, (BitmapTransformation) null, false, 1022, (Object) null);
        }
        ListExtentionsKt.setText(textView, this.f79230b);
        ListExtentionsKt.setText(textView2, this.f79231c);
        return view;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public final void onBindDialog(@Nullable Dialog dialog) {
        this.f79234f = dialog;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public final void onBindPopupWindow(@Nullable PopupWindow popupWindow) {
        this.f79233e = popupWindow;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public final void toggleDivider(int i7) {
        View view = this.f79235g;
        if (view != null) {
            view.setVisibility(i7);
        }
    }
}
