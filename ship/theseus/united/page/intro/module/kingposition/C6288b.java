package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alipay.sdk.app.PayTask;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/b.class */
@StabilityInferred(parameters = 0)
public final class C6288b implements com.bilibili.ship.theseus.united.page.popupwindow.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WeakReference<View> f100456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public com.bilibili.ship.theseus.united.page.popupwindow.g f100457b;

    public C6288b(@NotNull WeakReference<View> weakReference) {
        this.f100456a = weakReference;
    }

    @Override // com.bilibili.ship.theseus.united.page.popupwindow.b
    @NotNull
    public final com.bilibili.ship.theseus.united.page.popupwindow.g a(@NotNull Context context) {
        TextView textView = new TextView(context);
        textView.setText(context.getString(2131845945));
        textView.setTextSize(13.0f);
        textView.setTextColor(-1);
        textView.setBackgroundResource(2131234984);
        textView.setPadding(NewPlayerUtilsKt.toPx(12), NewPlayerUtilsKt.toPx(8), NewPlayerUtilsKt.toPx(12), NewPlayerUtilsKt.toPx(12));
        com.bilibili.ship.theseus.united.page.popupwindow.g gVar = new com.bilibili.ship.theseus.united.page.popupwindow.g(context);
        gVar.setContentView(textView);
        gVar.setOutsideTouchable(true);
        gVar.setBackgroundDrawable(new ColorDrawable(0));
        gVar.setClippingEnabled(false);
        gVar.setFocusable(false);
        gVar.f102445f = true;
        gVar.f102444e = PayTask.f60018j;
        this.f100457b = gVar;
        return gVar;
    }

    @Override // com.bilibili.ship.theseus.united.page.popupwindow.b
    public final void b() {
        View contentView;
        View view;
        com.bilibili.ship.theseus.united.page.popupwindow.g gVar = this.f100457b;
        if (gVar == null || (contentView = gVar.getContentView()) == null || (view = this.f100456a.get()) == null) {
            return;
        }
        contentView.measure(-2, -2);
        int measuredHeight = contentView.getMeasuredHeight();
        int measuredHeight2 = view.getMeasuredHeight();
        int measuredWidth = (contentView.getMeasuredWidth() - view.getMeasuredWidth()) / 2;
        int px = NewPlayerUtilsKt.toPx(1);
        com.bilibili.ship.theseus.united.page.popupwindow.g gVar2 = this.f100457b;
        if (gVar2 != null) {
            gVar2.showAsDropDown(view, -(measuredWidth - px), -(measuredHeight2 + measuredHeight));
        }
    }

    @Override // com.bilibili.ship.theseus.united.page.popupwindow.b
    public final int getType() {
        return 7;
    }
}
