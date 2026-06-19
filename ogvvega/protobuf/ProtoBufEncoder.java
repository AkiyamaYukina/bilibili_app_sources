package com.bilibili.ogvvega.protobuf;

import androidx.compose.foundation.gestures.C3392f;
import com.bilibili.ogvvega.protobuf.WireFormatter;
import com.bilibili.ogvvega.protobuf.annotation.Any;
import com.bilibili.ogvvega.protobuf.annotation.FieldNumber;
import com.bilibili.ogvvega.protobuf.annotation.Oneof;
import com.bilibili.ogvvega.protobuf.annotation.Pair;
import com.bilibili.search2.api.SearchBangumiItem;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/protobuf/ProtoBufEncoder.class */
public final class ProtoBufEncoder {

    @NotNull
    public static final ProtoBufEncoder INSTANCE = new ProtoBufEncoder();

    private ProtoBufEncoder() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    private final <T> int encodeAny(int i7, T t7, List<Byte> list, String str) throws InvalidProtocolBufferException, IllegalAccessException {
        List<Byte> arrayList = new ArrayList<>();
        encodeMessageNoTag$ogv_vega_release(t7, arrayList);
        ProtoAny protoAny = new ProtoAny();
        protoAny.setTypeUrl(str);
        protoAny.setBuffer(CollectionsKt.toByteArray(arrayList));
        return encodeMessage(i7, protoAny, list);
    }

    private final int encodeBoolean(int i7, boolean z6, List<Byte> list) {
        int iEncodeTag = encodeTag(i7, 0, list);
        list.add(Byte.valueOf(z6 ? (byte) 1 : (byte) 0));
        return iEncodeTag + 1;
    }

    private final int encodeBytes(int i7, byte[] bArr, List<Byte> list) {
        return encodeTag(i7, 2, list) + encodeBytesNoTag(bArr, list);
    }

    private final int encodeBytesNoTag(byte[] bArr, List<Byte> list) {
        int iEncodeUInt32NoTag$default = encodeUInt32NoTag$default(this, bArr.length, list, 0, 4, null);
        for (byte b7 : bArr) {
            list.add(Byte.valueOf(b7));
        }
        return iEncodeUInt32NoTag$default + bArr.length;
    }

    private final int encodeDouble(int i7, double d7, List<Byte> list) {
        return encodeFixed64(i7, Double.doubleToRawLongBits(d7), list);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    private final int encodeEnum(int i7, Enum<?> r7, List<Byte> list) throws InvalidProtocolBufferException {
        if (Internal.EnumLite.class.isAssignableFrom(r7.getClass())) {
            return encodeInt(i7, ((Internal.EnumLite) r7).getNumber(), list);
        }
        throw new InvalidProtocolBufferException("the enum class " + r7.getClass() + " must implement EnumLite interface");
    }

    private final int encodeFixed32(int i7, int i8, List<Byte> list) {
        return encodeTag(i7, 5, list) + encodeFixed32NoTag(i8, list);
    }

    private final int encodeFixed32NoTag(int i7, List<Byte> list) {
        list.add(Byte.valueOf((byte) (i7 & 255)));
        list.add(Byte.valueOf((byte) ((i7 >> 8) & 255)));
        list.add(Byte.valueOf((byte) ((i7 >> 16) & 255)));
        list.add(Byte.valueOf((byte) ((i7 >> 24) & 255)));
        return 4;
    }

    private final int encodeFixed64(int i7, long j7, List<Byte> list) {
        return encodeTag(i7, 1, list) + encodeFixed64NoTag(j7, list);
    }

    private final int encodeFixed64NoTag(long j7, List<Byte> list) {
        list.add(Byte.valueOf((byte) (j7 & 255)));
        list.add(Byte.valueOf((byte) ((j7 >> 8) & 255)));
        list.add(Byte.valueOf((byte) ((j7 >> 16) & 255)));
        list.add(Byte.valueOf((byte) ((j7 >> 24) & 255)));
        list.add(Byte.valueOf((byte) ((j7 >> 32) & 255)));
        list.add(Byte.valueOf((byte) ((j7 >> 40) & 255)));
        list.add(Byte.valueOf((byte) ((j7 >> 48) & 255)));
        list.add(Byte.valueOf((byte) ((j7 >> 56) & 255)));
        return 8;
    }

    private final int encodeFloat(int i7, float f7, List<Byte> list) {
        return encodeFixed32(i7, Float.floatToRawIntBits(f7), list);
    }

    private final int encodeInt(int i7, int i8, List<Byte> list) {
        return encodeTag(i7, 0, list) + encodeUInt32NoTag$default(this, i8, list, 0, 4, null);
    }

    private final int encodeLong(int i7, long j7, List<Byte> list) {
        return encodeTag(i7, 0, list) + encodeUInt64NoTag(j7, list);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    private final <T> int encodeMessage(int i7, T t7, List<Byte> list) throws InvalidProtocolBufferException, IllegalAccessException {
        int iEncodeTag = encodeTag(i7, 2, list);
        int size = list.size();
        int iEncodeMessageNoTag$ogv_vega_release = encodeMessageNoTag$ogv_vega_release(t7, list);
        return encodeUInt32NoTag(iEncodeMessageNoTag$ogv_vega_release, list, size) + iEncodeMessageNoTag$ogv_vega_release + iEncodeTag;
    }

    private final int encodeOneof(OneofWrapper oneofWrapper, List<Byte> list) {
        Object value = oneofWrapper.getValue();
        Object obj = value;
        if (value == null) {
            obj = null;
        }
        if (obj == null) {
            return 0;
        }
        return encodeMessage(oneofWrapper.getEventCase(), obj, list);
    }

    private final int encodePackedRepeatedBool(int i7, List<?> list, List<Byte> list2) {
        return encodeTag(i7, 2, list2) + encodePackedRepeatedBoolNoTag(list, list2);
    }

    private final int encodePackedRepeatedBoolNoTag(List<?> list, List<Byte> list2) {
        int size = list2.size();
        int i7 = 0;
        for (Object obj : list) {
            if (obj != null) {
                list2.add(Byte.valueOf(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0));
                i7++;
            }
        }
        return i7 + encodeUInt32NoTag(i7, list2, size);
    }

    private final int encodePackedRepeatedDouble(int i7, List<?> list, List<Byte> list2) {
        return encodeTag(i7, 2, list2) + encodePackedRepeatedDoubleNoTag(list, list2);
    }

    private final int encodePackedRepeatedDoubleNoTag(List<?> list, List<Byte> list2) {
        int size = list2.size();
        int iEncodeFixed64NoTag = 0;
        for (Object obj : list) {
            if (obj != null) {
                iEncodeFixed64NoTag += encodeFixed64NoTag(Double.doubleToRawLongBits(((Double) obj).doubleValue()), list2);
            }
        }
        return iEncodeFixed64NoTag + encodeUInt32NoTag(iEncodeFixed64NoTag, list2, size);
    }

    private final int encodePackedRepeatedFloat(int i7, List<?> list, List<Byte> list2) {
        return encodeTag(i7, 2, list2) + encodePackedRepeatedFloatNoTag(list, list2);
    }

    private final int encodePackedRepeatedFloatNoTag(List<?> list, List<Byte> list2) {
        int size = list2.size();
        int iEncodeFixed32NoTag = 0;
        for (Object obj : list) {
            if (obj != null) {
                iEncodeFixed32NoTag += encodeFixed32NoTag(Float.floatToRawIntBits(((Float) obj).floatValue()), list2);
            }
        }
        return iEncodeFixed32NoTag + encodeUInt32NoTag(iEncodeFixed32NoTag, list2, size);
    }

    private final int encodePackedRepeatedInt(int i7, List<?> list, List<Byte> list2) {
        return encodeTag(i7, 2, list2) + encodePackedRepeatedIntNoTag(list, list2);
    }

    private final int encodePackedRepeatedIntNoTag(List<?> list, List<Byte> list2) {
        int size = list2.size();
        int iEncodeUInt32NoTag$default = 0;
        for (Object obj : list) {
            if (obj != null) {
                iEncodeUInt32NoTag$default += encodeUInt32NoTag$default(this, ((Integer) obj).intValue(), list2, 0, 4, null);
            }
        }
        return iEncodeUInt32NoTag$default + encodeUInt32NoTag(iEncodeUInt32NoTag$default, list2, size);
    }

    private final int encodePackedRepeatedLong(int i7, List<?> list, List<Byte> list2) {
        return encodeTag(i7, 2, list2) + encodePackedRepeatedLongNoTag(list, list2);
    }

    private final int encodePackedRepeatedLongNoTag(List<?> list, List<Byte> list2) {
        int size = list2.size();
        int iEncodeUInt64NoTag = 0;
        for (Object obj : list) {
            if (obj != null) {
                iEncodeUInt64NoTag += encodeUInt64NoTag(((Long) obj).longValue(), list2);
            }
        }
        return iEncodeUInt64NoTag + encodeUInt32NoTag(iEncodeUInt64NoTag, list2, size);
    }

    private final int encodeRepeatedField(int i7, List<?> list, List<Byte> list2, Class<?> cls) {
        return (Intrinsics.areEqual(cls, Short.TYPE) || Intrinsics.areEqual(cls, Short.class) || Intrinsics.areEqual(cls, Integer.TYPE) || Intrinsics.areEqual(cls, Integer.class)) ? encodePackedRepeatedInt(i7, list, list2) : (Intrinsics.areEqual(cls, Long.TYPE) || Intrinsics.areEqual(cls, Long.class)) ? encodePackedRepeatedLong(i7, list, list2) : (Intrinsics.areEqual(cls, Boolean.TYPE) || Intrinsics.areEqual(cls, Boolean.class)) ? encodePackedRepeatedBool(i7, list, list2) : (Intrinsics.areEqual(cls, Double.TYPE) || Intrinsics.areEqual(cls, Double.class)) ? encodePackedRepeatedDouble(i7, list, list2) : (Intrinsics.areEqual(cls, Float.TYPE) || Intrinsics.areEqual(cls, Float.class)) ? encodePackedRepeatedFloat(i7, list, list2) : Intrinsics.areEqual(cls, String.class) ? encodeRepeatedString(i7, list, list2) : encodeRepeatedMessage(i7, list, list2);
    }

    private final int encodeRepeatedMessage(int i7, List<?> list, List<Byte> list2) {
        int iEncodeMessage = 0;
        for (Object obj : list) {
            if (obj != null) {
                iEncodeMessage += encodeMessage(i7, obj, list2);
            }
        }
        return iEncodeMessage;
    }

    private final int encodeRepeatedString(int i7, List<?> list, List<Byte> list2) {
        int iEncodeString = 0;
        for (Object obj : list) {
            if (obj != null) {
                iEncodeString += encodeString(i7, (String) obj, list2);
            }
        }
        return iEncodeString;
    }

    private final int encodeString(int i7, String str, List<Byte> list) {
        return encodeTag(i7, 2, list) + encodeStringNoTag(str, list);
    }

    private final int encodeStringNoTag(String str, List<Byte> list) {
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        int iEncodeUInt32NoTag$default = encodeUInt32NoTag$default(this, bytes.length, list, 0, 4, null);
        for (byte b7 : bytes) {
            list.add(Byte.valueOf(b7));
        }
        return iEncodeUInt32NoTag$default + bytes.length;
    }

    private final int encodeTag(int i7, int i8, List<Byte> list) {
        return encodeUInt32NoTag$default(this, WireFormatter.Companion.makeTag(i7, i8), list, 0, 4, null);
    }

    private final int encodeUInt32NoTag(int i7, List<Byte> list, int i8) {
        int i9 = 0;
        while ((i7 & (-128)) != 0) {
            list.add(i8 + i9, Byte.valueOf((byte) ((i7 & SearchBangumiItem.TYPE_FULLNET_BANGUMI) | 128)));
            i7 >>>= 7;
            i9++;
        }
        list.add(i8 + i9, Byte.valueOf((byte) i7));
        return i9 + 1;
    }

    public static /* synthetic */ int encodeUInt32NoTag$default(ProtoBufEncoder protoBufEncoder, int i7, List list, int i8, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            i8 = list.size();
        }
        return protoBufEncoder.encodeUInt32NoTag(i7, list, i8);
    }

    private final int encodeUInt64NoTag(long j7, List<Byte> list) {
        int i7 = 1;
        while (((-128) & j7) != 0) {
            list.add(Byte.valueOf((byte) ((127 & j7) | 128)));
            j7 >>>= 7;
            i7++;
        }
        list.add(Byte.valueOf((byte) j7));
        return i7;
    }

    private final <T> Field getField(Class<T> cls, int i7) {
        for (Field field : cls.getDeclaredFields()) {
            if (isOneofField(field, i7)) {
                field.setAccessible(true);
                return field;
            }
            if (field.isAnnotationPresent(FieldNumber.class) && ((FieldNumber) field.getAnnotation(FieldNumber.class)).value() == i7) {
                field.setAccessible(true);
                return field;
            }
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    private final boolean isOneofField(Field field, int i7) throws InvalidProtocolBufferException {
        Pair pair;
        if (!field.isAnnotationPresent(Oneof.class)) {
            return false;
        }
        if (!Intrinsics.areEqual(field.getType(), OneofWrapper.class)) {
            throw new InvalidProtocolBufferException("the field with annotation @Oneof must be OneofWrapper type");
        }
        if (field.isAnnotationPresent(FieldNumber.class) || field.isAnnotationPresent(Any.class)) {
            throw new InvalidProtocolBufferException("the field with annotation @Onfof can`t use with @Any or @FieldNumber");
        }
        Pair[] pairArrValue = ((Oneof) field.getAnnotation(Oneof.class)).value();
        int length = pairArrValue.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                pair = null;
                break;
            }
            pair = pairArrValue[i8];
            if (pair.fieldNumber() == i7) {
                break;
            }
            i8++;
        }
        return pair != null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    private final <T> kotlin.Pair<Integer, T> readAny(byte[] bArr, int i7, Class<T> cls) throws InvalidProtocolBufferException {
        kotlin.Pair<Integer, T> message = readMessage(bArr, i7, ProtoAny.class);
        return new kotlin.Pair<>(message.getFirst(), readMessage$ogv_vega_release(((ProtoAny) message.getSecond()).getBuffer(), cls));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    private final kotlin.Pair<Integer, Boolean> readBool(byte[] bArr, int i7) throws InvalidProtocolBufferException {
        kotlin.Pair<Integer, Long> rawVarint64 = readRawVarint64(bArr, i7);
        return new kotlin.Pair<>(rawVarint64.getFirst(), Boolean.valueOf(((Number) rawVarint64.getSecond()).longValue() != 0));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    private final kotlin.Pair<Integer, byte[]> readBytes(byte[] bArr, int i7) throws InvalidProtocolBufferException {
        kotlin.Pair<Integer, byte[]> pair;
        kotlin.Pair<Integer, Integer> rawVarint32 = readRawVarint32(bArr, i7);
        if (((Number) rawVarint32.getSecond()).intValue() == 0) {
            pair = new kotlin.Pair<>(rawVarint32.getFirst(), new byte[0]);
        } else {
            pair = new kotlin.Pair<>(Integer.valueOf(((Number) rawVarint32.getSecond()).intValue() + ((Number) rawVarint32.getFirst()).intValue()), readRawBytesSlowPath(bArr, ((Number) rawVarint32.getFirst()).intValue() + i7, ((Number) rawVarint32.getSecond()).intValue()));
        }
        return pair;
    }

    private final double readDouble(byte[] bArr, int i7) {
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        return Double.longBitsToDouble(readRawLittleEndian64(bArr, i7));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    private final kotlin.Pair<Integer, Enum<?>> readEnum(byte[] bArr, int i7, Class<?> cls) throws InvalidProtocolBufferException {
        Enum r62;
        if (!Internal.EnumLite.class.isAssignableFrom(cls)) {
            throw new InvalidProtocolBufferException("the enum class " + cls + " must implement EnumLite interface");
        }
        kotlin.Pair<Integer, Integer> int32 = readInt32(bArr, i7);
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i8 = 0;
        while (true) {
            r62 = null;
            if (i8 >= length) {
                break;
            }
            Field field = declaredFields[i8];
            if (Intrinsics.areEqual(field.getType(), cls) && ((Number) int32.getSecond()).intValue() == ((Internal.EnumLite) field.get(null)).getNumber()) {
                r62 = (Enum) field.get(null);
                break;
            }
            i8++;
        }
        return new kotlin.Pair<>(int32.getFirst(), r62);
    }

    private final float readFloat(byte[] bArr, int i7) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(readRawLittleEndian32(bArr, i7));
    }

    private final kotlin.Pair<Integer, Integer> readInt32(byte[] bArr, int i7) {
        return readRawVarint32(bArr, i7);
    }

    private final kotlin.Pair<Integer, Long> readInt64(byte[] bArr, int i7) {
        return readRawVarint64(bArr, i7);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    private final <T> kotlin.Pair<Integer, T> readMessage(byte[] bArr, int i7, Class<T> cls) throws InvalidProtocolBufferException {
        kotlin.Pair<Integer, Integer> rawVarint32 = readRawVarint32(bArr, i7);
        byte[] rawBytesSlowPath = readRawBytesSlowPath(bArr, ((Number) rawVarint32.getFirst()).intValue() + i7, ((Number) rawVarint32.getSecond()).intValue());
        return new kotlin.Pair<>(Integer.valueOf(((Number) rawVarint32.getSecond()).intValue() + ((Number) rawVarint32.getFirst()).intValue()), readMessage$ogv_vega_release(rawBytesSlowPath, cls));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    private final kotlin.Pair<Integer, OneofWrapper> readOneof(byte[] bArr, int i7, int i8, Class<?> cls) throws InvalidProtocolBufferException {
        kotlin.Pair message = readMessage(bArr, i7, cls);
        return new kotlin.Pair<>(message.getFirst(), new OneofWrapper(i8, message.getSecond()));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    private final int readPackedRepeatedField(byte[] bArr, int i7, List<Object> list, Class<?> cls) throws InvalidProtocolBufferException {
        int iIntValue;
        kotlin.Pair<Integer, Integer> rawVarint32 = readRawVarint32(bArr, i7);
        int iIntValue2 = ((Number) rawVarint32.getFirst()).intValue() + i7;
        int iIntValue3 = ((Number) rawVarint32.getSecond()).intValue() + iIntValue2;
        while (iIntValue2 < iIntValue3) {
            if (Intrinsics.areEqual(cls, Short.TYPE) || Intrinsics.areEqual(cls, Short.class) || Intrinsics.areEqual(cls, Integer.TYPE) || Intrinsics.areEqual(cls, Integer.class)) {
                kotlin.Pair<Integer, Integer> int32 = readInt32(bArr, iIntValue2);
                list.add(int32.getSecond());
                iIntValue = ((Number) int32.getFirst()).intValue();
                iIntValue2 += iIntValue;
            } else if (Intrinsics.areEqual(cls, Long.TYPE) || Intrinsics.areEqual(cls, Long.class)) {
                kotlin.Pair<Integer, Long> int64 = readInt64(bArr, iIntValue2);
                list.add(int64.getSecond());
                iIntValue = ((Number) int64.getFirst()).intValue();
                iIntValue2 += iIntValue;
            } else if (Intrinsics.areEqual(cls, Boolean.TYPE) || Intrinsics.areEqual(cls, Boolean.class)) {
                kotlin.Pair<Integer, Boolean> bool = readBool(bArr, iIntValue2);
                list.add(bool.getSecond());
                iIntValue = ((Number) bool.getFirst()).intValue();
                iIntValue2 += iIntValue;
            } else if (Intrinsics.areEqual(cls, Double.TYPE) || Intrinsics.areEqual(cls, Double.class)) {
                list.add(Double.valueOf(readDouble(bArr, iIntValue2)));
                iIntValue2 += 8;
            } else if (Intrinsics.areEqual(cls, Float.TYPE) || Intrinsics.areEqual(cls, Float.class)) {
                list.add(Float.valueOf(readFloat(bArr, iIntValue2)));
                iIntValue2 += 4;
            }
        }
        if (iIntValue2 == iIntValue3) {
            return iIntValue2 - i7;
        }
        throw new InvalidProtocolBufferException("decoder encountered a malformed varint.");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    private final byte[] readRawBytesSlowPath(byte[] bArr, int i7, int i8) throws InvalidProtocolBufferException {
        if (i8 <= 0) {
            if (i8 == 0) {
                return new byte[0];
            }
            throw new InvalidProtocolBufferException("decoder encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        return bArr2;
    }

    private final int readRawLittleEndian32(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    private final long readRawLittleEndian64(byte[] bArr, int i7) {
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    private final kotlin.Pair<Integer, Integer> readRawVarint32(byte[] bArr, int i7) throws InvalidProtocolBufferException {
        int i8 = 0;
        int i9 = i7;
        int i10 = 0;
        while (i8 < 64) {
            int i11 = i9 + 1;
            byte b7 = bArr[i9];
            i10 |= (b7 & 127) << i8;
            if ((b7 & 128) == 0) {
                return new kotlin.Pair<>(Integer.valueOf(i11 - i7), Integer.valueOf(i10));
            }
            i8 += 7;
            i9 = i11;
        }
        throw new InvalidProtocolBufferException("decoder encountered a malformed varint.");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    private final kotlin.Pair<Integer, Long> readRawVarint64(byte[] bArr, int i7) throws InvalidProtocolBufferException {
        long j7 = 0;
        int i8 = 0;
        int i9 = i7;
        while (true) {
            int i10 = i9;
            if (i8 >= 64) {
                throw new InvalidProtocolBufferException("decoder encountered a malformed varint.");
            }
            int i11 = i10 + 1;
            byte b7 = bArr[i10];
            j7 |= ((long) (b7 & 127)) << i8;
            if ((b7 & 128) == 0) {
                return new kotlin.Pair<>(Integer.valueOf(i11 - i7), Long.valueOf(j7));
            }
            i8 += 7;
            i9 = i11;
        }
    }

    private final int readRepeatedField(byte[] bArr, int i7, List<Object> list, Class<?> cls) {
        return (Intrinsics.areEqual(cls, Short.TYPE) || Intrinsics.areEqual(cls, Short.class) || Intrinsics.areEqual(cls, Integer.TYPE) || Intrinsics.areEqual(cls, Integer.class) || Intrinsics.areEqual(cls, Long.TYPE) || Intrinsics.areEqual(cls, Long.class) || Intrinsics.areEqual(cls, Boolean.TYPE) || Intrinsics.areEqual(cls, Boolean.class) || Intrinsics.areEqual(cls, Double.TYPE) || Intrinsics.areEqual(cls, Double.class) || Intrinsics.areEqual(cls, Float.TYPE) || Intrinsics.areEqual(cls, Float.class)) ? readPackedRepeatedField(bArr, i7, list, cls) : readUnpackedRepeatedField(bArr, i7, list, cls);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    private final kotlin.Pair<Integer, String> readString(byte[] bArr, int i7) throws InvalidProtocolBufferException {
        kotlin.Pair<Integer, String> pair;
        kotlin.Pair<Integer, Integer> rawVarint32 = readRawVarint32(bArr, i7);
        if (((Number) rawVarint32.getSecond()).intValue() == 0) {
            pair = new kotlin.Pair<>(rawVarint32.getFirst(), "");
        } else {
            pair = new kotlin.Pair<>(Integer.valueOf(((Number) rawVarint32.getSecond()).intValue() + ((Number) rawVarint32.getFirst()).intValue()), new String(readRawBytesSlowPath(bArr, ((Number) rawVarint32.getFirst()).intValue() + i7, ((Number) rawVarint32.getSecond()).intValue()), Charsets.UTF_8));
        }
        return pair;
    }

    private final kotlin.Pair<Integer, Integer> readTag(byte[] bArr, int i7) {
        return readRawVarint32(bArr, i7);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    private final int readUnpackedRepeatedField(byte[] bArr, int i7, List<Object> list, Class<?> cls) throws InvalidProtocolBufferException {
        int iIntValue;
        if (Intrinsics.areEqual(cls, String.class)) {
            kotlin.Pair<Integer, String> string = readString(bArr, i7);
            list.add(string.getSecond());
            iIntValue = ((Number) string.getFirst()).intValue();
        } else {
            kotlin.Pair message = readMessage(bArr, i7, cls);
            list.add(message.getSecond());
            iIntValue = ((Number) message.getFirst()).intValue();
        }
        return (iIntValue + i7) - i7;
    }

    public final <T> T decode(@NotNull byte[] bArr, @NotNull Class<T> cls) {
        return (T) readMessage$ogv_vega_release(bArr, cls);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    @NotNull
    public final <T> byte[] encode(@NotNull T t7) throws InvalidProtocolBufferException, IllegalAccessException {
        ArrayList arrayList = new ArrayList();
        encodeMessageNoTag$ogv_vega_release(t7, arrayList);
        return CollectionsKt.toByteArray(arrayList);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> int encodeMessageNoTag$ogv_vega_release(@NotNull T t7, @NotNull List<Byte> list) throws InvalidProtocolBufferException, IllegalAccessException {
        int iEncodeInt;
        int i7 = 0;
        for (Field field : t7.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(t7);
            if (obj != null) {
                if (field.isAnnotationPresent(Oneof.class)) {
                    if (!(obj instanceof OneofWrapper)) {
                        throw new InvalidProtocolBufferException("the field with annotation @Oneof must be OneofWrapper type");
                    }
                    if (field.isAnnotationPresent(FieldNumber.class) || field.isAnnotationPresent(Any.class)) {
                        throw new InvalidProtocolBufferException("the field with annotation @Onfof can`t use with @Any or @FieldNumber");
                    }
                    encodeOneof((OneofWrapper) obj, list);
                } else if (field.isAnnotationPresent(FieldNumber.class)) {
                    int iValue = ((FieldNumber) field.getAnnotation(FieldNumber.class)).value();
                    Class<?> type = field.getType();
                    if (Intrinsics.areEqual(type, Short.TYPE) || Intrinsics.areEqual(type, Short.class) || Intrinsics.areEqual(type, Integer.TYPE) || Intrinsics.areEqual(type, Integer.class)) {
                        iEncodeInt = encodeInt(iValue, ((Integer) obj).intValue(), list);
                    } else if (Intrinsics.areEqual(type, Long.TYPE) || Intrinsics.areEqual(type, Long.class)) {
                        iEncodeInt = encodeLong(iValue, ((Long) obj).longValue(), list);
                    } else if (Intrinsics.areEqual(type, Boolean.TYPE) || Intrinsics.areEqual(type, Boolean.class)) {
                        iEncodeInt = encodeBoolean(iValue, ((Boolean) obj).booleanValue(), list);
                    } else if (Intrinsics.areEqual(type, Double.TYPE) || Intrinsics.areEqual(type, Double.class)) {
                        iEncodeInt = encodeDouble(iValue, ((Double) obj).doubleValue(), list);
                    } else if (Intrinsics.areEqual(type, Float.TYPE) || Intrinsics.areEqual(type, Float.class)) {
                        iEncodeInt = encodeFloat(iValue, ((Float) obj).floatValue(), list);
                    } else if (Intrinsics.areEqual(type, String.class)) {
                        iEncodeInt = encodeString(iValue, (String) obj, list);
                    } else if (Intrinsics.areEqual(type, byte[].class)) {
                        iEncodeInt = encodeBytes(iValue, (byte[]) obj, list);
                    } else if (List.class.isAssignableFrom(field.getType())) {
                        Type genericType = field.getGenericType();
                        if (!(genericType instanceof ParameterizedType)) {
                            throw new InvalidProtocolBufferException(C3392f.a(iValue, "the List type with field number ", " must have one type argument"));
                        }
                        Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
                        if (actualTypeArguments.length > 1) {
                            throw new InvalidProtocolBufferException(C3392f.a(iValue, "the List type with field number ", " has more than one type argument"));
                        }
                        Type type2 = actualTypeArguments[0];
                        if (!(type2 instanceof Class)) {
                            throw new InvalidProtocolBufferException(C3392f.a(iValue, "the type parameter of the list field with number ", " must be Class"));
                        }
                        iEncodeInt = encodeRepeatedField(iValue, (List) obj, list, (Class) type2);
                    } else {
                        iEncodeInt = field.getType().isArray() ? encodeRepeatedField(iValue, ArraysKt.toList((Object[]) obj), list, field.getType().getComponentType()) : field.getType().isEnum() ? encodeEnum(iValue, (Enum) obj, list) : field.isAnnotationPresent(Any.class) ? encodeAny(iValue, obj, list, ((Any) field.getAnnotation(Any.class)).value()) : encodeMessage(iValue, obj, list);
                    }
                    i7 += iEncodeInt;
                } else {
                    continue;
                }
            }
        }
        return i7;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public final <T> T readMessage$ogv_vega_release(@NotNull byte[] bArr, @NotNull Class<T> cls) throws InvalidProtocolBufferException, IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        int iIntValue;
        List<Object> arrayList;
        Pair pair;
        Constructor<T> declaredConstructor = cls.getDeclaredConstructor(null);
        if (declaredConstructor == null) {
            throw new InvalidProtocolBufferException("Class " + cls + " must have a constructor with no parameters");
        }
        declaredConstructor.setAccessible(true);
        T tNewInstance = declaredConstructor.newInstance(null);
        int repeatedField = 0;
        while (repeatedField < bArr.length) {
            kotlin.Pair<Integer, Integer> tag = readTag(bArr, repeatedField);
            int iIntValue2 = repeatedField + ((Number) tag.getFirst()).intValue();
            WireFormatter.Companion companion = WireFormatter.Companion;
            int fieldNumber = companion.getFieldNumber(((Number) tag.getSecond()).intValue());
            Field field = getField(cls, fieldNumber);
            if (field == null || !field.isAnnotationPresent(Oneof.class)) {
                int wireType = companion.getWireType(((Number) tag.getSecond()).intValue());
                if (wireType != 0) {
                    if (wireType == 1) {
                        if (field != null) {
                            Class<?> type = field.getType();
                            if (Intrinsics.areEqual(type, Double.TYPE) || Intrinsics.areEqual(type, Double.class)) {
                                field.set(tNewInstance, Double.valueOf(readDouble(bArr, iIntValue2)));
                            }
                        }
                        repeatedField = iIntValue2 + 8;
                    } else if (wireType != 2) {
                        if (wireType != 5) {
                            repeatedField = iIntValue2;
                        } else {
                            if (field != null) {
                                Class<?> type2 = field.getType();
                                if (Intrinsics.areEqual(type2, Float.TYPE) || Intrinsics.areEqual(type2, Float.class)) {
                                    field.set(tNewInstance, Float.valueOf(readFloat(bArr, iIntValue2)));
                                }
                            }
                            repeatedField = iIntValue2 + 4;
                        }
                    } else if (field == null) {
                        kotlin.Pair<Integer, Integer> rawVarint32 = readRawVarint32(bArr, iIntValue2);
                        iIntValue = ((Number) rawVarint32.getSecond()).intValue() + ((Number) rawVarint32.getFirst()).intValue();
                    } else if (Intrinsics.areEqual(field.getType(), String.class)) {
                        kotlin.Pair<Integer, String> string = readString(bArr, iIntValue2);
                        field.set(tNewInstance, string.getSecond());
                        iIntValue = ((Number) string.getFirst()).intValue();
                    } else if (Intrinsics.areEqual(field.getType(), byte[].class)) {
                        kotlin.Pair<Integer, byte[]> bytes = readBytes(bArr, iIntValue2);
                        field.set(tNewInstance, bytes.getSecond());
                        iIntValue = ((Number) bytes.getFirst()).intValue();
                    } else if (List.class.isAssignableFrom(field.getType())) {
                        Type genericType = field.getGenericType();
                        if (!(genericType instanceof ParameterizedType)) {
                            throw new InvalidProtocolBufferException(C3392f.a(fieldNumber, "the List type with field number ", " must have one type argument"));
                        }
                        Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
                        if (actualTypeArguments.length > 1) {
                            throw new InvalidProtocolBufferException(C3392f.a(fieldNumber, "the List type with field number ", " has more than one type argument"));
                        }
                        Type type3 = actualTypeArguments[0];
                        if (!(type3 instanceof Class)) {
                            throw new InvalidProtocolBufferException(C3392f.a(fieldNumber, "the type parameter of the list field with number ", " must be Class"));
                        }
                        if (field.get(tNewInstance) != null) {
                            arrayList = TypeIntrinsics.asMutableList(field.get(tNewInstance));
                        } else if (field.getType().isInterface() || Modifier.isAbstract(field.getType().getModifiers())) {
                            arrayList = new ArrayList<>();
                        } else {
                            Constructor<?> declaredConstructor2 = field.getType().getDeclaredConstructor(null);
                            if (declaredConstructor2 == null) {
                                throw new InvalidProtocolBufferException("Class " + field.getType() + " must have a constructor with no parameter");
                            }
                            declaredConstructor2.setAccessible(true);
                            arrayList = TypeIntrinsics.asMutableList(declaredConstructor2.newInstance(null));
                        }
                        List<Object> list = arrayList;
                        repeatedField = iIntValue2 + readRepeatedField(bArr, iIntValue2, list, (Class) type3);
                        field.set(tNewInstance, list);
                    } else {
                        repeatedField = iIntValue2;
                        if (!field.getType().isArray()) {
                            if (field.isAnnotationPresent(Any.class)) {
                                kotlin.Pair<Integer, T> any = readAny(bArr, iIntValue2, field.getType());
                                field.set(tNewInstance, any.getSecond());
                                iIntValue = ((Number) any.getFirst()).intValue();
                            } else {
                                kotlin.Pair<Integer, T> message = readMessage(bArr, iIntValue2, field.getType());
                                field.set(tNewInstance, message.getSecond());
                                iIntValue = ((Number) message.getFirst()).intValue();
                            }
                        }
                    }
                } else if (field != null) {
                    Class<?> type4 = field.getType();
                    if (Intrinsics.areEqual(type4, Short.TYPE) || Intrinsics.areEqual(type4, Short.class) || Intrinsics.areEqual(type4, Integer.TYPE) || Intrinsics.areEqual(type4, Integer.class)) {
                        kotlin.Pair<Integer, Integer> int32 = readInt32(bArr, iIntValue2);
                        field.set(tNewInstance, int32.getSecond());
                        iIntValue = ((Number) int32.getFirst()).intValue();
                    } else if (Intrinsics.areEqual(type4, Long.TYPE) || Intrinsics.areEqual(type4, Long.class)) {
                        kotlin.Pair<Integer, Long> int64 = readInt64(bArr, iIntValue2);
                        field.set(tNewInstance, int64.getSecond());
                        iIntValue = ((Number) int64.getFirst()).intValue();
                    } else if (Intrinsics.areEqual(type4, Boolean.TYPE) || Intrinsics.areEqual(type4, Boolean.class)) {
                        kotlin.Pair<Integer, Boolean> bool = readBool(bArr, iIntValue2);
                        field.set(tNewInstance, bool.getSecond());
                        iIntValue = ((Number) bool.getFirst()).intValue();
                    } else {
                        repeatedField = iIntValue2;
                        if (field.getType().isEnum()) {
                            kotlin.Pair<Integer, Enum<?>> pair2 = readEnum(bArr, iIntValue2, field.getType());
                            field.set(tNewInstance, pair2.getSecond());
                            iIntValue = ((Number) pair2.getFirst()).intValue();
                        }
                    }
                } else {
                    iIntValue = ((Number) readRawVarint64(bArr, iIntValue2).getFirst()).intValue();
                }
            } else {
                Pair[] pairArrValue = ((Oneof) field.getAnnotation(Oneof.class)).value();
                int length = pairArrValue.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        pair = null;
                        break;
                    }
                    pair = pairArrValue[i7];
                    if (pair.fieldNumber() == fieldNumber) {
                        break;
                    }
                    i7++;
                }
                kotlin.Pair<Integer, OneofWrapper> oneof = readOneof(bArr, iIntValue2, pair.fieldNumber(), pair.clazz());
                field.set(tNewInstance, oneof.getSecond());
                iIntValue = ((Number) oneof.getFirst()).intValue();
            }
            repeatedField = iIntValue2 + iIntValue;
        }
        return tNewInstance;
    }
}
