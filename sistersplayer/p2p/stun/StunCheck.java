package com.bilibili.sistersplayer.p2p.stun;

import android.os.SystemClock;
import com.bilibili.sistersplayer.p2p.P2PContext;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunCheck.class */
public final class StunCheck {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "StunCheck";

    @NotNull
    private static NyaNatType curNatType;

    @NotNull
    private static NyaNatType curV6NatType;
    private static long lastCheckTime;
    private static long v6lastCheckTime;

    @NotNull
    private final P2PLogger logger;

    @NotNull
    private final P2PContext p2pContext;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunCheck$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void upDateCurrentNatType$default(Companion companion, NyaNatType nyaNatType, boolean z6, P2PLogger p2PLogger, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                z6 = false;
            }
            if ((i7 & 4) != 0) {
                p2PLogger = null;
            }
            companion.upDateCurrentNatType(nyaNatType, z6, p2PLogger);
        }

        public static /* synthetic */ void upDateCurrentV6NatType$default(Companion companion, NyaNatType nyaNatType, boolean z6, P2PLogger p2PLogger, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                z6 = false;
            }
            if ((i7 & 4) != 0) {
                p2PLogger = null;
            }
            companion.upDateCurrentV6NatType(nyaNatType, z6, p2PLogger);
        }

        private final void upDateLastCheckTime() {
            StunCheck.lastCheckTime = SystemClock.elapsedRealtime();
        }

        private final void upDateV6LastCheckTime() {
            StunCheck.v6lastCheckTime = SystemClock.elapsedRealtime();
        }

        public final boolean cacheInvalid(int i7) {
            boolean z6 = false;
            boolean z7 = SystemClock.elapsedRealtime() > StunCheck.lastCheckTime + ((long) i7);
            boolean z8 = SystemClock.elapsedRealtime() < StunCheck.lastCheckTime;
            if (z7 || z8) {
                z6 = true;
            }
            return z6;
        }

        public final boolean cacheInvalidV6(int i7) {
            boolean z6 = false;
            boolean z7 = SystemClock.elapsedRealtime() > StunCheck.v6lastCheckTime + ((long) i7);
            boolean z8 = SystemClock.elapsedRealtime() < StunCheck.v6lastCheckTime;
            if (z7 || z8) {
                z6 = true;
            }
            return z6;
        }

        @NotNull
        public final NyaNatType getCurrentNatType() {
            return StunCheck.curNatType;
        }

        @NotNull
        public final NyaNatType getCurrentV6NatType() {
            return StunCheck.curV6NatType;
        }

        public final void upDateCurrentNatType(@NotNull NyaNatType nyaNatType, boolean z6, @Nullable P2PLogger p2PLogger) {
            if (p2PLogger != null) {
                P2PLogger.logI$default(p2PLogger, StunCheck.TAG, "upDateCurrentNatType nyaNatType = " + nyaNatType + " " + z6, null, 4, null);
            }
            StunCheck.curNatType = nyaNatType;
            if (z6) {
                StunCheck.lastCheckTime = 0L;
            } else {
                upDateLastCheckTime();
            }
        }

        public final void upDateCurrentV6NatType(@NotNull NyaNatType nyaNatType, boolean z6, @Nullable P2PLogger p2PLogger) {
            if (p2PLogger != null) {
                P2PLogger.logI$default(p2PLogger, StunCheck.TAG, "upDateCurrentV6NatType nyaNatType = " + nyaNatType + " " + z6, null, 4, null);
            }
            StunCheck.curV6NatType = nyaNatType;
            if (z6) {
                StunCheck.v6lastCheckTime = 0L;
            } else {
                upDateV6LastCheckTime();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunCheck$NyaNatType.class */
    public static final class NyaNatType {
        private static final EnumEntries $ENTRIES;
        private static final NyaNatType[] $VALUES;

        @NotNull
        public static final Companion Companion;
        public static final NyaNatType Unknown = new NyaNatType("Unknown", 0);
        public static final NyaNatType UDPBlock = new NyaNatType("UDPBlock", 1);
        public static final NyaNatType PublicAddress = new NyaNatType("PublicAddress", 2);
        public static final NyaNatType FullConeOrRestrictedCone = new NyaNatType("FullConeOrRestrictedCone", 3);
        public static final NyaNatType UnknownCone = new NyaNatType("UnknownCone", 4);
        public static final NyaNatType PortRestrictedCone = new NyaNatType("PortRestrictedCone", 5);
        public static final NyaNatType Symmetric = new NyaNatType("Symmetric", 6);

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunCheck$NyaNatType$Companion.class */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final com.bilibili.sistersplayer.p2p.stun.StunCheck.NyaNatType parseMappingNATTypeOnlyBC(@org.jetbrains.annotations.Nullable java.lang.Integer r4) {
                /*
                    r3 = this;
                    com.bilibili.sistersplayer.p2p.stun.StunClient$Companion r0 = com.bilibili.sistersplayer.p2p.stun.StunClient.Companion
                    r6 = r0
                    r0 = r6
                    int r0 = r0.getRESULT_B()
                    r5 = r0
                    r0 = r4
                    if (r0 != 0) goto L10
                    goto L18
                L10:
                    r0 = r4
                    int r0 = r0.intValue()
                    r1 = r5
                    if (r0 == r1) goto L51
                L18:
                    r0 = r6
                    int r0 = r0.getRESULT_C()
                    r5 = r0
                    r0 = r4
                    if (r0 != 0) goto L24
                    goto L2f
                L24:
                    r0 = r4
                    int r0 = r0.intValue()
                    r1 = r5
                    if (r0 != r1) goto L2f
                    goto L51
                L2f:
                    r0 = r6
                    int r0 = r0.getRESULT_ERR()
                    r5 = r0
                    r0 = r4
                    if (r0 != 0) goto L3b
                    goto L4a
                L3b:
                    r0 = r4
                    int r0 = r0.intValue()
                    r1 = r5
                    if (r0 != r1) goto L4a
                    com.bilibili.sistersplayer.p2p.stun.StunCheck$NyaNatType r0 = com.bilibili.sistersplayer.p2p.stun.StunCheck.NyaNatType.UDPBlock
                    r4 = r0
                    goto L55
                L4a:
                    com.bilibili.sistersplayer.p2p.stun.StunCheck$NyaNatType r0 = com.bilibili.sistersplayer.p2p.stun.StunCheck.NyaNatType.Unknown
                    r4 = r0
                    goto L55
                L51:
                    com.bilibili.sistersplayer.p2p.stun.StunCheck$NyaNatType r0 = com.bilibili.sistersplayer.p2p.stun.StunCheck.NyaNatType.Symmetric
                    r4 = r0
                L55:
                    r0 = r4
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.stun.StunCheck.NyaNatType.Companion.parseMappingNATTypeOnlyBC(java.lang.Integer):com.bilibili.sistersplayer.p2p.stun.StunCheck$NyaNatType");
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final com.bilibili.sistersplayer.p2p.stun.StunCheck.NyaNatType parseNatType(@org.jetbrains.annotations.Nullable java.lang.Integer r4, @org.jetbrains.annotations.Nullable java.lang.Integer r5) {
                /*
                    r3 = this;
                    r0 = r4
                    if (r0 == 0) goto Lb7
                    r0 = r5
                    if (r0 == 0) goto Lb3
                    com.bilibili.sistersplayer.p2p.stun.StunClient$Companion r0 = com.bilibili.sistersplayer.p2p.stun.StunClient.Companion
                    r7 = r0
                    r0 = r7
                    int r0 = r0.getRESULT_A()
                    r6 = r0
                    r0 = r4
                    int r0 = r0.intValue()
                    r1 = r6
                    if (r0 != r1) goto L72
                    r0 = r7
                    int r0 = r0.getRESULT_A()
                    r6 = r0
                    r0 = r5
                    int r0 = r0.intValue()
                    r1 = r6
                    if (r0 == r1) goto L6b
                    r0 = r7
                    int r0 = r0.getRESULT_B()
                    r6 = r0
                    r0 = r5
                    int r0 = r0.intValue()
                    r1 = r6
                    if (r0 != r1) goto L3a
                    goto L6b
                L3a:
                    r0 = r7
                    int r0 = r0.getRESULT_C()
                    r6 = r0
                    r0 = r5
                    int r0 = r0.intValue()
                    r1 = r6
                    if (r0 != r1) goto L4f
                    com.bilibili.sistersplayer.p2p.stun.StunCheck$NyaNatType r0 = com.bilibili.sistersplayer.p2p.stun.StunCheck.NyaNatType.PortRestrictedCone
                    r4 = r0
                    goto Lb1
                L4f:
                    r0 = r7
                    int r0 = r0.getRESULT_ERR()
                    r6 = r0
                    r0 = r5
                    int r0 = r0.intValue()
                    r1 = r6
                    if (r0 != r1) goto L64
                    com.bilibili.sistersplayer.p2p.stun.StunCheck$NyaNatType r0 = com.bilibili.sistersplayer.p2p.stun.StunCheck.NyaNatType.UnknownCone
                    r4 = r0
                    goto Lb1
                L64:
                    com.bilibili.sistersplayer.p2p.stun.StunCheck$NyaNatType r0 = com.bilibili.sistersplayer.p2p.stun.StunCheck.NyaNatType.Unknown
                    r4 = r0
                    goto Lb1
                L6b:
                    com.bilibili.sistersplayer.p2p.stun.StunCheck$NyaNatType r0 = com.bilibili.sistersplayer.p2p.stun.StunCheck.NyaNatType.FullConeOrRestrictedCone
                    r4 = r0
                    goto Lb1
                L72:
                    r0 = r7
                    int r0 = r0.getRESULT_B()
                    r6 = r0
                    r0 = r4
                    int r0 = r0.intValue()
                    r1 = r6
                    if (r0 == r1) goto Lad
                    r0 = r7
                    int r0 = r0.getRESULT_C()
                    r6 = r0
                    r0 = r4
                    int r0 = r0.intValue()
                    r1 = r6
                    if (r0 != r1) goto L91
                    goto Lad
                L91:
                    r0 = r7
                    int r0 = r0.getRESULT_ERR()
                    r6 = r0
                    r0 = r4
                    int r0 = r0.intValue()
                    r1 = r6
                    if (r0 != r1) goto La6
                    com.bilibili.sistersplayer.p2p.stun.StunCheck$NyaNatType r0 = com.bilibili.sistersplayer.p2p.stun.StunCheck.NyaNatType.UDPBlock
                    r4 = r0
                    goto Lb1
                La6:
                    com.bilibili.sistersplayer.p2p.stun.StunCheck$NyaNatType r0 = com.bilibili.sistersplayer.p2p.stun.StunCheck.NyaNatType.Unknown
                    r4 = r0
                    goto Lb1
                Lad:
                    com.bilibili.sistersplayer.p2p.stun.StunCheck$NyaNatType r0 = com.bilibili.sistersplayer.p2p.stun.StunCheck.NyaNatType.Symmetric
                    r4 = r0
                Lb1:
                    r0 = r4
                    return r0
                Lb3:
                    com.bilibili.sistersplayer.p2p.stun.StunCheck$NyaNatType r0 = com.bilibili.sistersplayer.p2p.stun.StunCheck.NyaNatType.Unknown
                    return r0
                Lb7:
                    com.bilibili.sistersplayer.p2p.stun.StunCheck$NyaNatType r0 = com.bilibili.sistersplayer.p2p.stun.StunCheck.NyaNatType.Unknown
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.stun.StunCheck.NyaNatType.Companion.parseNatType(java.lang.Integer, java.lang.Integer):com.bilibili.sistersplayer.p2p.stun.StunCheck$NyaNatType");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunCheck$NyaNatType$WhenMappings.class */
        public final /* synthetic */ class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[NyaNatType.values().length];
                try {
                    iArr[NyaNatType.Symmetric.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[NyaNatType.UnknownCone.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[NyaNatType.PortRestrictedCone.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[NyaNatType.FullConeOrRestrictedCone.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ NyaNatType[] $values() {
            return new NyaNatType[]{Unknown, UDPBlock, PublicAddress, FullConeOrRestrictedCone, UnknownCone, PortRestrictedCone, Symmetric};
        }

        static {
            NyaNatType[] nyaNatTypeArr$values = $values();
            $VALUES = nyaNatTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(nyaNatTypeArr$values);
            Companion = new Companion(null);
        }

        private NyaNatType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<NyaNatType> getEntries() {
            return $ENTRIES;
        }

        public static NyaNatType valueOf(String str) {
            return (NyaNatType) Enum.valueOf(NyaNatType.class, str);
        }

        public static NyaNatType[] values() {
            return (NyaNatType[]) $VALUES.clone();
        }

        @Nullable
        public final String getStr() {
            int i7 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? null : "ip-restricted" : "port-restricted" : "non-sym" : "sym";
        }

        public final boolean natValid() {
            return (this == Unknown || this == UDPBlock || this == PublicAddress) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.stun.StunCheck$check$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunCheck$check$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super NyaNatType>, Object> {
        final List<String> $filterServers;
        final List<String> $mappingServers;
        Object L$0;
        Object L$1;
        int label;
        final StunCheck this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(StunCheck stunCheck, List<String> list, List<String> list2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = stunCheck;
            this.$mappingServers = list;
            this.$filterServers = list2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$mappingServers, this.$filterServers, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super NyaNatType> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x01cb  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0200  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 523
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.stun.StunCheck.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.stun.StunCheck$checkV6$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunCheck$checkV6$2.class */
    public static final class C65042 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super NyaNatType>, Object> {
        final List<String> $filterServers;
        final List<String> $mappingServers;
        Object L$0;
        Object L$1;
        int label;
        final StunCheck this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65042(StunCheck stunCheck, List<String> list, List<String> list2, Continuation<? super C65042> continuation) {
            super(2, continuation);
            this.this$0 = stunCheck;
            this.$mappingServers = list;
            this.$filterServers = list2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C65042(this.this$0, this.$mappingServers, this.$filterServers, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super NyaNatType> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x01cb  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0200  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 523
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.stun.StunCheck.C65042.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        NyaNatType nyaNatType = NyaNatType.Unknown;
        curNatType = nyaNatType;
        curV6NatType = nyaNatType;
    }

    public StunCheck(@NotNull P2PContext p2PContext, @NotNull P2PLogger p2PLogger) {
        this.p2pContext = p2PContext;
        this.logger = p2PLogger;
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    @Nullable
    public final Object check(@NotNull List<String> list, @NotNull List<String> list2, @NotNull Continuation<? super NyaNatType> continuation) {
        Deferred deferredAsync$default = P2PContext.async$default(this.p2pContext, null, new AnonymousClass2(this, list, list2, null), 1, null);
        if (deferredAsync$default != null) {
            return deferredAsync$default.await(continuation);
        }
        return null;
    }

    @Nullable
    public final Object checkV6(@NotNull List<String> list, @NotNull List<String> list2, @NotNull Continuation<? super NyaNatType> continuation) {
        Deferred deferredAsync$default = P2PContext.async$default(this.p2pContext, null, new C65042(this, list, list2, null), 1, null);
        if (deferredAsync$default != null) {
            return deferredAsync$default.await(continuation);
        }
        return null;
    }
}
