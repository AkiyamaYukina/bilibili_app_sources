package com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark;

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
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.provider.UtilKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark.MarkGoodsList;
import com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark.MarkRelatedGoodsItem$requestGoodsList$1;
import java.util.ArrayList;
import java.util.List;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.RecyclerView;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/mark/MarkGoodsDialog.class */
@StabilityInferred(parameters = 0)
public final class MarkGoodsDialog extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ImageView f81069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public RecyclerView f81070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public View f81071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final b f81072e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public MarkRelatedGoodsItem$requestGoodsList$1.a f81073f;

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        dismissAllowingStateLoss();
    }

    public final void hf(WindowSizeClass windowSizeClass) {
        int iDpToPx = DimenUtilsKt.dpToPx(KScreenAdjustUtilsKt.contentPanelMaxWith$default(windowSizeClass, 0, 1, (Object) null));
        View view = this.f81071d;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.matchConstraintMaxWidth = iDpToPx;
            view.setLayoutParams(layoutParams2);
        }
        bilibili.live.app.service.resolver.c.a(iDpToPx, "setContentMaxWidth: ", "MarkGoodsDialog");
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        FragmentActivity fragmentActivityP3;
        WindowSizeClass windowSizeClassWindowSize;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1 || (fragmentActivityP3 = p3()) == null || (windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(fragmentActivityP3)) == null || !KScreenAdjustUtilsKt.isNormal(windowSizeClassWindowSize)) {
            return;
        }
        dismissAllowingStateLoss();
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
            viewInflate = layoutInflater.inflate(2131493840, viewGroup, false);
            this.f81069b = (ImageView) viewInflate.findViewById(2131296853);
            this.f81070c = viewInflate.findViewById(2131308035);
            this.f81071d = viewInflate.findViewById(2131297144);
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f81070c = null;
        this.f81073f = null;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark.d] */
    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ImageView imageView = this.f81069b;
        if (imageView != null) {
            imageView.setOnClickListener(new c(this, 0));
        }
        RecyclerView recyclerView = this.f81070c;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f81072e);
            recyclerView.setItemAnimator(null);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        }
        MarkRelatedGoodsItem$requestGoodsList$1.a aVar = this.f81073f;
        if (aVar != null) {
            MarkGoodsList markGoodsList = aVar.f81074a;
            List<MarkGoodsList.MarkGoods> itemList = markGoodsList != null ? markGoodsList.getItemList() : null;
            if (itemList != null) {
                b bVar = this.f81072e;
                bVar.getClass();
                List<MarkGoodsList.MarkGoods> list = itemList;
                if (!list.isEmpty()) {
                    ((ArrayList) bVar.f81080a).clear();
                    ((ArrayList) bVar.f81080a).addAll(list);
                    bVar.notifyDataSetChanged();
                }
                final int i7 = 0;
                this.f81072e.f81081b = new Function1(this, i7) { // from class: com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f81089a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f81090b;

                    {
                        this.f81089a = i7;
                        this.f81090b = this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r6) {
                        /*
                            Method dump skipped, instruction units count: 584
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark.d.invoke(java.lang.Object):java.lang.Object");
                    }
                };
            }
        }
        FragmentActivity fragmentActivityFindFragmentActivityOrNull = UtilKt.findFragmentActivityOrNull(getContext());
        if (fragmentActivityFindFragmentActivityOrNull == null) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        WindowSizeClass windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(fragmentActivityFindFragmentActivityOrNull);
        objectRef.element = windowSizeClassWindowSize;
        hf(windowSizeClassWindowSize);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new MarkGoodsDialog$collectContentWidth$1(fragmentActivityFindFragmentActivityOrNull, objectRef, this, null), 3, (Object) null);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void showNow(@NotNull FragmentManager fragmentManager, @Nullable String str) {
        if (fragmentManager.isStateSaved()) {
            return;
        }
        super.showNow(fragmentManager, str);
    }
}
