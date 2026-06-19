package com.bilibili.music.podcast.view;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.theme.R$color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tv.danmaku.android.util.AppResUtil;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/LoadingErrorEmptyView.class */
public class LoadingErrorEmptyView extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f67048e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DayNightDraweeView f67049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f67050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f67051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<a> f67052d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/LoadingErrorEmptyView$a.class */
    public interface a {
        void a();

        void b();

        void c();

        void onError();
    }

    public LoadingErrorEmptyView(@NonNull Context context) {
        super(context);
        this.f67052d = new ArrayList(1);
        a();
    }

    public LoadingErrorEmptyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67052d = new ArrayList(1);
        a();
    }

    public final void a() {
        setTag("LoadingErrorEmptyView");
        setClickable(true);
        setBackgroundColor(ContextCompat.getColor(getContext(), R$color.Ga1));
        LayoutInflater.from(getContext()).inflate(2131499559, (ViewGroup) this, true);
        this.f67049a = (DayNightDraweeView) findViewById(2131301895);
        this.f67050b = (TextView) findViewById(2131303548);
        this.f67051c = (Button) findViewById(2131313707);
    }

    public final void b() {
        Iterator it = ((ArrayList) this.f67052d).iterator();
        while (it.hasNext()) {
            ((a) it.next()).c();
        }
        if (getVisibility() == 8) {
            return;
        }
        animate().alpha(0.0f).setDuration(getResources().getInteger(R.integer.config_mediumAnimTime)).setListener(new d(this)).start();
    }

    public final void c(@Nullable String str) {
        Iterator<a> it = this.f67052d.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        animate().cancel();
        setAlpha(1.0f);
        setVisibility(0);
        this.f67050b.setVisibility(0);
        if (TextUtils.isEmpty(str)) {
            this.f67050b.setText(2131831743);
        } else {
            this.f67050b.setText(str);
        }
        this.f67051c.setVisibility(8);
        this.f67049a.setVisibility(0);
        this.f67049a.setImageResource(2131235613);
    }

    public final void d(@Nullable Runnable runnable) {
        Iterator it = ((ArrayList) this.f67052d).iterator();
        while (it.hasNext()) {
            ((a) it.next()).onError();
        }
        animate().cancel();
        setAlpha(1.0f);
        setVisibility(0);
        this.f67050b.setVisibility(0);
        if (ConnectivityMonitor.getInstance().isNetworkActive()) {
            this.f67050b.setText(2131842651);
        } else {
            this.f67050b.setText(2131841649);
        }
        this.f67051c.setVisibility(0);
        this.f67051c.setText(2131841467);
        this.f67051c.setOnClickListener(new com.bilibili.bililive.biz.interactionpanel.pk.widget.n(runnable, 1));
        this.f67049a.setVisibility(0);
        this.f67049a.setImageResource(2131235614);
    }

    public final void e() {
        Iterator it = ((ArrayList) this.f67052d).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
        animate().cancel();
        setAlpha(1.0f);
        setVisibility(0);
        this.f67050b.setText(2131842631);
        this.f67050b.setVisibility(0);
        this.f67051c.setVisibility(8);
        this.f67049a.setVisibility(0);
        BiliImageLoader.INSTANCE.with(this.f67049a.getContext()).url(AppResUtil.getImageUrl("img_holder_loading_style1.png")).into(this.f67049a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f67052d.clear();
        super.onDetachedFromWindow();
    }
}
