package com.bilibili.ogv.operation3.module.hcards2x2;

import J3.V1;
import J3.W1;
import K7.M;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import bl0.InterfaceC5118d;
import com.bilibili.live.streaming.source.TextSource;
import dl0.C6820a;
import dl0.C6821b;
import fl0.C7127d;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql0.InterfaceC8453a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/hcards2x2/a.class */
@SerialName("card")
@StabilityInferred(parameters = 0)
@Serializable
public final class a implements InterfaceC5118d, InterfaceC8453a, com.bilibili.ogv.operation3.module.switchit.g {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f71352i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<com.bilibili.ogv.operation3.module.operablecard.a> f71353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final C6820a f71354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f71355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final C6821b f71356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f71357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f71358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f71359g;

    @NotNull
    public final Map<String, String> h;

    /* JADX INFO: renamed from: com.bilibili.ogv.operation3.module.hcards2x2.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/hcards2x2/a$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class C0445a implements GeneratedSerializer<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0445a f71360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f71361b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.operation3.module.hcards2x2.a$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f71360a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("card", (GeneratedSerializer) obj, 8);
            pluginGeneratedSerialDescriptor.addElement("items", false);
            pluginGeneratedSerialDescriptor.addElement("attr", false);
            pluginGeneratedSerialDescriptor.addElement("title", false);
            pluginGeneratedSerialDescriptor.addElement("headers", false);
            pluginGeneratedSerialDescriptor.addElement(TextSource.CFG_SIZE, true);
            pluginGeneratedSerialDescriptor.addElement("type", true);
            pluginGeneratedSerialDescriptor.addElement("module_id", true);
            pluginGeneratedSerialDescriptor.addElement("report", true);
            f71361b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = a.f71352i;
            Object value = lazyArr[0].getValue();
            KSerializer nullable = BuiltinSerializersKt.getNullable(C6820a.C1249a.f116488a);
            KSerializer nullable2 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
            KSerializer nullable3 = BuiltinSerializersKt.getNullable(C7127d.f118454c);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            return new KSerializer[]{value, nullable, nullable2, nullable3, intSerializer, intSerializer, LongSerializer.INSTANCE, lazyArr[7].getValue()};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            int iDecodeIntElement;
            Map map;
            C6821b c6821b;
            long jDecodeLongElement;
            List list;
            String str;
            C6820a c6820a;
            int i7;
            int i8;
            int i9;
            int i10;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71361b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = a.f71352i;
            int i11 = 4;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
                c6820a = (C6820a) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, C6820a.C1249a.f116488a, (Object) null);
                str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, (Object) null);
                c6821b = (C6821b) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, C7127d.f118454c, (Object) null);
                iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 4);
                int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 5);
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 6);
                map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), (Object) null);
                i8 = 255;
                i7 = iDecodeIntElement2;
                list = list2;
            } else {
                boolean z6 = true;
                iDecodeIntElement = 0;
                map = null;
                c6821b = null;
                C6820a c6820a2 = null;
                jDecodeLongElement = 0;
                int iDecodeIntElement3 = 0;
                List list3 = null;
                String str2 = null;
                int i12 = 0;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z6 = false;
                            continue;
                        case 0:
                            list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list3);
                            i9 = i12;
                            i10 = 1;
                            break;
                        case 1:
                            c6820a2 = (C6820a) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, C6820a.C1249a.f116488a, c6820a2);
                            i9 = i12;
                            i10 = 2;
                            break;
                        case 2:
                            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, str2);
                            i9 = i12;
                            i10 = 4;
                            break;
                        case 3:
                            c6821b = (C6821b) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, C7127d.f118454c, c6821b);
                            i12 |= 8;
                            i11 = 4;
                            continue;
                        case 4:
                            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, i11);
                            i12 |= 16;
                            continue;
                        case 5:
                            iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 5);
                            i12 |= 32;
                            continue;
                        case 6:
                            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 6);
                            i12 |= 64;
                            continue;
                        case 7:
                            map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), map);
                            i12 |= 128;
                            continue;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    i12 = i9 | i10;
                    i11 = 4;
                }
                list = list3;
                str = str2;
                c6820a = c6820a2;
                i7 = iDecodeIntElement3;
                i8 = i12;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new a(i8, iDecodeIntElement, i7, jDecodeLongElement, c6820a, c6821b, str, list, map);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f71361b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            a aVar = (a) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71361b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = a.f71352i;
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), aVar.f71353a);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, C6820a.C1249a.f116488a, aVar.f71354b);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, aVar.f71355c);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, C7127d.f118454c, aVar.f71356d);
            boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4);
            int i7 = aVar.f71357e;
            if (zShouldEncodeElementDefault || i7 != 4) {
                compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 4, i7);
            }
            boolean zShouldEncodeElementDefault2 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5);
            int i8 = aVar.f71358f;
            if (zShouldEncodeElementDefault2 || i8 != 0) {
                compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 5, i8);
            }
            boolean zShouldEncodeElementDefault3 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6);
            long j7 = aVar.f71359g;
            if (zShouldEncodeElementDefault3 || j7 != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 6, j7);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 7) || !Intrinsics.areEqual(aVar.h, MapsKt.emptyMap())) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 7, (SerializationStrategy) lazyArr[7].getValue(), aVar.h);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/hcards2x2/a$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<a> serializer() {
            return C0445a.f71360a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f71352i = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new V1(6)), null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new W1(8))};
    }

    public a(int i7, int i8, int i9, long j7, C6820a c6820a, C6821b c6821b, String str, List list, Map map) {
        if (15 != (i7 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i7, 15, C0445a.f71361b);
        }
        this.f71353a = list;
        this.f71354b = c6820a;
        this.f71355c = str;
        this.f71356d = c6821b;
        this.f71357e = (i7 & 16) == 0 ? 4 : i8;
        if ((i7 & 32) == 0) {
            this.f71358f = 0;
        } else {
            this.f71358f = i9;
        }
        if ((i7 & 64) == 0) {
            this.f71359g = 0L;
        } else {
            this.f71359g = j7;
        }
        if ((i7 & 128) == 0) {
            this.h = MapsKt.emptyMap();
        } else {
            this.h = map;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f71353a, aVar.f71353a) && Intrinsics.areEqual(this.f71354b, aVar.f71354b) && Intrinsics.areEqual(this.f71355c, aVar.f71355c) && Intrinsics.areEqual(this.f71356d, aVar.f71356d) && this.f71357e == aVar.f71357e && this.f71358f == aVar.f71358f && this.f71359g == aVar.f71359g && Intrinsics.areEqual(this.h, aVar.h);
    }

    @Override // ql0.InterfaceC8453a
    @NotNull
    public final String f() {
        return "pgc.{pageName}.operation.0.show";
    }

    @Override // ql0.InterfaceC8453a
    @NotNull
    public final String getClickEventId() {
        return "pgc.{pageName}.0.0.click";
    }

    @Override // com.bilibili.ogv.operation3.module.switchit.g
    public final long getModuleId() {
        return this.f71359g;
    }

    @Override // com.bilibili.ogv.operation3.module.switchit.g
    public final int getModuleType() {
        return this.f71358f;
    }

    @Override // ql0.InterfaceC8453a
    @NotNull
    public final Map<String, String> getReport() {
        return this.h;
    }

    @Override // com.bilibili.ogv.operation3.module.switchit.g
    public final int getSize() {
        return this.f71357e;
    }

    public final int hashCode() {
        int iHashCode = this.f71353a.hashCode();
        int iHashCode2 = 0;
        C6820a c6820a = this.f71354b;
        int iHashCode3 = c6820a == null ? 0 : c6820a.hashCode();
        String str = this.f71355c;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        C6821b c6821b = this.f71356d;
        if (c6821b != null) {
            iHashCode2 = c6821b.hashCode();
        }
        return this.h.hashCode() + C3554n0.a(I.a(this.f71358f, I.a(this.f71357e, ((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2) * 31, 31), 31), 31, this.f71359g);
    }

    @NotNull
    public final String toString() {
        List<com.bilibili.ogv.operation3.module.operablecard.a> list = this.f71353a;
        Map<String, String> map = this.h;
        StringBuilder sbA = M.a("HCard2x2(items=", ", attr=", list);
        sbA.append(this.f71354b);
        sbA.append(", title=");
        sbA.append(this.f71355c);
        sbA.append(", header=");
        sbA.append(this.f71356d);
        sbA.append(", size=");
        sbA.append(this.f71357e);
        sbA.append(", moduleType=");
        sbA.append(this.f71358f);
        sbA.append(", moduleId=");
        f6.a.a(sbA, this.f71359g, ", report=", map);
        sbA.append(")");
        return sbA.toString();
    }
}
