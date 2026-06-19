package com.bilibili.search2.eastereggs;

import Vn.A;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.fd_service.FreeDataManager;
import com.bilibili.lib.blkv.SharedPrefX;
import com.bilibili.search2.api.SearchResultAll;
import com.bilibili.search2.eastereggs.EggDialogFragment;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/t.class */
@StabilityInferred(parameters = 0)
public final class t extends a implements EggDialogFragment.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public VideoEggDialog f86536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f86537d;

    @Override // com.bilibili.search2.eastereggs.a
    public final void a(@NotNull Context context, @NotNull FragmentManager fragmentManager) {
        VideoEggDialog videoEggDialog = new VideoEggDialog();
        videoEggDialog.f86492b = "VideoEgg";
        videoEggDialog.f86494d = this;
        Bundle bundle = new Bundle();
        bundle.putParcelable("egg_obj", this.f86506a);
        videoEggDialog.setArguments(bundle);
        this.f86536c = videoEggDialog;
        videoEggDialog.show(fragmentManager, videoEggDialog.f86492b);
        this.f86537d = System.currentTimeMillis();
    }

    @Override // com.bilibili.search2.eastereggs.a
    public final void b() {
        VideoEggDialog videoEggDialog = this.f86536c;
        if (videoEggDialog != null) {
            videoEggDialog.dismissAllowingStateLoss();
        }
    }

    @Override // com.bilibili.search2.eastereggs.a
    public final void c() {
        SharedPrefX sharedPrefX = SearchLocalDataManager.f86501a;
        SearchLocalDataManager.i(this.f86506a.getId());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.search2.eastereggs.a
    public final boolean d(@NotNull Context context, @NotNull FragmentManager fragmentManager) throws NoWhenBranchMatchedException {
        boolean z6 = false;
        if (fragmentManager.isStateSaved()) {
            return false;
        }
        this.f86537d = 0L;
        SharedPrefX sharedPrefX = SearchLocalDataManager.f86501a;
        SearchResultAll.EasterEgg easterEgg = this.f86506a;
        int iD = SearchLocalDataManager.d(easterEgg.getId());
        int iG = SearchLocalDataManager.g(easterEgg.getId());
        q qVarJ = SearchLocalDataManager.j(easterEgg.getResUrl(context), easterEgg.getSourceMd5());
        k.a("egg show check", androidx.constraintlayout.widget.d.a(iG, easterEgg.getShowCount(), ",", "]", A.b(iD, easterEgg.getCloseCount(), "closeCount: [", ",", "] >>  playCount: [")));
        boolean z7 = qVarJ.f86527c;
        if (!z7 && (ConnectivityMonitor.getInstance().isWifiActive() || FreeDataManager.getInstance().isTf() || easterEgg.canPrefetch())) {
            k.a("egg res fetch async", easterEgg.getResUrl(context));
            SearchLocalDataManager.b(easterEgg.transform2SearchEasterItem());
        }
        if (iD >= easterEgg.getCloseCount()) {
            f(context, NoShowReason.CLOSE_COUNT_END);
        } else {
            if (iG < easterEgg.getShowCount()) {
                if (!z7) {
                    f(context, NoShowReason.NO_FILE);
                }
                return !z6;
            }
            f(context, NoShowReason.SHOW_COUNT_END);
        }
        z6 = true;
        return !z6;
    }

    @Override // com.bilibili.search2.eastereggs.EggDialogFragment.a
    public final void onCloseClick() {
        SharedPrefX sharedPrefX = SearchLocalDataManager.f86501a;
        SearchLocalDataManager.h(this.f86506a.getId());
        e();
    }

    @Override // com.bilibili.search2.eastereggs.EggDialogFragment.a
    public final void onDismiss() {
        g(System.currentTimeMillis() - this.f86537d);
        j jVar = this.f86507b;
        if (jVar != null) {
            jVar.dismiss();
        }
    }
}
