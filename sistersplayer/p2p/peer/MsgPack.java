package com.bilibili.sistersplayer.p2p.peer;

import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageUnpacker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/MsgPack.class */
public final class MsgPack {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/MsgPack$Companion.class */
    public static final class Companion {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/MsgPack$Companion$WhenMappings.class */
        public final /* synthetic */ class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MessageFormat.values().length];
                try {
                    iArr[MessageFormat.POSFIXINT.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[MessageFormat.NEGFIXINT.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[MessageFormat.INT8.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[MessageFormat.INT16.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                try {
                    iArr[MessageFormat.INT32.ordinal()] = 5;
                } catch (NoSuchFieldError e11) {
                }
                try {
                    iArr[MessageFormat.UINT8.ordinal()] = 6;
                } catch (NoSuchFieldError e12) {
                }
                try {
                    iArr[MessageFormat.UINT16.ordinal()] = 7;
                } catch (NoSuchFieldError e13) {
                }
                try {
                    iArr[MessageFormat.INT64.ordinal()] = 8;
                } catch (NoSuchFieldError e14) {
                }
                try {
                    iArr[MessageFormat.UINT32.ordinal()] = 9;
                } catch (NoSuchFieldError e15) {
                }
                try {
                    iArr[MessageFormat.UINT64.ordinal()] = 10;
                } catch (NoSuchFieldError e16) {
                }
                try {
                    iArr[MessageFormat.FIXSTR.ordinal()] = 11;
                } catch (NoSuchFieldError e17) {
                }
                try {
                    iArr[MessageFormat.STR8.ordinal()] = 12;
                } catch (NoSuchFieldError e18) {
                }
                try {
                    iArr[MessageFormat.STR16.ordinal()] = 13;
                } catch (NoSuchFieldError e19) {
                }
                try {
                    iArr[MessageFormat.STR32.ordinal()] = 14;
                } catch (NoSuchFieldError e20) {
                }
                try {
                    iArr[MessageFormat.FLOAT32.ordinal()] = 15;
                } catch (NoSuchFieldError e21) {
                }
                try {
                    iArr[MessageFormat.FLOAT64.ordinal()] = 16;
                } catch (NoSuchFieldError e22) {
                }
                try {
                    iArr[MessageFormat.BOOLEAN.ordinal()] = 17;
                } catch (NoSuchFieldError e23) {
                }
                try {
                    iArr[MessageFormat.FIXARRAY.ordinal()] = 18;
                } catch (NoSuchFieldError e24) {
                }
                try {
                    iArr[MessageFormat.ARRAY16.ordinal()] = 19;
                } catch (NoSuchFieldError e25) {
                }
                try {
                    iArr[MessageFormat.ARRAY32.ordinal()] = 20;
                } catch (NoSuchFieldError e26) {
                }
                try {
                    iArr[MessageFormat.FIXMAP.ordinal()] = 21;
                } catch (NoSuchFieldError e27) {
                }
                try {
                    iArr[MessageFormat.MAP16.ordinal()] = 22;
                } catch (NoSuchFieldError e28) {
                }
                try {
                    iArr[MessageFormat.MAP32.ordinal()] = 23;
                } catch (NoSuchFieldError e29) {
                }
                try {
                    iArr[MessageFormat.BIN8.ordinal()] = 24;
                } catch (NoSuchFieldError e30) {
                }
                try {
                    iArr[MessageFormat.BIN16.ordinal()] = 25;
                } catch (NoSuchFieldError e31) {
                }
                try {
                    iArr[MessageFormat.BIN32.ordinal()] = 26;
                } catch (NoSuchFieldError e32) {
                }
                try {
                    iArr[MessageFormat.NIL.ordinal()] = 27;
                } catch (NoSuchFieldError e33) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object[] unpackArray(MessageUnpacker messageUnpacker) {
            int iUnpackArrayHeader = messageUnpacker.unpackArrayHeader();
            Object[] objArr = new Object[iUnpackArrayHeader];
            for (int i7 = 0; i7 < iUnpackArrayHeader; i7++) {
                objArr[i7] = MsgPack.Companion.unpack(messageUnpacker);
            }
            return objArr;
        }

        private final byte[] unpackBin(MessageUnpacker messageUnpacker) {
            int iUnpackBinaryHeader = messageUnpacker.unpackBinaryHeader();
            return iUnpackBinaryHeader > 0 ? messageUnpacker.readPayload(iUnpackBinaryHeader) : new byte[0];
        }

        private final Map<String, Object> unpackMap(MessageUnpacker messageUnpacker) throws Exception {
            int iUnpackMapHeader = messageUnpacker.unpackMapHeader();
            HashMap map = new HashMap();
            for (int i7 = 0; i7 < iUnpackMapHeader; i7++) {
                Object objUnpack = unpack(messageUnpacker);
                if (!(objUnpack instanceof String)) {
                    throw new Exception("unpack msgpack error: key of map must be string");
                }
                map.put(objUnpack, unpack(messageUnpacker));
            }
            return map;
        }

        @Nullable
        public final Object unpack(@NotNull MessageUnpacker messageUnpacker) throws Exception {
            if (!messageUnpacker.hasNext()) {
                throw new Exception("unpack msgpack error: no more data to unpack");
            }
            MessageFormat nextFormat = messageUnpacker.getNextFormat();
            switch (nextFormat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[nextFormat.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return Integer.valueOf(messageUnpacker.unpackInt());
                case 8:
                case 9:
                case 10:
                    return Long.valueOf(messageUnpacker.unpackLong());
                case 11:
                case 12:
                case 13:
                case 14:
                    return messageUnpacker.unpackString();
                case 15:
                case 16:
                    return Double.valueOf(messageUnpacker.unpackDouble());
                case 17:
                    return Boolean.valueOf(messageUnpacker.unpackBoolean());
                case 18:
                case 19:
                case 20:
                    return unpackArray(messageUnpacker);
                case 21:
                case 22:
                case 23:
                    return unpackMap(messageUnpacker);
                case 24:
                case 25:
                case 26:
                    return unpackBin(messageUnpacker);
                case 27:
                    messageUnpacker.unpackNil();
                    return Unit.INSTANCE;
                default:
                    throw new Exception("unpack msgpack error: unsupported type " + messageUnpacker.getNextFormat());
            }
        }

        @Nullable
        public final Object unpack(@NotNull byte[] bArr) {
            return unpack(MessagePack.newDefaultUnpacker(bArr));
        }
    }
}
