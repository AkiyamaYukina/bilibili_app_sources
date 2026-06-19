package com.bilibili.biligame.business.pegasus.view;

import android.app.Activity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.api.BiligameMainGame;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/view/f.class */
@StabilityInferred(parameters = 0)
public final class f extends GameBasePanelDialog {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final List<? extends DownloadInfo> f62747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Co.f f62748j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CheckBox f62749k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f62750l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f62751m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f62752n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f62753o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public BiliImageView f62754p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f62755q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f62756r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f62757s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public GamePanelTextView f62758t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public BiliImageView f62759u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public BiliImageView f62760v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f62761w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public Map<Integer, ? extends BiligameMainGame> f62762x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public PegasusConfigBean f62763y;

    public f(@NotNull Activity activity, int i7, @NotNull List<? extends DownloadInfo> list) {
        super(activity, i7);
        this.f62747i = list;
        this.f62761w = new LinkedHashMap();
    }

    @NotNull
    public final CheckBox c() {
        CheckBox checkBox = this.f62749k;
        if (checkBox != null) {
            return checkBox;
        }
        Intrinsics.throwUninitializedPropertyAccessException("remindDay");
        return null;
    }

    @NotNull
    public final TextView d() {
        TextView textView = this.f62756r;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("subTitle");
        return null;
    }

    @Override // com.bilibili.biligame.business.pegasus.view.GameBasePanelDialog
    public final long getShowDuration() {
        return PegasusDialogViewConfig.a() != null ? r0.getDialogDuration() : 8000;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x038c  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 1784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.business.pegasus.view.f.onCreate(android.os.Bundle):void");
    }
}
