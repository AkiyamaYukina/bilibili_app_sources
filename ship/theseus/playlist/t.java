package com.bilibili.ship.theseus.playlist;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/t.class */
@StabilityInferred(parameters = 0)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f95914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlaylistLoadService f95915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final A f95916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final z f95917d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/t$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f95918a;

        static {
            int[] iArr = new int[PlaylistOrderEnum.values().length];
            try {
                iArr[PlaylistOrderEnum.RANDOM.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PlaylistOrderEnum.MOST_PLAY.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[PlaylistOrderEnum.REVERSE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[PlaylistOrderEnum.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f95918a = iArr;
        }
    }

    @Inject
    public t(@NotNull PlaylistRepository playlistRepository, @NotNull PlaylistLoadService playlistLoadService, @NotNull A a7, @NotNull z zVar) {
        this.f95914a = playlistRepository;
        this.f95915b = playlistLoadService;
        this.f95916c = a7;
        this.f95917d = zVar;
    }

    @NotNull
    public final u a() {
        return a.f95918a[this.f95914a.f().ordinal()] == 1 ? this.f95916c : this.f95917d;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01af A[LOOP:0: B:54:0x01af->B:63:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.t.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
