package com.bilibili.ship.theseus.ogv.intro.floatlayer.service;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.floatlayer.d;
import javax.inject.Inject;
import kotlin.Unit;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f92985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FragmentManager f92986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f92987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f92988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f92989e;

    @Inject
    public b(@NotNull CoroutineScope coroutineScope, @NotNull FragmentManager fragmentManager, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull a aVar, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar) {
        this.f92985a = coroutineScope;
        this.f92986b = fragmentManager;
        this.f92987c = theseusFloatLayerService;
        this.f92988d = aVar;
        this.f92989e = gVar;
    }

    @Nullable
    public final com.bilibili.ship.theseus.united.page.floatlayer.d a(@NotNull wl0.c cVar, @NotNull h hVar) {
        d.a aVar = new d.a(null);
        if (true != aVar.f99747e) {
            aVar.f99747e = true;
            aVar.notifyPropertyChanged(645);
        }
        Qj0.d dVarA = Qj0.c.a("bilibili://bangumi/review/short-review-publish");
        if (dVarA == null) {
            return null;
        }
        Class<? extends Fragment> cls = dVarA.f19963a;
        Bundle bundle = new Bundle();
        bundle.putString("MEDIA_ID", cVar.f128707a);
        bundle.putString("from", String.valueOf(28));
        Unit unit = Unit.INSTANCE;
        return new com.bilibili.ship.theseus.united.page.floatlayer.d(aVar, new com.bilibili.ship.theseus.united.page.floatlayer.e(this.f92986b, cls, bundle, new OgvShortReviewPublishLayerService$newShortReviewPublishLayer$2(hVar, this, aVar, null)));
    }
}
