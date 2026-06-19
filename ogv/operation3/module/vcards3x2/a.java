package com.bilibili.ogv.operation3.module.vcards3x2;

import J3.f2;
import J3.g2;
import K7.M;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import bl0.InterfaceC5118d;
import com.alipay.blueshield.TrustedErrorCode;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/vcards3x2/a.class */
@SerialName("v_card")
@StabilityInferred(parameters = 0)
@Serializable
public final class a implements InterfaceC5118d, InterfaceC8453a, com.bilibili.ogv.operation3.module.switchit.g {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f71441i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<com.bilibili.ogv.operation3.module.operablecard.a> f71442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final C6820a f71443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f71444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f71445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f71446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f71447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final C6821b f71448g;

    @NotNull
    public final Map<String, String> h;

    /* JADX INFO: renamed from: com.bilibili.ogv.operation3.module.vcards3x2.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/vcards3x2/a$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class C0447a implements GeneratedSerializer<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0447a f71449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f71450b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.operation3.module.vcards3x2.a$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f71449a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("v_card", (GeneratedSerializer) obj, 8);
            pluginGeneratedSerialDescriptor.addElement("items", false);
            pluginGeneratedSerialDescriptor.addElement("attr", false);
            pluginGeneratedSerialDescriptor.addElement("title", false);
            pluginGeneratedSerialDescriptor.addElement(TextSource.CFG_SIZE, true);
            pluginGeneratedSerialDescriptor.addElement("type", true);
            pluginGeneratedSerialDescriptor.addElement("module_id", true);
            pluginGeneratedSerialDescriptor.addElement("headers", false);
            pluginGeneratedSerialDescriptor.addElement("report", false);
            f71450b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = a.f71441i;
            Object value = lazyArr[0].getValue();
            KSerializer nullable = BuiltinSerializersKt.getNullable(C6820a.C1249a.f116488a);
            KSerializer nullable2 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            return new KSerializer[]{value, nullable, nullable2, intSerializer, intSerializer, LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(C7127d.f118454c), lazyArr[7].getValue()};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            int iDecodeIntElement;
            Map map;
            C6821b c6821b;
            long jDecodeLongElement;
            C6820a c6820a;
            List list;
            String str;
            int iDecodeIntElement2;
            int i7;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71450b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = a.f71441i;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                list = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), (Object) null);
                c6820a = (C6820a) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, C6820a.C1249a.f116488a, (Object) null);
                str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, (Object) null);
                iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 3);
                int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 4);
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 5);
                c6821b = (C6821b) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, C7127d.f118454c, (Object) null);
                map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), (Object) null);
                i7 = 255;
                iDecodeIntElement = iDecodeIntElement3;
            } else {
                boolean z6 = true;
                iDecodeIntElement = 0;
                map = null;
                c6821b = null;
                C6820a c6820a2 = null;
                jDecodeLongElement = 0;
                int iDecodeIntElement4 = 0;
                List list2 = null;
                String str2 = null;
                int i8 = 0;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z6 = false;
                            break;
                        case 0:
                            list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list2);
                            i8 |= 1;
                            break;
                        case 1:
                            c6820a2 = (C6820a) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, C6820a.C1249a.f116488a, c6820a2);
                            i8 |= 2;
                            break;
                        case 2:
                            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, str2);
                            i8 |= 4;
                            break;
                        case 3:
                            iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 3);
                            i8 |= 8;
                            break;
                        case 4:
                            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 4);
                            i8 |= 16;
                            break;
                        case 5:
                            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 5);
                            i8 |= 32;
                            break;
                        case 6:
                            c6821b = (C6821b) compositeDecoderBeginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, C7127d.f118454c, c6821b);
                            i8 |= 64;
                            break;
                        case 7:
                            map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), map);
                            i8 |= 128;
                            break;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                }
                c6820a = c6820a2;
                list = list2;
                str = str2;
                iDecodeIntElement2 = iDecodeIntElement4;
                i7 = i8;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new a(i7, iDecodeIntElement2, iDecodeIntElement, jDecodeLongElement, c6820a, c6821b, str, list, map);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f71450b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            a aVar = (a) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f71450b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = a.f71441i;
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), aVar.f71442a);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, C6820a.C1249a.f116488a, aVar.f71443b);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, aVar.f71444c);
            boolean zShouldEncodeElementDefault = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3);
            int i7 = aVar.f71445d;
            if (zShouldEncodeElementDefault || i7 != 4) {
                compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 3, i7);
            }
            boolean zShouldEncodeElementDefault2 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4);
            int i8 = aVar.f71446e;
            if (zShouldEncodeElementDefault2 || i8 != 0) {
                compositeEncoderBeginStructure.encodeIntElement(pluginGeneratedSerialDescriptor, 4, i8);
            }
            boolean zShouldEncodeElementDefault3 = compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5);
            long j7 = aVar.f71447f;
            if (zShouldEncodeElementDefault3 || j7 != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 5, j7);
            }
            compositeEncoderBeginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, C7127d.f118454c, aVar.f71448g);
            compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 7, (SerializationStrategy) lazyArr[7].getValue(), aVar.h);
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/vcards3x2/a$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<a> serializer() {
            return C0447a.f71449a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f71441i = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new f2(8)), null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new g2(9))};
    }

    public a(int i7, int i8, int i9, long j7, C6820a c6820a, C6821b c6821b, String str, List list, Map map) {
        if (199 != (i7 & TrustedErrorCode.MANAGER_ERROR_UNKONWN_CODE)) {
            PluginExceptionsKt.throwMissingFieldException(i7, TrustedErrorCode.MANAGER_ERROR_UNKONWN_CODE, C0447a.f71450b);
        }
        this.f71442a = list;
        this.f71443b = c6820a;
        this.f71444c = str;
        this.f71445d = (i7 & 8) == 0 ? 4 : i8;
        if ((i7 & 16) == 0) {
            this.f71446e = 0;
        } else {
            this.f71446e = i9;
        }
        if ((i7 & 32) == 0) {
            this.f71447f = 0L;
        } else {
            this.f71447f = j7;
        }
        this.f71448g = c6821b;
        this.h = map;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f71442a, aVar.f71442a) && Intrinsics.areEqual(this.f71443b, aVar.f71443b) && Intrinsics.areEqual(this.f71444c, aVar.f71444c) && this.f71445d == aVar.f71445d && this.f71446e == aVar.f71446e && this.f71447f == aVar.f71447f && Intrinsics.areEqual(this.f71448g, aVar.f71448g) && Intrinsics.areEqual(this.h, aVar.h);
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
        return this.f71447f;
    }

    @Override // com.bilibili.ogv.operation3.module.switchit.g
    public final int getModuleType() {
        return this.f71446e;
    }

    @Override // ql0.InterfaceC8453a
    @NotNull
    public final Map<String, String> getReport() {
        return this.h;
    }

    @Override // com.bilibili.ogv.operation3.module.switchit.g
    public final int getSize() {
        return this.f71445d;
    }

    public final int hashCode() {
        int iHashCode = this.f71442a.hashCode();
        C6820a c6820a = this.f71443b;
        int iHashCode2 = c6820a == null ? 0 : c6820a.hashCode();
        String str = this.f71444c;
        int iA = C3554n0.a(I.a(this.f71446e, I.a(this.f71445d, ((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.f71447f);
        C6821b c6821b = this.f71448g;
        return this.h.hashCode() + ((iA + (c6821b == null ? 0 : c6821b.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        List<com.bilibili.ogv.operation3.module.operablecard.a> list = this.f71442a;
        Map<String, String> map = this.h;
        StringBuilder sbA = M.a("VCard3x2(items=", ", attr=", list);
        sbA.append(this.f71443b);
        sbA.append(", title=");
        sbA.append(this.f71444c);
        sbA.append(", size=");
        sbA.append(this.f71445d);
        sbA.append(", moduleType=");
        sbA.append(this.f71446e);
        sbA.append(", moduleId=");
        sbA.append(this.f71447f);
        sbA.append(", header=");
        sbA.append(this.f71448g);
        sbA.append(", report=");
        sbA.append(map);
        sbA.append(")");
        return sbA.toString();
    }
}
