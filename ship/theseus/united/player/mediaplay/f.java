package com.bilibili.ship.theseus.united.player.mediaplay;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.Fragment;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/f.class */
public interface f {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/f$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ev0.g f104514a;

        public a(@NotNull ev0.g gVar) {
            this.f104514a = gVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/f$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ev0.h f104515a;

        public b(@NotNull ev0.h hVar) {
            this.f104515a = hVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/f$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final PlayViewUniteReply f104516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final com.bilibili.ship.theseus.united.bean.d f104517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final com.bilibili.ship.theseus.united.bean.b f104518c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final com.bilibili.ship.theseus.united.bean.g f104519d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Fragment f104520e;

        public c(@NotNull PlayViewUniteReply playViewUniteReply, @Nullable com.bilibili.ship.theseus.united.bean.d dVar, @Nullable com.bilibili.ship.theseus.united.bean.b bVar, @Nullable com.bilibili.ship.theseus.united.bean.g gVar, @Nullable Fragment fragment) {
            this.f104516a = playViewUniteReply;
            this.f104517b = dVar;
            this.f104518c = bVar;
            this.f104519d = gVar;
            this.f104520e = fragment;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/f$d.class */
    @StabilityInferred(parameters = 0)
    public static final class d implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final GeminiCommonPlayableParams f104521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f104522b;

        public d(@NotNull GeminiCommonPlayableParams geminiCommonPlayableParams, boolean z6) {
            this.f104521a = geminiCommonPlayableParams;
            this.f104522b = z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/f$e.class */
    @StabilityInferred(parameters = 0)
    public static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ev0.l f104523a;

        public e(@NotNull ev0.l lVar) {
            this.f104523a = lVar;
        }
    }
}
