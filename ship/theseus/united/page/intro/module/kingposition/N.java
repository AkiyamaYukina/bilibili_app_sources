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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/N.class */
@StabilityInferred(parameters = 0)
public final class N implements com.bilibili.ship.theseus.united.page.popupwindow.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WeakReference<View> f100445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public com.bilibili.ship.theseus.united.page.popupwindow.g f100446b;

    public N(@NotNull WeakReference<View> weakReference) {
        this.f100445a = weakReference;
    }

    @Override // com.bilibili.ship.theseus.united.page.popupwindow.b
    @NotNull
    public final com.bilibili.ship.theseus.united.page.popupwindow.g a(@NotNull Context context) {
        TextView textView = new TextView(context);
        textView.setText(context.getString(2131851575));
        textView.setTextSize(13.0f);
        textView.setTextColor(-1);
        textView.setBackgroundResource(2131240897);
        textView.setPadding(NewPlayerUtilsKt.toPx(12), NewPlayerUtilsKt.toPx(8), NewPlayerUtilsKt.toPx(12), NewPlayerUtilsKt.toPx(12));
        com.bilibili.ship.theseus.united.page.popupwindow.g gVar = new com.bilibili.ship.theseus.united.page.popupwindow.g(context);
        gVar.setContentView(textView);
        gVar.setOutsideTouchable(true);
        gVar.setBackgroundDrawable(new ColorDrawable(0));
        gVar.setClippingEnabled(false);
        gVar.setFocusable(false);
        gVar.f102445f = true;
        gVar.f102444e = PayTask.f60018j;
        this.f100446b = gVar;
        return gVar;
    }

    @Override // com.bilibili.ship.theseus.united.page.popupwindow.b
    public final void b() {
        View view = this.f100445a.get();
        if (view != null) {
            int px = NewPlayerUtilsKt.toPx(45);
            int height = view.getHeight();
            com.bilibili.ship.theseus.united.page.popupwindow.g gVar = this.f100446b;
            if (gVar != null) {
                gVar.showAsDropDown(view, NewPlayerUtilsKt.toPx(12), -(height + px));
            }
        }
    }

    @Override // com.bilibili.ship.theseus.united.page.popupwindow.b
    public final int getType() {
        return 4;
    }
}
