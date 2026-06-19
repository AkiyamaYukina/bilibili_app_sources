package com.bilibili.lib.ui;

import com.bilibili.video.story.action.StoryLiveController;

/* JADX INFO: renamed from: com.bilibili.lib.ui.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/b.class */
public final /* synthetic */ class RunnableC5341b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64830a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f64831b;

    public /* synthetic */ RunnableC5341b(BaseAppCompatActivity baseAppCompatActivity) {
        this.f64831b = baseAppCompatActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f64830a) {
            case 0:
                BaseAppCompatActivity baseAppCompatActivity = (BaseAppCompatActivity) this.f64831b;
                int i7 = BaseAppCompatActivity.f64709A;
                baseAppCompatActivity.getClass();
                boolean z6 = com.bilibili.base.i.a;
                com.bilibili.base.i.a(baseAppCompatActivity.getBaseContext());
                break;
            default:
                StoryLiveController.H0((StoryLiveController) this.f64831b);
                break;
        }
    }
}
