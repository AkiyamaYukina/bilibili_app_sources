package com.bilibili.sistersplayer.p2p.peer;

import I.E;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/IceCandidateModel.class */
public final class IceCandidateModel {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String address;

    @NotNull
    private final String port;

    @NotNull
    private final String protocol;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/IceCandidateModel$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final IceCandidateModel parseIceCandidate(@Nullable String str) {
            if (str == null || str.length() == 0) {
                return null;
            }
            try {
                List listR = StringsKt.R(str, new String[]{" "}, 0, 6);
                return new IceCandidateModel((String) listR.get(2), (String) listR.get(4), (String) listR.get(5));
            } catch (Exception e7) {
                return null;
            }
        }
    }

    public IceCandidateModel(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.protocol = str;
        this.address = str2;
        this.port = str3;
    }

    public static /* synthetic */ IceCandidateModel copy$default(IceCandidateModel iceCandidateModel, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = iceCandidateModel.protocol;
        }
        if ((i7 & 2) != 0) {
            str2 = iceCandidateModel.address;
        }
        if ((i7 & 4) != 0) {
            str3 = iceCandidateModel.port;
        }
        return iceCandidateModel.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.protocol;
    }

    @NotNull
    public final String component2() {
        return this.address;
    }

    @NotNull
    public final String component3() {
        return this.port;
    }

    @NotNull
    public final IceCandidateModel copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return new IceCandidateModel(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IceCandidateModel)) {
            return false;
        }
        IceCandidateModel iceCandidateModel = (IceCandidateModel) obj;
        return Intrinsics.areEqual(this.protocol, iceCandidateModel.protocol) && Intrinsics.areEqual(this.address, iceCandidateModel.address) && Intrinsics.areEqual(this.port, iceCandidateModel.port);
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final String getPort() {
        return this.port;
    }

    @NotNull
    public final String getProtocol() {
        return this.protocol;
    }

    public int hashCode() {
        return this.port.hashCode() + E.a(this.protocol.hashCode() * 31, 31, this.address);
    }

    @NotNull
    public String toString() {
        String str = this.protocol;
        String str2 = this.address;
        return C8770a.a(G0.b.a("IceCandidateModel(protocol=", str, ", address=", str2, ", port="), this.port, ")");
    }
}
