package com.bilibili.lib.relay.opporelay;

import N1.o;
import androidx.annotation.Keep;
import androidx.constraintlayout.motion.widget.p;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/relay/opporelay/BiliOppoRelay.class */
public final class BiliOppoRelay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static com.bilibili.ad.adview.comment.component.dialog.a f64267a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/relay/opporelay/BiliOppoRelay$AbilityBean.class */
    @Bson
    @Keep
    public static final class AbilityBean {

        @SerializedName("key")
        @NotNull
        private final String key;

        @SerializedName("value")
        @NotNull
        private final String value;

        public AbilityBean(@NotNull String str, @NotNull String str2) {
            this.key = str;
            this.value = str2;
        }

        public static /* synthetic */ AbilityBean copy$default(AbilityBean abilityBean, String str, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = abilityBean.key;
            }
            if ((i7 & 2) != 0) {
                str2 = abilityBean.value;
            }
            return abilityBean.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.key;
        }

        @NotNull
        public final String component2() {
            return this.value;
        }

        @NotNull
        public final AbilityBean copy(@NotNull String str, @NotNull String str2) {
            return new AbilityBean(str, str2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AbilityBean)) {
                return false;
            }
            AbilityBean abilityBean = (AbilityBean) obj;
            return Intrinsics.areEqual(this.key, abilityBean.key) && Intrinsics.areEqual(this.value, abilityBean.value);
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.key.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return p.a("CPProfileInfo{key='", this.key, "', value='", this.value, "'}");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/relay/opporelay/BiliOppoRelay$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f64268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<AbilityBean> f64269b;

        public a(@NotNull String str, @NotNull List<AbilityBean> list) {
            this.f64268a = str;
            this.f64269b = list;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f64268a, aVar.f64268a) && Intrinsics.areEqual(this.f64269b, aVar.f64269b);
        }

        public final int hashCode() {
            return this.f64269b.hashCode() + (this.f64268a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            List<AbilityBean> list = this.f64269b;
            return o.a(this.f64268a, ", extraArgs=", ")", new StringBuilder("OppoSendPadData(header="), list);
        }
    }
}
