package com.bilibili.ogv.kmm.operation.vippreview;

import I.E;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C4665g;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql0.InterfaceC8453a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/a.class */
@StabilityInferred(parameters = 0)
@Serializable
public final class a implements InterfaceC8453a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Lazy<KSerializer<Object>>[] f68910g = {null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new K3.e(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f68911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f68913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f68914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f68915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f68916f;

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.vippreview.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/a$a.class */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    @StabilityInferred(parameters = 0)
    public static final /* synthetic */ class C0421a implements GeneratedSerializer<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0421a f68917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final PluginGeneratedSerialDescriptor f68918b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.vippreview.a$a, java.lang.Object, kotlinx.serialization.internal.GeneratedSerializer] */
        static {
            ?? obj = new Object();
            f68917a = obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bilibili.ogv.kmm.operation.vippreview.ReservationNotice", (GeneratedSerializer) obj, 6);
            pluginGeneratedSerialDescriptor.addElement("cover", true);
            pluginGeneratedSerialDescriptor.addElement("oid", true);
            pluginGeneratedSerialDescriptor.addElement("title", true);
            pluginGeneratedSerialDescriptor.addElement("sub_title", true);
            pluginGeneratedSerialDescriptor.addElement("url", true);
            pluginGeneratedSerialDescriptor.addElement("report", true);
            f68918b = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            Lazy<KSerializer<Object>>[] lazyArr = a.f68910g;
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{stringSerializer, LongSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, lazyArr[5].getValue()};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
        public final Object deserialize(Decoder decoder) throws UnknownFieldException {
            int i7;
            long jDecodeLongElement;
            String strDecodeStringElement;
            String strDecodeStringElement2;
            Map map;
            String strDecodeStringElement3;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68918b;
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            Lazy<KSerializer<Object>>[] lazyArr = a.f68910g;
            String strDecodeStringElement4 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), (Object) null);
                i7 = 63;
            } else {
                boolean z6 = true;
                i7 = 0;
                String strDecodeStringElement5 = null;
                Map map2 = null;
                jDecodeLongElement = 0;
                strDecodeStringElement = null;
                strDecodeStringElement2 = null;
                while (z6) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z6 = false;
                            break;
                        case 0:
                            strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                            i7 |= 1;
                            break;
                        case 1:
                            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                            i7 |= 2;
                            break;
                        case 2:
                            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                            i7 |= 4;
                            break;
                        case 3:
                            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                            i7 |= 8;
                            break;
                        case 4:
                            strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 4);
                            i7 |= 16;
                            break;
                        case 5:
                            map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), map2);
                            i7 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                }
                String str = strDecodeStringElement5;
                map = map2;
                strDecodeStringElement3 = str;
            }
            compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new a(i7, strDecodeStringElement4, jDecodeLongElement, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, map);
        }

        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f68918b;
        }

        public final void serialize(Encoder encoder, Object obj) {
            a aVar = (a) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f68918b;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            b bVar = a.Companion;
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || !Intrinsics.areEqual(aVar.f68911a, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, aVar.f68911a);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || aVar.f68912b != 0) {
                compositeEncoderBeginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 1, aVar.f68912b);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || !Intrinsics.areEqual(aVar.f68913c, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, aVar.f68913c);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || !Intrinsics.areEqual(aVar.f68914d, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, aVar.f68914d);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || !Intrinsics.areEqual(aVar.f68915e, "")) {
                compositeEncoderBeginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 4, aVar.f68915e);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5) || !Intrinsics.areEqual(aVar.f68916f, MapsKt.emptyMap())) {
                compositeEncoderBeginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 5, (SerializationStrategy) a.f68910g[5].getValue(), aVar.f68916f);
            }
            compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @NotNull
        public final /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/a$b.class */
    public static final class b {
        @NotNull
        public final KSerializer<a> serializer() {
            return C0421a.f68917a;
        }
    }

    public a() {
        Map<String, String> mapEmptyMap = MapsKt.emptyMap();
        this.f68911a = "";
        this.f68912b = 0L;
        this.f68913c = "";
        this.f68914d = "";
        this.f68915e = "";
        this.f68916f = mapEmptyMap;
    }

    public a(int i7, String str, long j7, String str2, String str3, String str4, Map map) {
        if ((i7 & 1) == 0) {
            this.f68911a = "";
        } else {
            this.f68911a = str;
        }
        if ((i7 & 2) == 0) {
            this.f68912b = 0L;
        } else {
            this.f68912b = j7;
        }
        if ((i7 & 4) == 0) {
            this.f68913c = "";
        } else {
            this.f68913c = str2;
        }
        if ((i7 & 8) == 0) {
            this.f68914d = "";
        } else {
            this.f68914d = str3;
        }
        if ((i7 & 16) == 0) {
            this.f68915e = "";
        } else {
            this.f68915e = str4;
        }
        if ((i7 & 32) == 0) {
            this.f68916f = MapsKt.emptyMap();
        } else {
            this.f68916f = map;
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
        return Intrinsics.areEqual(this.f68911a, aVar.f68911a) && this.f68912b == aVar.f68912b && Intrinsics.areEqual(this.f68913c, aVar.f68913c) && Intrinsics.areEqual(this.f68914d, aVar.f68914d) && Intrinsics.areEqual(this.f68915e, aVar.f68915e) && Intrinsics.areEqual(this.f68916f, aVar.f68916f);
    }

    @Override // ql0.InterfaceC8453a
    @NotNull
    public final Map<String, String> getReport() {
        return this.f68916f;
    }

    public final int hashCode() {
        return this.f68916f.hashCode() + E.a(E.a(E.a(C3554n0.a(this.f68911a.hashCode() * 31, 31, this.f68912b), 31, this.f68913c), 31, this.f68914d), 31, this.f68915e);
    }

    @NotNull
    public final String toString() {
        Map<String, String> map = this.f68916f;
        StringBuilder sb = new StringBuilder("ReservationNotice(cover=");
        sb.append(this.f68911a);
        sb.append(", oid=");
        sb.append(this.f68912b);
        sb.append(", title=");
        sb.append(this.f68913c);
        sb.append(", subtitle=");
        sb.append(this.f68914d);
        sb.append(", url=");
        return C4665g.a(sb, this.f68915e, ", report=", map, ")");
    }
}
