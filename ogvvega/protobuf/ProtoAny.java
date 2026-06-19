package com.bilibili.ogvvega.protobuf;

import com.bilibili.ogvvega.protobuf.annotation.FieldNumber;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/protobuf/ProtoAny.class */
public final class ProtoAny {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TYPE_URL_PREFIX = "type.googleapis.com";

    @FieldNumber(1)
    @NotNull
    private String typeUrl = "";

    @FieldNumber(2)
    @NotNull
    private byte[] buffer = new byte[0];

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/protobuf/ProtoAny$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
        @NotNull
        public final <T> ProtoAny pack(@NotNull T t7, @NotNull String str) throws InvalidProtocolBufferException, IllegalAccessException {
            ProtoAny protoAny = new ProtoAny();
            protoAny.setTypeUrl(str);
            ArrayList arrayList = new ArrayList();
            ProtoBufEncoder.INSTANCE.encodeMessageNoTag$ogv_vega_release(t7, arrayList);
            protoAny.setBuffer(CollectionsKt.toByteArray(arrayList));
            return protoAny;
        }

        public final <T> T unpack(@NotNull ProtoAny protoAny, @NotNull Class<T> cls) {
            return (T) ProtoBufEncoder.INSTANCE.readMessage$ogv_vega_release(protoAny.getBuffer(), cls);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(ProtoAny.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        ProtoAny protoAny = (ProtoAny) obj;
        return Intrinsics.areEqual(this.typeUrl, protoAny.typeUrl) && Arrays.equals(this.buffer, protoAny.buffer);
    }

    @NotNull
    public final byte[] getBuffer() {
        return this.buffer;
    }

    @NotNull
    public final String getTypeUrl() {
        return this.typeUrl;
    }

    public int hashCode() {
        return Arrays.hashCode(this.buffer) + (this.typeUrl.hashCode() * 31);
    }

    public final void setBuffer(@NotNull byte[] bArr) {
        this.buffer = bArr;
    }

    public final void setTypeUrl(@NotNull String str) {
        this.typeUrl = str;
    }
}
