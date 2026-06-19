package com.bilibili.upper.widget.thumb;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import com.bilibili.upper.widget.thumb.HScrollView;
import java.util.Timer;
import lJ0.C7823b;
import lJ0.ViewTreeObserverOnScrollChangedListenerC7822a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/thumb/HScrollView.class */
public class HScrollView extends HorizontalScrollView {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f114606k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f114607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Timer f114608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f114609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f114610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f114611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f114612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C7823b f114613g;
    public volatile boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ViewTreeObserverOnScrollChangedListenerC7822a f114614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f114615j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/thumb/HScrollView$a.class */
    public final class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HScrollView f114616a;

        public a(HScrollView hScrollView) {
            this.f114616a = hScrollView;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i7 = message.what;
            if (i7 == 1) {
                HScrollView hScrollView = this.f114616a;
                int i8 = HScrollView.f114606k;
                hScrollView.h = false;
                hScrollView.f114612f = 0;
                if (hScrollView.f114608b != null) {
                    C7823b c7823b = hScrollView.f114613g;
                    if (c7823b != null) {
                        c7823b.cancel();
                    }
                    hScrollView.f114608b.cancel();
                    hScrollView.f114608b = null;
                    hScrollView.f114613g = null;
                }
                b bVar = this.f114616a.f114615j;
                if (bVar != null) {
                    bVar.onStop();
                    return;
                }
                return;
            }
            if (i7 != 2) {
                return;
            }
            HScrollView hScrollView2 = this.f114616a;
            if (!hScrollView2.h) {
                hScrollView2.h = true;
                hScrollView2.h = false;
                hScrollView2.f114612f = 0;
                if (hScrollView2.f114608b != null) {
                    C7823b c7823b2 = hScrollView2.f114613g;
                    if (c7823b2 != null) {
                        c7823b2.cancel();
                    }
                    hScrollView2.f114608b.cancel();
                    hScrollView2.f114608b = null;
                    hScrollView2.f114613g = null;
                }
                if (hScrollView2.f114608b == null) {
                    hScrollView2.f114608b = new Timer();
                }
                if (hScrollView2.f114613g == null) {
                    hScrollView2.f114613g = new C7823b(hScrollView2);
                }
                hScrollView2.f114608b.schedule(hScrollView2.f114613g, 0L, 100L);
            }
            b bVar2 = this.f114616a.f114615j;
            if (bVar2 != null) {
                bVar2.a();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/thumb/HScrollView$b.class */
    public interface b {
        void a();

        void onStop();
    }

    public HScrollView(Context context) {
        super(context);
        this.f114607a = true;
        this.f114611e = new a(this);
        this.f114612f = 0;
        this.f114613g = null;
        this.h = false;
    }

    public HScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114607a = true;
        this.f114611e = new a(this);
        this.f114612f = 0;
        this.f114613g = null;
        this.h = false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f114607a && super.onTouchEvent(motionEvent);
    }

    public void setEnableScrolling(boolean z6) {
        this.f114607a = z6;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [lJ0.a] */
    public void setOnOnHScrollListener(b bVar) {
        if (bVar != null) {
            this.f114615j = bVar;
            if (this.f114614i == null) {
                this.f114614i = new ViewTreeObserver.OnScrollChangedListener(this) { // from class: lJ0.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final HScrollView f123074a;

                    {
                        this.f123074a = this;
                    }

                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        HScrollView hScrollView = this.f123074a;
                        int i7 = HScrollView.f114606k;
                        if (hScrollView.getVisibility() == 0) {
                            hScrollView.f114609c = hScrollView.getScrollX();
                            hScrollView.f114611e.sendEmptyMessage(2);
                        }
                    }
                };
                getViewTreeObserver().addOnScrollChangedListener(this.f114614i);
                return;
            }
            return;
        }
        if (this.f114614i == null || !getViewTreeObserver().isAlive()) {
            return;
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.f114614i);
        this.f114614i = null;
    }
}
