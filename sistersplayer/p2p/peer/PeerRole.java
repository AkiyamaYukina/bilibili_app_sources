package com.bilibili.sistersplayer.p2p.peer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/PeerRole.class */
public final class PeerRole {
    private static final EnumEntries $ENTRIES;
    private static final PeerRole[] $VALUES;
    public static final PeerRole PEER = new PeerRole("PEER", 0);
    public static final PeerRole LEECH = new PeerRole("LEECH", 1);
    public static final PeerRole SEEDBOX = new PeerRole("SEEDBOX", 2);
    public static final PeerRole TYPE_COUNT = new PeerRole("TYPE_COUNT", 3);

    private static final /* synthetic */ PeerRole[] $values() {
        return new PeerRole[]{PEER, LEECH, SEEDBOX, TYPE_COUNT};
    }

    static {
        PeerRole[] peerRoleArr$values = $values();
        $VALUES = peerRoleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(peerRoleArr$values);
    }

    private PeerRole(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<PeerRole> getEntries() {
        return $ENTRIES;
    }

    public static PeerRole valueOf(String str) {
        return (PeerRole) Enum.valueOf(PeerRole.class, str);
    }

    public static PeerRole[] values() {
        return (PeerRole[]) $VALUES.clone();
    }
}
