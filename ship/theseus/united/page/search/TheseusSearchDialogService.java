package com.bilibili.ship.theseus.united.page.search;

import Ns0.d;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.ship.theseus.keel.player.h;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/search/TheseusSearchDialogService.class */
@StabilityInferred(parameters = 0)
public final class TheseusSearchDialogService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f103005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final FragmentManager f103006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final h f103007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final d f103008e = (d) BLRouter.get$default(BLRouter.INSTANCE, d.class, (String) null, 2, (Object) null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Job f103009f;

    @Inject
    public TheseusSearchDialogService(@NotNull CoroutineScope coroutineScope, @NotNull ComponentActivity componentActivity, @NotNull FragmentManager fragmentManager, @NotNull h hVar) {
        this.f103004a = coroutineScope;
        this.f103005b = componentActivity;
        this.f103006c = fragmentManager;
        this.f103007d = hVar;
    }

    public final boolean a(@NotNull String str) {
        Job job = this.f103009f;
        if (job != null && job.isActive()) {
            BLog.w("TheseusSearchDialogService-showSearchDialog", "[theseus-united-TheseusSearchDialogService-showSearchDialog] Search dialog is already showing", (Throwable) null);
            return true;
        }
        d dVar = this.f103008e;
        if (dVar == null) {
            BLog.e("TheseusSearchDialogService-showSearchDialog", "[theseus-united-TheseusSearchDialogService-showSearchDialog] ISearchFragmentProvider not found", (Throwable) null);
            return false;
        }
        if (!dVar.b(this.f103005b, str)) {
            return false;
        }
        this.f103009f = BuildersKt.launch$default(this.f103004a, (CoroutineContext) null, (CoroutineStart) null, new TheseusSearchDialogService$showSearchDialog$1(dVar, str, this, null), 3, (Object) null);
        return true;
    }
}
