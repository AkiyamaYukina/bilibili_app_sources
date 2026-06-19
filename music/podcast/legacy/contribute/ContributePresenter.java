package com.bilibili.music.podcast.legacy.contribute;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.bilibili.music.podcast.legacy.base.LifecyclePresenter;
import com.bilibili.music.podcast.legacy.fragment.ContributionsFragment;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/contribute/ContributePresenter.class */
public final class ContributePresenter implements LifecyclePresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ContributionsFragment f66815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LifecycleCoroutineScope f66816b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f66819e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f66817c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f66818d = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f66820f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f66821g = -1;
    public int h = -1;

    public ContributePresenter(@NotNull ContributionsFragment contributionsFragment, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope) {
        this.f66815a = contributionsFragment;
        this.f66816b = lifecycleCoroutineScope;
    }

    public final void a(long j7) {
        BuildersKt.launch$default(this.f66816b, (CoroutineContext) null, (CoroutineStart) null, new ContributePresenter$deleteContribution$1(this, j7, null), 3, (Object) null);
    }

    @Override // com.bilibili.music.podcast.legacy.base.LifecyclePresenter
    public final void attach() {
    }

    public final void b(boolean z6) {
        if (this.f66819e) {
            return;
        }
        BuildersKt.launch$default(this.f66816b, (CoroutineContext) null, (CoroutineStart) null, new ContributePresenter$getContributionList$1(this, z6, null), 3, (Object) null);
    }

    public final void c(int i7, int i8) {
        if (i7 != 0) {
            if (i7 == 1) {
                if (i8 == 0) {
                    this.h = -1;
                    this.f66821g = -1;
                } else if (i8 == 1) {
                    this.h = 1;
                    this.f66821g = -1;
                } else if (i8 == 2) {
                    this.f66821g = 1;
                    this.h = -1;
                }
            }
        } else if (i8 == 0) {
            this.f66820f = -1;
        } else if (i8 == 1) {
            this.f66820f = 1;
        } else if (i8 == 2) {
            this.f66820f = 2;
        } else if (i8 == 3) {
            this.f66820f = 3;
        }
        this.f66818d = 1;
        b(true);
    }

    @Override // com.bilibili.music.podcast.legacy.base.LifecyclePresenter
    public final void detach() {
    }
}
