package com.bilibili.music.podcast.view.mini;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.music.podcast.view.mini.MusicBottomPlayView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/mini/a.class */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy<a> f67302c = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Bc.b(7));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Map<Integer, b> f67303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d f67304b = new d(this, Looper.myLooper());

    /* JADX INFO: renamed from: com.bilibili.music.podcast.view.mini.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/mini/a$a.class */
    public static final class C0391a {
        @NotNull
        public static a a() {
            return (a) a.f67302c.getValue();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/mini/a$b.class */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MusicBottomPlayView.a f67305a;

        public b(@NotNull MusicBottomPlayView.a aVar) {
            this.f67305a = aVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/mini/a$c.class */
    public static final class c implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Handler f67306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Map<Integer, b> f67307b;

        public c(@NotNull Handler handler, @Nullable Map<Integer, b> map) {
            this.f67306a = handler;
            this.f67307b = map;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
            Map<Integer, b> map = this.f67307b;
            if (map != null) {
                map.remove(Integer.valueOf(lifecycleOwner.hashCode()));
            }
            this.f67307b = null;
            Message messageObtain = Message.obtain();
            messageObtain.what = 455555;
            this.f67306a.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/mini/a$d.class */
    public static final class d extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f67308a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a aVar, Looper looper) {
            super(looper);
            this.f67308a = aVar;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            a aVar;
            Map<Integer, b> map;
            if (message.what == 455555 && (map = (aVar = this.f67308a).f67303a) != null && ((HashMap) map).isEmpty()) {
                aVar.f67303a = null;
            }
        }
    }

    public final void a(@Nullable BaseFragment baseFragment, @NotNull MusicBottomPlayView.a aVar) {
        if (this.f67303a == null) {
            this.f67303a = new HashMap();
        }
        int iHashCode = baseFragment.hashCode();
        Map<Integer, b> map = this.f67303a;
        if (map == null || !((HashMap) map).containsKey(Integer.valueOf(iHashCode))) {
            Map<Integer, b> map2 = this.f67303a;
            if (map2 != null) {
            }
            baseFragment.getLifecycle().addObserver(new c(this.f67304b, this.f67303a));
        }
    }

    public final void b(int i7) {
        Map<Integer, b> map = this.f67303a;
        if (map == null) {
            return;
        }
        Iterator it = ((HashMap) map).entrySet().iterator();
        while (it.hasNext()) {
            ((b) ((Map.Entry) it.next()).getValue()).f67305a.onStateChange(i7);
        }
    }
}
