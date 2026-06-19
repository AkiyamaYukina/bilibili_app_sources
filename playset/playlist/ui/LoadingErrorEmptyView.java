package com.bilibili.playset.playlist.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintFrameLayout;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.tgwt.detail.chat.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tv.danmaku.android.util.AppResUtil;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/ui/LoadingErrorEmptyView.class */
public class LoadingErrorEmptyView extends TintFrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f85508f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DayNightDraweeView f85509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f85510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f85511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TintLinearLayout f85512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<a> f85513e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/ui/LoadingErrorEmptyView$a.class */
    public interface a {
        void a();

        void b();

        void c();

        void d();

        void onError();
    }

    public LoadingErrorEmptyView(@NonNull Context context) {
        super(context);
        this.f85513e = new ArrayList(1);
        i();
    }

    public LoadingErrorEmptyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f85513e = new ArrayList(1);
        i();
    }

    public final void i() {
        setTag("LoadingErrorEmptyView");
        setClickable(true);
        LayoutInflater.from(getContext()).inflate(2131499735, (ViewGroup) this, true);
        this.f85509a = (DayNightDraweeView) findViewById(2131301895);
        this.f85510b = (TextView) findViewById(2131303548);
        this.f85511c = (Button) findViewById(2131313707);
        this.f85512d = (TintLinearLayout) findViewById(2131317364);
    }

    public final void j(@Nullable String str) {
        Iterator<a> it = this.f85513e.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        animate().cancel();
        setAlpha(1.0f);
        setVisibility(0);
        this.f85510b.setVisibility(0);
        if (TextUtils.isEmpty(str)) {
            this.f85510b.setText(2131833120);
        } else {
            this.f85510b.setText(str);
        }
        this.f85511c.setVisibility(8);
        this.f85512d.setVisibility(8);
        this.f85509a.setVisibility(0);
        this.f85509a.setImageResource(2131235613);
    }

    public final void l(@StringRes int i7, @Nullable Runnable runnable) {
        m(runnable, getContext().getApplicationContext().getString(i7));
    }

    public final void m(@Nullable Runnable runnable, @Nullable String str) {
        Iterator it = ((ArrayList) this.f85513e).iterator();
        while (it.hasNext()) {
            ((a) it.next()).onError();
        }
        animate().cancel();
        setAlpha(1.0f);
        setVisibility(0);
        this.f85510b.setVisibility(0);
        if (str != null) {
            this.f85510b.setText(str);
        } else if (ConnectivityMonitor.getInstance().isNetworkActive()) {
            this.f85510b.setText(2131842651);
        } else {
            this.f85510b.setText(2131846984);
        }
        this.f85511c.setVisibility(0);
        this.f85511c.setText(2131841467);
        this.f85511c.setOnClickListener(new d(runnable, 1));
        this.f85512d.setVisibility(8);
        this.f85509a.setVisibility(0);
        this.f85509a.setImageResource(2131235614);
    }

    public final void n(@Nullable String str) {
        Iterator<a> it = this.f85513e.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        animate().cancel();
        setAlpha(1.0f);
        setVisibility(0);
        if (str == null) {
            this.f85510b.setText(2131842631);
            this.f85510b.setVisibility(0);
        } else {
            this.f85510b.setText(str);
            this.f85510b.setVisibility(0);
        }
        this.f85511c.setVisibility(8);
        this.f85512d.setVisibility(8);
        this.f85509a.setVisibility(0);
        ImageExtentionKt.displayImage(this.f85509a, AppResUtil.getImageUrl("img_holder_loading_style1.png"));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f85513e.clear();
        super.onDetachedFromWindow();
    }

    @Override // com.bilibili.magicasakura.widgets.TintFrameLayout, com.bilibili.magicasakura.widgets.Tintable
    public final void tint() {
        super.tint();
        this.f85510b.setTextColor(ThemeUtils.getColorById(getContext(), R$color.Ga5));
        this.f85512d.tint();
    }
}
