package com.bilibili.playset.playlist.edit;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bilibili.playset.api.MultitypePlaylist;
import com.bilibili.playset.playlist.entity.MediaId;
import com.bilibili.playset.playlist.protocal.LifecyclePresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/ListPresenter.class */
@StabilityInferred(parameters = 0)
public final class ListPresenter implements LifecyclePresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PlaylistEditFragment f85232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f85233b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f85241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f85242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public MultitypePlaylist.Info f85243m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f85234c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f85235d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85236e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85237f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f85238g = 1;
    public int h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f85239i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f85240j = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final ArrayList<List<MediaId>> f85244n = new ArrayList<>();

    public ListPresenter(PlaylistEditFragment playlistEditFragment, long j7) {
        this.f85232a = playlistEditFragment;
        this.f85233b = j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb A[Catch: all -> 0x0078, Exception -> 0x0116, TRY_ENTER, TryCatch #1 {all -> 0x0078, blocks: (B:13:0x006d, B:28:0x00cb, B:33:0x00f1, B:35:0x00fb, B:37:0x0104, B:39:0x010e, B:45:0x0122, B:49:0x0133, B:56:0x015f, B:60:0x016b, B:63:0x0177, B:23:0x009e), top: B:73:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015f A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #1 {all -> 0x0078, blocks: (B:13:0x006d, B:28:0x00cb, B:33:0x00f1, B:35:0x00fb, B:37:0x0104, B:39:0x010e, B:45:0x0122, B:49:0x0133, B:56:0x015f, B:60:0x016b, B:63:0x0177, B:23:0x009e), top: B:73:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.playset.playlist.edit.ListPresenter r5, boolean r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.edit.ListPresenter.a(com.bilibili.playset.playlist.edit.ListPresenter, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.playset.playlist.edit.ListPresenter r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.edit.ListPresenter.b(com.bilibili.playset.playlist.edit.ListPresenter, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.playset.playlist.protocal.LifecyclePresenter
    public final void attach() {
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(boolean r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.edit.ListPresenter.c(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(boolean r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.edit.ListPresenter.d(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.playset.playlist.protocal.LifecyclePresenter
    public final void detach() {
    }

    public final void e() {
        LifecycleCoroutineScope lifecycleCoroutineScopeTf;
        LifecycleCoroutineScope lifecycleCoroutineScopeTf2;
        int i7 = this.f85237f;
        int i8 = this.f85238g;
        if (i7 != i8) {
            this.f85237f = i8;
        }
        int i9 = this.f85237f + 1;
        this.f85237f = i9;
        int size = this.f85244n.size();
        PlaylistEditFragment playlistEditFragment = this.f85232a;
        if (i9 <= size && (lifecycleCoroutineScopeTf2 = playlistEditFragment.tf()) != null) {
            BuildersKt.launch$default(lifecycleCoroutineScopeTf2, (CoroutineContext) null, (CoroutineStart) null, new ListPresenter$loadNextPage$1(this, null), 3, (Object) null);
        }
        int i10 = this.f85239i;
        if (i10 <= 1 || this.h > i10 || this.f85244n.size() - this.f85237f >= 5 || (lifecycleCoroutineScopeTf = playlistEditFragment.tf()) == null) {
            return;
        }
        BuildersKt.launch$default(lifecycleCoroutineScopeTf, (CoroutineContext) null, (CoroutineStart) null, new ListPresenter$loadNextPage$2(this, null), 3, (Object) null);
    }

    public final void f() {
        this.f85237f = 1;
        this.f85236e = 1;
        this.f85238g = 1;
        this.h = 1;
        this.f85240j = 0;
        PlaylistEditFragment playlistEditFragment = this.f85232a;
        LifecycleCoroutineScope lifecycleCoroutineScopeTf = playlistEditFragment.tf();
        if (lifecycleCoroutineScopeTf != null) {
            BuildersKt.launch$default(lifecycleCoroutineScopeTf, (CoroutineContext) null, (CoroutineStart) null, new ListPresenter$refresh$1(this, null), 3, (Object) null);
        }
        LifecycleCoroutineScope lifecycleCoroutineScopeTf2 = playlistEditFragment.tf();
        if (lifecycleCoroutineScopeTf2 != null) {
            BuildersKt.launch$default(lifecycleCoroutineScopeTf2, (CoroutineContext) null, (CoroutineStart) null, new ListPresenter$refresh$2(this, null), 3, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.edit.ListPresenter.g(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
