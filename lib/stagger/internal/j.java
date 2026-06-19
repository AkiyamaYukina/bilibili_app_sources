package com.bilibili.lib.stagger.internal;

import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/j.class */
public final class j implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f64552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<Runnable> f64553b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f64554c;

    public j(Executor executor) {
        this.f64552a = executor;
    }

    public final void a() {
        synchronized (this) {
            Runnable runnablePoll = this.f64553b.poll();
            this.f64554c = runnablePoll;
            if (runnablePoll != null) {
                this.f64552a.execute(runnablePoll);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        synchronized (this) {
            final int i7 = 0;
            this.f64553b.offer(new Runnable(i7, this, runnable) { // from class: com.bilibili.lib.stagger.internal.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f64549a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f64550b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f64551c;

                {
                    this.f64549a = i7;
                    this.f64550b = this;
                    this.f64551c = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f64549a) {
                        case 0:
                            j jVar = (j) this.f64550b;
                            Runnable runnable2 = (Runnable) this.f64551c;
                            jVar.getClass();
                            try {
                                runnable2.run();
                                return;
                            } finally {
                                jVar.a();
                            }
                        default:
                            com.bilibili.bplus.following.publish.view.web.a aVar = (com.bilibili.bplus.following.publish.view.web.a) this.f64550b;
                            JSONObject jSONObject = (JSONObject) this.f64551c;
                            if (aVar.a != null) {
                                Intent intent = new Intent();
                                intent.putExtra("voteInfo", jSONObject.toString());
                                aVar.a.setResult(-1, intent);
                                aVar.a.finish();
                                return;
                            }
                            return;
                    }
                }
            });
            if (this.f64554c == null) {
                a();
            }
        }
    }
}
