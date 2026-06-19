package com.bilibili.biligame.business.pegasus.view;

import Co.n;
import android.app.Activity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.business.pegasus.bean.PegasusConfigBean;
import com.bilibili.biligame.business.pegasus.config.PegasusDialogViewConfig;
import com.bilibili.game.service.bean.DownloadInfo;
import com.bilibili.lib.image2.view.BiliImageView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/view/j.class */
@StabilityInferred(parameters = 0)
public final class j extends GameBasePanelDialog {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final List<? extends DownloadInfo> f62769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public n f62770j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CheckBox f62771k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f62772l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f62773m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f62774n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f62775o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public BiliImageView f62776p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f62777q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f62778r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f62779s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f62780t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public GamePanelTextView f62781u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public BiliImageView f62782v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public BiliImageView f62783w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f62784x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public PegasusConfigBean f62785y;

    public j(@NotNull Activity activity, int i7, @NotNull List<? extends DownloadInfo> list) {
        super(activity, i7);
        this.f62769i = list;
        this.f62784x = new LinkedHashMap();
    }

    @NotNull
    public final CheckBox c() {
        CheckBox checkBox = this.f62771k;
        if (checkBox != null) {
            return checkBox;
        }
        Intrinsics.throwUninitializedPropertyAccessException("remindDay");
        return null;
    }

    @Override // com.bilibili.biligame.business.pegasus.view.GameBasePanelDialog
    public final long getShowDuration() {
        return PegasusDialogViewConfig.b() != null ? r0.getDialogDuration() : 8000;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03cf  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 1762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.business.pegasus.view.j.onCreate(android.os.Bundle):void");
    }
}
