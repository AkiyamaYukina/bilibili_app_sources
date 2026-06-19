package com.bilibili.ship.theseus.ogv.intro.download.ui;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.bapis.bilibili.playershared.DolbyItem;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.main.MainCommonService;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/b0.class */
@StabilityInferred(parameters = 0)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final I9.c f92527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LH.g f92528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableState f92529c = SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableState f92530d = SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableState f92531e = SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<a0> f92532f = SnapshotStateKt.mutableStateListOf();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableState f92533g;

    @NotNull
    public final MutableState h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f92534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public DolbyItem.Type f92535j;

    public b0(@NotNull I9.c cVar, @NotNull LH.g gVar) {
        this.f92527a = cVar;
        this.f92528b = gVar;
        Boolean bool = Boolean.FALSE;
        this.f92533g = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.h = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        Cu0.a.f1797a.getClass();
        MainCommonService mainCommonService = (MainCommonService) BLRouter.INSTANCE.get(MainCommonService.class, "default");
        this.f92534i = mainCommonService != null ? mainCommonService.obtainDownloadSourceQuality() : 0;
        this.f92535j = DolbyItem.Type.NONE;
    }
}
