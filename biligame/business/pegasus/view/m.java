package com.bilibili.biligame.business.pegasus.view;

import Co.u;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.business.pegasus.bean.GameSmallPegasusBean;
import com.bilibili.biligame.business.pegasus.config.PegasusDialogViewConfig;
import com.bilibili.biligame.report.ReportHelper;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.biligame.utils.GameImageExtensionsKt;
import com.bilibili.lib.blkv.BLKV;
import com.bilibili.lib.image2.bean.AnimationListener;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.magicasakura.widgets.TintCheckBox;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/view/m.class */
@StabilityInferred(parameters = 0)
public final class m extends GameBasePanelDialog {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public GameSmallPegasusBean f62788i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public u f62789j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BiliImageView f62790k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f62791l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f62792m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f62793n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f62794o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TintCheckBox f62795p;

    @NotNull
    public final TintCheckBox c() {
        TintCheckBox tintCheckBox = this.f62795p;
        if (tintCheckBox != null) {
            return tintCheckBox;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cbRemindDay");
        return null;
    }

    @Override // com.bilibili.biligame.business.pegasus.view.GameBasePanelDialog
    public final long getShowDuration() {
        return PegasusDialogViewConfig.d() != null ? r0.getDialogDuration() : 8000;
    }

    @Override // android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131496810);
        this.f62794o = (TextView) findViewById(2131315395);
        this.f62795p = (TintCheckBox) findViewById(2131298552);
        c().setVisibility(8);
        findViewById(2131302903).setOnClickListener(new XD.a(this));
        this.f62790k = findViewById(2131302505);
        this.f62791l = (TextView) findViewById(2131314603);
        this.f62792m = (TextView) findViewById(2131315249);
        this.f62793n = (TextView) findViewById(2131314712);
        findViewById(2131311199).setOnClickListener(new XD.b(this));
        c().setOnClickListener(new XD.d(this));
        PegasusDialogViewConfig.d();
        BiliImageView biliImageView = this.f62790k;
        if (biliImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconIv");
            biliImageView = null;
        }
        GameImageExtensionsKt.displayGameGifImage$default(biliImageView, this.f62788i.icon, (AnimationListener) null, 2, (Object) null);
        TextView textView = this.f62791l;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gameTitle");
            textView = null;
        }
        textView.setText(this.f62788i.gameName);
        if (this.f62788i.getShowRecentCheck()) {
            c().setVisibility(0);
        }
        String str = this.f62788i.description;
        if (str == null || str.length() == 0) {
            TextView textView2 = this.f62794o;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTitleHint");
                textView2 = null;
            }
            textView2.setText(getContext().getString(2131838738));
        } else {
            TextView textView3 = this.f62794o;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTitleHint");
                textView3 = null;
            }
            textView3.setText(this.f62788i.description);
        }
        String str2 = this.f62788i.buttonText;
        if (str2 == null || str2.length() == 0) {
            TextView textView4 = this.f62793n;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("installBtn");
                textView4 = null;
            }
            textView4.setText(getContext().getString(2131838737));
        } else {
            TextView textView5 = this.f62793n;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("installBtn");
                textView5 = null;
            }
            textView5.setText(this.f62788i.buttonText);
        }
        String str3 = this.f62788i.summary;
        if (str3 == null || str3.length() == 0) {
            TextView textView6 = this.f62792m;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subTitle");
                textView6 = null;
            }
            textView6.setText(this.f62788i.summary);
        } else {
            TextView textView7 = this.f62792m;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subTitle");
                textView7 = null;
            }
            textView7.setText(getContext().getString(2131838739));
        }
        setOnDismissListener(new DialogInterface.OnDismissListener(this) { // from class: com.bilibili.biligame.business.pegasus.view.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final m f62787a;

            {
                this.f62787a = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                m mVar = this.f62787a;
                if (mVar.c().isChecked()) {
                    Tc.j.a(BLKV.getBLSharedPreferences$default(mVar.getContext(), "biligame_install_panel", true, 0, 4, (Object) null).edit(), "smallgame_later_not_remind_recent");
                }
                u uVar = mVar.f62789j;
                if (uVar != null) {
                    uVar.invoke();
                }
            }
        });
        HashMap mapHashMapOf = MapsKt.hashMapOf(new Pair[]{TuplesKt.to("sourcefrom", this.f62788i.sourceFrom), TuplesKt.to("game_base_id", String.valueOf(this.f62788i.gameBaseId)), TuplesKt.to("game_name", this.f62788i.gameName)});
        ReportHelper.getHelperInstance(getContext()).setSourceFrom(this.f62788i.sourceFrom);
        ReporterV3.reportExposure("game-ball.mini-game.play-later-popup.0.show", mapHashMapOf);
    }
}
