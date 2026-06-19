package com.bilibili.sistersplayer.p2p.utils;

import androidx.appcompat.widget.C3259x;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/LeakCheck.class */
public final class LeakCheck {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "LeakCheck";

    @NotNull
    private ConcurrentHashMap<String, Throwable> contextHash = new ConcurrentHashMap<>();

    @NotNull
    private final P2PLogger logger;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/LeakCheck$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    public LeakCheck(@NotNull P2PLogger p2PLogger) {
        this.logger = p2PLogger;
    }

    public final void onCreate(@Nullable Object obj) throws Throwable {
        if (obj == null) {
            throw new Throwable("obj is null !!!");
        }
        this.contextHash.put(Integer.toHexString(obj.hashCode()), new Throwable());
    }

    public final void onRelease(@Nullable Object obj) {
        if (obj == null) {
            this.logger.logI(TAG, "onRelease obj is null !!!", new Throwable());
        } else {
            this.contextHash.remove(Integer.toHexString(obj.hashCode()));
        }
    }

    public final void releaseCheck() {
        if (this.contextHash.isEmpty()) {
            return;
        }
        P2PLogger.logI$default(this.logger, TAG, C3259x.a(this.contextHash.size(), "obj Check size = "), null, 4, null);
        Iterator<T> it = this.contextHash.values().iterator();
        while (it.hasNext()) {
            this.logger.logE(TAG, "obj ReleaseCheck", (Throwable) it.next());
        }
    }
}
