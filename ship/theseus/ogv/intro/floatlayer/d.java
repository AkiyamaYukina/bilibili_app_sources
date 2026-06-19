package com.bilibili.ship.theseus.ogv.intro.floatlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ObservableArrayList;
import com.bilibili.ship.theseus.ogv.intro.floatlayer.OgvActorInfoFragment;
import com.bilibili.ship.theseus.ogv.intro.floatlayer.bean.OgvActorInfoVo;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/d.class */
@StabilityInferred(parameters = 0)
public final class d extends androidx.databinding.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f92909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92910c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f92914g;

    @Nullable
    public OgvActorInfoVo h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public OgvActorInfoFragment.C61902 f92915i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ObservableArrayList<Nj0.c> f92908a = new ObservableArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f92911d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f92912e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f92913f = true;

    public final void m(@NotNull Nj0.c cVar) {
        Nj0.c next;
        ObservableArrayList<Nj0.c> observableArrayList = this.f92908a;
        Iterator<Nj0.c> it = observableArrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof t) {
                    break;
                }
            }
        }
        Nj0.c cVar2 = next;
        if (cVar2 == null) {
            observableArrayList.add(cVar);
            return;
        }
        observableArrayList.remove(cVar2);
        observableArrayList.add(cVar);
        observableArrayList.add(cVar2);
    }

    public final void n(int i7) {
        if (i7 == this.f92909b) {
            return;
        }
        this.f92909b = i7;
        notifyPropertyChanged(360);
    }
}
