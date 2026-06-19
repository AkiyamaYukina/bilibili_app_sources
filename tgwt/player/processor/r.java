package com.bilibili.tgwt.player.processor;

import ES0.J;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.im.ui.PlayerChatFragment;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageActivity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/r.class */
@StabilityInferred(parameters = 0)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TogetherWatchDetailPageActivity f111699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FragmentManager f111700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ViewGroup f111701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ChatRoomManagerService f111702d;

    @Nullable
    public PlayerChatFragment h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f111706i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f111707j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public ValueAnimator f111708k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f111709l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f111710m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f111711n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final CompositeDisposable f111713p;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f111703e = LazyKt.lazy(new J(this, 2));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f111704f = LazyKt.lazy(new Hk0.l(this, 3));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f111705g = LazyKt.lazy(new Hk0.m(this, 3));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f111712o = true;

    public r(@NotNull TogetherWatchDetailPageActivity togetherWatchDetailPageActivity, @NotNull FragmentManager fragmentManager, @NotNull ViewGroup viewGroup, @NotNull ChatRoomManagerService chatRoomManagerService, @NotNull Observable observable) {
        this.f111699a = togetherWatchDetailPageActivity;
        this.f111700b = fragmentManager;
        this.f111701c = viewGroup;
        this.f111702d = chatRoomManagerService;
        float f7 = 12;
        this.f111709l = Uj0.c.b(f7, togetherWatchDetailPageActivity);
        this.f111710m = Uj0.c.b(f7, togetherWatchDetailPageActivity);
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.f111713p = compositeDisposable;
        compositeDisposable.add(observable.subscribe(new q(this)));
    }

    public final ViewGroup a() {
        return (ViewGroup) this.f111704f.getValue();
    }

    public final ViewGroup b() {
        return (ViewGroup) this.f111705g.getValue();
    }

    public final ViewGroup c() {
        return (ViewGroup) this.f111703e.getValue();
    }
}
