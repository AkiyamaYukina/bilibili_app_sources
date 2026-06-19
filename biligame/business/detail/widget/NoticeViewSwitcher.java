package com.bilibili.biligame.business.detail.widget;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import androidx.annotation.NonNull;
import com.bilibili.biligame.business.detail.widget.NoticeViewSwitcher;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/widget/NoticeViewSwitcher.class */
public class NoticeViewSwitcher extends ViewSwitcher {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f62711e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f62712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f62713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f62714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f62715d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/widget/NoticeViewSwitcher$a.class */
    public static abstract class a {
        public abstract void a(int i7, @NonNull View view);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/widget/NoticeViewSwitcher$b.class */
    public static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<NoticeViewSwitcher> f62716a;

        /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r6) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.business.detail.widget.NoticeViewSwitcher.b.handleMessage(android.os.Message):void");
        }
    }

    public NoticeViewSwitcher(Context context) {
        super(context);
        this.f62713b = 4000;
        a();
    }

    public NoticeViewSwitcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62713b = 4000;
        a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Handler, com.bilibili.biligame.business.detail.widget.NoticeViewSwitcher$b] */
    public final void a() {
        ?? handler = new Handler();
        handler.f62716a = new WeakReference<>(this);
        this.f62712a = handler;
        setInAnimation(getContext(), 2130772374);
        setOutAnimation(getContext(), 2130772375);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f62712a.removeMessages(0);
    }

    public void setAdapter(a aVar) {
        this.f62714c = aVar;
        if (aVar != null) {
            setFactory(new ViewSwitcher.ViewFactory(this) { // from class: xo.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final NoticeViewSwitcher f129386a;

                {
                    this.f129386a = this;
                }

                @Override // android.widget.ViewSwitcher.ViewFactory
                public final View makeView() {
                    NoticeViewSwitcher noticeViewSwitcher = this.f129386a;
                    int i7 = NoticeViewSwitcher.f62711e;
                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(noticeViewSwitcher.getContext());
                    noticeViewSwitcher.f62714c.getClass();
                    return layoutInflaterFrom.inflate(2131497046, (ViewGroup) noticeViewSwitcher, false);
                }
            });
        }
    }

    public void setLoopTime(int i7) {
        this.f62713b = i7;
    }
}
