package com.bilibili.ogvvega.protobuf;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/protobuf/WireFormatter.class */
public final class WireFormatter {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int TAG_TYPE_BITS = 3;
    private static final int TAG_TYPE_MASK = 7;
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_SRART_GROUP = 3;
    public static final int WIRETYPE_VARINT = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/protobuf/WireFormatter$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getFieldNumber(int i7) {
            return i7 >>> 3;
        }

        public final int getWireType(int i7) {
            return i7 & 7;
        }

        public final int makeTag(int i7, int i8) {
            return (i7 << 3) | i8;
        }
    }
}
