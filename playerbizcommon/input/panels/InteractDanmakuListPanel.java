package com.bilibili.playerbizcommon.input.panels;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.playerbizcommon.features.danmaku.InteractDanmakuListWidget;
import com.bilibili.playerbizcommon.features.danmaku.a;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.dialog.BaseDialogFragment;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsDanmaku;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/InteractDanmakuListPanel.class */
public final class InteractDanmakuListPanel extends BaseDialogFragment implements a.b, oq0.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public InteractDanmakuListWidget f80109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Cq0.b f80110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public List<CommandsDanmaku> f80111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f80112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f80113g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/InteractDanmakuListPanel$a.class */
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InteractDanmakuListPanel f80114a;

        public a(InteractDanmakuListPanel interactDanmakuListPanel) {
            this.f80114a = interactDanmakuListPanel;
        }

        @Override // com.bilibili.playerbizcommon.input.panels.c
        public final void a(Throwable th) {
            defpackage.a.b("delete command danmaku fail -> ", th != null ? th.getMessage() : null, "InteractDanmakuListPanel");
        }

        @Override // com.bilibili.playerbizcommon.input.panels.c
        public final void b(CommandsDanmaku commandsDanmaku) {
            com.bilibili.playerbizcommon.features.danmaku.a aVar;
            InteractDanmakuListWidget interactDanmakuListWidget = this.f80114a.f80109c;
            if (interactDanmakuListWidget == null || (aVar = interactDanmakuListWidget.f79627d) == null) {
                return;
            }
            int iIndexOf = aVar.f79629a.indexOf(commandsDanmaku);
            if (aVar.f79629a.remove(commandsDanmaku)) {
                aVar.notifyItemRemoved(iIndexOf);
            }
        }
    }

    @Override // com.bilibili.playerbizcommon.features.danmaku.a.b
    public final void H(@NotNull CommandsDanmaku commandsDanmaku) {
        Qq0.a aVarE;
        Cq0.b bVar = this.f80110d;
        if (bVar == null || (aVarE = bVar.e()) == null) {
            return;
        }
        aVarE.u(commandsDanmaku, new a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.playerbizcommon.features.danmaku.a.b
    public final void b(@NotNull CommandsDanmaku commandsDanmaku) {
        Qq0.a aVarE;
        Cq0.b bVar = this.f80110d;
        if (bVar != null && (aVarE = bVar.e()) != null) {
            aVarE.b(commandsDanmaku);
        }
        dismissAllowingStateLoss();
    }

    public final int getDialogViewRes() {
        return 2131496387;
    }

    public final void initView(@NotNull View view) {
        InteractDanmakuListWidget interactDanmakuListWidget = (InteractDanmakuListWidget) view.findViewById(2131303785);
        this.f80109c = interactDanmakuListWidget;
        if (interactDanmakuListWidget != null) {
            interactDanmakuListWidget.setCommandDmOperationCallback(this);
        }
        InteractDanmakuListWidget interactDanmakuListWidget2 = this.f80109c;
        if (interactDanmakuListWidget2 != null) {
            interactDanmakuListWidget2.setActionCallback(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oq0.k
    public final void onCloseClick() {
        this.f80112f = true;
        dismissAllowingStateLoss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        Qq0.a aVarE;
        super/*androidx.fragment.app.DialogFragment*/.onDismiss(dialogInterface);
        Cq0.b bVar = this.f80110d;
        if (bVar != null && (aVarE = bVar.e()) != null) {
            aVarE.s(this.f80112f);
        }
        this.f80112f = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Window window;
        Window window2;
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setGravity(80);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setDimAmount(0.0f);
        }
        InteractDanmakuListWidget interactDanmakuListWidget = this.f80109c;
        if (interactDanmakuListWidget != null) {
            interactDanmakuListWidget.setData(this.f80111e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int requestHeight() {
        int screenHeight = this.f80113g;
        if (screenHeight <= 0) {
            screenHeight = (int) (ScreenUtil.getScreenHeight(p3()) * 0.45f);
        }
        return screenHeight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int requestWidth() {
        return ScreenUtil.getScreenWidth(p3());
    }
}
