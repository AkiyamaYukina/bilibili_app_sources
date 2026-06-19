package com.bilibili.ship.theseus.playlist;

import com.bilibili.ship.theseus.playlist.InterfaceC6214a;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.united.di.BusinessType;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/D.class */
public final class D {
    @NotNull
    public static final BusinessType a(@NotNull MultiTypeMedia multiTypeMedia) {
        return multiTypeMedia.t() ? BusinessType.OGV : multiTypeMedia.u() ? BusinessType.CHEESE : BusinessType.UGC;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Nullable
    public static final PlaylistRepository.e b(@NotNull InterfaceC6214a interfaceC6214a) throws NoWhenBranchMatchedException {
        PlaylistRepository.e eVar;
        if ((interfaceC6214a instanceof InterfaceC6214a.c) || (interfaceC6214a instanceof InterfaceC6214a.d) || (interfaceC6214a instanceof InterfaceC6214a.f)) {
            eVar = null;
        } else if (interfaceC6214a instanceof InterfaceC6214a.b) {
            InterfaceC6214a.b bVar = (InterfaceC6214a.b) interfaceC6214a;
            eVar = new PlaylistRepository.e(bVar.f95187a, bVar.f95188b, 12);
        } else if (interfaceC6214a instanceof InterfaceC6214a.C0771a) {
            InterfaceC6214a.C0771a c0771a = (InterfaceC6214a.C0771a) interfaceC6214a;
            eVar = new PlaylistRepository.e(c0771a.f95185a, c0771a.f95186b, 12);
        } else {
            if (!(interfaceC6214a instanceof InterfaceC6214a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = new PlaylistRepository.e(((InterfaceC6214a.e) interfaceC6214a).f95191a, null, 14);
        }
        return eVar;
    }
}
