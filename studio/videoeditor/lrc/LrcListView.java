package com.bilibili.studio.videoeditor.lrc;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import com.alipay.sdk.app.PayTask;
import com.bilibili.lib.infoeyes.InfoEyesManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/lrc/LrcListView.class */
public class LrcListView extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EC0.a f109812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f109813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f109814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f109815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f109816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f109817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f109818g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/lrc/LrcListView$a.class */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LrcListView f109819a;

        public a(LrcListView lrcListView) {
            this.f109819a = lrcListView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f109819a.f109813b = false;
        }
    }

    public LrcListView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [EC0.a, android.widget.BaseAdapter, android.widget.ListAdapter] */
    public LrcListView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f109818g = new a(this);
        ?? baseAdapter = new BaseAdapter();
        this.f109812a = baseAdapter;
        this.f109817f = new Handler();
        this.f109815d = true;
        setAdapter((ListAdapter) baseAdapter);
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f109817f.removeCallbacks(this.f109818g);
            this.f109813b = true;
            this.f109814c = true;
        } else if (action == 1 || action == 3) {
            this.f109814c = false;
            this.f109817f.removeCallbacks(this.f109818g);
            this.f109817f.postDelayed(this.f109818g, PayTask.f60018j);
            if (this.f109815d) {
                this.f109815d = false;
                InfoEyesManager.getInstance().report2(false, "000225", new String[]{"shoot_lrc_roll_click", "click", this.f109816e});
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setContributeFrom(String str) {
        this.f109816e = str;
    }
}
