package com.bilibili.opd.app.bizcommon.context.session;

import G0.b;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/session/MallSession.class */
@Keep
public final class MallSession {
    private int expireTime;

    @Nullable
    private String prePageId;

    @Nullable
    private String sessionCreateTime;

    @Nullable
    private String sessionId;

    @Nullable
    private Integer sourceType;

    public MallSession() {
        this(null, null, null, 0, null, 31, null);
    }

    public MallSession(@Nullable String str, @Nullable String str2, @Nullable Integer num, int i7, @Nullable String str3) {
        this.sessionId = str;
        this.sessionCreateTime = str2;
        this.sourceType = num;
        this.expireTime = i7;
        this.prePageId = str3;
    }

    public /* synthetic */ MallSession(String str, String str2, Integer num, int i7, String str3, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : num, (i8 & 8) != 0 ? 60000 : i7, (i8 & 16) != 0 ? null : str3);
    }

    public static /* synthetic */ MallSession copy$default(MallSession mallSession, String str, String str2, Integer num, int i7, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = mallSession.sessionId;
        }
        if ((i8 & 2) != 0) {
            str2 = mallSession.sessionCreateTime;
        }
        if ((i8 & 4) != 0) {
            num = mallSession.sourceType;
        }
        if ((i8 & 8) != 0) {
            i7 = mallSession.expireTime;
        }
        if ((i8 & 16) != 0) {
            str3 = mallSession.prePageId;
        }
        return mallSession.copy(str, str2, num, i7, str3);
    }

    @Nullable
    public final String component1() {
        return this.sessionId;
    }

    @Nullable
    public final String component2() {
        return this.sessionCreateTime;
    }

    @Nullable
    public final Integer component3() {
        return this.sourceType;
    }

    public final int component4() {
        return this.expireTime;
    }

    @Nullable
    public final String component5() {
        return this.prePageId;
    }

    @NotNull
    public final MallSession copy(@Nullable String str, @Nullable String str2, @Nullable Integer num, int i7, @Nullable String str3) {
        return new MallSession(str, str2, num, i7, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallSession)) {
            return false;
        }
        MallSession mallSession = (MallSession) obj;
        return Intrinsics.areEqual(this.sessionId, mallSession.sessionId) && Intrinsics.areEqual(this.sessionCreateTime, mallSession.sessionCreateTime) && Intrinsics.areEqual(this.sourceType, mallSession.sourceType) && this.expireTime == mallSession.expireTime && Intrinsics.areEqual(this.prePageId, mallSession.prePageId);
    }

    public final int getExpireTime() {
        return this.expireTime;
    }

    @Nullable
    public final String getPrePageId() {
        return this.prePageId;
    }

    @Nullable
    public final String getSessionCreateTime() {
        return this.sessionCreateTime;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public final Integer getSourceType() {
        return this.sourceType;
    }

    public int hashCode() {
        String str = this.sessionId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.sessionCreateTime;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.sourceType;
        int iA = I.a(this.expireTime, ((((iHashCode * 31) + iHashCode2) * 31) + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str3 = this.prePageId;
        return iA + (str3 == null ? 0 : str3.hashCode());
    }

    public final void setExpireTime(int i7) {
        this.expireTime = i7;
    }

    public final void setPrePageId(@Nullable String str) {
        this.prePageId = str;
    }

    public final void setSessionCreateTime(@Nullable String str) {
        this.sessionCreateTime = str;
    }

    public final void setSessionId(@Nullable String str) {
        this.sessionId = str;
    }

    public final void setSourceType(@Nullable Integer num) {
        this.sourceType = num;
    }

    @NotNull
    public String toString() {
        String str = this.sessionId;
        String str2 = this.sessionCreateTime;
        Integer num = this.sourceType;
        int i7 = this.expireTime;
        String str3 = this.prePageId;
        StringBuilder sbA = b.a("MallSession(sessionId=", str, ", sessionCreateTime=", str2, ", sourceType=");
        sbA.append(num);
        sbA.append(", expireTime=");
        sbA.append(i7);
        sbA.append(", prePageId=");
        return C8770a.a(sbA, str3, ")");
    }
}
