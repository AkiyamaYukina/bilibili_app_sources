package com.bilibili.ship.theseus.united.page.screenstate;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.view.OrientationEventListener;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.stagger.internal.l;
import com.bilibili.playerbizcommonv2.service.SystemGravityHelper;
import kotlin.Unit;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.util.AppBuildConfig;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Handler f102971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f102972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f102973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SystemGravityHelper f102974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final c f102975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final b f102976f;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screenstate.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/a$a.class */
    public static final class C1111a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f102977a;

        public C1111a(a aVar) {
            this.f102977a = aVar;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onPause(LifecycleOwner lifecycleOwner) {
            a aVar = this.f102977a;
            aVar.f102975e.disable();
            SystemGravityHelper systemGravityHelper = aVar.f102974d;
            systemGravityHelper.setChangedListener(null);
            systemGravityHelper.stopObserver();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onResume(LifecycleOwner lifecycleOwner) {
            a aVar = this.f102977a;
            aVar.f102975e.enable();
            aVar.f102973c.setValue(Boolean.valueOf(SystemGravityHelper.Companion.getGravityOpenStatus(FoundationAlias.getFapp())));
            SystemGravityHelper systemGravityHelper = aVar.f102974d;
            systemGravityHelper.setChangedListener(aVar.f102976f);
            systemGravityHelper.startObserver();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/a$b.class */
    public static final class b implements SystemGravityHelper.OnSystemGravityChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f102978a;

        public b(a aVar) {
            this.f102978a = aVar;
        }

        @Override // com.bilibili.playerbizcommonv2.service.SystemGravityHelper.OnSystemGravityChangedListener
        public final void onClose() {
            this.f102978a.f102973c.setValue(Boolean.FALSE);
        }

        @Override // com.bilibili.playerbizcommonv2.service.SystemGravityHelper.OnSystemGravityChangedListener
        public final void onOpen() {
            this.f102978a.f102973c.setValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/a$c.class */
    public static final class c extends OrientationEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f102979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f102980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l f102981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a f102982d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a aVar, Application application) {
            super(application, 3);
            this.f102982d = aVar;
            this.f102981c = new l(1, this, aVar);
        }

        @Override // android.view.OrientationEventListener
        public final void disable() {
            super.disable();
            if (this.f102980b) {
                this.f102980b = false;
                this.f102982d.f102971a.removeCallbacks(this.f102981c);
            }
        }

        @Override // android.view.OrientationEventListener
        public final void enable() {
            if (this.f102980b) {
                return;
            }
            try {
                super.enable();
                this.f102980b = true;
                this.f102979a = false;
                this.f102982d.f102971a.postDelayed(this.f102981c, 100L);
            } catch (IllegalStateException e7) {
                if (AppBuildConfig.Companion.getDebug()) {
                    throw e7;
                }
                e7.printStackTrace();
                com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-united-TheseusAutoRotateScreenHelper$orientationListener$1-enable] ", "startGravitySensor error: " + Unit.INSTANCE, "TheseusAutoRotateScreenHelper$orientationListener$1-enable", (Throwable) null);
            }
        }

        @Override // android.view.OrientationEventListener
        public final void onOrientationChanged(int i7) {
            if (i7 == -1) {
                a.a(this.f102982d, -1);
            } else if ((350 <= i7 && i7 < 361) || (i7 >= 0 && i7 < 11)) {
                a.a(this.f102982d, 1);
            } else if (170 <= i7 && i7 < 191) {
                a.a(this.f102982d, 9);
            } else if (80 <= i7 && i7 < 101) {
                a.a(this.f102982d, 8);
            } else if (260 <= i7 && i7 < 281) {
                a.a(this.f102982d, 0);
            } else if (!this.f102979a) {
                a.a(this.f102982d, -1);
            }
            this.f102979a = true;
        }
    }

    public a(@NotNull Lifecycle lifecycle) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f102971a = handler;
        this.f102972b = StateFlowKt.MutableStateFlow(-2);
        this.f102973c = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f102974d = new SystemGravityHelper(FoundationAlias.getFapp(), handler);
        this.f102975e = new c(this, FoundationAlias.getFapp());
        this.f102976f = new b(this);
        lifecycle.addObserver(new C1111a(this));
    }

    public static final void a(a aVar, int i7) {
        aVar.f102972b.setValue(Integer.valueOf(i7));
    }
}
