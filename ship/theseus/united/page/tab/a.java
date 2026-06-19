package com.bilibili.ship.theseus.united.page.tab;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import com.alipay.sdk.app.PayTask;
import com.bilibili.lib.theme.R$color;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/a.class */
@StabilityInferred(parameters = 0)
public final class a implements com.bilibili.ship.theseus.united.page.popupwindow.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WeakReference<View> f103163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f103164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public com.bilibili.ship.theseus.united.page.popupwindow.g f103165c;

    public a(@NotNull WeakReference<View> weakReference, @NotNull String str) {
        this.f103163a = weakReference;
        this.f103164b = str;
    }

    @Override // com.bilibili.ship.theseus.united.page.popupwindow.b
    @NotNull
    public final com.bilibili.ship.theseus.united.page.popupwindow.g a(@NotNull Context context) {
        TextView textView = new TextView(context);
        textView.setText(this.f103164b);
        textView.setTextSize(11.0f);
        textView.setTextColor(ContextCompat.getColor(context, R$color.Text2));
        textView.setBackgroundResource(2131233843);
        textView.setPadding(NewPlayerUtilsKt.toPx(13), NewPlayerUtilsKt.toPx(7), NewPlayerUtilsKt.toPx(10), NewPlayerUtilsKt.toPx(11));
        com.bilibili.ship.theseus.united.page.popupwindow.g gVar = new com.bilibili.ship.theseus.united.page.popupwindow.g(context);
        gVar.setContentView(textView);
        gVar.setBackgroundDrawable(new ColorDrawable(0));
        gVar.f102445f = true;
        gVar.f102444e = PayTask.f60018j;
        this.f103165c = gVar;
        return gVar;
    }

    @Override // com.bilibili.ship.theseus.united.page.popupwindow.b
    public final void b() {
        View view = this.f103163a.get();
        if (view != null) {
            int px = NewPlayerUtilsKt.toPx(15);
            int height = view.getHeight() / 2;
            com.bilibili.ship.theseus.united.page.popupwindow.g gVar = this.f103165c;
            if (gVar != null) {
                gVar.showAsDropDown(view, 0, -(height + px), GravityCompat.END);
            }
        }
    }

    @Override // com.bilibili.ship.theseus.united.page.popupwindow.b
    public final int getType() {
        return 6;
    }
}
