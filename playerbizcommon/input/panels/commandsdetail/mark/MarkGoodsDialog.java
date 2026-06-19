package com.bilibili.playerbizcommon.input.panels.commandsdetail.mark;

import android.app.Dialog;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bilibili.playerbizcommon.input.panels.commandsdetail.mark.MarkGoodsList;
import com.bilibili.playerbizcommon.input.panels.commandsdetail.mark.MarkRelatedGoodsItem$requestGoodsList$1;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.RecyclerView;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/commandsdetail/mark/MarkGoodsDialog.class */
public final class MarkGoodsDialog extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ImageView f80130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public RecyclerView f80131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final c f80132d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public MarkRelatedGoodsItem$requestGoodsList$1.a f80133e;

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation != 1) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate;
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            viewInflate = null;
        } else {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setWindowAnimations(2131886233);
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            Bundle arguments = getArguments();
            attributes.height = arguments != null ? arguments.getInt("mark_goods_dialog_height") : NewPlayerUtilsKt.toPx(300.0f);
            attributes.gravity = 80;
            window.setAttributes(attributes);
            viewInflate = layoutInflater.inflate(2131493839, viewGroup, false);
            this.f80130b = (ImageView) viewInflate.findViewById(2131296853);
            this.f80131c = viewInflate.findViewById(2131308035);
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f80131c = null;
        this.f80133e = null;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bilibili.playerbizcommon.input.panels.commandsdetail.mark.c, java.lang.Object] */
    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ImageView imageView = this.f80130b;
        if (imageView != null) {
            imageView.setOnClickListener(new QH0.b(this, 1));
        }
        RecyclerView recyclerView = this.f80131c;
        List<MarkGoodsList.MarkGoods> itemList = null;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f80132d);
            recyclerView.setItemAnimator(null);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        }
        MarkRelatedGoodsItem$requestGoodsList$1.a aVar = this.f80133e;
        if (aVar != null) {
            MarkGoodsList markGoodsList = aVar.f80134a;
            if (markGoodsList != null) {
                itemList = markGoodsList.getItemList();
            }
            if (itemList != null) {
                ?? r02 = this.f80132d;
                r02.getClass();
                List<MarkGoodsList.MarkGoods> list = itemList;
                if (!list.isEmpty()) {
                    ((ArrayList) r02.f80142a).clear();
                    ((ArrayList) r02.f80142a).addAll(list);
                    r02.notifyDataSetChanged();
                }
                this.f80132d.f80143b = new QH0.c(this, 1);
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void showNow(@NotNull FragmentManager fragmentManager, @Nullable String str) {
        if (fragmentManager.isStateSaved()) {
            return;
        }
        super.showNow(fragmentManager, str);
    }
}
