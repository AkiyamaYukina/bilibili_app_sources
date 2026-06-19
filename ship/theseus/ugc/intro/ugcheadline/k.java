package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.ship.theseus.ugc.intro.ugcheadline.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.videopage.common.widget.view.TagExpressView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/k.class */
@StabilityInferred(parameters = 0)
public final class k extends AlertDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public g f97347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public View f97348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TextView f97349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TagExpressView f97350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public j f97351e;

    public k(@NotNull Context context) {
        super(context);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        if (view.getId() == 2131298371) {
            dismiss();
            return;
        }
        if (!(view instanceof TagExpressView) || this.f97351e == null) {
            return;
        }
        Resources resources = getContext().getResources();
        TagExpressView tagExpressView = (TagExpressView) view;
        if (!tagExpressView.i) {
            ToastHelper.showToastShort(getContext(), resources.getString(2131845702, 1, resources.getString(2131846932)));
            return;
        }
        if (tagExpressView.h.isSelected()) {
            return;
        }
        j jVar = this.f97351e;
        g gVar = this.f97347a;
        jVar.getClass();
        if (gVar == null) {
            return;
        }
        int[] iArr = {2131847303, 2131847076, 2131847490, 2131845892};
        long j7 = jVar.f97346b;
        i iVar = jVar.f97345a;
        i.a aVar = new i.a(iVar, j7, gVar, iArr);
        AlertDialog.Builder title = new AlertDialog.Builder(iVar.f97333a).setTitle(2131847514);
        i iVar2 = jVar.f97345a;
        AlertDialog alertDialogCreate = title.setSingleChoiceItems(new String[]{iVar2.f97333a.getString(iArr[0]), iVar2.f97333a.getString(iArr[1]), iVar2.f97333a.getString(iArr[2]), iVar2.f97333a.getString(iArr[3])}, -1, aVar).setPositiveButton(2131851597, aVar).setNegativeButton(2131851592, aVar).create();
        alertDialogCreate.show();
        Button button = alertDialogCreate.getButton(-1);
        button.setTextColor(ThemeUtils.getThemeColorStateList(iVar2.f97333a, 2131103538));
        button.setEnabled(false);
        aVar.f97341e = button;
        k kVar = iVar2.f97335c;
        if (kVar != null) {
            kVar.dismiss();
        }
    }

    @Override // androidx.appcompat.app.AlertDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131500405);
        this.f97348b = findViewById(2131298371);
        this.f97349c = (TextView) findViewById(2131308958);
        this.f97350d = findViewById(2131310156);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(2131888319);
            window.setGravity(80);
            window.setLayout(-1, -2);
        }
        AccountInfo accountInfoFromCache = BiliAccountInfo.Companion.get().getAccountInfoFromCache();
        if (accountInfoFromCache != null) {
            TagExpressView tagExpressView = this.f97350d;
            if (tagExpressView != null) {
                boolean z6 = accountInfoFromCache.getLevel() >= 1;
                boolean z7 = this.f97347a.f97331f;
                tagExpressView.i = z6;
                if (!z6) {
                    tagExpressView.h.setImageResource(tagExpressView.j);
                    tagExpressView.h.setImageTintList(2131101202);
                    tagExpressView.g.setTextColor(tagExpressView.getResources().getColor(2131101202));
                } else if (z7) {
                    tagExpressView.setSelected(true);
                } else {
                    tagExpressView.setSelected(false);
                }
            }
        } else {
            dismiss();
        }
        TextView textView = this.f97349c;
        if (textView != null) {
            textView.setText(this.f97347a.f97327b.length() > 14 ? G.p.a(this.f97347a.f97327b.substring(0, 14), "...") : this.f97347a.f97327b);
        }
        TagExpressView tagExpressView2 = this.f97350d;
        if (tagExpressView2 != null) {
            int i7 = this.f97347a.f97331f ? 2131845777 : 2131846932;
            if (i7 != 0) {
                tagExpressView2.g.setText(tagExpressView2.getResources().getString(i7, new Object[0]));
            }
        }
        TagExpressView tagExpressView3 = this.f97350d;
        if (tagExpressView3 != null) {
            tagExpressView3.setOnClickListener(this);
        }
        View view = this.f97348b;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }
}
